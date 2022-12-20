package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView mInfoTextView;
    private ConstraintLayout mConstraintLayout;
    private Button yellowButton;
    private Button greenButton;
    private Button redButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mInfoTextView = findViewById(R.id.textView);
        mConstraintLayout = findViewById(R.id.rootLayout);
        yellowButton = findViewById(R.id.buttonYellow);
        greenButton = findViewById(R.id.buttonGreen);
        redButton = findViewById(R.id.buttonRed);
        yellowButton.setOnClickListener(this);
        greenButton.setOnClickListener(this);
        redButton.setOnClickListener(this);
    }
    @SuppressLint("NonConstantResourceId")
    @Override
   public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonRed: mInfoTextView.setText(R.string.red);
                mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.redColor)); break;
            case R.id.buttonYellow: mInfoTextView.setText(R.string.yellow);
                mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.yellowColor)); break;
            case R.id.buttonGreen: mInfoTextView.setText(R.string.green);
                mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.greenColor)); break;
        }
    }
}