package com.example.system.mathbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Formulas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulas);
        Button home_formulas = (Button) findViewById(R.id.home_formulas);
        home_formulas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Formulas.this, Home.class);
                startActivity(intent);
            }
        });
        Button back_formulas = (Button) findViewById(R.id.back_formulas);
        back_formulas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Formulas.this, Learn_it.class);
                startActivity(intent);
            }
        });
        TextView text = (TextView) findViewById(R.id.formulas);
        text.setMovementMethod(new ScrollingMovementMethod());
    }

}
