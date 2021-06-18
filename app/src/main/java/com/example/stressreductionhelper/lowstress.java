package com.example.stressreductionhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class lowstress extends AppCompatActivity {

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lowstress);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Button musicLow = findViewById(R.id.musicbutton);
        Button actlow = findViewById(R.id.activities);
        Button foodlow = findViewById(R.id.food);
        Button back = findViewById(R.id.mentalhealth);

        musicLow.setOnClickListener(v -> {
            Intent i = new Intent(lowstress.this, musiclows.class);
            startActivity(i);
        });

        actlow.setOnClickListener(v -> {
            Intent i = new Intent(lowstress.this, activities.class);
            startActivity(i);
        });


        foodlow.setOnClickListener(v -> {
            Intent i = new Intent(lowstress.this, foodlowlist.class);
            startActivity(i);
        });

        back.setOnClickListener(v -> finish());



    }
}