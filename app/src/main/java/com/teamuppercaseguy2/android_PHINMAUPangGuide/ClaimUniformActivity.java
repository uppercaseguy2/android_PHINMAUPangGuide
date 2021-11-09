package com.teamuppercaseguy2.android_PHINMAUPangGuide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

public class ClaimUniformActivity extends AppCompatActivity {
    TextView _linkCMA, _linkCITE,_linkCSS,_linkCEA,_linkCHS;
    ImageButton _backBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_claim_uniform);

        _backBtn = findViewById(R.id.btn_return);
        _backBtn.setOnClickListener(view -> onBackPressed());

        _linkCMA =  findViewById(R.id.link_cma);
        _linkCITE =  findViewById(R.id.link_cite);
        _linkCSS =  findViewById(R.id.link_css);
        _linkCEA =  findViewById(R.id.link_cea);
        _linkCHS =  findViewById(R.id.link_chs);

        toUnderline(_linkCMA);
        toUnderline(_linkCITE);
        toUnderline(_linkCSS);
        toUnderline(_linkCEA);
        toUnderline(_linkCHS);

        _linkCMA.setOnClickListener(view -> toURL(_linkCMA));
        _linkCITE.setOnClickListener(view -> toURL(_linkCITE));
        _linkCSS.setOnClickListener(view -> toURL(_linkCSS));
        _linkCEA.setOnClickListener(view -> toURL(_linkCEA));
        _linkCHS.setOnClickListener(view -> toURL(_linkCHS));


    }

    private void toURL(TextView textView) {
        Uri uri = Uri.parse(textView.getText().toString());
        Intent intent= new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }

    private void toUnderline(TextView textView){
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

    }


}