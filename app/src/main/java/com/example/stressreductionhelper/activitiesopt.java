package com.example.stressreductionhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class activitiesopt extends AppCompatActivity {

    ImageView vg, meditate, busy,lovelytalk,sleep,cum;

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitiesopt);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        vg = findViewById(R.id.act1);
        meditate = findViewById(R.id.act2);
        busy = findViewById(R.id.act3);
        lovelytalk = findViewById(R.id.act4);
        sleep = findViewById(R.id.act5);
        cum = findViewById(R.id.comingsoon);

        Button b = findViewById(R.id.back);

        vg.setOnClickListener(v -> {

            Intent i = new Intent(activitiesopt.this, activity_detail.class);
            i.putExtra("img", R.drawable.videogames);
            i.putExtra("actname", "Video Games");
            i.putExtra("details", "\nPlay video games Video games are engaging and enjoyable, which reduces stress. Gaming results in dopamine secretion, which makes you feel good.");
            startActivity(i);

        });

        meditate.setOnClickListener(v -> {
            Intent i = new Intent(activitiesopt.this, activity_detail.class);
            i.putExtra("img", R.drawable.meditate);
            i.putExtra("actname", "Meditation");
            i.putExtra("details", "\nMeditation can produce a deep state of relaxation and a tranquil mind. During meditation, you focus your attention and eliminate the stream of jumbled thoughts that may be crowding your mind and causing stress.");
            startActivity(i);
        });

        busy.setOnClickListener(v -> {
            Intent i = new Intent(activitiesopt.this, activity_detail.class);
            i.putExtra("img", R.drawable.busy);
            i.putExtra("actname", "Make yourself busy");
            i.putExtra("details", "\nMake your self busy Making yourself busy can help you forgets the stress that you feel.");
            startActivity(i);
        });

        lovelytalk.setOnClickListener(v -> {
            Intent i = new Intent(activitiesopt.this, activity_detail.class);
            i.putExtra("img", R.drawable.lovelytalk);
            i.putExtra("actname", "Lovely Talk");
            i.putExtra("details", "\nHave a deep conversation with a supportive loved one. Talk about life and open up all the problems you have been experiencing.");
            startActivity(i);
        });

        sleep.setOnClickListener(v -> {
            Intent i = new Intent(activitiesopt.this, activity_detail.class);
            i.putExtra("img", R.drawable.sleep);
            i.putExtra("actname", "Sleep");
            i.putExtra("details", "\nSleep in, and feel good about it. Sleep is a powerful stress reducer. Following a regular sleep routine calms and restores the body, improves concentration, regulates mood, and sharpens judgment and decision-making.");
            startActivity(i);
        });

        cum.setOnClickListener(v -> Toast.makeText(activitiesopt.this, "Content Coming Soon...", Toast.LENGTH_LONG).show());

        b.setOnClickListener(v -> finish());
    }
}