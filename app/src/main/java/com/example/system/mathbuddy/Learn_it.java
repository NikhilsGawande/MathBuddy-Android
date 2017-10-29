package com.example.system.mathbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Learn_it extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_it);


        Button home_learnit = (Button)findViewById(R.id.home_learnit);
        home_learnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Learn_it.this, Home.class);
                startActivity(intent);
            }
        });
        Button aboutmaths = (Button)findViewById(R.id.whatismaths);
        aboutmaths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Learn_it.this,About_Mathematics.class);
                startActivity(intent);
            }
        });
        Button formulas = (Button)findViewById(R.id.formulas);
        formulas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Learn_it.this, Formulas.class);
                startActivity(intent);
            }
        });


    }

}
