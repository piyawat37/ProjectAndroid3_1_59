package com.example.evitected.math_piece;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.evitected.math_piece.ClassModel.DatabaseSQLite;

/*********************Plan in future
 * 1. Checked Count of Answer { answer > 3 } will be  stop played 10 minute.
 * 2. Make State.
 * 3. Ranked Online INTERNET php -> JSON -> MySQL
 *
 * *************************************************/

public class MainActivity extends AppCompatActivity {

    private EditText etPlayerName;
    private Button btnPlay, btnExit;


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
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("Really Exit?")
                .setMessage("Are you sure you want to exit?")
                .setNegativeButton(android.R.string.no, null)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface arg0, int arg1) {
                        finish();
                    }
                }).create().show();
    }

    private void bindWidget() {
        btnPlay = (Button) findViewById(R.id.btnPlay);
        btnExit = (Button)findViewById(R.id.btnExit);
    }
}
