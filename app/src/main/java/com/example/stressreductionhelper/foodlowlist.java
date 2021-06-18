package com.example.stressreductionhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class foodlowlist extends AppCompatActivity {

    ImageView swisschard, potato, kimchim, artic, organsmeat, cum;

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodlowlist);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        swisschard = findViewById(R.id.act1);
        potato = findViewById(R.id.act2);
        kimchim = findViewById(R.id.act3);
        artic = findViewById(R.id.act4);
        organsmeat = findViewById(R.id.act5);
        cum = findViewById(R.id.comingsoon);

        Button b = findViewById(R.id.back);

        swisschard.setOnClickListener(v -> {
            Intent i = new Intent(foodlowlist.this, activity_detail.class);
            i.putExtra("img", R.drawable.swisschard);
            i.putExtra("actname", "Swiss Chard");
            i.putExtra("details", "Swiss chard is a leafy green vegetable that’s packed with stress-fighting nutrients.");
            startActivity(i);
        });

        potato.setOnClickListener(v -> {
            Intent i = new Intent(foodlowlist.this, activity_detail.class);
            i.putExtra("img", R.drawable.sweetpotato);
            i.putExtra("actname", "Sweet Potato");
            i.putExtra("details", "Sweet potatoes are a whole food that makes an excellent carb choice. They’re packed with nutrients that are important for stress response, such as vitamin C and potassium.");
            startActivity(i);
        });

        kimchim.setOnClickListener(v -> {
            Intent i = new Intent(foodlowlist.this, activity_detail.class);
            i.putExtra("img", R.drawable.kimchi);
            i.putExtra("actname", "Kimchi");
            i.putExtra("details", "Many other studies show that probiotic supplements and probiotic-rich foods like kimchi have beneficial effects on mental health. This is likely due to their interactions with your gut bacteria, which directly affect your mood Artichokes");
            startActivity(i);
        });

        artic.setOnClickListener(v -> {
            Intent i = new Intent(foodlowlist.this, activity_detail.class);
            i.putExtra("img", R.drawable.artichoke);
            i.putExtra("actname", "Artichoke");
            i.putExtra("details", "Artichokes are also high in potassium, magnesium, and vitamins C and K, all of which are essential for a healthy stress response Organ meats");
            startActivity(i);
        });

        organsmeat.setOnClickListener(v -> {
            Intent i = new Intent(foodlowlist.this, activity_detail.class);
            i.putExtra("img", R.drawable.organmeats);
            i.putExtra("actname", "Organ Meats");
            i.putExtra("details", "Organ meats, which include the heart, liver, and kidneys of animals like cows and chickens, are an excellent source of B vitamins, especially B12, B6, riboflavin, and folate, which are essential for stress control.");
            startActivity(i);
        });

        cum.setOnClickListener(v -> Toast.makeText(foodlowlist.this, "Content Coming Soon...", Toast.LENGTH_LONG).show());

        b.setOnClickListener(v -> finish());



    }
}