package com.teamuppercaseguy2.android_PHINMAUPangGuide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HelpSelectActivity extends AppCompatActivity {

    Button _viewEnrollment, _viewUniform, _viewFees, _viewCampus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_select);

        _viewEnrollment = findViewById(R.id.view_Enrollment);
        _viewUniform = findViewById(R.id.view_uniforms);
        _viewFees = findViewById(R.id.view_Fees);
        _viewCampus = findViewById(R.id.view_campus);


        _viewEnrollment.setOnClickListener(view -> {
            startActivity(new Intent(HelpSelectActivity.this, EnrollmentStepsActivity.class));
        });
    }
}