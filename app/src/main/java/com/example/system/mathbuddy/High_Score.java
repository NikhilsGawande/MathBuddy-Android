package com.example.system.mathbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class High_Score extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high__score);
        Button home_score = (Button) findViewById(R.id.home_score);
        home_score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(High_Score.this, Home.class);
                startActivity(intent);

            }
        });
        Button back_score = (Button) findViewById(R.id.back_score);
        back_score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(High_Score.this, Try_this.class);
                startActivity(intent);

            }
        });

        int add = Over.getDefaults("addition",High_Score.this);
        TextView addition = (TextView)findViewById(R.id.add1);
        addition.setText(""+add);
    }

}
