package com.tamilloft.nsic_projectsapk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;

public class projects_page extends AppCompatActivity {
    CardView day1, day2, day3, day4, day5,day6, day7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects_page);

        day1 = findViewById(R.id.day1);
        day2 = findViewById(R.id.day2);
        day3 = findViewById(R.id.day3);
        day4 = findViewById(R.id.day4);
        day5 = findViewById(R.id.day5);
        day6 = findViewById(R.id.day6);
        day7 = findViewById(R.id.day7);



       day1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(projects_page.this, Day1.class);
               startActivity(intent);
           }
       });
        day2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(projects_page.this, Day2.class);
                startActivity(intent);
            }
        });
        day3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(projects_page.this, Day3.class);
                startActivity(intent);
            }
        });
        day4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(projects_page.this, Day4.class);
                startActivity(intent);
            }
        });
        day5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(projects_page.this, Day5.class);
                startActivity(intent);
            }
        });
        day6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(projects_page.this, Day6.class);
                startActivity(intent);
            }
        });
        day7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(projects_page.this, Day7.class);
                startActivity(intent);
            }
        });

    }
}