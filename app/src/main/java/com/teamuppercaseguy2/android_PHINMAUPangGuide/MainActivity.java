package com.teamuppercaseguy2.android_PHINMAUPangGuide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button _findMore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _findMore = findViewById(R.id.button_findMore);

        _findMore.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, HelpSelectActivity.class));
        });


        getWindow().setNavigationBarColor(getResources().getColor(R.color.upang_darkgreen));
    }
}