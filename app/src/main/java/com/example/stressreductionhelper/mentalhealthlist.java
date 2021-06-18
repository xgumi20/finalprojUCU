package com.example.stressreductionhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class mentalhealthlist extends AppCompatActivity {

    ImageView prcc, healthpinas, phmental,mhf,mhph,sinag;

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mentalhealthlist);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        prcc = findViewById(R.id.himg1);
        healthpinas = findViewById(R.id.himg2);
        phmental = findViewById(R.id.himg3);
        mhf = findViewById(R.id.himg4);
        mhph = findViewById(R.id.himg5);
        sinag = findViewById(R.id.himg6);

        Button m = findViewById(R.id.more);
        Button b = findViewById(R.id.back);

        prcc.setOnClickListener(v -> {

            Intent i = new Intent(mentalhealthlist.this, mentalhealthdetail.class);
            i.putExtra("img", R.drawable.prcc);
            i.putExtra("actname", "Presidential Communications");
            i.putExtra("details", "\uD83D\uDCDE804-4673\n" +
                    "\uD83D\uDCDE0917-558-4673");
            startActivity(i);

        });

        healthpinas.setOnClickListener(v -> {
            Intent i = new Intent(mentalhealthlist.this, mentalhealthdetail.class);
            i.putExtra("img", R.drawable.healthpinas);
            i.putExtra("actname", "Healthy Pilipinas");
            i.putExtra("details", "\uD83D\uDCDE1551\n" +
                    "\uD83D\uDCDE0917-899-USAP(8728)\n" +
                    "\uD83D\uDCDE(02)7 989-USAP(8727)");
            startActivity(i);
        });

        phmental.setOnClickListener(v -> {
            Intent i = new Intent(mentalhealthlist.this, mentalhealthdetail.class);
            i.putExtra("img", R.drawable.phmental);
            i.putExtra("actname", "Philippine Mental health Inc,.");
            i.putExtra("details", "\uD83D\uDCDE1553(-Luzon wide landline toll-free)\n\n" +
                                        "\uD83D\uDCDEGlobe/Tm:0917-899-8727 |0966-351-4518\n\n" +
                                        "\uD83D\uDCDESmart/Sun/Tnt:0908-639-267");
            startActivity(i);
        });

        mhf.setOnClickListener(v -> {
            Intent i = new Intent(mentalhealthlist.this, mentalhealthdetail.class);
            i.putExtra("img", R.drawable.mhf);
            i.putExtra("actname", "Mental Health Foundation");
            i.putExtra("details", "Samaritans: \uD83D\uDCDE 116 123\n" +
                    "Crisis Hotline: Text SHOUT to 85258\n" +
                    "Calm: \uD83D\uDCDE 0800 58 58 5");
            startActivity(i);
        });

        mhph.setOnClickListener(v -> {
            Intent i = new Intent(mentalhealthlist.this, mentalhealthdetail.class);
            i.putExtra("img", R.drawable.mhph);
            i.putExtra("actname", "MentalHealthPH");
            i.putExtra("details", "NCMH Crisis Hotline Number:\n" +
                    "Smart/Sun/TnT:\n" +
                    "\uD83D\uDCDE0908-447-8479\n" +
                    "\uD83D\uDCDE0999-447-8479\n" +
                    "\n" +
                    "Globe/Tm:\n" +
                    "\uD83D\uDCDE0966-351-4518\n" +
                    "\uD83D\uDCDE0917-899-8727");
            startActivity(i);
        });

        sinag.setOnClickListener(v -> {
            Intent i = new Intent(mentalhealthlist.this, mentalhealthdetail.class);
            i.putExtra("img", R.drawable.sinag);
            i.putExtra("actname", "World Health Organization");
            i.putExtra("details", "Suicide Hotline of the Philippines : 1-800-273-8255\n\n" +
                    "Maaari rin tumawag sa\nDOH Mental Crisis Hotline:\n\n" +
                    "0917-899-USAP (8727)\n" +
                    "989-USAP (8727)\n\n" +
                    "o sa HOPELINE\n" +
                    "PLDT - (02) 804-4673\n" +
                    "GLOBE - 0917 558 4673\n" +
                    "Toll-free for Globe/TM - 2919");
            startActivity(i);
        });

        m.setOnClickListener(v -> {
            Intent i = new Intent(mentalhealthlist.this, mentalhealthdetailmore.class);
            startActivity(i);
        });

        b.setOnClickListener(v -> finish());



    }
}