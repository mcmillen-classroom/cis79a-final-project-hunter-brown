package com.hunter_brown.dicerollapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class ResultsActivity extends AppCompatActivity {

    public static final String EXTRA_DICE_CHOICES = "dice choices";
    public static final String EXTRA_DICE_CHOICE_2 = "dice choice_2";
    public static final String EXTRA_DICE_CHOICE_4 = "dice choice_4";
    public static final String EXTRA_DICE_CHOICE_6 = "dice choice_6";
    public static final String EXTRA_DICE_CHOICE_8 = "dice choice_8";
    public static final String EXTRA_DICE_CHOICE_10 = "dice choice_10";
    public static final String EXTRA_DICE_CHOICE_12 = "dice choice_12";
    public static final String EXTRA_DICE_CHOICE_20 = "dice choice_20";

    private int mdiceNum2;
    private int mdiceNum4;
    private int mdiceNum6;
    private int mdiceNum8;
    private int mdiceNum10;
    private int mdiceNum12;
    private int mdiceNum20;

    private int[] mRolls2;
    private int[] mRolls4;
    private int[] mRolls6;
    private int[] mRolls8;
    private int[] mRolls10;
    private int[] mRolls12;
    private int[] mRolls20;




    private int[] mdiceChoices;
    private LinearLayout mLinearLayout2;
    private LinearLayout mLinearLayout4;
    private LinearLayout mLinearLayout6;
    private LinearLayout mLinearLayout8;
    private LinearLayout mLinearLayout10;
    private LinearLayout mLinearLayout12;
    private LinearLayout mLinearLayout20;

    private TextView mTotalScoreView;


    private int mTotalDice;
    private int mTotalScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        mLinearLayout2=findViewById(R.id.dice_images_layout_2);
        mLinearLayout4=findViewById(R.id.dice_images_layout_4);
        mLinearLayout6=findViewById(R.id.dice_images_layout_6);
        mLinearLayout8=findViewById(R.id.dice_images_layout_8);
        mLinearLayout10=findViewById(R.id.dice_images_layout_10);
        mLinearLayout12=findViewById(R.id.dice_images_layout_12);
        mLinearLayout20=findViewById(R.id.dice_images_layout_20);

        mTotalScoreView=findViewById(R.id.total_score_val);


        Intent launchIntent = getIntent();
        mdiceChoices=launchIntent.getIntArrayExtra(EXTRA_DICE_CHOICES);
//        mdiceNum2 = launchIntent.getIntExtra(EXTRA_DICE_CHOICE_2, 0);
//        mdiceNum4 = launchIntent.getIntExtra(EXTRA_DICE_CHOICE_4, 0);
//        mdiceNum6 = launchIntent.getIntExtra(EXTRA_DICE_CHOICE_6, 0);
//        mdiceNum8 = launchIntent.getIntExtra(EXTRA_DICE_CHOICE_8, 0);
//        mdiceNum10 = launchIntent.getIntExtra(EXTRA_DICE_CHOICE_10, 0);
//        mdiceNum12 = launchIntent.getIntExtra(EXTRA_DICE_CHOICE_12, 0);
//        mdiceNum20 = launchIntent.getIntExtra(EXTRA_DICE_CHOICE_20, 0);
//        mTotalDice= mdiceNum2+mdiceNum4+mdiceNum6+mdiceNum8+mdiceNum10+mdiceNum12+mdiceNum20;

        for (int i=0; i<mdiceChoices.length; i++){
            mTotalDice+=mdiceChoices[i];
        }

        mRolls2= new int[mdiceChoices[0]];
        mRolls4= new int[mdiceChoices[1]];
        mRolls6= new int[mdiceChoices[2]];
        mRolls8= new int[mdiceChoices[3]];
        mRolls10= new int[mdiceChoices[4]];
        mRolls12= new int[mdiceChoices[5]];
        mRolls20 = new int[mdiceChoices[6]];


//        Remove views if the app has rolled once already
        if(mLinearLayout2.getChildCount() > 0) {
            mLinearLayout2.removeAllViews();
        }
        if(mLinearLayout4.getChildCount() > 0) {
            mLinearLayout4.removeAllViews();
        }
        if(mLinearLayout6.getChildCount() > 0) {
            mLinearLayout6.removeAllViews();
        }
        if(mLinearLayout8.getChildCount() > 0) {
            mLinearLayout8.removeAllViews();
        }
        if(mLinearLayout10.getChildCount() > 0) {
            mLinearLayout10.removeAllViews();
        }
        if(mLinearLayout12.getChildCount() > 0) {
            mLinearLayout12.removeAllViews();
        }
        if(mLinearLayout20.getChildCount() > 0) {
            mLinearLayout20.removeAllViews();
        }

//test for posting images
//        for ( int i= 0; i<=6; i++)
//        {
//            if (i == 0 ){
//                ImageView d6_s1= new ImageView(this);
//                d6_s1.setImageResource(R.drawable.d6_side1);
//                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
//                d6_s1.setLayoutParams(layoutParams);
//                mLinearLayout.addView(d6_s1);
//
//
//            }
//            if (i == 1 ){
//                ImageView d6_s2= new ImageView(this);
//                d6_s2.setImageResource(R.drawable.d6_side2);
//                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
//                d6_s2.setLayoutParams(layoutParams);
//                mLinearLayout.addView(d6_s2);
//
//            }
//            if (i == 2 ){
//                ImageView d6_s3= new ImageView(this);
//                d6_s3.setImageResource(R.drawable.d6_side3);
//                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
//                d6_s3.setLayoutParams(layoutParams);
//
//                mLinearLayout.addView(d6_s3);
//
//            }
//            if (i == 3 ){
//                ImageView d6_s4= new ImageView(this);
//                d6_s4.setImageResource(R.drawable.d6_side4);
//                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
//                d6_s4.setLayoutParams(layoutParams);
//
//                mLinearLayout.addView(d6_s4);
//
//            }
//            if (i == 4 ){
//                ImageView d6_s5= new ImageView(this);
//                d6_s5.setImageResource(R.drawable.d6_side5);
//                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
//                d6_s5.setLayoutParams(layoutParams);
//
//                mLinearLayout.addView(d6_s5);
//
//            }
//            if (i == 5 ){
//                ImageView d6_s6= new ImageView(this);
//                d6_s6.setImageResource(R.drawable.d6_side6);
//                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
//                d6_s6.setLayoutParams(layoutParams);
//
//                mLinearLayout.addView(d6_s6);
//
//            }
//
//            if (i == 6 ){
//                ImageView d8_s8= new ImageView(this);
//                d8_s8.setImageResource(R.mipmap.d8);
//                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
//                d8_s8.setLayoutParams(layoutParams);
//
//                mLinearLayout.addView(d8_s8);
//
//            }
//
//        }

       //main methods for rolling dice and posting images



        //MAIN METHODS
        RollDice(mdiceChoices);

        PostDiceImages();

        TotalScore();
    }
//Rolls Dice for each type d2-d20 and puts the results in mRollsx int[] where x is 2-20
    private void RollDice(int[] dicechosen){
        //Separates the number of each dice in the int[] for each random roll and the range for each appropriate dice
        for (int dicetype=0; dicetype<dicechosen.length; dicetype++){
            if (dicetype==0){
                for (int rolls2= 0; rolls2<mdiceChoices[dicetype]; rolls2++ ){
                    Random rand= new Random();
                    int rollrand= rand.nextInt(2)+1;
                    mRolls2[rolls2]=rollrand;
                }
            }
            if (dicetype==1){
                for (int rolls4= 0; rolls4<mdiceChoices[dicetype]; rolls4++ ){
                    Random rand= new Random();
                    int rollrand= rand.nextInt(4)+1;
                    mRolls4[rolls4]=rollrand;
                }
            }
            if (dicetype==2){
                for (int rolls6= 0; rolls6<mdiceChoices[dicetype]; rolls6++ ){
                    Random rand= new Random();
                    int rollrand= rand.nextInt(6)+1;
                    mRolls6[rolls6]=rollrand;
                }
            }
            if (dicetype==3){
                for (int rolls8= 0; rolls8<mdiceChoices[dicetype]; rolls8++ ){
                    Random rand= new Random();
                    int rollrand= rand.nextInt(8)+1;
                    mRolls8[rolls8]=rollrand;
                }
            }
            if (dicetype==4){
                for (int rolls10= 0; rolls10<mdiceChoices[dicetype]; rolls10++ ){
                    Random rand= new Random();
                    int rollrand= rand.nextInt(10)+1;
                    mRolls10[rolls10]=rollrand;
                }
            }
            if (dicetype==5){
                for (int rolls12= 0; rolls12<mdiceChoices[dicetype]; rolls12++ ){
                    Random rand= new Random();
                    int rollrand= rand.nextInt(12)+1;
                    mRolls12[rolls12]=rollrand;
                }
            }
            if (dicetype==6){
                for (int rolls20= 0; rolls20<mdiceChoices[dicetype]; rolls20++ ){
                    Random rand= new Random();
                    int rollrand= rand.nextInt(20)+1;
                    mRolls20[rolls20]=rollrand;
                }
            }
        }
//Tests for Dice rolls and Toasts the rolls
//        StringBuilder builder2 = new StringBuilder();
//        for(int i : mRolls2)
//        {
//            builder2.append("" + i + " ");
//        }
//        StringBuilder builder4 = new StringBuilder();
//        for(int i : mRolls4)
//        {
//            builder4.append("" + i + " ");
//        }
//        StringBuilder builder6 = new StringBuilder();
//        for(int i : mRolls6)
//        {
//            builder6.append("" + i + " ");
//        }
//        StringBuilder builder8 = new StringBuilder();
//        for(int i : mRolls8)
//        {
//            builder8.append("" + i + " ");
//        }
//        StringBuilder builder10 = new StringBuilder();
//        for(int i : mRolls10)
//        {
//            builder10.append("" + i + " ");
//        }
//        StringBuilder builder12 = new StringBuilder();
//        for(int i : mRolls12)
//        {
//            builder12.append("" + i + " ");
//        }
//        StringBuilder builder20 = new StringBuilder();
//        for(int i : mRolls20)
//        {
//            builder20.append("" + i + " ");
//        }
//
//        Toast.makeText(this, "d2 rolls:" + builder2, Toast.LENGTH_LONG).show();
//        Toast.makeText(this, "d4 rolls:" + builder4, Toast.LENGTH_LONG).show();
//        Toast.makeText(this, "d6 rolls:" + builder6, Toast.LENGTH_LONG).show();
//        Toast.makeText(this, "d8 rolls:" + builder8, Toast.LENGTH_LONG).show();
//        Toast.makeText(this, "d10 rolls:" + builder10, Toast.LENGTH_LONG).show();
//        Toast.makeText(this, "d12 rolls:" + builder12, Toast.LENGTH_LONG).show();
//        Toast.makeText(this, "d20 rolls:" + builder20, Toast.LENGTH_LONG).show();

    }
    //takes the mRollsx int[] and connects the rolls with the correct  images
private void PostDiceImages(){
        for (int i = 0; i<=6; i++){
            if (i==0){
              //d2 images
                for (int r2=0; r2<mRolls2.length;r2++){
                    if(mRolls2[r2]==1) {
                        ImageView d2_s1 = new ImageView(this);
                        d2_s1.setImageResource(R.drawable.ic_ring);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d2_s1.setLayoutParams(layoutParams);

                        mLinearLayout2.addView(d2_s1);
                    }
                    if(mRolls2[r2]==2) {
                        ImageView d2_s2 = new ImageView(this);
                        d2_s2.setImageResource(R.drawable.ic_adjust_black_24dp);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d2_s2.setLayoutParams(layoutParams);

                        mLinearLayout2.addView(d2_s2);
                    }

                }
            }
            else if(i==1){
                //d4 images method
                for (int r4=0; r4<mRolls4.length;r4++){
                    if(mRolls4[r4]==1) {
                        ImageView d4_s1 = new ImageView(this);
                        d4_s1.setImageResource(R.drawable.d4_s1);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d4_s1.setLayoutParams(layoutParams);

                        mLinearLayout4.addView(d4_s1);
                    }
                    if(mRolls4[r4]==2) {
                        ImageView d4_s2 = new ImageView(this);
                        d4_s2.setImageResource(R.drawable.d4_s2);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d4_s2.setLayoutParams(layoutParams);

                        mLinearLayout4.addView(d4_s2);
                    }
                    if(mRolls4[r4]==3) {
                        ImageView d4_s3 = new ImageView(this);
                        d4_s3.setImageResource(R.drawable.d4_s3);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d4_s3.setLayoutParams(layoutParams);

                        mLinearLayout4.addView(d4_s3);
                    }
                    if(mRolls4[r4]==4) {
                        ImageView d4_s4 = new ImageView(this);
                        d4_s4.setImageResource(R.drawable.d4_s4);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d4_s4.setLayoutParams(layoutParams);

                        mLinearLayout4.addView(d4_s4);
                    }
                }
            }
            else if (i==2){
                //method to post d6 images
                for (int r6= 0; r6<mRolls6.length;r6++){
                    if(mRolls6[r6]==1){
                        ImageView d6_s1= new ImageView(this);
                        d6_s1.setImageResource(R.drawable.d6_side1);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d6_s1.setLayoutParams(layoutParams);

                        mLinearLayout6.addView(d6_s1);

                    }
                    if (mRolls6[r6] == 2 ){
                        ImageView d6_s2= new ImageView(this);
                        d6_s2.setImageResource(R.drawable.d6_side2);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d6_s2.setLayoutParams(layoutParams);

                        mLinearLayout6.addView(d6_s2);

                    }
                    if (mRolls6[r6] == 3 ){
                        ImageView d6_s3= new ImageView(this);
                        d6_s3.setImageResource(R.drawable.d6_side3);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d6_s3.setLayoutParams(layoutParams);

                        mLinearLayout6.addView(d6_s3);

                    }
                    if (mRolls6[r6] == 4 ){
                        ImageView d6_s4= new ImageView(this);
                        d6_s4.setImageResource(R.drawable.d6_side4);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d6_s4.setLayoutParams(layoutParams);

                        mLinearLayout6.addView(d6_s4);

                    }
                    if (mRolls6[r6] == 5 ){
                        ImageView d6_s5= new ImageView(this);
                        d6_s5.setImageResource(R.drawable.d6_side5);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d6_s5.setLayoutParams(layoutParams);

                        mLinearLayout6.addView(d6_s5);

                    }
                    if (mRolls6[r6] == 6 ){
                        ImageView d6_s6= new ImageView(this);
                        d6_s6.setImageResource(R.drawable.d6_side6);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d6_s6.setLayoutParams(layoutParams);

                        mLinearLayout6.addView(d6_s6);

                    }

                }
            }
            else if(i==3){
                //d8 images method
                for (int r8= 0; r8<mRolls8.length;r8++){
                    if(mRolls8[r8]==1){
                        ImageView d8_s1= new ImageView(this);
                        d8_s1.setImageResource(R.drawable.d8_s1);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d8_s1.setLayoutParams(layoutParams);

                        mLinearLayout8.addView(d8_s1);

                    }
                    if(mRolls8[r8]==2){
                        ImageView d8_s2= new ImageView(this);
                        d8_s2.setImageResource(R.drawable.d8_s2);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d8_s2.setLayoutParams(layoutParams);

                        mLinearLayout8.addView(d8_s2);

                    }
                    if(mRolls8[r8]==3){
                        ImageView d8_s3= new ImageView(this);
                        d8_s3.setImageResource(R.drawable.d8_s3);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d8_s3.setLayoutParams(layoutParams);

                        mLinearLayout8.addView(d8_s3);

                    }
                    if(mRolls8[r8]==4){
                        ImageView d8_s4= new ImageView(this);
                        d8_s4.setImageResource(R.drawable.d8_s4);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d8_s4.setLayoutParams(layoutParams);

                        mLinearLayout8.addView(d8_s4);

                    }
                    if(mRolls8[r8]==5){
                        ImageView d8_s5= new ImageView(this);
                        d8_s5.setImageResource(R.drawable.d8_s5);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d8_s5.setLayoutParams(layoutParams);

                        mLinearLayout8.addView(d8_s5);

                    }
                    if(mRolls8[r8]==6){
                        ImageView d8_s6= new ImageView(this);
                        d8_s6.setImageResource(R.drawable.d8_s6);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d8_s6.setLayoutParams(layoutParams);

                        mLinearLayout8.addView(d8_s6);

                    }
                    if(mRolls8[r8]==7){
                        ImageView d8_s7= new ImageView(this);
                        d8_s7.setImageResource(R.drawable.d8_s7);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d8_s7.setLayoutParams(layoutParams);

                        mLinearLayout8.addView(d8_s7);

                    }
                    if(mRolls8[r8]==8){
                        ImageView d8_s8= new ImageView(this);
                        d8_s8.setImageResource(R.drawable.d8_s8);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d8_s8.setLayoutParams(layoutParams);

                        mLinearLayout8.addView(d8_s8);

                    }








                }
            }
            else if (i==4){
                //d10 images
                for (int r10= 0; r10<mRolls10.length;r10++){
                    if(mRolls10[r10]==1){
                        ImageView d10_s1= new ImageView(this);
                        d10_s1.setImageResource(R.drawable.d10_s1);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d10_s1.setLayoutParams(layoutParams);

                        mLinearLayout10.addView(d10_s1);

                    }
                    if(mRolls10[r10]==2){
                        ImageView d10_s2= new ImageView(this);
                        d10_s2.setImageResource(R.drawable.d10_s2);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d10_s2.setLayoutParams(layoutParams);

                        mLinearLayout10.addView(d10_s2);

                    }
                    if(mRolls10[r10]==3){
                        ImageView d10_s3= new ImageView(this);
                        d10_s3.setImageResource(R.drawable.d10_s3);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d10_s3.setLayoutParams(layoutParams);

                        mLinearLayout10.addView(d10_s3);

                    }
                    if(mRolls10[r10]==4){
                        ImageView d10_s4= new ImageView(this);
                        d10_s4.setImageResource(R.drawable.d10_s4);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d10_s4.setLayoutParams(layoutParams);

                        mLinearLayout10.addView(d10_s4);

                    }
                    if(mRolls10[r10]==5){
                        ImageView d10_s5= new ImageView(this);
                        d10_s5.setImageResource(R.drawable.d10_s5);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d10_s5.setLayoutParams(layoutParams);

                        mLinearLayout10.addView(d10_s5);

                    }
                    if(mRolls10[r10]==6){
                        ImageView d10_s6= new ImageView(this);
                        d10_s6.setImageResource(R.drawable.d10_s6);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d10_s6.setLayoutParams(layoutParams);

                        mLinearLayout10.addView(d10_s6);

                    }
                    if(mRolls10[r10]==7){
                        ImageView d10_s7= new ImageView(this);
                        d10_s7.setImageResource(R.drawable.d10_s7);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d10_s7.setLayoutParams(layoutParams);

                        mLinearLayout10.addView(d10_s7);

                    }
                    if(mRolls10[r10]==8){
                        ImageView d10_s8= new ImageView(this);
                        d10_s8.setImageResource(R.drawable.d10_s8);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d10_s8.setLayoutParams(layoutParams);

                        mLinearLayout10.addView(d10_s8);

                    }
                    if(mRolls10[r10]==9){
                        ImageView d10_s9= new ImageView(this);
                        d10_s9.setImageResource(R.drawable.d10_s9);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d10_s9.setLayoutParams(layoutParams);

                        mLinearLayout10.addView(d10_s9);

                    }
                    if(mRolls10[r10]==10){
                        ImageView d10_s10= new ImageView(this);
                        d10_s10.setImageResource(R.drawable.d10_s10);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d10_s10.setLayoutParams(layoutParams);

                        mLinearLayout10.addView(d10_s10);

                    }

                }

            }
            else if (i==5){
                //d12 images
                for (int r12= 0; r12<mRolls12.length;r12++){
                    if(mRolls12[r12]==1){
                        ImageView d12_s1= new ImageView(this);
                        d12_s1.setImageResource(R.drawable.d12_s1);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d12_s1.setLayoutParams(layoutParams);

                        mLinearLayout12.addView(d12_s1);

                    }
                    if(mRolls12[r12]==2){
                        ImageView d12_s2= new ImageView(this);
                        d12_s2.setImageResource(R.drawable.d12_s2);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d12_s2.setLayoutParams(layoutParams);

                        mLinearLayout12.addView(d12_s2);

                    }
                    if(mRolls12[r12]==3){
                        ImageView d12_s3= new ImageView(this);
                        d12_s3.setImageResource(R.drawable.d12_s3);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d12_s3.setLayoutParams(layoutParams);

                        mLinearLayout12.addView(d12_s3);

                    }
                    if(mRolls12[r12]==4){
                        ImageView d12_s4= new ImageView(this);
                        d12_s4.setImageResource(R.drawable.d12_s4);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d12_s4.setLayoutParams(layoutParams);

                        mLinearLayout12.addView(d12_s4);

                    }
                    if(mRolls12[r12]==5){
                        ImageView d12_s5= new ImageView(this);
                        d12_s5.setImageResource(R.drawable.d12_s5);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d12_s5.setLayoutParams(layoutParams);

                        mLinearLayout12.addView(d12_s5);

                    }
                    if(mRolls12[r12]==6){
                        ImageView d12_s6= new ImageView(this);
                        d12_s6.setImageResource(R.drawable.d12_s6);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d12_s6.setLayoutParams(layoutParams);

                        mLinearLayout12.addView(d12_s6);

                    }
                    if(mRolls12[r12]==7){
                        ImageView d12_s7= new ImageView(this);
                        d12_s7.setImageResource(R.drawable.d12_s7);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d12_s7.setLayoutParams(layoutParams);

                        mLinearLayout12.addView(d12_s7);

                    }
                    if(mRolls12[r12]==8){
                        ImageView d12_s8= new ImageView(this);
                        d12_s8.setImageResource(R.drawable.d12_s8);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d12_s8.setLayoutParams(layoutParams);

                        mLinearLayout12.addView(d12_s8);

                    }
                    if(mRolls12[r12]==9){
                        ImageView d12_s9= new ImageView(this);
                        d12_s9.setImageResource(R.drawable.d12_s9);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d12_s9.setLayoutParams(layoutParams);

                        mLinearLayout12.addView(d12_s9);

                    }
                    if(mRolls12[r12]==10){
                        ImageView d12_s10= new ImageView(this);
                        d12_s10.setImageResource(R.drawable.d12_s10);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d12_s10.setLayoutParams(layoutParams);

                        mLinearLayout12.addView(d12_s10);

                    }
                    if(mRolls12[r12]==11){
                        ImageView d12_s11= new ImageView(this);
                        d12_s11.setImageResource(R.drawable.d12_s11);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d12_s11.setLayoutParams(layoutParams);

                        mLinearLayout12.addView(d12_s11);

                    }
                    if(mRolls12[r12]==12){
                        ImageView d12_s12= new ImageView(this);
                        d12_s12.setImageResource(R.drawable.d12_s12);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d12_s12.setLayoutParams(layoutParams);

                        mLinearLayout12.addView(d12_s12);

                    }
                }

            }
            else if (i==6){
                //d20 images
                for (int r20= 0; r20<mRolls20.length;r20++){
                    if(mRolls20[r20]==1){
                        ImageView d20_s1= new ImageView(this);
                        d20_s1.setImageResource(R.drawable.d20_s1);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d20_s1.setLayoutParams(layoutParams);

                        mLinearLayout20.addView(d20_s1);

                    }
                    if(mRolls20[r20]==2){
                        ImageView d20_s2= new ImageView(this);
                        d20_s2.setImageResource(R.drawable.d20_s2);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d20_s2.setLayoutParams(layoutParams);

                        mLinearLayout20.addView(d20_s2);

                    }
                    if(mRolls20[r20]==3){
                        ImageView d20_s3= new ImageView(this);
                        d20_s3.setImageResource(R.drawable.d20_s3);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d20_s3.setLayoutParams(layoutParams);

                        mLinearLayout20.addView(d20_s3);

                    }
                    if(mRolls20[r20]==4){
                        ImageView d20_s4= new ImageView(this);
                        d20_s4.setImageResource(R.drawable.d20_s4);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d20_s4.setLayoutParams(layoutParams);

                        mLinearLayout20.addView(d20_s4);

                    }
                    if(mRolls20[r20]==5){
                        ImageView d20_s5= new ImageView(this);
                        d20_s5.setImageResource(R.drawable.d20_s5);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d20_s5.setLayoutParams(layoutParams);

                        mLinearLayout20.addView(d20_s5);

                    }
                    if(mRolls20[r20]==6){
                        ImageView d20_s6= new ImageView(this);
                        d20_s6.setImageResource(R.drawable.d20_s6);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d20_s6.setLayoutParams(layoutParams);

                        mLinearLayout20.addView(d20_s6);

                    }
                    if(mRolls20[r20]==7){
                        ImageView d20_s7= new ImageView(this);
                        d20_s7.setImageResource(R.drawable.d20_s7);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d20_s7.setLayoutParams(layoutParams);

                        mLinearLayout20.addView(d20_s7);

                    }
                    if(mRolls20[r20]==8){
                        ImageView d20_s8= new ImageView(this);
                        d20_s8.setImageResource(R.drawable.d20_s8);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d20_s8.setLayoutParams(layoutParams);

                        mLinearLayout20.addView(d20_s8);

                    }
                    if(mRolls20[r20]==9){
                        ImageView d20_s9= new ImageView(this);
                        d20_s9.setImageResource(R.drawable.d20_s9);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d20_s9.setLayoutParams(layoutParams);

                        mLinearLayout20.addView(d20_s9);

                    }
                    if(mRolls20[r20]==10){
                        ImageView d20_s10= new ImageView(this);
                        d20_s10.setImageResource(R.drawable.d20_s10);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d20_s10.setLayoutParams(layoutParams);

                        mLinearLayout20.addView(d20_s10);

                    }
                    if(mRolls20[r20]==11){
                        ImageView d20_s11= new ImageView(this);
                        d20_s11.setImageResource(R.drawable.d20_s11);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d20_s11.setLayoutParams(layoutParams);

                        mLinearLayout20.addView(d20_s11);

                    }
                    if(mRolls20[r20]==12){
                        ImageView d20_s12= new ImageView(this);
                        d20_s12.setImageResource(R.drawable.d20_s12);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d20_s12.setLayoutParams(layoutParams);

                        mLinearLayout20.addView(d20_s12);

                    }
                    if(mRolls20[r20]==13){
                        ImageView d20_s13= new ImageView(this);
                        d20_s13.setImageResource(R.drawable.d20_s13);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d20_s13.setLayoutParams(layoutParams);

                        mLinearLayout20.addView(d20_s13);

                    }
                    if(mRolls20[r20]==14){
                        ImageView d20_s14= new ImageView(this);
                        d20_s14.setImageResource(R.drawable.d20_s14);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d20_s14.setLayoutParams(layoutParams);

                        mLinearLayout20.addView(d20_s14);

                    }
                    if(mRolls20[r20]==15){
                        ImageView d20_s15= new ImageView(this);
                        d20_s15.setImageResource(R.drawable.d20_s15);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d20_s15.setLayoutParams(layoutParams);

                        mLinearLayout20.addView(d20_s15);

                    }
                    if(mRolls20[r20]==16){
                        ImageView d20_s16= new ImageView(this);
                        d20_s16.setImageResource(R.drawable.d20_s16);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d20_s16.setLayoutParams(layoutParams);

                        mLinearLayout20.addView(d20_s16);

                    }
                    if(mRolls20[r20]==17){
                        ImageView d20_s17= new ImageView(this);
                        d20_s17.setImageResource(R.drawable.d20_s17);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d20_s17.setLayoutParams(layoutParams);

                        mLinearLayout20.addView(d20_s17);

                    }
                    if(mRolls20[r20]==18){
                        ImageView d20_s18= new ImageView(this);
                        d20_s18.setImageResource(R.drawable.d20_s18);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d20_s18.setLayoutParams(layoutParams);

                        mLinearLayout20.addView(d20_s18);

                    }
                    if(mRolls20[r20]==19){
                        ImageView d20_s19= new ImageView(this);
                        d20_s19.setImageResource(R.drawable.d20_s19);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d20_s19.setLayoutParams(layoutParams);

                        mLinearLayout20.addView(d20_s19);

                    }
                    if(mRolls20[r20]==20){
                        ImageView d20_s20= new ImageView(this);
                        d20_s20.setImageResource(R.drawable.d20_s20);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(100, 100);
                        d20_s20.setLayoutParams(layoutParams);

                        mLinearLayout20.addView(d20_s20);

                    }
                }

            }
        }
}

private void TotalScore(){

        for (int i=0; i<mRolls2.length; i++){
           mTotalScore+=mRolls2[i];
       }
    for (int i=0; i<mRolls4.length; i++){
        mTotalScore+=mRolls4[i];
    }
    for (int i=0; i<mRolls6.length; i++){
        mTotalScore+=mRolls6[i];
    }
    for (int i=0; i<mRolls8.length; i++){
        mTotalScore+=mRolls8[i];
    }
    for (int i=0; i<mRolls10.length; i++){
        mTotalScore+=mRolls10[i];
    }
    for (int i=0; i<mRolls12.length; i++){
        mTotalScore+=mRolls12[i];
    }
    for (int i=0; i<mRolls20.length; i++){
        mTotalScore+=mRolls20[i];
    }

mTotalScoreView.setText(String.valueOf(mTotalScore));
}

    // Starts this Activity
    public static Intent newIntent(Context ctx, ShakeActivity shakeActivity) {
        Intent ret = new Intent(ctx, ResultsActivity.class);
        ret.putExtra(EXTRA_DICE_CHOICES,shakeActivity.GetDiceChoice());
//        ret.putExtra(EXTRA_DICE_CHOICE_2, shakeActivity.GetDiceChoice(0));
//        ret.putExtra(EXTRA_DICE_CHOICE_4, shakeActivity.GetDiceChoice(1));
//        ret.putExtra(EXTRA_DICE_CHOICE_6, shakeActivity.GetDiceChoice(2));
//        ret.putExtra(EXTRA_DICE_CHOICE_8, shakeActivity.GetDiceChoice(3));
//        ret.putExtra(EXTRA_DICE_CHOICE_10, shakeActivity.GetDiceChoice(4));
//        ret.putExtra(EXTRA_DICE_CHOICE_12, shakeActivity.GetDiceChoice(5));
//        ret.putExtra(EXTRA_DICE_CHOICE_20, shakeActivity.GetDiceChoice(6));
        return ret;
    }
}