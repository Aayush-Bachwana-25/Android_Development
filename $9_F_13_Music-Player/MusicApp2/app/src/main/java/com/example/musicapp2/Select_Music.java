package com.example.musicapp2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Select_Music extends AppCompatActivity {

    RecyclerView recyclerView;

    Music m1=new Music(
            R.drawable.ua,
            "Zara Dekh Mera Deewanapan (Footpath) 320Kbps",
            "Udit Narayan, Alka Yagnik",
            "https://pwdown.com/12555/Zara%20Dekh%20Mera%20Deewanapan%20(Footpath)%20320Kbps.mp3");

    Music m2=new Music(
            R.drawable.ua,
            "Mera Mann (Mann) 320Kbps",
            "Udit Narayan, Alka Yagnik",
            "https://pwdown.com/12555/Mera%20Mann%20(Mann)%20320Kbps.mp3");

    Music m3=new Music(
            R.drawable.arjit,
            "Pal - Arijit Singh 320Kbps",
            "Arijit Singh , Rochak Kohli",
            "https://pwdown.com/12075/Pal%20-%20Arijit%20Singh%20320Kbps.mp3");

    Music m4=new Music(
            R.drawable.sj,
            "Tu Jo Mila-Raabta",
            "Shirley Setia,Jubin Nautiyal",
            "https://pwdown.com/11945/Tu%20Jo%20Mila-Raabta%20-%20Shirley%20Setia%20n%20Jubin.mp3");


    Music[] arr ={m1,m2,m3,m4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_music);

        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        CustomMusicRowAdapter customMusicRowAdapter=new CustomMusicRowAdapter(arr);
        recyclerView.setAdapter(customMusicRowAdapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(),DividerItemDecoration.VERTICAL));

    }
}