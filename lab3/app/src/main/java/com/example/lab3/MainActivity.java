package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mCountCrows = 0;
    private int mCountCats = 0;
    private TextView mInfoTextView;

    private static final String KEY_COUNT = "COUNT";
    private static final String KEY_COUNT_CAT = "COUNT_CAT";

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mCrowsCounterButton = findViewById(R.id.buttonCount);
        Button mCatsCountButton = findViewById(R.id.buttonCountCat);
        mInfoTextView = findViewById(R.id.textView);
        if (savedInstanceState != null) {
            mCountCrows = savedInstanceState.getInt(KEY_COUNT, 0);
            mInfoTextView.setText("Я насчитал " + mCountCrows + " ворон");
            mCountCats = savedInstanceState.getInt(KEY_COUNT_CAT,0);
            mInfoTextView.setText("Я насчитал " + mCountCats + " котов");

        }
        mCrowsCounterButton.setOnClickListener(v -> mInfoTextView.setText("Я насчитал " + ++mCountCrows +" ворон"));
        mCatsCountButton.setOnClickListener(v -> mInfoTextView.setText("Я насчитал " + ++mCountCats +" котов"));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_COUNT, mCountCrows);
    }

    @SuppressLint("SetTextI18n")
    public void onClick(View view) {
        mInfoTextView.setText("Hello Kitty!");
    }
}