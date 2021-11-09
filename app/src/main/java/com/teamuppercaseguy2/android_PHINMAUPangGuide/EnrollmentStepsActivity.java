package com.teamuppercaseguy2.android_PHINMAUPangGuide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class EnrollmentStepsActivity extends AppCompatActivity {
    TextView _linkEnroll, _linkProof;
    ImageButton _backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enrollment_steps);

       _linkEnroll =  findViewById(R.id.link_enroll);
       _linkProof =  findViewById(R.id.link_proof);
       _backBtn = findViewById(R.id.btn_return);

       _backBtn.setOnClickListener(view -> onBackPressed());

       _linkProof.setPaintFlags(_linkProof.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
       _linkEnroll.setPaintFlags(_linkEnroll.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

       _linkEnroll.setOnClickListener(view ->
               GoToURL(_linkEnroll.getText().toString())
               );
        _linkProof.setOnClickListener(view ->
                GoToURL(_linkProof.getText().toString())
        );

    }

    void GoToURL(String url){
        Uri uri = Uri.parse(url);
        Intent intent= new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}