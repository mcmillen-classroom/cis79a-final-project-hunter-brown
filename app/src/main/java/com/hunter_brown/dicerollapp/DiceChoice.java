package com.hunter_brown.dicerollapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class DiceChoice extends AppCompatActivity implements View.OnClickListener {

  public static final int REQUEST_CODE_SHAKE = 0 ;
    private TextView mdice2ValLabel;
    private TextView mdice4ValLabel;
    private TextView mdice6ValLabel;
    private TextView mdice8ValLabel;
    private TextView mdice10ValLabel;
    private TextView mdice20ValLabel;
    private TextView mdice12ValLabel;
    private TextView mdice100ValLabel;
    private Button mRollButton;
    private int mdice2Val;
    private int mdice4Val;
    private int mdice6Val;
    private int mdice8Val;
    private int mdice10Val;
    private int mdice12Val;
    private int mdice20Val;

    private SeekBar mdice2Bar;
    private SeekBar mdice4Bar;
    private SeekBar mdice6Bar;
    private SeekBar mdice8Bar;
    private SeekBar mdice10Bar;
    private SeekBar mdice12Bar;
    private SeekBar mdice20Bar;


    private int[] mDice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice_choice);

        mDice= new int[7];

        mRollButton= (Button) findViewById(R.id.roll_button);
        mRollButton.setOnClickListener(this);

        // 2 dice (coin) Listener to show int of bar
         mdice2Bar = (SeekBar) findViewById(R.id.seek_2_sided);
        mdice2Bar.setOnSeekBarChangeListener(seekBarChangeListener2);

         mdice2Val = mdice2Bar.getProgress();
        mdice2ValLabel = findViewById(R.id.heads_val);
        mdice2ValLabel.setText(String.valueOf(mdice2Val));

        //4 Sided Dice Listener

        mdice4Bar = findViewById(R.id.seek_4_sided);
        mdice4Bar.setOnSeekBarChangeListener(seekBarChangeListener4);

        mdice4Val = mdice4Bar.getProgress();
        mdice4ValLabel = findViewById(R.id.dice_4_val);
        mdice4ValLabel.setText(String.valueOf(mdice4Val));

        // 6 sided dice Listener

        mdice6Bar = findViewById(R.id.seek_6_sided);
        mdice6Bar.setOnSeekBarChangeListener(seekBarChangeListener6);

        mdice6Val = mdice6Bar.getProgress();
        mdice6ValLabel = findViewById(R.id.dice_6_val);
        mdice6ValLabel.setText(String.valueOf(mdice6Val));

        //8 sided dice Listener

        mdice8Bar = findViewById(R.id.seek_8_sided);
        mdice8Bar.setOnSeekBarChangeListener(seekBarChangeListener8);

        mdice8Val = mdice8Bar.getProgress();
        mdice8ValLabel = findViewById(R.id.dice_8_val);
        mdice8ValLabel.setText(String.valueOf(mdice8Val));

        //10 sided dice Listener

        mdice10Bar = findViewById(R.id.seek_10_sided);
        mdice10Bar.setOnSeekBarChangeListener(seekBarChangeListener10);

        mdice10Val = mdice10Bar.getProgress();
        mdice10ValLabel = findViewById(R.id.dice_10_val);
        mdice10ValLabel.setText(String.valueOf(mdice10Val));

        //12 sided dice listener

        mdice12Bar = findViewById(R.id.seek_12_sided);
        mdice12Bar.setOnSeekBarChangeListener(seekBarChangeListener12);

        mdice12Val = mdice12Bar.getProgress();
        mdice12ValLabel = findViewById(R.id.dice_12_val);
        mdice12ValLabel.setText(String.valueOf(mdice12Val));

        //20 sided dice listener

        mdice20Bar = findViewById(R.id.seek_20_sided);
        mdice20Bar.setOnSeekBarChangeListener(seekBarChangeListener20);

        mdice20Val = mdice20Bar.getProgress();
        mdice20ValLabel = findViewById(R.id.dice_20_val);
        mdice20ValLabel.setText(String.valueOf(mdice20Val));


    }

    @Override
    public void onClick(View view) {

        if (view.getId()==R.id.roll_button){


            // Start Shake activity
            Intent DiceShakeIntent = ShakeActivity.newIntent(this,this);
            startActivity(DiceShakeIntent);
        }

    }

    SeekBar.OnSeekBarChangeListener seekBarChangeListener2 = new SeekBar.OnSeekBarChangeListener() {

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            // updated continuously as the user slides the thumb
            mdice2ValLabel.setText(String.valueOf(progress));
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            // called when the user first touches the SeekBar
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            // called after the user finishes moving the SeekBar
        }
    };

    SeekBar.OnSeekBarChangeListener seekBarChangeListener4 = new SeekBar.OnSeekBarChangeListener() {

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            // updated continuously as the user slides the thumb
            mdice4ValLabel.setText(String.valueOf(progress));
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            // called when the user first touches the SeekBar
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            // called after the user finishes moving the SeekBar
        }
    };

    SeekBar.OnSeekBarChangeListener seekBarChangeListener6 = new SeekBar.OnSeekBarChangeListener() {

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            // updated continuously as the user slides the thumb
            mdice6ValLabel.setText(String.valueOf(progress));
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            // called when the user first touches the SeekBar
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            // called after the user finishes moving the SeekBar
        }
    };

    SeekBar.OnSeekBarChangeListener seekBarChangeListener8 = new SeekBar.OnSeekBarChangeListener() {

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            // updated continuously as the user slides the thumb
            mdice8ValLabel.setText(String.valueOf(progress));
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            // called when the user first touches the SeekBar
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            // called after the user finishes moving the SeekBar
        }
    };

    SeekBar.OnSeekBarChangeListener seekBarChangeListener10 = new SeekBar.OnSeekBarChangeListener() {

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            // updated continuously as the user slides the thumb
            mdice10ValLabel.setText(String.valueOf(progress));
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            // called when the user first touches the SeekBar
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            // called after the user finishes moving the SeekBar
        }
    };

    SeekBar.OnSeekBarChangeListener seekBarChangeListener12 = new SeekBar.OnSeekBarChangeListener() {

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            // updated continuously as the user slides the thumb
            mdice12ValLabel.setText(String.valueOf(progress));
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            // called when the user first touches the SeekBar
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            // called after the user finishes moving the SeekBar
        }
    };

    SeekBar.OnSeekBarChangeListener seekBarChangeListener20 = new SeekBar.OnSeekBarChangeListener() {

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            // updated continuously as the user slides the thumb
            mdice20ValLabel.setText(String.valueOf(progress));
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            // called when the user first touches the SeekBar
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            // called after the user finishes moving the SeekBar
        }
    };


    // method to start this Activity
    public static Intent newIntent(Context ctx){
        Intent ret = new Intent(ctx,DiceChoice.class);
        return ret;
    }

    public int[] GetDiceChoice() {

        mDice[0]= mdice2Val=mdice2Bar.getProgress();

        mDice[1]=mdice4Val=mdice4Bar.getProgress();

        mDice[2]=mdice6Val=mdice6Bar.getProgress();

        mDice[3]=mdice8Val=mdice8Bar.getProgress();

        mDice[4]=mdice10Val=mdice10Bar.getProgress();

        mDice[5]=mdice12Val=mdice12Bar.getProgress();

        mDice[6]=mdice20Val=mdice20Bar.getProgress();

        return mDice;
//        if (i == 0) {
//            return mdice2Val= mdice2Bar.getProgress();
//        }
//        if (i == 1) {
//            return mdice4Val= mdice4Bar.getProgress();
//        }
//        if (i == 2) {
//            return mdice6Val= mdice6Bar.getProgress();
//        }
//        if (i == 3) {
//            return mdice8Val= mdice8Bar.getProgress();
//        }
//        if (i == 4) {
//            return mdice10Val= mdice10Bar.getProgress();
//        }
//        if (i == 5) {
//            return mdice12Val= mdice12Bar.getProgress();
//        }
//        if (i == 6) {
//            return mdice20Val= mdice20Bar.getProgress();
//        }
//        return 0;

    }


}
