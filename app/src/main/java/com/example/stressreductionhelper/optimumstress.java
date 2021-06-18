package com.example.stressreductionhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class optimumstress extends AppCompatActivity {

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_optimumstress);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Button musicLow = findViewById(R.id.musicbutton);
        Button acti = findViewById(R.id.activities);
        Button foodopt = findViewById(R.id.food);
        Button mh = findViewById(R.id.mentalhealth);
        Button back = findViewById(R.id.back);

        musicLow.setOnClickListener(v -> {
            Intent i = new Intent(optimumstress.this, musicopti.class);
            startActivity(i);
        });

        acti.setOnClickListener(v -> {
            Intent i = new Intent(optimumstress.this, activitiesopt.class);
            startActivity(i);
        });

        foodopt.setOnClickListener(v -> {
            Intent i = new Intent(optimumstress.this, foodoptlist.class);
            startActivity(i);
        });

        mh.setOnClickListener(v -> {
            Intent i = new Intent(optimumstress.this, mentalhealthlist.class);
            startActivity(i);
        });

        back.setOnClickListener(v -> finish());

    }
}