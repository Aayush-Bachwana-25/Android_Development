package com.example.musicapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Toast;

import java.io.IOException;

public class PlayingSong extends AppCompatActivity {

    ImageView pauseplay,seekLeft,seekRight;
    SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_song);

        pauseplay=findViewById(R.id.pauseplay);
        seekLeft=findViewById(R.id.seekLeft);
        seekRight=findViewById(R.id.seekRight);
        seekBar=findViewById(R.id.seekBar);

        Intent intent=getIntent();

        String url=intent.getStringExtra("songName");
        int image=intent.getIntExtra("imageResource", R.drawable.musiclogo);

        //Setting SongLogo on Music Player Playing Screen
        ImageView playingMusicLogo=findViewById(R.id.playingMusicLogo);
        playingMusicLogo.setImageResource(image);

        //Creating MediaPlayer
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setScreenOnWhilePlaying(true);

        //Setting up online DataSource for required Music.
        try {
            mediaPlayer.setDataSource(url);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Setting up onPreparedListener to carry out Non-Synchronous Tasks.
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                Toast.makeText(getApplicationContext(), "Playing...", Toast.LENGTH_SHORT).show();
                mediaPlayer.start();

                //Adding functionality to SeekBar

                seekBar.setMax(mediaPlayer.getDuration());
                seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean isFromUser) {
                        if(isFromUser){
                            mediaPlayer.seekTo(progress);
                        }
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                });
            }
        });
        mediaPlayer.prepareAsync();

        //Setting Functionality of Buttons
        pauseplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    pauseplay.setImageResource(R.drawable.play);
                }
                else{
                    mediaPlayer.start();
                    pauseplay.setImageResource(R.drawable.pause);
                }
            }
        });
        seekRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currentPosition= mediaPlayer.getCurrentPosition();
                mediaPlayer.seekTo(currentPosition+10000);
            }
        });
        seekLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currentPosition= mediaPlayer.getCurrentPosition();
                if(currentPosition>=10000) {
                    mediaPlayer.seekTo(currentPosition - 10000);
                }
            }
        });
    }
}