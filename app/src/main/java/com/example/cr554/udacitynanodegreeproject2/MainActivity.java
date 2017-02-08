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
        winning_team_display();
    }
    public void display_team_two_score(){
        TextView textView = (TextView) findViewById(R.id.team_two_score);
        String asString = Integer.toString(teamTwoScore);
        textView.setText(asString);
        winning_team_display();
    }
    public void winning_team_display(){
        TextView textView = (TextView) findViewById(R.id.current_leader);
        String currentLeader;
        if(teamOneScore>teamTwoScore){
            currentLeader = getString(R.string.team_one_winning);
        }
        else if(teamOneScore<teamTwoScore){
            currentLeader = getString(R.string.team_two_winning);
        }
        else
        {
            currentLeader = getString(R.string.is_tie);
        }
        textView.setText(currentLeader);
    }

}
