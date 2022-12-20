package com.example.lab8;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.AppCompatAlertDialogStyle);
        builder.setTitle("Dialog");
        builder.setMessage("Покормить кота?");
        builder.setPositiveButton("Да", null);
        builder.setNegativeButton("Отмена", null);
        builder.show();
    }

    public void show(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),"Пора кормить котика!", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast, findViewById(R.id.toast_layout));
        TextView text = layout.findViewById(R.id.text);
        text.setText("Пора кормить котика!");
        ImageView catImageView = layout.findViewById(R.id.imageViev);
        catImageView.setImageResource(R.drawable.cat);
        toast.setView(layout);
        toast.show();
        /*LinearLayout toastContainer = (LinearLayout) toast.getView();
        ImageView catImageView = new ImageView(getApplicationContext());
        catImageView.setImageResource(R.drawable.cat);
        //toast.setView(catImageView);
        toastContainer.addView(catImageView, 0);
        toast.show();*/
    }
}