package com.example.android.footballmatch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int noGoalT1,noGoalT2,noFoulT1,noFoulT2,noYellowT1,noYellowT2,noRedT1,noRedT2,noOffsideT1,noOffsideT2;
    TextView TGoalT1,TGoalT2,TFoulT1,TFoulT2,TYellowT1,TYellowT2,TRedT1,TRedT2,TOffsideT1,TOffsideT2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TGoalT1=(TextView)findViewById(R.id.goalT1);
        TGoalT2=(TextView)findViewById(R.id.goalT2);
        TFoulT1=(TextView)findViewById(R.id.foulT1);
        TFoulT2=(TextView)findViewById(R.id.foulT2);
        TYellowT1=(TextView)findViewById(R.id.yellowT1);
        TYellowT2=(TextView)findViewById(R.id.yellow2);
        TRedT1=(TextView)findViewById(R.id.redT1);
        TRedT2=(TextView)findViewById(R.id.redT2);
        TOffsideT1=(TextView)findViewById(R.id.offsideT1);
        TOffsideT2=(TextView)findViewById(R.id.offsideT2);
    }

    public void rest(View view) {
        noGoalT1=0;
        noFoulT1=0;
        noYellowT1=0;
        noRedT1=0;
        noOffsideT1=0;
        noGoalT2=0;
        noFoulT2=0;
        noYellowT2=0;
        noRedT2=0;
        noOffsideT2=0;
        TGoalT2.setText(String.valueOf(noGoalT2));
        TFoulT2.setText(String.valueOf(noFoulT2));
        TYellowT2.setText(String.valueOf(noYellowT2));
        TRedT2.setText(String.valueOf(noRedT2));
        TOffsideT2.setText(String.valueOf(noOffsideT2));
        TFoulT1.setText(String.valueOf(noFoulT1));
        TRedT1.setText(String.valueOf(noRedT1));
        TYellowT1.setText(String.valueOf(noYellowT1));
        TGoalT1.setText(String.valueOf(noGoalT1));
        TOffsideT1.setText(String.valueOf(noOffsideT1));
    }

    public void goal2(View view) {
        noGoalT2++;
        TGoalT2.setText(String.valueOf(noGoalT2));
    }

    public void foul2(View view) {
        noFoulT2++;
        TFoulT2.setText(String.valueOf(noFoulT2));
    }

    public void yellow2(View view) {
        noYellowT2++;
        TYellowT2.setText(String.valueOf(noYellowT2));
    }

    public void red2(View view) {
        noRedT2++;
        TRedT2.setText(String.valueOf(noRedT2));
    }

    public void offside2(View view) {
        noOffsideT2++;
        TOffsideT2.setText(String.valueOf(noOffsideT2));
    }

    public void foul1(View view) {
        noFoulT1++;
        TFoulT1.setText(String.valueOf(noFoulT1));
    }

    public void yellow1(View view) {
        noYellowT1++;
        TYellowT1.setText(String.valueOf(noYellowT1));
    }

    public void red1(View view) {
        noRedT1++;
        TRedT1.setText(String.valueOf(noRedT1));
    }

    public void offside1(View view) {
        noOffsideT1++;
        TOffsideT1.setText(String.valueOf(noOffsideT1));
    }

    public void goal1(View view) {
        noGoalT1++;
        TGoalT1.setText(String.valueOf(noGoalT1));
    }
}
