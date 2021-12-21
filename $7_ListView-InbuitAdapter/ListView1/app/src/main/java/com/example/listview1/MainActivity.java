package com.example.listview1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listview;
    private String[] str={"Hello","World","I","am","testing","this"};

    private int[] images={R.drawable.img,R.drawable.img,R.drawable.img,R.drawable.img,R.drawable.img,R.drawable.img};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview=findViewById(R.id.listview);
//        ArrayAdapter ad=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,str);
//        listview.setAdapter(ad);

        NewAdapter na=new NewAdapter(getApplicationContext(),R.layout.mylayout,str,images);
        listview.setAdapter(na);

    }
}