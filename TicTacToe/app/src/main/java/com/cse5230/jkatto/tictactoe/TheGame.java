package com.cse5230.jkatto.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.TextView;

public class TheGame extends AppCompatActivity implements View.OnClickListener {

    //initialize variables
    Button A1, A2, A3, B1, B2, B3, C1, C2, C3, reset;
    TextView currentPlayer;
    int player = 0, count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_game);

        //link the buttons to the layout file
        currentPlayer = (TextView) findViewById(R.id.text);
        A1 = (Button) findViewById(R.id.A1);
        A2 = (Button) findViewById(R.id.A2);
        A3 = (Button) findViewById(R.id.A3);
        B1 = (Button) findViewById(R.id.B1);
        B2 = (Button) findViewById(R.id.B2);
        B3 = (Button) findViewById(R.id.B3);
        C1 = (Button) findViewById(R.id.C1);
        C2 = (Button) findViewById(R.id.C2);
        C3 = (Button) findViewById(R.id.C3);
        reset = (Button) findViewById(R.id.reset);

        //set the clickListener for the buttons
        A1.setOnClickListener(this);
        A2.setOnClickListener(this);
        A3.setOnClickListener(this);
        B1.setOnClickListener(this);
        B2.setOnClickListener(this);
        B3.setOnClickListener(this);
        C1.setOnClickListener(this);
        C2.setOnClickListener(this);
        C3.setOnClickListener(this);
        reset.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        //Set symbol on board and check for win
        switch (view.getId()) {

            case R.id.start:
                reset();
                break;

            case R.id.reset:
                reset();
                break;

            case R.id.A1:
                players_turn(A1);
                break;

            case R.id.A2:
                players_turn(A2);
                break;

            case R.id.A3:
                players_turn(A3);
                break;

            case R.id.B1:
                players_turn(B1);
                break;

            case R.id.B2:
                players_turn(B2);
                break;

            case R.id.B3:
                players_turn(B3);
                break;

            case R.id.C1:
                players_turn(C1);
                break;

            case R.id.C2:
                players_turn(C2);
                break;

            case R.id.C3:
                players_turn(C3);
                break;
        }
    }

    public void result() {
        if (A1.getText().toString().equals("X") &&
                A2.getText().toString().equals("X") &&
                A3.getText().toString().equals("X")) {
            Toast.makeText(this, "Player 1 Wins!", Toast.LENGTH_SHORT).show();
            reset.callOnClick();
        } else if (B1.getText().toString().equals("X") &&
                B2.getText().toString().equals("X") &&
                B3.getText().toString().equals("X")) {
            Toast.makeText(this, "Player 1 Wins!", Toast.LENGTH_SHORT).show();
            reset.callOnClick();
        } else if (C1.getText().toString().equals("X") &&
                C2.getText().toString().equals("X") &&
                C3.getText().toString().equals("X")) {
            Toast.makeText(this, "Player 1 Wins!", Toast.LENGTH_SHORT).show();
            reset.callOnClick();
        } else if (A1.getText().toString().equals("X") &&
                B2.getText().toString().equals("X") &&
                C3.getText().toString().equals("X")) {
            Toast.makeText(this, "Player 1 Wins!", Toast.LENGTH_SHORT).show();
            reset.callOnClick();
        } else if (A3.getText().toString().equals("X") &&
                B2.getText().toString().equals("X") &&
                C1.getText().toString().equals("X")) {
            Toast.makeText(this, "Player 1 Wins!", Toast.LENGTH_SHORT).show();
            reset.callOnClick();
        } else if (A1.getText().toString().equals("X") &&
                B1.getText().toString().equals("X") &&
                C1.getText().toString().equals("X")) {
            Toast.makeText(this, "Player 1 Wins!", Toast.LENGTH_SHORT).show();
            reset.callOnClick();
        } else if (A2.getText().toString().equals("X") &&
                B2.getText().toString().equals("X") &&
                C2.getText().toString().equals("X")) {
            Toast.makeText(this, "Player 1 Wins!", Toast.LENGTH_SHORT).show();
            reset.callOnClick();
        } else if (A3.getText().toString().equals("X") &&
                B3.getText().toString().equals("X") &&
                C3.getText().toString().equals("X")) {
            Toast.makeText(this, "Player 1 Wins!", Toast.LENGTH_SHORT).show();
            reset.callOnClick();
        } else if (A1.getText().toString().equals("O") &&
                A2.getText().toString().equals("O") &&
                A3.getText().toString().equals("O")) {
            Toast.makeText(this, "Player 2 Wins!", Toast.LENGTH_SHORT).show();
            reset.callOnClick();
        } else if (B1.getText().toString().equals("O") &&
                B2.getText().toString().equals("O") &&
                B3.getText().toString().equals("O")) {
            Toast.makeText(this, "Player 2 Wins!", Toast.LENGTH_SHORT).show();
            reset.callOnClick();
        } else if (C1.getText().toString().equals("O") &&
                C2.getText().toString().equals("O") &&
                C3.getText().toString().equals("O")) {
            Toast.makeText(this, "Player 2 Wins!", Toast.LENGTH_SHORT).show();
            reset.callOnClick();
        } else if (A1.getText().toString().equals("O") &&
                B2.getText().toString().equals("O") &&
                C3.getText().toString().equals("O")) {
            Toast.makeText(this, "Player 2 Wins!", Toast.LENGTH_SHORT).show();
            reset.callOnClick();
        } else if (A3.getText().toString().equals("O") &&
                B2.getText().toString().equals("O") &&
                C1.getText().toString().equals("O")) {
            Toast.makeText(this, "Player 2 Wins!", Toast.LENGTH_SHORT).show();
            reset.callOnClick();
        } else if (A1.getText().toString().equals("O") &&
                B1.getText().toString().equals("O") &&
                C1.getText().toString().equals("O")) {
            Toast.makeText(this, "Player 2 Wins!", Toast.LENGTH_SHORT).show();
            reset.callOnClick();
        } else if (A2.getText().toString().equals("O") &&
                B2.getText().toString().equals("O") &&
                C2.getText().toString().equals("O")) {
            Toast.makeText(this, "Player 2 Wins!", Toast.LENGTH_SHORT).show();
            reset.callOnClick();
        } else if (A3.getText().toString().equals("O") &&
                B3.getText().toString().equals("O") &&
                C3.getText().toString().equals("O")) {
            Toast.makeText(this, "Player 2 Wins!", Toast.LENGTH_SHORT).show();
            reset.callOnClick();
        } else {
            if (count == 9) {
                Toast.makeText(this, "Cats Game!", Toast.LENGTH_SHORT).show();
                reset.callOnClick();
            }
        }
    }

    public void players_turn(Button game_button) {
        if (game_button.getText().toString().equals("")) {
            count += 1;
            if (player == 0) {
                player = 1;
                currentPlayer.setText("Player 2's Turn - O");
                game_button.setText("X");
                result();
            } else {
                player = 0;
                currentPlayer.setText("Player 1's Turn - X");
                game_button.setText("O");
                result();
            }
        }
    }

    public void reset() {
        A1.setText("");
        A2.setText("");
        A3.setText("");
        B1.setText("");
        B2.setText("");
        B3.setText("");
        C1.setText("");
        C2.setText("");
        C3.setText("");
        player = 0;
        count = 0;
        currentPlayer.setText("Player 1's Turn - X");
    }
}
