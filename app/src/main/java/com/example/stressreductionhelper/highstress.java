package com.example.stressreductionhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class highstress extends AppCompatActivity {

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highstress);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Button musicHigh = findViewById(R.id.musicbutton);
        Button actHigh = findViewById(R.id.activities);
        Button foodhigh = findViewById(R.id.food);
        Button mh = findViewById(R.id.mentalhealth);
        Button back = findViewById(R.id.back);

        musicHigh.setOnClickListener(v -> {
            Intent i = new Intent(highstress.this, musichigh.class);
            startActivity(i);
        });

        actHigh.setOnClickListener(v -> {
            Intent i = new Intent(highstress.this, activitieshigh.class);
            startActivity(i);
        });

        foodhigh.setOnClickListener(v -> {
            Intent i = new Intent(highstress.this, foodhighlist.class);
            startActivity(i);
        });

        mh.setOnClickListener(v -> {
            Intent i = new Intent(highstress.this, mentalhealthlist.class);
            startActivity(i);
        });

        back.setOnClickListener(v -> finish());



    }
}