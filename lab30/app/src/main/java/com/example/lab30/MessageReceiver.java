package com.example.lab30;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MessageReceiver extends BroadcastReceiver {
    public MessageReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Обнаружено сообщение: " +
                intent.getStringExtra("ru.alexanderklimov.broadcast.Message"), Toast.LENGTH_SHORT).show();
    }
}