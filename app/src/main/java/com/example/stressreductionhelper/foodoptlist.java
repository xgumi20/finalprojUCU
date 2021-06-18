package com.example.stressreductionhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class foodoptlist extends AppCompatActivity {

    ImageView shellfish, cherry, broccoli, blueberry, nuts, cum;

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodoptlist);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        shellfish = findViewById(R.id.act1);
        cherry = findViewById(R.id.act2);
        broccoli = findViewById(R.id.act3);
        blueberry = findViewById(R.id.act4);
        nuts = findViewById(R.id.act5);
        cum = findViewById(R.id.comingsoon);

        Button b = findViewById(R.id.back);

        shellfish.setOnClickListener(v -> {
            Intent i = new Intent(foodoptlist.this, activity_detail.class);
            i.putExtra("img", R.drawable.shellfish);
            i.putExtra("actname", "Shellfish");
            i.putExtra("details", "Shellfish are also loaded with vitamin B12, zinc, copper, manganese, and selenium, all of which may help boost mood. A study in 2,089 Japanese adults associated low intakes of zinc, copper, and manganese with depression and anxiety symptom");
            startActivity(i);
        });

        cherry.setOnClickListener(v -> {
            Intent i = new Intent(foodoptlist.this, activity_detail.class);
            i.putExtra("img", R.drawable.cherry);
            i.putExtra("actname", "Acerola Cherry");
            i.putExtra("details", " Vitamin C is involved in stress response. What’s more, high vitamin C levels are linked to elevated mood and lower levels of depression and anger. Plus, eating foods rich in this vitamin may improve overall mood");
            startActivity(i);
        });

        broccoli.setOnClickListener(v -> {
            Intent i = new Intent(foodoptlist.this, activity_detail.class);
            i.putExtra("img", R.drawable.brocolli);
            i.putExtra("actname", "Broccoli");
            i.putExtra("details", "Broccoli is also rich in sulforaphane, a sulfur compound that has neuroprotective properties and may offer calming and antidepressant effects");
            startActivity(i);
        });

        blueberry.setOnClickListener(v -> {
            Intent i = new Intent(foodoptlist.this, activity_detail.class);
            i.putExtra("img", R.drawable.blueberry);
            i.putExtra("actname", "Blueberry");
            i.putExtra("details", "Blueberries are associated with a number of health benefits, including improved mood");
            startActivity(i);
        });

        nuts.setOnClickListener(v -> {
            Intent i = new Intent(foodoptlist.this, activity_detail.class);
            i.putExtra("img", R.drawable.brazilnuts);
            i.putExtra("actname", "Brazil Nuts");
            i.putExtra("details", "Brazil nuts are high in selenium. SeleniumTrusted Source may improve mood by reducing inflammation, which is often at heightened levels when someone has a mood disorder, such as anxiety.");
            startActivity(i);
        });

        cum.setOnClickListener(v -> Toast.makeText(foodoptlist.this, "Content Coming Soon...", Toast.LENGTH_LONG).show());

        b.setOnClickListener(v -> finish());
    }
}