package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA=0;
    int scoreB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Aplus3(View v){
        scoreA=scoreA+3;
        displayA(scoreA);
    }

    public void Aplus2(View v){
        scoreA=scoreA+2;
        displayA(scoreA);
    }

    public void Aplusfree(View v){
        scoreA=scoreA+1;
        displayA(scoreA);
    }

    public void Bplus3(View v){
        scoreB=scoreB+3;
        displayB(scoreB);
    }

    public void Bplus2(View v){
        scoreB=scoreB+2;
        displayB(scoreB);
    }

    public void Bplusfree(View v){
        scoreB=scoreB+1;
        displayB(scoreB);
    }

    public void displayA(int sA){
        TextView scoreView = (TextView) findViewById(R.id.teamA_score);
        scoreView.setText(String.valueOf(sA));
    }

    public void displayB(int sB){
        TextView scoreView = (TextView) findViewById(R.id.teamB_score);
        scoreView.setText(String.valueOf(sB));
    }

    public void resetScore(View v){
        scoreA=0;
        scoreB=0;
        displayA(scoreA);
        displayB(scoreB);
    }
}
