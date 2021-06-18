package com.example.stressreductionhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;

import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;


public class musiclows extends AppCompatActivity {

MediaPlayer songs;
SeekBar mSeek;
TextView curpos, dur;

boolean playing = false;

Handler seekHandler = new Handler();
Runnable runnable;

    @SuppressLint({"SourceLockedOrientationActivity", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musiclows);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        curpos = findViewById(R.id.currentpos);
        dur = findViewById(R.id.duration);
        mSeek = findViewById(R.id.mSeek);

        songs = MediaPlayer.create(this, R.raw.mild);


        Button p = findViewById(R.id.play);
        Button s = findViewById(R.id.stop);
        Button ps = findViewById(R.id.pause);

        int dura = songs.getDuration();
        String sDura = convertFormat(dura);
        dur.setText(sDura);

        runnable = new Runnable() {
            @Override
            public void run() {
                mSeek.setProgress(songs.getCurrentPosition());

                seekHandler.postDelayed(this, 1000);
            }
        };

        p.setOnClickListener(v -> {
            songs.start();
            p.setVisibility(View.GONE);
            ps.setVisibility(View.VISIBLE);
            playing = true;
            mSeek.setMax(songs.getDuration());

            seekHandler.postDelayed(runnable,0);
        });


        ps.setOnClickListener(v -> {
            songs.pause();
            p.setVisibility(View.VISIBLE);
            ps.setVisibility(View.GONE);
            playing = false;
            seekHandler.removeCallbacks(runnable);
        });

        s.setOnClickListener(v -> {
            songs.reset();
            p.setVisibility(View.VISIBLE);
            ps.setVisibility(View.GONE);
            playing = false;
            curpos.setText("00:00");
            songs = MediaPlayer.create(musiclows.this, R.raw.mild);
        });

        mSeek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser){
                    songs.seekTo(progress);
                }

                curpos.setText(convertFormat(songs.getCurrentPosition()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        songs.setOnCompletionListener(mp -> {
            ps.setVisibility(View.GONE);
            p.setVisibility(View.VISIBLE);
            songs.seekTo(0);
        });

    }

    @SuppressLint("DefaultLocale")
    private String convertFormat(int dura) {
        //return String.format("%02d:%02d", TimeUnit.MILLISECONDS.toMinutes(dura), TimeUnit.MILLISECONDS.toSeconds(dura), TimeUnit.MINUTES.toSeconds(TimeUnit.SECONDS.toMinutes(dura)));
        long minutes = TimeUnit.MINUTES.convert(dura, TimeUnit.MILLISECONDS);
        long seconds = TimeUnit.SECONDS.convert(dura, TimeUnit.MILLISECONDS)-minutes* TimeUnit.SECONDS.convert(1, TimeUnit.MINUTES);

        return String.format("%02d:%02d", minutes, seconds);

    }

    @Override
    public void onBackPressed()
    {
        songs.stop();
        finish();
        super.onBackPressed();
    }

    public void onStop(){
        songs.pause();
        super.onStop();
    }

    public void onResume(){
        if (playing){
            songs.start();
        }
        super.onResume();
    }

}
