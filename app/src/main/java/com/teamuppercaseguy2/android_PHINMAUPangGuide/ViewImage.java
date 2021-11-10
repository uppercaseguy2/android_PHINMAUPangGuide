package com.teamuppercaseguy2.android_PHINMAUPangGuide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewImage extends AppCompatActivity {
        ImageView _viewImage;
        TextView _viewText;
        ImageButton _backBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_image);

        _backBtn = findViewById(R.id.btn_return);

        _backBtn.setOnClickListener(view -> onBackPressed());

        _viewImage = findViewById(R.id.viewImage);
        _viewText = findViewById(R.id.viewText);

        int _Img = 0;
        int _position = 0;
        String _campusName = "";

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            _campusName = extras.getString("name");
            _position = extras.getInt("position");
            _Img = extras.getInt("image");
        }
        _viewText.setText(_campusName);
        _viewImage.setImageResource(_Img);

        if ((_position%2) ==0){
            _viewText.setTextColor(getResources().getColor(R.color.upang_blue));
        }
    }
}