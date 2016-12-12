package com.example.evitected.math_piece.PlayingState;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Typeface;
import android.provider.Settings.Secure;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.evitected.math_piece.ClassModel.CustomAdapter;
import com.example.evitected.math_piece.ClassModel.DatabaseSQLite;
import com.example.evitected.math_piece.GridModel.GridLevel;
import com.example.evitected.math_piece.PlayActivity;
import com.example.evitected.math_piece.R;

public class PlayNStateActivity extends AppCompatActivity {

    GridLevel gvObj = new GridLevel();
    int state;
    int[] answer = new int[25];
    private String oldText;
    private GridView gvAnswer;
    private ImageView imgQuestion;
    private TextView tvAnswer;
    private Button btnSubmit, btnEscape;

    DatabaseSQLite myDB;
    private ImageView stateHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_nstate);
        getSupportActionBar().hide();
        myDB = new DatabaseSQLite(this, 2);
        bindWidget();
        setAnswer();
        create_GridAnswer();
        getState();
        setEventButton();
    }


    private void create_GridAnswer() {
        gvAnswer.setAdapter(new CustomAdapter(getApplicationContext(), gvObj.getAnswer()));
        gvAnswer.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_MOVE){
                    return true;
                }
                return false;
            }
        });
        gvAnswer_Click();
    }

    private void gvAnswer_Click() {
        gvAnswer.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    oldText = tvAnswer.getText().toString().trim();
                    tvAnswer.setText(oldText + "0");
                }else if(position == 1){
                    oldText = tvAnswer.getText().toString().trim();
                    tvAnswer.setText(oldText + "1");
                }else if(position == 2){
                    oldText = tvAnswer.getText().toString().trim();
                    tvAnswer.setText(oldText + "2");
                }else if(position == 3){
                    oldText = tvAnswer.getText().toString().trim();
                    tvAnswer.setText(oldText + "3");
                }else if(position == 4){
                    oldText = tvAnswer.getText().toString().trim();
                    tvAnswer.setText(oldText + "4");
                }else if(position == 5){
                    oldText = tvAnswer.getText().toString().trim();
                    tvAnswer.setText(oldText + "5");
                }else if(position == 6){
                    oldText = tvAnswer.getText().toString().trim();
                    tvAnswer.setText(oldText + "6");
                }else if(position == 7){
                    oldText = tvAnswer.getText().toString().trim();
                    tvAnswer.setText(oldText + "7");
                }else if(position == 8){
                    oldText = tvAnswer.getText().toString().trim();
                    tvAnswer.setText(oldText + "8");
                }else if(position == 9){
                    oldText = tvAnswer.getText().toString().trim();
                    tvAnswer.setText(oldText + "9");
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("Really Exit?")
                .setMessage("Are you sure you want to exit?")
                .setNegativeButton(android.R.string.no, null)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface arg0, int arg1) {
                        finish();
                        Intent i = new Intent(PlayNStateActivity.this, PlayActivity.class);
                        startActivity(i);
                    }
                }).create().show();
    }

    private void setEventButton() {
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tvAnswer.getText().toString().trim().isEmpty()){
                    int ans = Integer.parseInt(tvAnswer.getText().toString().trim());
                    if(state == 1){
                        if((ans == answer[0])){
                            answerTrue();
                        }else {
                            Toast.makeText(PlayNStateActivity.this, "false", Toast.LENGTH_SHORT).show();
                        }
                    }else if(state == 2){
                        if(ans == answer[1]){
                            answerTrue();
                        }else{
                            Toast.makeText(PlayNStateActivity.this, "false", Toast.LENGTH_SHORT).show();
                        }
                    }else if(state == 3){
                        if(ans == answer[2]){
                            answerTrue();
                        }else{
                            Toast.makeText(PlayNStateActivity.this, "false", Toast.LENGTH_SHORT).show();
                        }
                    }else if(state == 4){
                        if(ans == answer[3]){
                            answerTrue();
                        }else{
                            Toast.makeText(PlayNStateActivity.this, "false", Toast.LENGTH_SHORT).show();
                        }
                    }else if(state == 5){
                        if(ans == answer[4]){
                            answerTrue();
                        }else{
                            Toast.makeText(PlayNStateActivity.this, "false", Toast.LENGTH_SHORT).show();
                        }
                    }
                }else{
                    Toast.makeText(PlayNStateActivity.this, "false", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnEscape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    if(!tvAnswer.getText().toString().isEmpty()){
                        oldText = tvAnswer.getText().toString().trim();
                        tvAnswer.setText(oldText.substring(0,oldText.length()-1));
                    }else{

                    }
                }catch (NullPointerException e){
                    e.printStackTrace();
                }
            }
        });
    }


    //Update Fixed Bug State 11-12-2559 12.03
    private void answerTrue() {
        Cursor CheckStateCount = myDB.getDeviceID();
        int row = CheckStateCount.getCount();
        if(row > 0){
            int LastState = CheckStateCount.getInt(2);
            if(LastState < state+1){
                 myDB.updateState(1,state+1);
            }
        }
        finish();
        Intent i = new Intent(PlayNStateActivity.this, PlayActivity.class);
        startActivity(i);
    }


    //Update State 5 12-12-2559 18.06
    private void getState() {
        Intent i = getIntent();
        state = i.getIntExtra("positionClick",0);
        switch(state){
            case 1:
                imgQuestion.setImageResource(R.drawable.quest1);
                stateHeader.setImageResource(R.drawable.s1);
                break;
            case 2:
                imgQuestion.setImageResource(R.drawable.quest2);
                stateHeader.setImageResource(R.drawable.s2);
                break;
            case 3:
                imgQuestion.setImageResource(R.drawable.quest3);
                stateHeader.setImageResource(R.drawable.s3);
                break;
            case 4:
                imgQuestion.setImageResource(R.drawable.quest4);
                stateHeader.setImageResource(R.drawable.s4);
                break;
            case 5:
                imgQuestion.setImageResource(R.drawable.quest5);
                stateHeader.setImageResource(R.drawable.s5);
                break;
            case 6:
                imgQuestion.setImageResource(R.drawable.quest5);
                stateHeader.setImageResource(R.drawable.s6);
                break;
            case 7:
                imgQuestion.setImageResource(R.drawable.quest5);
                stateHeader.setImageResource(R.drawable.s7);
                break;
            case 8:
                imgQuestion.setImageResource(R.drawable.quest5);
                stateHeader.setImageResource(R.drawable.s8);
                break;
            case 9:
                imgQuestion.setImageResource(R.drawable.quest5);
                stateHeader.setImageResource(R.drawable.s9);
                break;
            case 10:
                imgQuestion.setImageResource(R.drawable.quest5);
                stateHeader.setImageResource(R.drawable.s10);
                break;
            case 11:
                imgQuestion.setImageResource(R.drawable.quest5);
                stateHeader.setImageResource(R.drawable.s11);
                break;
            case 12:
                imgQuestion.setImageResource(R.drawable.quest5);
                stateHeader.setImageResource(R.drawable.s12);
                break;
            case 13:
                imgQuestion.setImageResource(R.drawable.quest5);
                stateHeader.setImageResource(R.drawable.s13);
                break;
            case 14:
                imgQuestion.setImageResource(R.drawable.quest5);
                stateHeader.setImageResource(R.drawable.s14);
                break;
            case 15:
                imgQuestion.setImageResource(R.drawable.quest5);
                stateHeader.setImageResource(R.drawable.s15);
                break;
            case 16:
                imgQuestion.setImageResource(R.drawable.quest5);
                stateHeader.setImageResource(R.drawable.s16);
                break;
            case 17:
                imgQuestion.setImageResource(R.drawable.quest5);
                stateHeader.setImageResource(R.drawable.s17);
                break;
            case 18:
                imgQuestion.setImageResource(R.drawable.quest5);
                stateHeader.setImageResource(R.drawable.s18);
                break;
            case 19:
                imgQuestion.setImageResource(R.drawable.quest5);
                stateHeader.setImageResource(R.drawable.s19);
                break;
            case 20:
                imgQuestion.setImageResource(R.drawable.quest5);
                stateHeader.setImageResource(R.drawable.s20);
                break;
            case 21:
                imgQuestion.setImageResource(R.drawable.quest5);
                stateHeader.setImageResource(R.drawable.s21);
                break;
            case 22:
                imgQuestion.setImageResource(R.drawable.quest5);
                stateHeader.setImageResource(R.drawable.s22);
                break;
            case 23:
                imgQuestion.setImageResource(R.drawable.quest5);
                stateHeader.setImageResource(R.drawable.s23);
                break;
            case 24:
                imgQuestion.setImageResource(R.drawable.quest5);
                stateHeader.setImageResource(R.drawable.s24);
                break;
            case 25:
                imgQuestion.setImageResource(R.drawable.quest5);
                stateHeader.setImageResource(R.drawable.s25);
                break;
        }
    }

    private void setAnswer() {
        answer = new int[]{3612, 35, 8, 98, 256};
    }

    private void bindWidget() {
        stateHeader = (ImageView) findViewById(R.id.stateHeader);
        gvAnswer = (GridView) findViewById(R.id.gvAnswer);
        imgQuestion = (ImageView) findViewById(R.id.imgQuestion);
        tvAnswer = (TextView) findViewById(R.id.tvAnswer);

        //Button
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnEscape = (Button) findViewById(R.id.btnEscape);
    }
}
