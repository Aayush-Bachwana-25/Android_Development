package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView rview;

    String[] arr={"Facebook","Google","Apple","Amazon","Microsoft","Samsung","Coca-Cola"};
    int[] images={R.drawable.facebook,R.drawable.google,R.drawable.apple,R.drawable.amazon,R.drawable.microsoft,R.drawable.samsung,R.drawable.cocacola};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rview=findViewById(R.id.recyclerView);
        rview.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        CustomAdapter cAd=new CustomAdapter(arr,images);
        rview.setAdapter(cAd);
    }
}