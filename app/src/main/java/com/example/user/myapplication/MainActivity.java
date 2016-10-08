package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int TeamAscore = 0;
    int TeamBscore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addThreeToTeamA(View view) {
        TeamAscore = TeamAscore + 3;
        displayForTeamA(TeamAscore);
}
    public void addTwoToTeamA(View view) {
        TeamAscore =TeamAscore + 2;
        displayForTeamA(TeamAscore);
    }
    public void addOneToTeamA(View view) {
        TeamAscore++;
    displayForTeamA(TeamAscore);
    }

    public void addThreeToTeamB(View view) {
        TeamBscore = TeamBscore + 3;
        displayForTeamB(TeamBscore);
    }
    public void addTwoToTeamB(View view) {
        TeamBscore =TeamBscore + 2;
        displayForTeamB(TeamBscore);
    }
    public void addOneToTeamB(View view) {
        TeamBscore++;
        displayForTeamB(TeamBscore);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void Reset(int score){
        TeamAscore = 0;
        TeamBscore = 0;
        displayForTeamA(TeamAscore);
        displayForTeamB(TeamBscore);
        }
        }