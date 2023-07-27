package com.tamilloft.nsic_projectsapk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    private static final int SPLASH_TIME_OUT = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(MainActivity.this, projects_page.class);
            startActivity(intent);
            finish();

        },SPLASH_TIME_OUT);
    }


}