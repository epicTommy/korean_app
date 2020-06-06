package com.example.koreanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.TransactionTooLargeException;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void issa(View view){
        Intent intent = new Intent(this,Number.class);
        startActivity((intent));
    }

    public void mel(View view){
        Intent intent = new Intent(this, Day.class);
        startActivity(intent);
    }

    public void gi(View view){
        Intent intent = new Intent(this, Food.class);
        startActivity(intent);
    }

    public void ung(View view){
        Intent intent = new Intent(this, Trasnportation.class);
        startActivity(intent);
    }
}
