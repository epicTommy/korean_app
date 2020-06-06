package com.example.koreanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Number extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
    }

    public void oneStart(View view){
        final MediaPlayer onePlay = MediaPlayer.create(this, R.raw.one);
        onePlay.start();
    }

    public void twoStart(View view){
        final MediaPlayer onePlay = MediaPlayer.create(this, R.raw.two);
        onePlay.start();
    }

    public void threeStart(View view){
        final MediaPlayer onePlay = MediaPlayer.create(this, R.raw.three);
        onePlay.start();
    }

    public void fourStart(View view){
        final MediaPlayer onePlay = MediaPlayer.create(this, R.raw.four);
        onePlay.start();
    }

    public void fiveStart(View view){
        final MediaPlayer onePlay = MediaPlayer.create(this, R.raw.five);
        onePlay.start();
    }

    public void sixStart(View view){
        final MediaPlayer onePlay = MediaPlayer.create(this, R.raw.six);
        onePlay.start();
    }

    public void sevenStart(View view){
        final MediaPlayer onePlay = MediaPlayer.create(this, R.raw.seven);
        onePlay.start();
    }

    public void eightStart(View view){
        final MediaPlayer onePlay = MediaPlayer.create(this, R.raw.eight);
        onePlay.start();
    }

    public void nineStart(View view){
        final MediaPlayer onePlay = MediaPlayer.create(this, R.raw.nine);
        onePlay.start();
    }

    public void tenStart(View view){
        final MediaPlayer onePlay = MediaPlayer.create(this, R.raw.ten);
        onePlay.start();
    }
}
