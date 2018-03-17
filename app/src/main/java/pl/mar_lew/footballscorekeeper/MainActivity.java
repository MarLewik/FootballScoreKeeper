package pl.mar_lew.footballscorekeeper;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int goalsA;
    int goalsB;
    int foulsA;
    int foulsB;
    int yellowCardA;
    int yellowCardB;
    int redCardA;
    int redCardB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayGoalTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamAscore);
        scoreView.setText(String.valueOf(score));
    }

    public void displayGoalTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamBscore);
        scoreView.setText(String.valueOf(score));
    }

    public void displayfoulsA(int fouls) {
        TextView foulsView = (TextView) findViewById(R.id.teamAfouls);
        foulsView.setText("Fouls: " + String.valueOf(fouls));
    }

    public void displayfoulsB(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.teamBfouls);
        scoreView.setText("Fouls: " + String.valueOf(fouls));
    }

    public void displayYellowCardA(int yellowCards) {
        TextView yellowCardView = (TextView) findViewById(R.id.teamAyellowCards);
        yellowCardView.setText(String.valueOf(yellowCards));
    }

    public void displayYellowCardB(int yellowCards) {
        TextView yellowCardView = (TextView) findViewById(R.id.teamByellowCards);
        yellowCardView.setText(String.valueOf(yellowCards));
    }

    public void displayRedCardA(int redCards) {
        TextView redCardView = (TextView) findViewById(R.id.teamAredCards);
        redCardView.setText(String.valueOf(redCards));
    }

    public void displayRedCardB(int redCards) {
        TextView redCardView = (TextView) findViewById(R.id.teamBredCards);
        redCardView.setText(String.valueOf(redCards));
    }

    public void addOneForTeamA(View v) {
        goalsA = goalsA + 1;
        displayGoalTeamA(goalsA);
        final MediaPlayer mpA = MediaPlayer.create(this, R.raw.goal);
        mpA.start();
    }

    public void addOneForTeamB(View v) {
        goalsB = goalsB + 1;
        displayGoalTeamB(goalsB);
        final MediaPlayer mpB = MediaPlayer.create(this, R.raw.goal);
        mpB.start();
    }

    public void addOneFoulTeamA(View v) {
        foulsA = foulsA + 1;
        displayfoulsA(foulsA);
    }

    public void addOneFoulTeamB(View v) {
        foulsB = foulsB + 1;
        displayfoulsB(foulsB);
    }

    public void addYellowForTeamA(View v) {
        yellowCardA = yellowCardA + 1;
        displayYellowCardA(yellowCardA);
    }

    public void addYellowForTeamB(View v) {
        yellowCardB = yellowCardB + 1;
        displayYellowCardB(yellowCardB);
    }

    public void addRedForTeamA(View v) {
        redCardA = redCardA + 1;
        displayRedCardA(redCardA);
    }

    public void addRedForTeamB(View v) {
        redCardB = redCardB + 1;
        displayRedCardB(redCardB);
    }

//    Set all values to 0 with display update after reset button click
    public void resetButton(View v) {
        goalsA = 0;
        goalsB = 0;
        foulsA = 0;
        foulsB = 0;
        yellowCardA = 0;
        yellowCardB = 0;
        redCardA = 0;
        redCardB = 0;
        displayGoalTeamA(goalsA);
        displayGoalTeamB(goalsB);
        displayfoulsA(foulsA);
        displayfoulsB(foulsB);
        displayYellowCardA(yellowCardA);
        displayYellowCardB(yellowCardB);
        displayRedCardA(redCardA);
        displayRedCardB(redCardB);
    }
}