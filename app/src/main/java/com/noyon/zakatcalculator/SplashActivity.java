package com.noyon.zakatcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.VideoView;

public class SplashActivity extends AppCompatActivity {

    VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        video=findViewById(R.id.video);

         video.setVideoPath("android.resource://" + getPackageName() + "/"
                 + R.raw.logo);


         video.start();




         new Handler().postDelayed(new Runnable() {
             @Override
             public void run() {

                 Intent myIntent=new Intent(SplashActivity.this,MainActivity.class);
                 startActivity(myIntent);
                  finish();

             }
         },2000);







    }
}