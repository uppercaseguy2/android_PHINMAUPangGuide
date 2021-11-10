package com.teamuppercaseguy2.android_PHINMAUPangGuide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;

public class PayFeesActivity extends AppCompatActivity {
    ImageButton _backBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_fees);

        _backBtn = findViewById(R.id.btn_return);
        _backBtn.setOnClickListener(view -> onBackPressed());
    }
}