package com.example.stressreductionhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class foodhighlist extends AppCompatActivity {

    ImageView fatfish, egg, pumpkinseed, choco, yougurt, cum;

    @SuppressLint("SourceLockedOrientationActivity")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodhighlist);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        fatfish = findViewById(R.id.act1);
        egg = findViewById(R.id.act2);
        pumpkinseed = findViewById(R.id.act3);
        choco = findViewById(R.id.act4);
        yougurt = findViewById(R.id.act5);
        cum = findViewById(R.id.comingsoon);

        Button b = findViewById(R.id.back);

        fatfish.setOnClickListener(v -> {
            Intent i = new Intent(foodhighlist.this, activity_detail.class);
            i.putExtra("img", R.drawable.fatfish);
            i.putExtra("actname", "Fatty Fish");
            i.putExtra("details", "Fatty fish, such as salmon, mackerel, sardines, trout, and herring, are high \n" +
                    "in omega-3. Omega-3 is a fatty acid that has a strong relationship with \n" +
                    "cognitive function as well as mental health.");
            startActivity(i);
        });

        egg.setOnClickListener(v -> {
            Intent i = new Intent(foodhighlist.this, activity_detail.class);
            i.putExtra("img", R.drawable.egg);
            i.putExtra("actname", "Eggs");
            i.putExtra("details", "Eggs also contain tryptophan, which is an amino acid that helps create serotonin.\n" +
                    " Serotonin is a chemical neurotransmitter that helps to regulate mood, sleep,\n" +
                    " memory, and behavior. Serotonin is also thought to improve brain function and\n" +
                    " relieve anxiety.");
            startActivity(i);
        });

        pumpkinseed.setOnClickListener(v -> {
            Intent i = new Intent(foodhighlist.this, activity_detail.class);
            i.putExtra("img", R.drawable.pumpkinseed);
            i.putExtra("actname", "Pumpkin Seed");
            i.putExtra("details", "Pumpkin seedsTrusted Source are an excellent source of potassium, which helps\n" +
                    "regulateTrusted Source electrolyte balance and manage blood pressure.");
            startActivity(i);
        });

        choco.setOnClickListener(v -> {
            Intent i = new Intent(foodhighlist.this, activity_detail.class);
            i.putExtra("img", R.drawable.choco);
            i.putExtra("actname", "Dark Chocolate");
            i.putExtra("details", "Dark chocolate is also a good source of magnesium. Eating a diet with enough \n" +
                    "magnesium in it or taking supplements may reduce symptoms of depression.");
            startActivity(i);
        });

        yougurt.setOnClickListener(v -> {
            Intent i = new Intent(foodhighlist.this, activity_detail.class);
            i.putExtra("img", R.drawable.yougurt);
            i.putExtra("actname", "Yogurt");
            i.putExtra("details", "Yogurt contains healthful bacteria, Lactobaccilus and Bifidobacteria. There is emerging evidenceTrusted Source that these bacteria and fermented\n" +
                    " products have positive effects on brain health.");
            startActivity(i);
        });

        cum.setOnClickListener(v -> Toast.makeText(foodhighlist.this, "Content Coming Soon...", Toast.LENGTH_LONG).show());

        b.setOnClickListener(v -> finish());
    }
}