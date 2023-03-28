package com.example.myapplication;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public static final String EXTRA_MESSAGE="MainActivity.MESSAGE";
    /* Цей метод викликається коли користувач натискає кнопку "Button" */
    public void sendMessage(View view)
    {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        TextView textView = (TextView) findViewById(R.id.textView);
        String message = textView.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}