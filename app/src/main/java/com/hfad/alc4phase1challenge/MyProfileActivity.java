package com.hfad.alc4phase1challenge;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MyProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setElevation(0);
        }
    }
}
