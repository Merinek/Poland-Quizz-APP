package com.example.android.polandquizz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int finalPoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Method called to check total good answers after button pressing.
     */
    public void checkScore(View view) {
        EditText nameOfPlayer = (EditText) findViewById(R.id.nameInput);
        String name = nameOfPlayer.getText().toString();

        //Question No1 answer
        RadioButton radioButtonQuestion1AnswerB = (RadioButton) findViewById(R.id.radio_button_Q1_answerB_correct);
        boolean radioButtonQuestion1AnswerBcheck = radioButtonQuestion1AnswerB.isChecked();
        //Question No2 answer
        RadioButton radioButtonQuestion2AnswerA = (RadioButton) findViewById(R.id.radio_button_Q2_answerA_correct);
        boolean radioButtonQuestion2AnswerAcheck = radioButtonQuestion2AnswerA.isChecked();
        //Question No3 answer
        RadioButton radioButtonQuestion3AnswerD = (RadioButton) findViewById(R.id.radio_button_Q3_answerD_correct);
        boolean radioButtonQuestion3AnswerDcheck = radioButtonQuestion3AnswerD.isChecked();
        //Question No4 answer
        RadioButton radioButtonQuestion4AnswerA = (RadioButton) findViewById(R.id.radio_button_Q4_answerA_correct);
        boolean radioButtonQuestion4AnswerAcheck = radioButtonQuestion4AnswerA.isChecked();
        //Question No5 answer
        RadioButton radioButtonQuestion5AnswerC = (RadioButton) findViewById(R.id.radio_button_Q5_answerC_correct);
        boolean radioButtonQuestion5AnswerCcheck = radioButtonQuestion5AnswerC.isChecked();
        //Question No6 answer
        CheckBox checkBoxQuestion6AnswerA = (CheckBox) findViewById(R.id.checkbox_Q6_answerA_correct);
        boolean checkBoxQuestion6AnswerAcheck = checkBoxQuestion6AnswerA.isChecked();
        CheckBox checkBoxQuestion6AnswerB = (CheckBox) findViewById(R.id.checkbox_Q6_answerB_correct);
        boolean checkBoxQuestion6AnswerBcheck = checkBoxQuestion6AnswerB.isChecked();
        CheckBox checkBoxQuestion6AnswerC = (CheckBox) findViewById(R.id.checkbox_Q6_answerC_wrong);
        boolean checkBoxQuestion6AnswerCcheck = checkBoxQuestion6AnswerC.isChecked();
        CheckBox checkBoxQuestion6AnswerD = (CheckBox) findViewById(R.id.checkbox_Q6_answerD_wrong);
        boolean checkBoxQuestion6AnswerDcheck = checkBoxQuestion6AnswerD.isChecked();

        /**@return finalPoints
         *
         */
        int finalPoints = calculateScore(radioButtonQuestion1AnswerBcheck, radioButtonQuestion2AnswerAcheck, radioButtonQuestion3AnswerDcheck,
                radioButtonQuestion4AnswerAcheck, radioButtonQuestion5AnswerCcheck,checkBoxQuestion6AnswerAcheck, checkBoxQuestion6AnswerBcheck,
                checkBoxQuestion6AnswerCcheck, checkBoxQuestion6AnswerDcheck);
        String submitMessage = getString(R.string.finalMessagePart1) + " " + name + ", " + getString(R.string.finalMessagePart2)
                + " " + finalPoints + " " + getString(R.string.finalMessagePart3);
        /**
         * Toast with FINAL SCORE
         */
        Toast.makeText(this, submitMessage, Toast.LENGTH_LONG).show();
    }

       private int calculateScore(boolean radioButtonQuestion1AnswerBcheck, boolean radioButtonQuestion2AnswerAcheck, boolean radioButtonQuestion3AnswerDcheck,
                                  boolean radioButtonQuestion4AnswerAcheck, boolean radioButtonQuestion5AnswerCcheck, boolean checkBoxQuestion6AnswerAcheck,
                                  boolean checkBoxQuestion6AnswerBcheck, boolean checkBoxQuestion6AnswerCcheck, boolean checkBoxQuestion6AnswerDcheck) {
        int score = 0;
                if (radioButtonQuestion1AnswerBcheck) {
                    score += 1;
                }
                if (radioButtonQuestion2AnswerAcheck){
                    score += 1;
                }
                if (radioButtonQuestion3AnswerDcheck) {
                    score += 1;
                }
                if (radioButtonQuestion4AnswerAcheck){
                    score += 1;
                }
                if (radioButtonQuestion5AnswerCcheck){
                    score += 1;
                }
                 if ((checkBoxQuestion6AnswerAcheck) && (checkBoxQuestion6AnswerBcheck)){
                    score += 1;
                }
                    return score;

    }
}
