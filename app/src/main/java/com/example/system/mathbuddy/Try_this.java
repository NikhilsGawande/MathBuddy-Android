package com.example.system.mathbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Try_this extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_try_this);
        Button gameplay = (Button) findViewById(R.id.gameplay);
        gameplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Try_this.this, Play.class);
                startActivity(intent);

            }
        });
        Button highscore = (Button) findViewById(R.id.highscore);
        highscore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Try_this.this, High_Score.class);
                startActivity(intent);

            }
        });
        Button home_try = (Button) findViewById(R.id.home_try);
        home_try.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Try_this.this, Home.class);
                startActivity(intent);

            }
        });
    }

}
