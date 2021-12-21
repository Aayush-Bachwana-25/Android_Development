package com.example.markopedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String names[]={"Facebook","Google","Apple","Amazon","Coca-cola","Microsoft","Samsung"};
    private int images[]={R.drawable.facebook,R.drawable.google,R.drawable.apple,R.drawable.amazon,R.drawable.cocacola,R.drawable.microsoft,R.drawable.samsung};

//    protected static void runIntent(String url){
//        //Implicit intent to open a webPage
//        Uri webpage = Uri.parse(newAdapter.getUrl());
//        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
//        if (intent.resolveActivity(getApplicationContext().getPackageManager()) != null) {
//            startActivity(intent);
//        }
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listView);
        newAdapter ad=new newAdapter(getApplicationContext(),R.layout.newadapter,names,images);
        listView.setAdapter(ad);

    }

}