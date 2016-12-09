package com.example.evitected.math_piece;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.evitected.math_piece.ClassModel.DatabaseSQLite;

public class MainActivity extends AppCompatActivity {

    private EditText etPlayerName;
    private Button btnPlay, btnRanked, btnContact, btnExit;


    DatabaseSQLite myDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        myDB = new DatabaseSQLite(this,2);

        bindWidget();
        setEvent();

        //Method Emergency Reset State
        //ResetState();

    }

    private void ResetState() {
        boolean result = myDB.ResetState();
    }

    private void setEvent() {
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PlayActivity.class);
                startActivity(i);
            }
        });
        btnRanked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void bindWidget() {
        btnPlay = (Button) findViewById(R.id.btnPlay);
        btnRanked = (Button) findViewById(R.id.btnRanked);
        btnContact = (Button) findViewById(R.id.btnContact);
        btnExit = (Button)findViewById(R.id.btnExit);
    }
}
