package com.hunter_brown.dicerollapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ShakeActivity extends AppCompatActivity implements AccelerometerListener, View.OnClickListener {

    public static final String EXTRA_DICE_CHOICES = "dice_choices";

    private int[] mdiceChoices;

    private float[] mMotionFloats;
    private Button mShakeButton;
    private boolean mHasShaken;
    private boolean mHasPlayed;
    private boolean mShakeSounding;
    private int mTotalDice;

    private TextView mShakeNull;
    private TextView mShaking;

   private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shake);

        mHasShaken = false;
        mShakeSounding= false;
        mHasPlayed=false;


        mShakeButton = (Button) findViewById(R.id.button_shake);
        mShakeButton.setOnClickListener(this);

        mShakeNull=findViewById(R.id.shake_null);
        mShaking=findViewById(R.id.shake_active);

        mShaking.setVisibility(View.INVISIBLE);
        mShakeNull.setVisibility(View.VISIBLE);


        Intent launchIntent = getIntent();
        mdiceChoices=launchIntent.getIntArrayExtra(EXTRA_DICE_CHOICES);

        mTotalDice=0;

        for (int i=0; i<mdiceChoices.length; i++){
            mTotalDice+=mdiceChoices[i];
        }
//        Toast.makeText(this, " Total Dice = " + mTotalDice, Toast.LENGTH_SHORT).show();

    }


        public int[] GetDiceChoice () {
            return mdiceChoices;
        }

        public float[] GetMotionFloat () {
            return mMotionFloats;

        }
        @Override
        protected void onResume () {
            super.onResume();
            if (AccelerometerManager.isSupported(this)) {
                AccelerometerManager.startListening(this);
            }
        }

        @Override
        public void onAccelerationChanged ( float x, float y, float z){

        }

        @Override
        public void onShake ( float force){
            //Toast.makeText(this, "Motion detected", Toast.LENGTH_SHORT).show();

            mShaking.setVisibility(View.VISIBLE);
            mShakeNull.setVisibility(View.INVISIBLE);

            if (mHasShaken == false) {
                mHasShaken = true;

            }
            else if (mp!= null && mp.isPlaying()){


            }
//            else if (mp!=null && mHasShaken==true && mp.isPlaying()==false){
////                mHasShaken=false;
////                Intent DiceResultIntent = ResultsActivity.newIntent(this, this);
////                startActivity(DiceResultIntent);

//            }
            else {
                mp= MediaPlayer.create(getApplicationContext(), R.raw.dicesound_1);
                mp.start();
                mHasShaken=true;
            }
        }

        @Override
        public void onStop () {
            super.onStop();
            mShaking.setVisibility(View.INVISIBLE);
            mShakeNull.setVisibility(View.VISIBLE);

//Check device supported Accelerometer sensor or not
            if (AccelerometerManager.isListening()) {

//Start Accelerometer Listening
                AccelerometerManager.stopListening();

//                Toast.makeText(this, "onStop Accelerometer Stopped", Toast.LENGTH_SHORT).show();
            }
        }
        @Override
        public void onDestroy () {
            super.onDestroy();
            if (AccelerometerManager.isListening()) {
                AccelerometerManager.stopListening();

//                Toast.makeText(this, "onDestroy Accelerometer Stopped", Toast.LENGTH_SHORT).show();
            }
        }

        // Starts this Activity
        public static Intent newIntent (Context ctx, DiceChoice diceChoice){
            Intent ret = new Intent(ctx, ShakeActivity.class);
            ret.putExtra(EXTRA_DICE_CHOICES,diceChoice.GetDiceChoice());
            return ret;
        }

        @Override
        public void onClick (View view){
            if (view.getId() == R.id.button_shake) {
                Intent DiceResultIntent = ResultsActivity.newIntent(this, this);
                startActivity(DiceResultIntent);
            }
        }
    }
