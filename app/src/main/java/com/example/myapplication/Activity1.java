package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Activity1 extends AppCompatActivity {

    Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);
        Intent it1 = getIntent();
        String totalscore = it1.getStringExtra("Total Score");
        startButton = findViewById(R.id.startButton);
        startButton.setOnClickListener(view -> {
            Intent it = new Intent(Activity1.this,Activity2.class);
            it.putExtra("Total Score", totalscore);
            startActivity(it);
        });
    }
}