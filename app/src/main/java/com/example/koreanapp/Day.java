package com.example.koreanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Day extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day);
    }


    public void monStart(View view){
        final MediaPlayer onePlay = MediaPlayer.create(this, R.raw.monday);
        onePlay.start();
    }


    public void tueStart(View view){
        final MediaPlayer onePlay = MediaPlayer.create(this, R.raw.tue);
        onePlay.start();
    }


    public void wedStart(View view){
        final MediaPlayer onePlay = MediaPlayer.create(this, R.raw.wed);
        onePlay.start();
    }


    public void thuStart(View view){
        final MediaPlayer onePlay = MediaPlayer.create(this, R.raw.thu);
        onePlay.start();
    }


    public void friStart(View view){
        final MediaPlayer onePlay = MediaPlayer.create(this, R.raw.fri);
        onePlay.start();
    }


    public void satStart(View view){
        final MediaPlayer onePlay = MediaPlayer.create(this, R.raw.sat);
        onePlay.start();
    }


    public void sunStart(View view){
        final MediaPlayer onePlay = MediaPlayer.create(this, R.raw.sun);
        onePlay.start();
    }
}
