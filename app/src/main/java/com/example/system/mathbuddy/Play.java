package com.example.system.mathbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Play extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        Button home_play = (Button) findViewById(R.id.home_play);
        home_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Play.this, Home.class);
                startActivity(intent);

            }
        });
        Button back_play = (Button) findViewById(R.id.back_play);
        back_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Play.this, Try_this.class);
                startActivity(intent);

            }
        });
        Button addition = (Button) findViewById(R.id.addition);
        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Play.this, Game_is_on.class);
                intent.putExtra("key","1");
                startActivity(intent);

            }
        });
        Button subtraction = (Button) findViewById(R.id.subtraction);
        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Play.this, Game_is_on.class);
                intent.putExtra("key","2");
                startActivity(intent);

            }
        });
        Button multiplication = (Button) findViewById(R.id.multiplication);
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Play.this, Game_is_on.class);
                intent.putExtra("key","3");
                startActivity(intent);

            }
        });
        Button division = (Button) findViewById(R.id.division);
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Play.this, Game_is_on.class);
                intent.putExtra("key","4");
                startActivity(intent);

            }
        });
        Button square = (Button) findViewById(R.id.square);
        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Play.this, Game_is_on.class);
                intent.putExtra("key","5");
                startActivity(intent);

            }
        });


    }

}
