package com.example.lab6;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends Activity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        String user = getIntent().getExtras().getString("username");
        String gift = getIntent().getExtras().getString("gift");
        String author = getIntent().getExtras().getString("author");
        TextView textView = findViewById(R.id.textView);
        textView.setText(user + ", вам передали " + gift + " от " + author);
    }
}
