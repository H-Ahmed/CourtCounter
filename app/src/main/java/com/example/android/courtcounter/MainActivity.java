package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreForTeamA = 0;
    private int scoreForTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamAScore);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamBScore);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeForTeamA(View view){
        scoreForTeamA = scoreForTeamA + 3;
        displayForTeamA(scoreForTeamA);
    }

    public void addTwoForTeamA(View view){
        scoreForTeamA = scoreForTeamA + 2;
        displayForTeamA(scoreForTeamA);
    }

    public void addFreeThrowForTeamA(View view){
        scoreForTeamA = scoreForTeamA + 1;
        displayForTeamA(scoreForTeamA);
    }

    public void addThreeForTeamB(View view){
        scoreForTeamB = scoreForTeamB + 3;
        displayForTeamB(scoreForTeamB);
    }

    public void addTwoForTeamB(View view){
        scoreForTeamB = scoreForTeamB + 2;
        displayForTeamB(scoreForTeamB);
    }

    public void addFreeThrowForTeamB(View view){
        scoreForTeamB = scoreForTeamB + 1;
        displayForTeamB(scoreForTeamB);
    }

    public void reset(View view) {
        scoreForTeamA = 0;
        displayForTeamA(scoreForTeamA);
        scoreForTeamB = 0;
        displayForTeamB(scoreForTeamB);
    }
}
