package com.tamilloft.nsic_projectsapk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Day3 extends AppCompatActivity implements View.OnClickListener {
    private Button[][] buttons = new Button[3][3];
    private Boolean player1Turn = true;
    private Boolean checkForWin;
    private int roundCount;
    private Button button_reset;
    private int player1Points, player2Points;
    private TextView textViewPlayer1, textViewPlayer2, txtView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day3);

        textViewPlayer1 = findViewById(R.id.p1);
        textViewPlayer2 = findViewById(R.id.p2);
        txtView3 = findViewById(R.id.p3);
        button_reset = findViewById(R.id.button_reset);

        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                String buttonID = "button_" + i + j;
                int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
                buttons[i][j] = findViewById(resID);
                buttons[i][j].setOnClickListener(this);

            }
        }

        button_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetGame();
            }
        });

    }

    @Override
    public void onClick(View v) {
        if (!((Button) v).getText().toString().equals("")) {
            return;
        }
        if (player1Turn) {
            ((Button) v).setText("X");

        } else {
            ((Button) v).setText("O");
        }

        roundCount++;

        if (checkForWin()) {
            if (player1Turn) {
                player1Wins();

            } else {
                player2Wins();
            }}
        else if (roundCount == 9) {
            draw();
        } else {
            player1Turn = !player1Turn;
        }
    }

    private boolean checkForWin()
    {  String[][] field = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = buttons[i][j].getText().toString();
            }

        }
        for (int i = 0; i < 3; i++) {
            if (field[i][0].equals(field[i][1]) && field[i][0].equals(field[i][2]) && !field[i][0].equals("")) {
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (field[0][i].equals(field[1][i]) && field[0][i].equals(field[2][i]) && !field[0][i].equals("")) {
                return true;
            }
        }
        if (field[0][0].equals(field[1][1]) && field[0][0].equals(field[2][2]) && !field[0][0].equals("")) {
            return true;
        }
        if (field[0][2].equals(field[1][1]) && field[0][2].equals(field[2][0]) && !field[0][2].equals("")) {
            return true;
        }
        return false;
    }


    private void player1Wins() {
        player1Points++;
        Toast.makeText(this,"Player 1 Wins", Toast.LENGTH_SHORT).show();
        txtView3.setText("Player 1 is Wine");
        updatePointsText();
        resetBoard();
    }

    private void player2Wins() {
        player2Points++;
        Toast.makeText(this,"Player 2 Wins", Toast.LENGTH_SHORT).show();
        txtView3.setText("Player 2 is Wine");
        updatePointsText();
        resetBoard();
    }
    private void draw(){
        Toast.makeText(this,"No Points",Toast.LENGTH_SHORT).show();
        txtView3.setText("Match Draw..!");
        resetBoard();
    }

    private void updatePointsText() {
        textViewPlayer1.setText(" " + player1Points);
        textViewPlayer2.setText(" " + player2Points);
    }

    private void resetBoard() {
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                buttons[i][j].setText("");
            }
        }
        roundCount=0;
        player1Turn = true;
    }

    private void resetGame(){
        player1Points = 0;
        player2Points = 0;
        updatePointsText();
        resetBoard();
    }
    @Override
    protected  void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        outState.putInt("roundCount",roundCount);
        outState.putInt("player1Points",player1Points);
        outState.putInt("player2Points",player2Points);
        outState.putBoolean("player1Turn",player1Turn);

    }
    @Override
    protected  void onRestoreInstanceState(Bundle savedInstanceState){

        super.onRestoreInstanceState(savedInstanceState);
        roundCount = savedInstanceState.getInt("roundCount");
        player1Points=savedInstanceState.getInt("Player1Points");
        player2Points=savedInstanceState.getInt("Player2Points");
        player1Turn=savedInstanceState.getBoolean("player1Turn");

    }

}