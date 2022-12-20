package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        EditText editTextUser = findViewById(R.id.editTextName);
        EditText editTextDescription = findViewById(R.id.editTextDescription);
        EditText editTextAuthor = findViewById(R.id.editTextAuthor);
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        intent.putExtra("username", editTextUser.getText().toString());
        intent.putExtra("gift", editTextDescription.getText().toString());
        intent.putExtra("author", editTextAuthor.getText().toString());
        startActivity(intent);
    }

    public void onClickProgram(View view) {
        Intent intent = new Intent(MainActivity.this, BirthdayActivity.class);
        startActivity(intent);
    }


}