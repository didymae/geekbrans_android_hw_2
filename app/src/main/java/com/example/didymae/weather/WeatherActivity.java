package com.example.didymae.weather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toolbar;

public class WeatherActivity extends AppCompatActivity {
private static final String TAG = "WeatherActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //setTheme(R.style.Theme_AppCompat_NoActionBar);
        super.onCreate(savedInstanceState);
        //android.support.v7.widget.Toolbar toolbar = findViewById(R.id.weather_toolbar);
        //setSupportActionBar(toolbar);
        setContentView(R.layout.weather_main);
        Log.d(TAG,"onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart");

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG,"onSaveInstanceState");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG,"onPause");

    }
}
