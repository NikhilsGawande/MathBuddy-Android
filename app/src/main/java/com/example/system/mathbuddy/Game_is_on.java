package com.example.system.mathbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class Game_is_on extends AppCompatActivity {
    int a,score_value;
    String flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_is_on);

        //set score to zero
        Intent intent = getIntent();
        flag = intent.getStringExtra("key");
        score_value=0;
        TextView sco = (TextView)findViewById(R.id.sco);
        sco.setText("" + score_value);

        a = createexpr();

        final TextView answr= (TextView) findViewById(R.id.ans);



        //code to get numbers from button
        Button one = (Button)findViewById(R.id.one);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                answr.setText(answr.getText() + "1");
                checkanswer();
            }
        });


        Button two = (Button)findViewById(R.id.two);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answr.setText(answr.getText()+ "2");
                checkanswer();
            }
        });

        Button three = (Button)findViewById(R.id.three);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answr.setText(answr.getText()+ "3");
                checkanswer();
            }
        });

        Button four = (Button)findViewById(R.id.four);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answr.setText(answr.getText()+ "4");
                checkanswer();
            }
        });

        Button five = (Button)findViewById(R.id.five);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answr.setText(answr.getText()+ "5");
                checkanswer();
            }
        });

        Button six = (Button)findViewById(R.id.six);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answr.setText(answr.getText()+ "6");
                checkanswer();
            }
        });

        Button seven = (Button)findViewById(R.id.seven);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answr.setText(answr.getText()+ "7");
                checkanswer();
            }
        });

        Button eight = (Button)findViewById(R.id.eight);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answr.setText(answr.getText()+ "8");
                checkanswer();
            }
        });

        Button nine = (Button)findViewById(R.id.nine);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answr.setText(answr.getText()+ "9");
                checkanswer();
            }
        });

        Button zero = (Button)findViewById(R.id.zero);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answr.setText(answr.getText()+ "0");
                checkanswer();
            }
        });
    }
    public int createexpr() {
        Random rand = new Random();
        int no1 = rand.nextInt(100);
        int no2 = rand.nextInt(100);
        int ans=0;

        TextView exp = (TextView) findViewById(R.id.exp);
        switch (flag){
            case "1": exp.setText("" + no1 + " + " + no2);
                      ans = no1 + no2;
                      break;
            case "2": while(no1<no2){
                         no1 = rand.nextInt(100);
                         no2 = rand.nextInt(100);
                      }
                      exp.setText("" + no1 + " - " + no2);
                      ans =  no1 - no2;
                      break;
            case "3": exp.setText("" + no1 + " * " + no2);
                      ans = no1 * no2;
                      break;
            case "4":  while(no1/no2==0){
                            no1 = rand.nextInt(100);
                            no2 = rand.nextInt(100);
                     }
                      exp.setText("" + no1 + " / " + no2);
                      ans = no1 / no2;
                      break;
            case "5": exp.setText("" + no1);
                      ans = no1 * no1 ;
                      break;
        }
        return ans;

    }
    public void checkanswer(){
        TextView answr= (TextView) findViewById(R.id.ans);
        TextView sco = (TextView)findViewById(R.id.sco);
        String ans = (String)answr.getText();
        int answer = Integer.parseInt(ans);
        if(answer == a ){
            score_value++;
            sco.setText("" + score_value);
            a = createexpr();
            answr.setText("");
        }
        else if(answer > a){
            String dataToPass =(String) sco.getText();
            Intent intent = new Intent(Game_is_on.this,Over.class);
            intent.putExtra("key", dataToPass);
            intent.putExtra("highscoretype",flag);
            startActivity(intent);
        }

    }

}
