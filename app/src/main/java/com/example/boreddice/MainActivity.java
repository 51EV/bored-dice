package com.example.boreddice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    ImageButton dice1;
    ImageButton dice2;
    ImageButton dice3;
    ImageButton dice4;
    ImageButton dice5;
    ImageButton dice6;
    ImageButton roll;
    int result;
    ConstraintLayout background;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        background = (ConstraintLayout) findViewById(R.id.background);
        background.setBackgroundColor(getResources().getColor(R.color.colorBackground));

        dice1 = findViewById(R.id.dice1);
        dice2 = findViewById(R.id.dice2);
        dice3 = findViewById(R.id.dice3);
        dice4 = findViewById(R.id.dice4);
        dice5 = findViewById(R.id.dice5);
        dice6 = findViewById(R.id.dice6);
        roll = findViewById(R.id.roll);
        randomize();

    }

    public void randomize(){

        roll.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                // code
                result = new Random().nextInt(6)+1;

                switch(result){
                case(1):
                    dice1.setImageResource(R.drawable.dice_1_on);
                    dice2.setImageResource(R.drawable.dice_2_off);
                    dice3.setImageResource(R.drawable.dice_3_off);
                    dice4.setImageResource(R.drawable.dice_4_off);
                    dice5.setImageResource(R.drawable.dice_5_off);
                    dice6.setImageResource(R.drawable.dice_6_off);
                    break;
                case(2):
                    dice1.setImageResource(R.drawable.dice_1_off);
                    dice2.setImageResource(R.drawable.dice_2_on);
                    dice3.setImageResource(R.drawable.dice_3_off);
                    dice4.setImageResource(R.drawable.dice_4_off);
                    dice5.setImageResource(R.drawable.dice_5_off);
                    dice6.setImageResource(R.drawable.dice_6_off);
                    break;
                case(3):
                    dice1.setImageResource(R.drawable.dice_1_off);
                    dice2.setImageResource(R.drawable.dice_2_off);
                    dice3.setImageResource(R.drawable.dice_3_on);
                    dice4.setImageResource(R.drawable.dice_4_off);
                    dice5.setImageResource(R.drawable.dice_5_off);
                    dice6.setImageResource(R.drawable.dice_6_off);
                    break;
                case(4):
                    dice1.setImageResource(R.drawable.dice_1_off);
                    dice2.setImageResource(R.drawable.dice_2_off);
                    dice3.setImageResource(R.drawable.dice_3_off);
                    dice4.setImageResource(R.drawable.dice_4_on);
                    dice5.setImageResource(R.drawable.dice_5_off);
                    dice6.setImageResource(R.drawable.dice_6_off);
                    break;
                case(5):
                    dice1.setImageResource(R.drawable.dice_1_off);
                    dice2.setImageResource(R.drawable.dice_2_off);
                    dice3.setImageResource(R.drawable.dice_3_off);
                    dice4.setImageResource(R.drawable.dice_4_off);
                    dice5.setImageResource(R.drawable.dice_5_on);
                    dice6.setImageResource(R.drawable.dice_6_off);
                    break;
                case(6):
                    dice1.setImageResource(R.drawable.dice_1_off);
                    dice2.setImageResource(R.drawable.dice_2_off);
                    dice3.setImageResource(R.drawable.dice_3_off);
                    dice4.setImageResource(R.drawable.dice_4_off);
                    dice5.setImageResource(R.drawable.dice_5_off);
                    dice6.setImageResource(R.drawable.dice_6_on);
                    break;
                default:
                    dice1.setImageResource(R.drawable.dice_1_off);
                    dice2.setImageResource(R.drawable.dice_2_off);
                    dice3.setImageResource(R.drawable.dice_3_off);
                    dice4.setImageResource(R.drawable.dice_4_off);
                    dice5.setImageResource(R.drawable.dice_5_off);
                    dice6.setImageResource(R.drawable.dice_6_off);
                    break;
                }
            }
        });
    }
}
