package com.rozadin.board;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int A = 0,B = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void reset(View v)
    {
        A=0;B=0;
        displayForTeamA();
        displayForTeamB();
    }
    public void add1prav(View v)
    {
        B++;
        displayForTeamB();
    }
    public void add2prav(View v)
    {
        B=B+2;
        displayForTeamB();
    }
    public void add3prav(View v)
    {
        B=B+3;
        displayForTeamB();
    }
    public void add1left(View v)
    {
        A++;
        displayForTeamA();
    }
    public void add2left(View v)
    {
        A=A+2;
        displayForTeamA();
    }
    public void add3left(View v)
    {
        A=A+3;
        displayForTeamA();
    }
    public void displayForTeamA() {
        TextView scoreView = (TextView) findViewById(R.id.Name_lev);
        scoreView.setText(String.valueOf(A));
    }
    public void displayForTeamB() {
        TextView scoreView = (TextView) findViewById(R.id.Name_prav);
        scoreView.setText(String.valueOf(B));
    }
}
