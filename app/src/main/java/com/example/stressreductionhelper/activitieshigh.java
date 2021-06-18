package com.example.stressreductionhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class activitieshigh extends AppCompatActivity {

    ImageView drive, listen, cuddle,eating,cycling,cum;

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitieshigh);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        drive = findViewById(R.id.act1);
        listen = findViewById(R.id.act2);
        cuddle = findViewById(R.id.act3);
        eating = findViewById(R.id.act4);
        cycling = findViewById(R.id.act5);
        cum = findViewById(R.id.comingsoon);

        Button b = findViewById(R.id.back);

        drive.setOnClickListener(v -> {

            Intent i = new Intent(activitieshigh.this, activity_detail.class);
            i.putExtra("img", R.drawable.drive);
            i.putExtra("actname", "Driving");
            i.putExtra("details", "\nTake a drive to a beautiful place. Research a beautiful location. Find a place to hike, a bridge to sit on, a lake to skip rocks at, or a hill where you can see the lights of a big city.");
            startActivity(i);

        });

        listen.setOnClickListener(v -> {
            Intent i = new Intent(activitieshigh.this, activity_detail.class);
            i.putExtra("img", R.drawable.listen);
            i.putExtra("actname", "Listening");
            i.putExtra("details", "\nListen to songs listening to calming song helps you to reduce stress.");
            startActivity(i);
        });

        cuddle.setOnClickListener(v -> {
            Intent i = new Intent(activitieshigh.this, activity_detail.class);
            i.putExtra("img", R.drawable.cuddle);
            i.putExtra("actname", "Cuddle");
            i.putExtra("details", "\nCuddling, kissing, hugging and sex can all help relieve stress.");
            startActivity(i);
        });

        eating.setOnClickListener(v -> {
            Intent i = new Intent(activitieshigh.this, activity_detail.class);
            i.putExtra("img", R.drawable.eating);
            i.putExtra("actname", "Eating");
            i.putExtra("details", "\nEating a healthy diet can reduce the negative effects of stress on your body.");
            startActivity(i);
        });

        cycling.setOnClickListener(v -> {
            Intent i = new Intent(activitieshigh.this, activity_detail.class);
            i.putExtra("img", R.drawable.cycling);
            i.putExtra("actname", "Cycling");
            i.putExtra("details", "\nCycling has been proven to reduce levels of cortisol (stress hormones) in the body, which disturb a restful and deep sleep.");
            startActivity(i);
        });

        cum.setOnClickListener(v -> Toast.makeText(activitieshigh.this, "Content Coming Soon...", Toast.LENGTH_LONG).show());

        b.setOnClickListener(v -> finish());





    }
}