package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onStartFirst(View view) {
        Intent intent = new Intent(MainActivity.this, MyService1.class);
        startService(intent);
    }
    public void onStartSecond(View view){
        Intent intent = new Intent(MainActivity.this, MyService2.class);
        startService(intent);

    }
    public void onStartThird(View view){
        Intent intent = new Intent(MainActivity.this, MyService3.class);
        startService(intent);

    }
}