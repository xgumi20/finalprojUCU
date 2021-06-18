package com.example.stressreductionhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Button mtrs = findViewById(R.id.lowstrs);
        Button otrs = findViewById(R.id.optstrs);
        Button htrs = findViewById(R.id.highstrs);

        mtrs.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, lowstress.class);
            startActivity(i);
        });

        otrs.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, optimumstress.class);
            startActivity(i);
        });

        htrs.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, highstress.class);
            startActivity(i);
        });


    }
}