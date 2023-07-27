package com.tamilloft.nsic_projectsapk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

//import com.github.chrisbanes.photoview.PhotoView;

public class Day5 extends AppCompatActivity {
    GridView gridView;
    ///PhotoView
            ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day5);
        gridView = findViewById(R.id.gv);
        imageView = findViewById(R.id.imageView);
        gridView.setVisibility(View.VISIBLE);
        imageView.setVisibility(View.INVISIBLE);
        gridView.setAdapter(new ImageAdapter(this));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                imageView.setVisibility(View.VISIBLE);
                gridView.setVisibility(View.INVISIBLE);
                ImageAdapter adapter=new ImageAdapter(Day5.this);
                imageView.setImageResource(adapter.image[position]);



            }
        });
    }

    private void goTOback() {
     Intent intent = new Intent(this,Day5.class);
     startActivity(intent);
    }

}