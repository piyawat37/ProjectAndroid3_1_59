package com.example.evitected.math_piece.PlayingState;

import android.content.Intent;
import android.graphics.Typeface;
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
import com.example.evitected.math_piece.GridModel.GridLevel;
import com.example.evitected.math_piece.R;

public class PlayNStateActivity extends AppCompatActivity {

    GridLevel gvObj = new GridLevel();
    private TextView test;
    int state;
    int[] answer = new int[25];
    private String oldText;
    private GridView gvAnswer;
    private ImageView imgQuestion;
    private TextView tvAnswer;
    private Button btnSubmit, btnEscape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_nstate);
        getSupportActionBar().hide();
        bindWidget();
        setAnswer();
        //setFontAwesome();
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


    private void setEventButton() {
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tvAnswer.getText().toString().trim().isEmpty()){
                    int ans = Integer.parseInt(tvAnswer.getText().toString().trim());
                    if(state == 1){
                        if((ans == answer[0])){
                            Toast.makeText(PlayNStateActivity.this, "true", Toast.LENGTH_SHORT).show();
                        }else {
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

    private void getState() {
        Intent i = getIntent();
        state = i.getIntExtra("positionClick",0);
        switch(state){
            case 1: imgQuestion.setImageResource(R.drawable.quest1);
                break;
            case 2: imgQuestion.setImageResource(R.drawable.a0);
                break;
            case 3: test.setText(String.valueOf(state));
                break;
            case 4: test.setText(String.valueOf(state));
                break;
            case 5: test.setText(String.valueOf(state));
                break;
            case 6: test.setText(String.valueOf(state));
                break;
            case 7: test.setText(String.valueOf(state));
                break;
            case 8: test.setText(String.valueOf(state));
                break;
            case 9: test.setText(String.valueOf(state));
                break;
            case 10: test.setText(String.valueOf(state));
                break;
            case 11: test.setText(String.valueOf(state));
                break;
            case 12: test.setText(String.valueOf(state));
                break;
            case 13: test.setText(String.valueOf(state));
                break;
            case 14: test.setText(String.valueOf(state));
                break;
            case 15: test.setText(String.valueOf(state));
                break;
            case 16: test.setText(String.valueOf(state));
                break;
            case 17: test.setText(String.valueOf(state));
                break;
            case 18: test.setText(String.valueOf(state));
                break;
            case 19: test.setText(String.valueOf(state));
                break;
            case 20: test.setText(String.valueOf(state));
                break;
            case 21: test.setText(String.valueOf(state));
                break;
            case 22: test.setText(String.valueOf(state));
                break;
            case 23: test.setText(String.valueOf(state));
                break;
            case 24: test.setText(String.valueOf(state));
                break;
            case 25: test.setText(String.valueOf(state));
                break;
        }
    }

    private void setAnswer() {
        answer[0] = 3612;
    }

    private void setFontAwesome() {
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/fontawesome-webfont.ttf");
        //btnBack.setTypeface(font);
        //btnBack.setText("\uf053");
    }

    private void bindWidget() {
        test = (TextView) findViewById(R.id.test);
        gvAnswer = (GridView) findViewById(R.id.gvAnswer);
        imgQuestion = (ImageView) findViewById(R.id.imgQuestion);
        tvAnswer = (TextView) findViewById(R.id.tvAnswer);

        //Button
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnEscape = (Button) findViewById(R.id.btnEscape);
    }
}
