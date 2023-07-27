package com.tamilloft.nsic_projectsapk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.VideoView;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Day4 extends AppCompatActivity {

    VideoView videoView;
    ListView listView;
    ArrayList<String> videoList;
    ArrayAdapter adapter;
    private Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day4);

        videoView = findViewById(R.id.videoView);
        listView = findViewById(R.id.lodVideo);
        videoList = new ArrayList<>();
        videoList.add("video1");
        videoList.add("video2");
        videoList.add("video3");

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, videoList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video1));
                        break;
                    case 1:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video2));
                        break;
                    case 2:
                        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video3));
                        break;
                    default:
                        break;
                }
                videoView.setMediaController(new MediaController(Day4.this));
                videoView.requestFocus();
                videoView.start();
            }
        });
        }
}