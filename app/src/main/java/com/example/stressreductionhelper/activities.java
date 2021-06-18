package com.example.stressreductionhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class activities extends AppCompatActivity {

    ImageView read, excer, mus,mov,play,cum;

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activities);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        read = findViewById(R.id.act1);
        excer = findViewById(R.id.act2);
        mus = findViewById(R.id.act3);
        mov = findViewById(R.id.act4);
        play = findViewById(R.id.act5);
        cum = findViewById(R.id.comingsoon);

        Button b = findViewById(R.id.back);

        read.setOnClickListener(v -> {

            Intent i = new Intent(activities.this, activity_detail.class);
            i.putExtra("img", R.drawable.read);
            i.putExtra("actname", "Reading");
            i.putExtra("details", "\nReading Books can even relax your body by lowering your heart rate and easing the tension in your muscles.");
            startActivity(i);

        });

        excer.setOnClickListener(v -> {
            Intent i = new Intent(activities.this, activity_detail.class);
            i.putExtra("img", R.drawable.excer);
            i.putExtra("actname", "Excercise");
            i.putExtra("details", "\nExercising reduces levels of the body's stress hormones, such as adrenaline and cortisol. It also stimulates the production of endorphins, chemicals in the brain that are the body's natural painkillers and mood elevators.");
            startActivity(i);
        });

        mus.setOnClickListener(v -> {
            Intent i = new Intent(activities.this, activity_detail.class);
            i.putExtra("img", R.drawable.musicc);
            i.putExtra("actname", "Playing Instrument");
            i.putExtra("details", "\nPlaying an instrument can help refocus bad energy into something positive and enjoyable, which in turn can help alleviate stress.");
            startActivity(i);
        });

        mov.setOnClickListener(v -> {
            Intent i = new Intent(activities.this, activity_detail.class);
            i.putExtra("img", R.drawable.movie);
            i.putExtra("actname", "Movie");
            i.putExtra("details", "\nWatching movies Watch exactly what you want, when you want! Take yourself out.");
            startActivity(i);
        });

        play.setOnClickListener(v -> {
            Intent i = new Intent(activities.this, activity_detail.class);
            i.putExtra("img", R.drawable.playing);
            i.putExtra("actname", "Play with Friends");
            i.putExtra("details", "\nFriends reduce your body's stress response. \n\n In one study researchers found that children who had a negative experience while their best friend was present not only felt better about themselves afterwards but also had lower levels of cortisol, the stress hormone, than those who did not have a friend present.");
            startActivity(i);
        });

        cum.setOnClickListener(v -> Toast.makeText(activities.this, "Content Coming Soon...", Toast.LENGTH_LONG).show());

        b.setOnClickListener(v -> finish());

    }
}