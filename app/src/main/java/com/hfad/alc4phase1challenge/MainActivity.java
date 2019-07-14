package com.hfad.alc4phase1challenge;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToProfile(View view) {
        Intent intent = new Intent(this, MyProfileActivity.class);
        startActivity(intent);
    }

    public void goToAboutAlc(View view) {
        Intent intent = new Intent(this, AboutALCActivity.class);
        startActivity(intent);
    }
}
