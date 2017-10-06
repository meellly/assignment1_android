package com.cse5230.jkatto.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Assignment 1 - Tic Tac Toe (Android implementation)
 * Team Members: Jason Katto, Melissa Schilbe, Hinal Wadia
 **/

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.cse5230.jkatto.tictactoe.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {

        Intent intent = new Intent(this, TheGame.class);
        Button button = (Button) findViewById(R.id.start);
        String message = button.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }
}
