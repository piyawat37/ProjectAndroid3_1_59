package com.example.evitected.math_piece;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Typeface;
import android.provider.Settings.Secure;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.evitected.math_piece.ClassModel.CustomAdapter;
import com.example.evitected.math_piece.ClassModel.DatabaseSQLite;
import com.example.evitected.math_piece.GridModel.GridLevel;
import com.example.evitected.math_piece.PlayingState.PlayNStateActivity;

public class PlayActivity extends AppCompatActivity {

    private Button btnPlayBack;
    private GridView gvLevel;
    GridLevel gvObj = new GridLevel();
    int State;
    int i;
    private DatabaseSQLite myDB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        getSupportActionBar().hide();
        myDB = new DatabaseSQLite(this,2);

        bindWidget();
        setFontAwesome();
            CheckDevice_State();
        createGridviewState();
    }

    private void CheckDevice_State() {
        Cursor result = myDB.getDeviceID();
        int row = result.getCount();
        if(row > 0){
            State = result.getInt(2);
            //Toast.makeText(PlayActivity.this, String.valueOf(State), Toast.LENGTH_SHORT).show();
            i = State;
        }else{
            String device_id = Secure.getString(this.getContentResolver(), Secure.ANDROID_ID);
            boolean newDevice = myDB.insertNewDevice(device_id);
        }
    }

    private void createGridviewState() {
        if(i == 1){
            gvLevel.setAdapter(new CustomAdapter(getApplicationContext(), gvObj.getLockStateDefault()));
        }else if(i == 2){
            gvLevel.setAdapter(new CustomAdapter(getApplicationContext(), gvObj.getState2()));
        }else if(i == 3){
            gvLevel.setAdapter(new CustomAdapter(getApplicationContext(), gvObj.getState3()));
        }else if(i == 4){
            gvLevel.setAdapter(new CustomAdapter(getApplicationContext(), gvObj.getState4()));
        }else if(i == 5){
            gvLevel.setAdapter(new CustomAdapter(getApplicationContext(), gvObj.getState5()));
        }else if(i == 6){
            gvLevel.setAdapter(new CustomAdapter(getApplicationContext(), gvObj.getState6()));
        }else if(i == 7){
            gvLevel.setAdapter(new CustomAdapter(getApplicationContext(), gvObj.getState7()));
        }else if(i == 8){
            gvLevel.setAdapter(new CustomAdapter(getApplicationContext(), gvObj.getState8()));
        }else if(i == 9){
            gvLevel.setAdapter(new CustomAdapter(getApplicationContext(), gvObj.getState9()));
        }else if(i == 10){
            gvLevel.setAdapter(new CustomAdapter(getApplicationContext(), gvObj.getState10()));
        }else if(i == 11){
            gvLevel.setAdapter(new CustomAdapter(getApplicationContext(), gvObj.getState11()));
        }else if(i == 12){
            gvLevel.setAdapter(new CustomAdapter(getApplicationContext(), gvObj.getState12()));
        }else if(i == 13){
            gvLevel.setAdapter(new CustomAdapter(getApplicationContext(), gvObj.getState13()));
        }else if(i == 14){
            gvLevel.setAdapter(new CustomAdapter(getApplicationContext(), gvObj.getState14()));
        }else if(i == 15){
            gvLevel.setAdapter(new CustomAdapter(getApplicationContext(), gvObj.getState15()));
        }else if(i == 16){
            gvLevel.setAdapter(new CustomAdapter(getApplicationContext(), gvObj.getState16()));
        }else if(i == 17){
            gvLevel.setAdapter(new CustomAdapter(getApplicationContext(), gvObj.getState17()));
        }else if(i == 18){
            gvLevel.setAdapter(new CustomAdapter(getApplicationContext(), gvObj.getState18()));
        }else if(i == 19){
            gvLevel.setAdapter(new CustomAdapter(getApplicationContext(), gvObj.getState19()));
        }else if(i == 20){
            gvLevel.setAdapter(new CustomAdapter(getApplicationContext(), gvObj.getState20()));
        }else if(i == 21){
            gvLevel.setAdapter(new CustomAdapter(getApplicationContext(), gvObj.getState21()));
        }else if(i == 22){
            gvLevel.setAdapter(new CustomAdapter(getApplicationContext(), gvObj.getState22()));
        }else if(i == 23){
            gvLevel.setAdapter(new CustomAdapter(getApplicationContext(), gvObj.getState23()));
        }else if(i == 24){
            gvLevel.setAdapter(new CustomAdapter(getApplicationContext(), gvObj.getState24()));
        }else if(i == 25){
            gvLevel.setAdapter(new CustomAdapter(getApplicationContext(), gvObj.getState25()));
        }

        setOnClickState();
    }

    private void setOnClickState() {
        gvLevel.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int positionClick = position+1;
                Intent i = new Intent(PlayActivity.this, PlayNStateActivity.class);
                if(positionClick <= State){
                    if(lockState(positionClick) == true){
                        Toast.makeText(PlayActivity.this, "This state has lock. Please wait next Update State.", Toast.LENGTH_SHORT).show();
                    }else{
                        i.putExtra("positionClick", positionClick);
                        startActivity(i);
                        finish();
                    }
                }else{
                    Toast.makeText(PlayActivity.this, "Try to Complete State Before!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    //Update Developer Control. { Lock State Wait Update State } 12-12-2559 18.17
    private boolean lockState(int position) {
        if (position == 6){
            return true;
        }else {
            return false;
        }
    }

    private void setFontAwesome() {
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/fontawesome-webfont.ttf");
        btnPlayBack.setTypeface(font);
        btnPlayBack.setText("\uf053");
    }

    private void bindWidget() {
        gvLevel = (GridView) findViewById(R.id.gvLevel);
        btnPlayBack = (Button)findViewById( R.id.btnPlayBack);
    }
}
