package com.example.appcommerce;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        final Intent intentSplash = new Intent(this, MainActivity.class);

        final Handler handlerSplash = new Handler();
        final Runnable r = new Runnable() {
            public void run() {
                startActivity(intentSplash);
                //Finaliza a Splash Activity
                finish();
            }
        };
        handlerSplash.postDelayed(r, 3000);
    }
}
