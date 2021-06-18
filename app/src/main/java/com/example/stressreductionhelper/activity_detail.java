package com.example.stressreductionhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_detail extends AppCompatActivity {

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        ImageView actpc = findViewById(R.id.actpic);
        TextView actnameTV = findViewById(R.id.activityname);
        TextView actdetails = findViewById(R.id.actdetails);
        Bundle img = getIntent().getExtras();

        if (img!=null){
            int imgid = img.getInt("img");
            actpc.setImageResource(imgid);
        }
        String an = getIntent().getExtras().getString("actname");
        String ad = getIntent().getExtras().getString("details");
        actnameTV.setText(an);
        actdetails.setText(ad);
        actdetails.setMovementMethod(new ScrollingMovementMethod());

        actpc.setOnClickListener(v -> finish());


    }
}