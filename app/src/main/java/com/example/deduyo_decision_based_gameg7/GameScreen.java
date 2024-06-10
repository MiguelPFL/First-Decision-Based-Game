package com.example.deduyo_decision_based_gameg7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;

public class GameScreen extends AppCompatActivity implements View.OnClickListener {

    TextView TextBox, charName;
    Button nextButton, choiceA, choiceB, choiceC, choiceD, reset;
    String[] defaultText, ccharName, TTxtBox, buttons;
    ConstraintLayout background;
    ImageView haruka, mitsuru, ryoku, sota;

    int turnCount; //turn number
    int route;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.game_screen);
        Objects.requireNonNull(getSupportActionBar()).hide();
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        //setting up the default text
        defaultText = getResources().getStringArray(R.array.intro_default);
        //setting up the text changer
        ccharName = getResources().getStringArray(R.array.intro_default);
        //setting up the characters
        haruka = findViewById(R.id.haruka);
        mitsuru = findViewById(R.id.mitsuru);
        ryoku = findViewById(R.id.ryoku);
        sota = findViewById(R.id.sota);
        //setting up button text
        buttons = getResources().getStringArray(R.array.intro_default);
        //setting up txtBox
        TTxtBox = getResources().getStringArray(R.array.intro_default);
        //button to trigger the next dialogue
        nextButton = findViewById(R.id.nextButton);
        //Buttons for choices
        choiceA = findViewById(R.id.button);
        choiceB = findViewById(R.id.button3);
        choiceC = findViewById(R.id.button4);
        choiceD = findViewById(R.id.button5);
        reset = findViewById(R.id.button6);
        //Buttons for choices onClickListener
        choiceA.setOnClickListener(this);
        choiceB.setOnClickListener(this);
        choiceC.setOnClickListener(this);
        choiceD.setOnClickListener(this);
        reset.setOnClickListener(this);

        //dialogue for charName
        charName = findViewById(R.id.charName);
        //dialogue for txtBox
        TextBox = findViewById(R.id.txtBox);
        //Set Game Background
        background = findViewById(R.id.background_otome);
        //Set the default image view.
        background.setBackgroundResource(R.drawable.schoolgrounds);

        // Set text to default scenario.
        charName.setText(defaultText[0]);
        TextBox.setText(defaultText[1]);
        choiceA.setText(defaultText[2]);
        choiceB.setText(defaultText[3]);
        choiceC.setText(defaultText[4]);
        choiceD.setText(defaultText[5]);
    }
    public void showChoices1(){
        choiceA.setVisibility(View.VISIBLE);
        choiceB.setVisibility(View.VISIBLE);
        choiceC.setVisibility(View.GONE);
        choiceD.setVisibility(View.GONE);
    }

    public void showChoices2(){
        choiceA.setVisibility(View.VISIBLE);
        choiceB.setVisibility(View.VISIBLE);
        choiceC.setVisibility(View.VISIBLE);
        choiceD.setVisibility(View.GONE);
    }

    public void showChoices3(){
        choiceA.setVisibility(View.VISIBLE);
        choiceB.setVisibility(View.VISIBLE);
        choiceC.setVisibility(View.VISIBLE);
        choiceD.setVisibility(View.VISIBLE);
    }

    public void hideChoices(){
        choiceA.setVisibility(View.GONE);
        choiceB.setVisibility(View.GONE);
        choiceC.setVisibility(View.GONE);
        choiceD.setVisibility(View.GONE);
    }

    public void showResetButton(){
        reset.setVisibility(View.VISIBLE);
    }

    public void hideResetButton(){
        reset.setVisibility(View.GONE);
    }

    //this button must be hidden once choices appear
    public void hidenextButton(){
        nextButton.setVisibility(View.GONE);
    }

    //this will show the nextButton after the choices state end
    public void shownextButton(){
        nextButton.setVisibility(View.VISIBLE);
    }

    //this will hide the character name
    public void hideCharName(){
        charName.setVisibility(View.GONE);
    }

    //this will show the character name
    public void showCharName(){
        charName.setVisibility(View.VISIBLE);
    }


    public void storyProgression() {

        if (turnCount == 1) { //Turn 1
            ccharName = getResources().getStringArray(R.array.turn_1);
            TTxtBox = getResources().getStringArray(R.array.turn_1);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 2){ //Turn 2
            showChoices1();
            hidenextButton();
            ccharName = getResources().getStringArray(R.array.turn_2);
            TTxtBox = getResources().getStringArray(R.array.turn_2);
            buttons = getResources().getStringArray(R.array.turn_2);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
            choiceA.setText(buttons[2]);
            choiceB.setText(buttons[3]);

        }
        else if (turnCount == 3){ //Turn 3
            shownextButton();
            hideChoices();
            ccharName = getResources().getStringArray(R.array.turn_3);
            TTxtBox = getResources().getStringArray(R.array.turn_3);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 4){ //Turn 4
            ccharName = getResources().getStringArray(R.array.turn_4);
            TTxtBox = getResources().getStringArray(R.array.turn_4);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 5){ //Turn 5
            ccharName = getResources().getStringArray(R.array.turn_5);
            TTxtBox = getResources().getStringArray(R.array.turn_5);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 6){ //Turn 6
            showChoices1();
            hidenextButton();
            ccharName = getResources().getStringArray(R.array.turn_6);
            TTxtBox = getResources().getStringArray(R.array.turn_6);
            buttons = getResources().getStringArray(R.array.turn_6);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
            choiceA.setText(buttons[2]);
            choiceB.setText(buttons[3]);
        }
        else if (turnCount == 7){ //Turn 7
            shownextButton();
            hideChoices();
            hideCharName();
            TTxtBox = getResources().getStringArray(R.array.turn_7);
            TextBox.setText(TTxtBox[1]);
            haruka.setVisibility(View.GONE);
        }
        else if (turnCount == 8){ //Turn 8
            showCharName();
            haruka.setVisibility(View.VISIBLE);
            ccharName = getResources().getStringArray(R.array.turn_8);
            TTxtBox = getResources().getStringArray(R.array.turn_8);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);

        }
        else if (turnCount == 9){ //Turn 9
            showChoices1();
            hidenextButton();
            ccharName = getResources().getStringArray(R.array.turn_9);
            TTxtBox = getResources().getStringArray(R.array.turn_9);
            buttons = getResources().getStringArray(R.array.turn_9);
            TextBox.setText(TTxtBox[1]);
            choiceA.setText(buttons[2]);
            choiceB.setText(buttons[3]);
        }
        else if (turnCount == 10){ //Turn 10 Ryoku Route
            if (route == 1){
                hideChoices();
                shownextButton();
                haruka.setVisibility(View.GONE);
                ryoku.setVisibility(View.VISIBLE);
                ccharName = getResources().getStringArray(R.array.ryoku_route1);
                TTxtBox = getResources().getStringArray(R.array.ryoku_route1);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);

            }
            else if (route == 2){ //Turn 10 Mitsuru Route
                hideChoices();
                shownextButton();
                haruka.setVisibility(View.GONE);
                mitsuru.setVisibility(View.VISIBLE);
                ccharName = getResources().getStringArray(R.array.mitsuru_route1);
                TTxtBox = getResources().getStringArray(R.array.mitsuru_route1);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
            }

        }
        else if (turnCount == 11){ //Turn 11
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.VISIBLE);
            ccharName = getResources().getStringArray(R.array.turn_11);
            TTxtBox = getResources().getStringArray(R.array.turn_11);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);

        }
        else if (turnCount == 12){ //Turn 12
            route = 0;
            mitsuru.setVisibility(View.VISIBLE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            ccharName = getResources().getStringArray(R.array.turn_12);
            TTxtBox = getResources().getStringArray(R.array.turn_12);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 13){ //Turn 13
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.VISIBLE);
            ccharName = getResources().getStringArray(R.array.turn_13);
            TTxtBox = getResources().getStringArray(R.array.turn_13);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 14){ //Turn 14
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.VISIBLE);
            haruka.setVisibility(View.GONE);
            ccharName = getResources().getStringArray(R.array.turn_14);
            TTxtBox = getResources().getStringArray(R.array.turn_14);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 15){ //Turn 15
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.VISIBLE);
            ccharName = getResources().getStringArray(R.array.turn_15);
            TTxtBox = getResources().getStringArray(R.array.turn_15);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 16){ //Turn 16
            mitsuru.setVisibility(View.VISIBLE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            ccharName = getResources().getStringArray(R.array.turn_16);
            TTxtBox = getResources().getStringArray(R.array.turn_16);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 17){ //Turn 17
            showChoices3();
            hidenextButton();
            ccharName = getResources().getStringArray(R.array.turn_17);
            TTxtBox = getResources().getStringArray(R.array.turn_17);
            buttons = getResources().getStringArray(R.array.turn_17);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
            choiceA.setText(buttons[2]);
            choiceB.setText(buttons[3]);
            choiceC.setText(buttons[4]);
            choiceD.setText(buttons[5]);
        }
        else if (turnCount == 18){
            hideChoices();
            shownextButton();
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.VISIBLE);
            haruka.setVisibility(View.GONE);
            ccharName = getResources().getStringArray(R.array.turn_18);
            TTxtBox = getResources().getStringArray(R.array.turn_18);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 19){
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.VISIBLE);
            ccharName = getResources().getStringArray(R.array.turn_19);
            TTxtBox = getResources().getStringArray(R.array.turn_19);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 20){
            mitsuru.setVisibility(View.VISIBLE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            ccharName = getResources().getStringArray(R.array.turn_20);
            TTxtBox = getResources().getStringArray(R.array.turn_20);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 21){
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.VISIBLE);
            ccharName = getResources().getStringArray(R.array.turn_21);
            TTxtBox = getResources().getStringArray(R.array.turn_21);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 22){
            hideCharName();
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            TTxtBox = getResources().getStringArray(R.array.turn_22);
            TextBox.setText(TTxtBox[1]);
            background.setBackgroundResource(R.drawable.studentcounciloffice);
        }
        else if (turnCount == 23){
            showCharName();
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.VISIBLE);
            ccharName = getResources().getStringArray(R.array.turn_23);
            TTxtBox = getResources().getStringArray(R.array.turn_23);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 24){
            showChoices1();
            hidenextButton();
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.VISIBLE);
            ccharName = getResources().getStringArray(R.array.turn_24);
            TTxtBox = getResources().getStringArray(R.array.turn_24);
            buttons = getResources().getStringArray(R.array.turn_24);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
            choiceA.setText(buttons[2]);
            choiceB.setText(buttons[3]);
        }
        else if (turnCount == 25){
            hideChoices();
            shownextButton();
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.VISIBLE);
            ccharName = getResources().getStringArray(R.array.turn_25);
            TTxtBox = getResources().getStringArray(R.array.turn_25);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 26){
            showChoices1();
            hidenextButton();
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.VISIBLE);
            ccharName = getResources().getStringArray(R.array.turn_26);
            TTxtBox = getResources().getStringArray(R.array.turn_26);
            buttons = getResources().getStringArray(R.array.turn_26);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
            choiceA.setText(buttons[2]);
            choiceB.setText(buttons[3]);
        }
        else if (turnCount == 27){
            hideChoices();
            shownextButton();
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            sota.setVisibility(View.VISIBLE);
            ccharName = getResources().getStringArray(R.array.turn_27);
            TTxtBox = getResources().getStringArray(R.array.turn_27);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 28){
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.VISIBLE);
            sota.setVisibility(View.GONE);
            ccharName = getResources().getStringArray(R.array.turn_28);
            TTxtBox = getResources().getStringArray(R.array.turn_28);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 29){
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.VISIBLE);
            sota.setVisibility(View.GONE);
            ccharName = getResources().getStringArray(R.array.turn_29);
            TTxtBox = getResources().getStringArray(R.array.turn_29);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 30){
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            sota.setVisibility(View.VISIBLE);
            ccharName = getResources().getStringArray(R.array.turn_30);
            TTxtBox = getResources().getStringArray(R.array.turn_30);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 31){
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            sota.setVisibility(View.VISIBLE);
            ccharName = getResources().getStringArray(R.array.turn_31);
            TTxtBox = getResources().getStringArray(R.array.turn_31);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 32){
            background.setBackgroundResource(R.drawable.blackscreen);
            hideCharName();
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            sota.setVisibility(View.GONE);
            TTxtBox = getResources().getStringArray(R.array.turn_32);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 33){
            background.setBackgroundResource(R.drawable.clubroom);
            showCharName();
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.VISIBLE);
            sota.setVisibility(View.GONE);
            ccharName = getResources().getStringArray(R.array.turn_33);
            TTxtBox = getResources().getStringArray(R.array.turn_33);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 34){
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.VISIBLE);
            haruka.setVisibility(View.GONE);
            sota.setVisibility(View.GONE);
            ccharName = getResources().getStringArray(R.array.turn_34);
            TTxtBox = getResources().getStringArray(R.array.turn_34);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 35){
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.VISIBLE);
            sota.setVisibility(View.GONE);
            ccharName = getResources().getStringArray(R.array.turn_35);
            TTxtBox = getResources().getStringArray(R.array.turn_35);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 36){
            mitsuru.setVisibility(View.VISIBLE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            sota.setVisibility(View.GONE);
            ccharName = getResources().getStringArray(R.array.turn_36);
            TTxtBox = getResources().getStringArray(R.array.turn_36);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 37){
            hidenextButton();
            showChoices1();
            mitsuru.setVisibility(View.VISIBLE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            sota.setVisibility(View.GONE);
            ccharName = getResources().getStringArray(R.array.turn_37);
            TTxtBox = getResources().getStringArray(R.array.turn_37);
            buttons = getResources().getStringArray(R.array.turn_37);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
            choiceA.setText(buttons[2]);
            choiceB.setText(buttons[3]);
        }
        else if (turnCount == 38){
            shownextButton();
            hideChoices();
            mitsuru.setVisibility(View.VISIBLE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            sota.setVisibility(View.GONE);
            ccharName = getResources().getStringArray(R.array.turn_38);
            TTxtBox = getResources().getStringArray(R.array.turn_38);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 39){
            background.setBackgroundResource(R.drawable.blackscreen);
            hideCharName();
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            sota.setVisibility(View.GONE);
            TTxtBox = getResources().getStringArray(R.array.turn_39);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 40){
            background.setBackgroundResource(R.drawable.clubroom);
            showCharName();
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            sota.setVisibility(View.VISIBLE);
            ccharName = getResources().getStringArray(R.array.turn_40);
            TTxtBox = getResources().getStringArray(R.array.turn_40);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 41){
            background.setBackgroundResource(R.drawable.clubroom);
            showCharName();
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.VISIBLE);
            sota.setVisibility(View.GONE);
            ccharName = getResources().getStringArray(R.array.turn_41);
            TTxtBox = getResources().getStringArray(R.array.turn_41);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 42){
            mitsuru.setVisibility(View.VISIBLE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            sota.setVisibility(View.GONE);
            ccharName = getResources().getStringArray(R.array.turn_42);
            TTxtBox = getResources().getStringArray(R.array.turn_42);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 43){
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.VISIBLE);
            haruka.setVisibility(View.GONE);
            sota.setVisibility(View.GONE);
            ccharName = getResources().getStringArray(R.array.turn_43);
            TTxtBox = getResources().getStringArray(R.array.turn_43);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 44){
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.VISIBLE);
            sota.setVisibility(View.GONE);
            ccharName = getResources().getStringArray(R.array.turn_44);
            TTxtBox = getResources().getStringArray(R.array.turn_44);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 45){
            background.setBackgroundResource(R.drawable.blackscreen);
            hideCharName();
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            sota.setVisibility(View.GONE);
            TTxtBox = getResources().getStringArray(R.array.turn_45);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 46){
            background.setBackgroundResource(R.drawable.clubroom);
            showCharName();
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.VISIBLE);
            sota.setVisibility(View.GONE);
            ccharName = getResources().getStringArray(R.array.turn_46);
            TTxtBox = getResources().getStringArray(R.array.turn_46);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 47){
            hideCharName();
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            sota.setVisibility(View.GONE);
            TTxtBox = getResources().getStringArray(R.array.turn_47);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 48){
            showCharName();
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            sota.setVisibility(View.VISIBLE);
            ccharName = getResources().getStringArray(R.array.turn_48);
            TTxtBox = getResources().getStringArray(R.array.turn_48);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 49){
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.VISIBLE);
            sota.setVisibility(View.GONE);
            ccharName = getResources().getStringArray(R.array.turn_49);
            TTxtBox = getResources().getStringArray(R.array.turn_49);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 50){
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            sota.setVisibility(View.VISIBLE);
            ccharName = getResources().getStringArray(R.array.turn_50);
            TTxtBox = getResources().getStringArray(R.array.turn_50);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 51){
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.VISIBLE);
            sota.setVisibility(View.GONE);
            ccharName = getResources().getStringArray(R.array.turn_51);
            TTxtBox = getResources().getStringArray(R.array.turn_51);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 52){
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            sota.setVisibility(View.VISIBLE);
            ccharName = getResources().getStringArray(R.array.turn_52);
            TTxtBox = getResources().getStringArray(R.array.turn_52);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 53){
            showChoices1();
            hidenextButton();
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            sota.setVisibility(View.VISIBLE);
            ccharName = getResources().getStringArray(R.array.turn_53);
            TTxtBox = getResources().getStringArray(R.array.turn_53);
            buttons = getResources().getStringArray(R.array.turn_53);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
            choiceA.setText(buttons[2]);
            choiceB.setText(buttons[3]);
        }
        else if (turnCount == 54){
            hideChoices();
            shownextButton();
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            sota.setVisibility(View.VISIBLE);
            ccharName = getResources().getStringArray(R.array.turn_54);
            TTxtBox = getResources().getStringArray(R.array.turn_54);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 55){
            showChoices2();
            hidenextButton();
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            sota.setVisibility(View.VISIBLE);
            ccharName = getResources().getStringArray(R.array.turn_55);
            TTxtBox = getResources().getStringArray(R.array.turn_55);
            buttons = getResources().getStringArray(R.array.turn_55);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
            choiceA.setText(buttons[2]);
            choiceB.setText(buttons[3]);
            choiceC.setText(buttons[4]);
        }
        else if (turnCount == 56){
            if (route == 1) {
                hideChoices();
                shownextButton();
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.VISIBLE);
                ccharName = getResources().getStringArray(R.array.turn_56_firstroute);
                TTxtBox = getResources().getStringArray(R.array.turn_56_firstroute);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                route = 1;
            }
            else if (route == 2) {
                hideChoices();
                shownextButton();
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.VISIBLE);
                ccharName = getResources().getStringArray(R.array.turn_56_secondroute);
                TTxtBox = getResources().getStringArray(R.array.turn_56_secondroute);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                route = 2;
            }
        }
        else if (turnCount == 57){
            if (route == 1) {
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.VISIBLE);
                sota.setVisibility(View.GONE);
                ccharName = getResources().getStringArray(R.array.turn_57_firstroute);
                TTxtBox = getResources().getStringArray(R.array.turn_57_firstroute);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                route = 1;
            }
            else if (route == 2) {
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.VISIBLE);
                sota.setVisibility(View.GONE);
                ccharName = getResources().getStringArray(R.array.turn_57_secondroute);
                TTxtBox = getResources().getStringArray(R.array.turn_57_secondroute);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                route = 2;
            }
        }
        else if (turnCount == 58){
            if (route == 1) {
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.VISIBLE);
                ccharName = getResources().getStringArray(R.array.turn_58_firstroute);
                TTxtBox = getResources().getStringArray(R.array.turn_58_firstroute);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                route = 0;
            }
            else if (route == 2) {
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.VISIBLE);
                ccharName = getResources().getStringArray(R.array.turn_58_secondroute);
                TTxtBox = getResources().getStringArray(R.array.turn_58_secondroute);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                route = 0;
            }
        }
        else if (turnCount == 59) {
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.VISIBLE);
            sota.setVisibility(View.GONE);
            ccharName = getResources().getStringArray(R.array.turn_59);
            TTxtBox = getResources().getStringArray(R.array.turn_59);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 60) {
            background.setBackgroundResource(R.drawable.harukaroom);
            hideCharName();
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            sota.setVisibility(View.GONE);
            TTxtBox = getResources().getStringArray(R.array.turn_60);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 61) {
            hidenextButton();
            showChoices1();
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            sota.setVisibility(View.GONE);
            TTxtBox = getResources().getStringArray(R.array.turn_61);
            buttons = getResources().getStringArray(R.array.turn_61);
            TextBox.setText(TTxtBox[1]);
            choiceA.setText(buttons[2]);
            choiceB.setText(buttons[3]);
        }
        else if (turnCount == 62){
            if (route == 1) {
                showCharName();
                hideChoices();
                shownextButton();
                mitsuru.setVisibility(View.VISIBLE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                ccharName = getResources().getStringArray(R.array.turn_62_mitsuru_route);
                TTxtBox = getResources().getStringArray(R.array.turn_62_mitsuru_route);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                route = 1;
            }
            else if (route == 2) {
                showCharName();
                hideChoices();
                shownextButton();
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.VISIBLE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                ccharName = getResources().getStringArray(R.array.turn_62_ryoku_route);
                TTxtBox = getResources().getStringArray(R.array.turn_62_ryoku_route);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                route = 2;
            }
        }
        else if (turnCount == 63){
            if (route == 1) {
                showChoices1();
                hidenextButton();
                mitsuru.setVisibility(View.VISIBLE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                ccharName = getResources().getStringArray(R.array.turn_63_mitsuru_route);
                TTxtBox = getResources().getStringArray(R.array.turn_63_mitsuru_route);
                buttons = getResources().getStringArray(R.array.turn_63_mitsuru_route);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                choiceA.setText(buttons[2]);
                choiceB.setText(buttons[3]);
                route = 1;
            }
            else if (route == 2) {
                showChoices1();
                hidenextButton();
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.VISIBLE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                ccharName = getResources().getStringArray(R.array.turn_63_ryoku_route);
                TTxtBox = getResources().getStringArray(R.array.turn_63_ryoku_route);
                buttons = getResources().getStringArray(R.array.turn_63_ryoku_route);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                choiceA.setText(buttons[2]);
                choiceB.setText(buttons[3]);
                route = 2;
            }
        }
        else if (turnCount == 64){
            if (route == 1) {
                hideChoices();
                shownextButton();
                mitsuru.setVisibility(View.VISIBLE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                ccharName = getResources().getStringArray(R.array.turn_64_mitsuru_route);
                TTxtBox = getResources().getStringArray(R.array.turn_64_mitsuru_route);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                route = 1;
            }
            else if (route == 2) {
                hideChoices();
                shownextButton();
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.VISIBLE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                ccharName = getResources().getStringArray(R.array.turn_64_ryoku_route);
                TTxtBox = getResources().getStringArray(R.array.turn_64_ryoku_route);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                route = 2;
            }
        }
        else if (turnCount == 65){
            if (route == 1) {
                hideCharName();
                background.setBackgroundResource(R.drawable.golf_course);
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                TTxtBox = getResources().getStringArray(R.array.turn_65_mitsuru_route);
                TextBox.setText(TTxtBox[1]);
                route = 1;
            }
            else if (route == 2) {
                hideCharName();
                background.setBackgroundResource(R.drawable.arcade);
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                TTxtBox = getResources().getStringArray(R.array.turn_65_ryoku_route);
                TextBox.setText(TTxtBox[1]);
                route = 2;
            }
        }
        else if (turnCount == 66){
            if (route == 1) {
                showCharName();
                background.setBackgroundResource(R.drawable.food);
                mitsuru.setVisibility(View.VISIBLE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                ccharName = getResources().getStringArray(R.array.turn_66_mitsuru_route);
                TTxtBox = getResources().getStringArray(R.array.turn_66_mitsuru_route);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                route = 1;
            }
            else if (route == 2) {
                showCharName();
                background.setBackgroundResource(R.drawable.cafe);
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.VISIBLE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                ccharName = getResources().getStringArray(R.array.turn_66_ryoku_route);
                TTxtBox = getResources().getStringArray(R.array.turn_66_ryoku_route);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                route = 2;
            }
        }
        else if (turnCount == 67){
            if (route == 1) {
                hidenextButton();
                showChoices1();
                mitsuru.setVisibility(View.VISIBLE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                ccharName = getResources().getStringArray(R.array.turn_67_mitsuru_route);
                TTxtBox = getResources().getStringArray(R.array.turn_67_mitsuru_route);
                buttons = getResources().getStringArray(R.array.turn_67_mitsuru_route);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                choiceA.setText(buttons[2]);
                choiceB.setText(buttons[3]);
                route = 1;
            }
            else if (route == 2) {
                hidenextButton();
                showChoices1();
                background.setBackgroundResource(R.drawable.cafe);
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.VISIBLE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                ccharName = getResources().getStringArray(R.array.turn_67_ryoku_route);
                TTxtBox = getResources().getStringArray(R.array.turn_67_ryoku_route);
                buttons = getResources().getStringArray(R.array.turn_67_ryoku_route);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                choiceA.setText(buttons[2]);
                choiceB.setText(buttons[3]);
                route = 2;
            }
        }
        else if (turnCount == 68){
            if (route == 1) {
                shownextButton();
                hideChoices();
                mitsuru.setVisibility(View.VISIBLE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                ccharName = getResources().getStringArray(R.array.turn_68_mitsuru_route);
                TTxtBox = getResources().getStringArray(R.array.turn_68_mitsuru_route);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                route = 1;
            }
            else if (route == 2) {
                shownextButton();
                hideChoices();
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.VISIBLE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                ccharName = getResources().getStringArray(R.array.turn_68_ryoku_route);
                TTxtBox = getResources().getStringArray(R.array.turn_68_ryoku_route);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                route = 2;
            }
        }
        else if (turnCount == 69){
            if (route == 1) {
                mitsuru.setVisibility(View.VISIBLE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                ccharName = getResources().getStringArray(R.array.turn_69_mitsuru_route);
                TTxtBox = getResources().getStringArray(R.array.turn_69_mitsuru_route);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                route = 1;
            }
            else if (route == 2) {
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.VISIBLE);
                sota.setVisibility(View.GONE);
                ccharName = getResources().getStringArray(R.array.turn_69_ryoku_route);
                TTxtBox = getResources().getStringArray(R.array.turn_69_ryoku_route);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                route = 2;
            }
        }
        else if (turnCount == 70){
            if (route == 1) {
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.VISIBLE);
                sota.setVisibility(View.GONE);
                ccharName = getResources().getStringArray(R.array.turn_70_mitsuru_route);
                TTxtBox = getResources().getStringArray(R.array.turn_70_mitsuru_route);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                route = 1;
            }
            else if (route == 2) {
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.VISIBLE);
                sota.setVisibility(View.GONE);
                ccharName = getResources().getStringArray(R.array.turn_70_ryoku_route);
                TTxtBox = getResources().getStringArray(R.array.turn_70_ryoku_route);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                route = 2;
            }
        }
        else if (turnCount == 71){
            if (route == 1) {
                mitsuru.setVisibility(View.VISIBLE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                ccharName = getResources().getStringArray(R.array.turn_71_mitsuru_route);
                TTxtBox = getResources().getStringArray(R.array.turn_71_mitsuru_route);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                route = 1;
            }
            else if (route == 2) {
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.VISIBLE);
                sota.setVisibility(View.GONE);
                ccharName = getResources().getStringArray(R.array.turn_71_ryoku_route);
                TTxtBox = getResources().getStringArray(R.array.turn_71_ryoku_route);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                route = 2;
            }
        }
        else if (turnCount == 72){
            if (route == 1) {
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.VISIBLE);
                sota.setVisibility(View.GONE);
                ccharName = getResources().getStringArray(R.array.turn_72_mitsuru_route);
                TTxtBox = getResources().getStringArray(R.array.turn_72_mitsuru_route);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                route = 1;
            }
            else if (route == 2) {
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.VISIBLE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                ccharName = getResources().getStringArray(R.array.turn_72_ryoku_route);
                TTxtBox = getResources().getStringArray(R.array.turn_72_ryoku_route);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                route = 2;
            }
        }
        else if (turnCount == 73){
            if (route == 1) {
                mitsuru.setVisibility(View.VISIBLE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                ccharName = getResources().getStringArray(R.array.turn_73_mitsuru_route);
                TTxtBox = getResources().getStringArray(R.array.turn_73_mitsuru_route);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                route = 1;
            }
            else if (route == 2) {
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.VISIBLE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                ccharName = getResources().getStringArray(R.array.turn_73_ryoku_route);
                TTxtBox = getResources().getStringArray(R.array.turn_73_ryoku_route);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                route = 2;
            }
        }
        else if (turnCount == 74){
            if (route == 1) {
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.VISIBLE);
                sota.setVisibility(View.GONE);
                ccharName = getResources().getStringArray(R.array.turn_74_mitsuru_route);
                TTxtBox = getResources().getStringArray(R.array.turn_74_mitsuru_route);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                route = 1;
            }
            else if (route == 2) {
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.VISIBLE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                ccharName = getResources().getStringArray(R.array.turn_74_ryoku_route);
                TTxtBox = getResources().getStringArray(R.array.turn_74_ryoku_route);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                route = 2;
            }
        }
        else if (turnCount == 75){
            if (route == 1) {
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.VISIBLE);
                sota.setVisibility(View.GONE);
                ccharName = getResources().getStringArray(R.array.turn_75_mitsuru_route);
                TTxtBox = getResources().getStringArray(R.array.turn_75_mitsuru_route);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                route = 1;
            }
            else if (route == 2) {
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.VISIBLE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                ccharName = getResources().getStringArray(R.array.turn_75_ryoku_route);
                TTxtBox = getResources().getStringArray(R.array.turn_75_ryoku_route);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                route = 2;
            }
        }
        else if (turnCount == 76){
            if (route == 1) {
                mitsuru.setVisibility(View.VISIBLE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                ccharName = getResources().getStringArray(R.array.turn_76_mitsuru_route);
                TTxtBox = getResources().getStringArray(R.array.turn_76_mitsuru_route);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                route = 1;
            }
            else if (route == 2) {
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.VISIBLE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                ccharName = getResources().getStringArray(R.array.turn_76_ryoku_route);
                TTxtBox = getResources().getStringArray(R.array.turn_76_ryoku_route);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                route = 2;
            }
        }
        else if (turnCount == 77){
            if (route == 1) {
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.VISIBLE);
                sota.setVisibility(View.GONE);
                ccharName = getResources().getStringArray(R.array.turn_77_mitsuru_route);
                TTxtBox = getResources().getStringArray(R.array.turn_77_mitsuru_route);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                route = 1;
            }
            else if (route == 2) {
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.VISIBLE);
                sota.setVisibility(View.GONE);
                ccharName = getResources().getStringArray(R.array.turn_77_ryoku_route);
                TTxtBox = getResources().getStringArray(R.array.turn_77_ryoku_route);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                route = 2;
            }
        }
        else if (turnCount == 78){
            if (route == 1) {
                mitsuru.setVisibility(View.VISIBLE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                ccharName = getResources().getStringArray(R.array.turn_78_mitsuru_route);
                TTxtBox = getResources().getStringArray(R.array.turn_78_mitsuru_route);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                route = 1;
            }
            else if (route == 2) {
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.VISIBLE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                ccharName = getResources().getStringArray(R.array.turn_78_ryoku_route);
                TTxtBox = getResources().getStringArray(R.array.turn_78_ryoku_route);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                route = 2;
            }
        }
        else if (turnCount == 79){
            if (route == 1) {
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.VISIBLE);
                sota.setVisibility(View.GONE);
                ccharName = getResources().getStringArray(R.array.turn_79_mitsuru_route);
                TTxtBox = getResources().getStringArray(R.array.turn_79_mitsuru_route);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                route = 1;
            }
            else if (route == 2) {
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.VISIBLE);
                sota.setVisibility(View.GONE);
                ccharName = getResources().getStringArray(R.array.turn_79_ryoku_route);
                TTxtBox = getResources().getStringArray(R.array.turn_79_ryoku_route);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                route = 2;
            }
        }
        else if (turnCount == 80){
            if (route == 1) {
                mitsuru.setVisibility(View.VISIBLE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                ccharName = getResources().getStringArray(R.array.turn_80_mitsuru_route);
                TTxtBox = getResources().getStringArray(R.array.turn_80_mitsuru_route);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                route = 1;
            }
            else if (route == 2) {
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.VISIBLE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                ccharName = getResources().getStringArray(R.array.turn_80_ryoku_route);
                TTxtBox = getResources().getStringArray(R.array.turn_80_ryoku_route);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                route = 2;
            }
        }
        else if (turnCount == 81){
            if (route == 1) {
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.VISIBLE);
                sota.setVisibility(View.GONE);
                ccharName = getResources().getStringArray(R.array.turn_81_mitsuru_route);
                TTxtBox = getResources().getStringArray(R.array.turn_81_mitsuru_route);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                route = 1;
            }
            else if (route == 2) {
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.VISIBLE);
                sota.setVisibility(View.GONE);
                ccharName = getResources().getStringArray(R.array.turn_81_ryoku_route);
                TTxtBox = getResources().getStringArray(R.array.turn_81_ryoku_route);
                charName.setText(ccharName[0]);
                TextBox.setText(TTxtBox[1]);
                route = 2;
            }
        }
        else if (turnCount == 82){
            if (route == 1) {
                background.setBackgroundResource(R.drawable.blackscreen);
                hideCharName();
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                TTxtBox = getResources().getStringArray(R.array.turn_82_mitsuru_route);
                TextBox.setText(TTxtBox[1]);
                route = 1;
            }
            else if (route == 2) {
                background.setBackgroundResource(R.drawable.blackscreen);
                hideCharName();
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                TTxtBox = getResources().getStringArray(R.array.turn_82_ryoku_route);
                TextBox.setText(TTxtBox[1]);
                route = 2;
            }
        }
        else if (turnCount == 83){
            if (route == 1) {
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                TTxtBox = getResources().getStringArray(R.array.turn_83_mitsuru_route);
                TextBox.setText(TTxtBox[1]);
                route = 0;
            }
            else if (route == 2) {
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                TTxtBox = getResources().getStringArray(R.array.turn_83_ryoku_route);
                TextBox.setText(TTxtBox[1]);
                route = 0;
            }
        }
        else if (turnCount == 84){
            background.setBackgroundResource(R.drawable.clubroom);
            showCharName();
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            sota.setVisibility(View.VISIBLE);
            ccharName = getResources().getStringArray(R.array.turn_84);
            TTxtBox = getResources().getStringArray(R.array.turn_84);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 85){
            showChoices1();
            hidenextButton();
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            sota.setVisibility(View.VISIBLE);
            ccharName = getResources().getStringArray(R.array.turn_85);
            TTxtBox = getResources().getStringArray(R.array.turn_85);
            buttons = getResources().getStringArray(R.array.turn_85);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
            choiceA.setText(buttons[2]);
            choiceB.setText(buttons[3]);
        }
        else if (turnCount == 86){
            hideChoices();
            shownextButton();
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            sota.setVisibility(View.VISIBLE);
            ccharName = getResources().getStringArray(R.array.turn_86);
            TTxtBox = getResources().getStringArray(R.array.turn_86);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 87){
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.VISIBLE);
            sota.setVisibility(View.GONE);
            ccharName = getResources().getStringArray(R.array.turn_87);
            TTxtBox = getResources().getStringArray(R.array.turn_87);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 88){
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            sota.setVisibility(View.VISIBLE);
            ccharName = getResources().getStringArray(R.array.turn_88);
            TTxtBox = getResources().getStringArray(R.array.turn_88);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 89){
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.VISIBLE);
            sota.setVisibility(View.GONE);
            ccharName = getResources().getStringArray(R.array.turn_89);
            TTxtBox = getResources().getStringArray(R.array.turn_89);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 90){
            hideCharName();
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            sota.setVisibility(View.GONE);
            TTxtBox = getResources().getStringArray(R.array.turn_90);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 91){
            background.setBackgroundResource(R.drawable.concert);
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            sota.setVisibility(View.GONE);
            TTxtBox = getResources().getStringArray(R.array.turn_91);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 92){
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            sota.setVisibility(View.GONE);
            TTxtBox = getResources().getStringArray(R.array.turn_92);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 93){
            background.setBackgroundResource(R.drawable.nearby_place);
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            sota.setVisibility(View.GONE);
            TTxtBox = getResources().getStringArray(R.array.turn_93);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 94){
            showCharName();
            mitsuru.setVisibility(View.VISIBLE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            sota.setVisibility(View.GONE);
            ccharName = getResources().getStringArray(R.array.turn_94);
            TTxtBox = getResources().getStringArray(R.array.turn_94);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 95){
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            sota.setVisibility(View.VISIBLE);
            ccharName = getResources().getStringArray(R.array.turn_95);
            TTxtBox = getResources().getStringArray(R.array.turn_95);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 96){
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.VISIBLE);
            haruka.setVisibility(View.GONE);
            sota.setVisibility(View.GONE);
            ccharName = getResources().getStringArray(R.array.turn_96);
            TTxtBox = getResources().getStringArray(R.array.turn_96);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 97){
            mitsuru.setVisibility(View.VISIBLE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            sota.setVisibility(View.GONE);
            ccharName = getResources().getStringArray(R.array.turn_97);
            TTxtBox = getResources().getStringArray(R.array.turn_97);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 98){
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            sota.setVisibility(View.GONE);
            ccharName = getResources().getStringArray(R.array.turn_98);
            TTxtBox = getResources().getStringArray(R.array.turn_98);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 99){
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.VISIBLE);
            sota.setVisibility(View.GONE);
            ccharName = getResources().getStringArray(R.array.turn_99);
            TTxtBox = getResources().getStringArray(R.array.turn_99);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 100){
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            sota.setVisibility(View.VISIBLE);
            ccharName = getResources().getStringArray(R.array.turn_100);
            TTxtBox = getResources().getStringArray(R.array.turn_100);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 101){
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.VISIBLE);
            haruka.setVisibility(View.GONE);
            sota.setVisibility(View.GONE);
            ccharName = getResources().getStringArray(R.array.turn_101);
            TTxtBox = getResources().getStringArray(R.array.turn_101);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 102){
            hideCharName();
            mitsuru.setVisibility(View.GONE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            sota.setVisibility(View.GONE);
            TTxtBox = getResources().getStringArray(R.array.turn_102);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 103){
            showCharName();
            mitsuru.setVisibility(View.VISIBLE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            sota.setVisibility(View.GONE);
            ccharName = getResources().getStringArray(R.array.turn_103);
            TTxtBox = getResources().getStringArray(R.array.turn_103);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
        }
        else if (turnCount == 104){
            hidenextButton();
            showChoices3();
            hideResetButton();
            mitsuru.setVisibility(View.VISIBLE);
            ryoku.setVisibility(View.GONE);
            haruka.setVisibility(View.GONE);
            sota.setVisibility(View.GONE);
            ccharName = getResources().getStringArray(R.array.turn_104);
            TTxtBox = getResources().getStringArray(R.array.turn_104);
            buttons = getResources().getStringArray(R.array.turn_104);
            charName.setText(ccharName[0]);
            TextBox.setText(TTxtBox[1]);
            choiceA.setText(buttons[2]);
            choiceB.setText(buttons[3]);
            choiceC.setText(buttons[4]);
            choiceD.setText(buttons[5]);
        }
        else if (turnCount == 105){
            if (route == 1) {
                hideCharName();
                hideChoices();
                shownextButton();
                background.setBackgroundResource(R.drawable.park);
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                TTxtBox = getResources().getStringArray(R.array.turn_105_route1);
                TextBox.setText(TTxtBox[1]);
                route = 1;
            }
            else if (route == 2) {
                hideCharName();
                hideChoices();
                shownextButton();
                background.setBackgroundResource(R.drawable.library);
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                TTxtBox = getResources().getStringArray(R.array.turn_105_route2);
                TextBox.setText(TTxtBox[1]);
                route = 2;
            }
            else if (route == 3) {
                hideCharName();
                hideChoices();
                shownextButton();
                background.setBackgroundResource(R.drawable.school);
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                TTxtBox = getResources().getStringArray(R.array.turn_105_route3);
                TextBox.setText(TTxtBox[1]);
                route = 3;
            }
            else if (route == 4) {
                hideCharName();
                hideChoices();
                shownextButton();
                background.setBackgroundResource(R.drawable.clubroom);
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                TTxtBox = getResources().getStringArray(R.array.turn_105_route4);
                TextBox.setText(TTxtBox[1]);
                route = 4;
            }
        }
        else if (turnCount == 106){
            if (route == 1) {
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                TTxtBox = getResources().getStringArray(R.array.turn_106_route1);
                TextBox.setText(TTxtBox[1]);
                route = 1;
            }
            else if (route == 2) {
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                TTxtBox = getResources().getStringArray(R.array.turn_106_route2);
                TextBox.setText(TTxtBox[1]);
                route = 2;
            }
            else if (route == 3) {
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                TTxtBox = getResources().getStringArray(R.array.turn_106_route3);
                TextBox.setText(TTxtBox[1]);
                route = 3;
            }
            else if (route == 4) {
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                TTxtBox = getResources().getStringArray(R.array.turn_106_route4);
                TextBox.setText(TTxtBox[1]);
                route = 4;
            }
        }
        else if (turnCount == 107){
            if (route == 1) {
                showResetButton();
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                TTxtBox = getResources().getStringArray(R.array.turn_107_route1);
                buttons = getResources().getStringArray(R.array.turn_107_route1);
                TextBox.setText(TTxtBox[1]);
                reset.setText(buttons[6]);
                route = 0;
            }
            else if (route == 2) {
                showResetButton();
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                TTxtBox = getResources().getStringArray(R.array.turn_107_route2);
                buttons = getResources().getStringArray(R.array.turn_107_route2);
                TextBox.setText(TTxtBox[1]);
                reset.setText(buttons[6]);
                route = 0;
            }
            else if (route == 3) {
                showResetButton();
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                TTxtBox = getResources().getStringArray(R.array.turn_107_route3);
                buttons = getResources().getStringArray(R.array.turn_107_route3);
                TextBox.setText(TTxtBox[1]);
                reset.setText(buttons[6]);
                route = 0;
            }
            else if (route == 4) {
                showResetButton();
                mitsuru.setVisibility(View.GONE);
                ryoku.setVisibility(View.GONE);
                haruka.setVisibility(View.GONE);
                sota.setVisibility(View.GONE);
                TTxtBox = getResources().getStringArray(R.array.turn_107_route4);
                buttons = getResources().getStringArray(R.array.turn_107_route4);
                TextBox.setText(TTxtBox[1]);
                reset.setText(buttons[6]);
                route = 0;
            }
        }


    }


    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.nextButton: //PROGRESSION BUTTON
                turnCount++;
                break;

            case R.id.button: //choice A
                if (turnCount == 9){
                    route = 1;
                }else if (turnCount == 55){
                    route = 1;
                }else if (turnCount == 61){
                    route = 1;
                }else if (turnCount == 104){
                    route = 1;
                }
                turnCount++;
                break;

            case R.id.button3: //choice B
                if (turnCount == 9){
                    route = 2;
                }else if (turnCount == 55){
                    route = 2;
                }else if (turnCount == 61){
                    route = 2;
                }else if (turnCount == 104){
                    route = 2;
                }
                turnCount++;
                break;

            case R.id.button4: //choice C
                if (turnCount == 55){
                    route = 2;
                }else if (turnCount == 104){
                    route = 3;
                }
                turnCount++;
                break;

            case R.id.button5: //choice D
                if (turnCount == 104){
                    route = 4;
                }
                turnCount++;
                break;

            case R.id.button6: //check other endings button
                if (turnCount == 107){
                    turnCount = 104;
                    background.setBackgroundResource(R.drawable.nearby_place);
                }
                break;
        }storyProgression();
    }
}