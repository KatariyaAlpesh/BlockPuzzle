package com.example.blockpuzzle;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class OpenPage extends AppCompatActivity
{

    TextView tv1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_page);

        tv1 = findViewById(R.id.TV1);

        Animation Splash = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotation_splash);
        tv1.setAnimation(Splash);

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                Intent IHome = new Intent(OpenPage.this , LevelPage.class);
                startActivity(IHome);
                finish();
            }
        }, 4000);

    }
}