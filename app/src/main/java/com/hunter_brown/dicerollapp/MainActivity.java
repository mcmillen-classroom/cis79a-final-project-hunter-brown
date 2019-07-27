package com.hunter_brown.dicerollapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mContinueButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContinueButton= (Button) findViewById(R.id.button_choose_dice);

        mContinueButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()== R.id.button_choose_dice) {
            Intent DiceRollIntent = DiceChoice.newIntent(this);
            startActivity(DiceRollIntent);
        }
    }
}
