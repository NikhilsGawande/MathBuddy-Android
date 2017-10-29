package com.example.system.mathbuddy;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Over extends AppCompatActivity {


    public static void setDefaults(String key, int value, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt(key, value);
        editor.commit();
    }

    public static int getDefaults(String key, Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getInt(key, 0);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_over);

        String datatoCollect,flag;
        Intent intent = getIntent();
        datatoCollect = intent.getStringExtra("key");
        int score = Integer.parseInt(datatoCollect);

        flag = intent.getStringExtra("highscoretype");

        TextView yscore = (TextView)findViewById(R.id.score);
        yscore.setText(datatoCollect);

        TextView hscore = (TextView)findViewById(R.id.highscore);

        int high_score= 0;


        switch(flag){
            case "1": high_score = getDefaults("addscore", Over.this);
                if(score>high_score){
                   setDefaults("addscore",score,Over.this);
                }
                else{
                    setDefaults("addscore",high_score,Over.this);
                }

                break;
            case "2": high_score = getDefaults("subscore", Over.this);
                if(score>high_score){
                    setDefaults("subscore",score,Over.this);
                }
                else{
                    setDefaults("subscore",high_score,Over.this);
                }
                break;
            case "3": high_score = getDefaults("mulscore", Over.this);
                if(score>high_score){
                    setDefaults("mulscore",score,Over.this);
                }
                else{
                    setDefaults("mulscore",high_score,Over.this);
                }

                break;
            case "4": high_score = getDefaults("divscore", Over.this);
                if(score>high_score){
                    setDefaults("divscore",score,Over.this);
                }
                else{
                    setDefaults("divscore", high_score, Over.this);
                }

                break;
            case "5": high_score = getDefaults("sqscore", Over.this);
                if(score>high_score){
                    setDefaults("sqscore",score,Over.this);
                }
                else{
                    setDefaults("sqscore",high_score,Over.this);
                }

                break;
        }

        if(score>high_score){
           hscore.setText(""+score);
        }
        else{
           hscore.setText(""+high_score);
        }

        Button again = (Button) findViewById(R.id.again);
        again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Over.this, Play.class);
                startActivity(intent);

            }
        });
        Button home_over = (Button) findViewById(R.id.home_over);
        home_over.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Over.this, Home.class);
                startActivity(intent);

            }
        });
    }

}
