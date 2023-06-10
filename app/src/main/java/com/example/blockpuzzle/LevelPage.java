package com.example.blockpuzzle;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LevelPage extends AppCompatActivity implements View.OnClickListener
{

    TextView back,three,four,five,six,seven,eight;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_page);

        back = findViewById(R.id.Back);
        three = findViewById(R.id.Three);
        four = findViewById(R.id.Four);
        five = findViewById(R.id.Five);
        six = findViewById(R.id.Six);
        seven = findViewById(R.id.Seven);
        eight = findViewById(R.id.Eight);

        back.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        if (view.getId()==three.getId())
        {
            Intent INext;
            INext = new Intent(LevelPage.this , Three.class);
            startActivity(INext);
        }

        if (view.getId()==four.getId())
        {
            Intent Inext;
            Inext = new Intent(LevelPage.this , Four.class);
            startActivity(Inext);
        }

        if (view.getId()==five.getId())
        {
            Intent Inext;
            Inext = new Intent(LevelPage.this , Five.class);
            startActivity(Inext);
        }

        if (view.getId() == six.getId())
        {
            Intent Inext;
            Inext = new Intent(LevelPage.this , Six.class);
            startActivity(Inext);
        }

        if (view.getId() == seven.getId())
        {
            Intent Inext;
            Inext = new Intent(LevelPage.this , Seven.class);
            startActivity(Inext);
        }

        if (view.getId() == eight.getId())
        {
            Intent Inext;
            Inext = new Intent(LevelPage.this , Eight.class);
            startActivity(Inext);
        }
    }
}