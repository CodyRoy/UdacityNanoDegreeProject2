package com.example.cr554.udacitynanodegreeproject2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamOneScore=0;
    int teamTwoScore=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display_team_two_score();
        display_team_one_score();

    }

    public void increment_team_one(View view){
        teamOneScore++;
        display_team_one_score();
    }
    public void increment_team_two(View view){
        teamTwoScore++;
        display_team_two_score();

    }
    public void decrement_team_one(View view){
        teamOneScore--;
        display_team_one_score();

    }
    public void decrement_team_two(View view){
        teamTwoScore--;
        display_team_two_score();
    }

    //both display functions get the appropriate textview, convert the current team score for the appropriate team
    //from an integer to a string so that it can then set the text displayed to it,
    public void display_team_one_score(){
        TextView textView = (TextView) findViewById(R.id.team_one_score);
        String asString = Integer.toString(teamOneScore);
        textView.setText(asString);
        //will update the score for team 1
        //called from the increment_team_one and decrement_team_one functions
    }
    public void display_team_two_score(){
        TextView textView = (TextView) findViewById(R.id.team_two_score);
        String asString = Integer.toString(teamTwoScore);
        textView.setText(asString);
        //willupdate the score for team 2
        //called from the increment_team_two and decrement_team_two functions
    }

}
