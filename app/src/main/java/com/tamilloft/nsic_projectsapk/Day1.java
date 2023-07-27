package com.tamilloft.nsic_projectsapk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.widget.TextView;

public class Day1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day1);
        TextView textView = findViewById(R.id.textId);
        SpannableStringBuilder ssb = new SpannableStringBuilder();
        ssb.append("welcome to ");
        ssb.setSpan(new ImageSpan(this,R.drawable.ic_android_black_24dp), ssb.length() -1, ssb.length(), 0);
        ssb.append("the hel..!");
        textView.setText(ssb);
    }
}