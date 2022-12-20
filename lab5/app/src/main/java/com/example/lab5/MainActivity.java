package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textViewFirst = findViewById(R.id.textSleep);
        TextView textViewSecond = findViewById(R.id.textView);
        TextView textViewThird = findViewById(R.id.textView2);

        ImageView imageView = findViewById(R.id.Cat2);
        imageView.setOnClickListener(v -> {
            String[] phrases = {"Уже 6 часов утра, Наташ",
                    "Вставай, мы там всё уронили",
                    "Мы уронили вообще всё, Наташ",
                    "Наташ, ты чё опять лежишь?",
                    "Часики-то тикают",
                    "Мужика-то хоть нашла себе?",
                    "Уже дитачек пора рожать вообще-то"};

            shuffleArray(phrases);

            textViewFirst.setText(phrases[0]);
            textViewSecond.setText(phrases[1]);
            textViewThird.setText(phrases[2]);
        });
    }
    void shuffleArray(String[] ar){
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            String a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
}