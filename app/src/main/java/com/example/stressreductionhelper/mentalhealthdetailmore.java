package com.example.stressreductionhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.Button;
import android.widget.TextView;

public class mentalhealthdetailmore extends AppCompatActivity {

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mentalhealthdetailmore);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        TextView tv = findViewById(R.id.mc);
        Button b = findViewById(R.id.back);

        String setText = "Philippine Mental Health Association Online Support: PMHA Facebook Messenger\n" +
                "pmhacds@gmail.com\n" +
                "0917-565-2036\n\n" +
                "Ateneo Bulatao Center for Psychological Services: \n" +
                "Email: bulataocenter.ls@ateneo.edu\n" +
                "Website: ateneobulataocenter.com\n\n" +
                "Philippine Psychiatric Association: Mind Matters\n" +
                "0918-942-4864\n\n" +
                "sychConsult, Inc. \n" +
                "(02) 842-12469\n\n" +
                "GrayMatters Psychological and Consultancy, Inc. Philippines \n" +
                "0917-709-6961\n" +
                "0997-561-8778";

        tv.setText(setText);
        tv.setMovementMethod(new ScrollingMovementMethod());

        b.setOnClickListener(v -> finish());

    }
}