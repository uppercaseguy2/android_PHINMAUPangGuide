package com.teamuppercaseguy2.android_PHINMAUPangGuide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import java.util.ArrayList;

public class InsideCampusActivity extends AppCompatActivity {
    RecyclerView _recyclerView;
    ImageButton _backBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inside_campus);

        _backBtn = findViewById(R.id.btn_return);

        _backBtn.setOnClickListener(view -> startActivity(new Intent(InsideCampusActivity.this, HelpSelectActivity.class)));

        _recyclerView = findViewById(R.id.campusRecyclerView);
        _recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        _recyclerView.setItemAnimator(new DefaultItemAnimator());
        _recyclerView.setHasFixedSize(true);

        ArrayList<CampusModel> campusModels = new ArrayList<>();
        campusModels.add(new CampusModel(R.drawable.img_campus, "CAMPUS"));
        campusModels.add(new CampusModel(R.drawable.img_cma, "CMA BUILDING"));
        campusModels.add(new CampusModel(R.drawable.img_basiced, "BASIC ED BUILDING"));
        campusModels.add(new CampusModel(R.drawable.img_mba, "MBA BUILDING"));
        campusModels.add(new CampusModel(R.drawable.img_nh, "NH BUILDING"));
        campusModels.add(new CampusModel(R.drawable.img_cite, "CITE BUILDING"));
        campusModels.add(new CampusModel(R.drawable.img_sp, "STUDENT PLAZA"));
        campusModels.add(new CampusModel(R.drawable.img_hallway, "HALLWAY"));

        _recyclerView.setAdapter(new CampusAdapter(InsideCampusActivity.this, campusModels));
    }
}