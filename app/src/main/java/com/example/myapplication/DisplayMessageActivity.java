package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        //Одержуємо повідомлення і зберігаємо в змінній message
        Intent intent = getIntent();
        String message=intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        //Через вказівник на компонент екрану TextView2 передаємо текст
        TextView textView2=(TextView) findViewById(R.id.textView2);
        textView2.setText(message);
    }
}