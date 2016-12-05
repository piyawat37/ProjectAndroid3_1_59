package com.example.evitected.math_piece;

import android.content.Intent;
import android.graphics.Typeface;
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
import com.example.evitected.math_piece.GridModel.GridLevel;
import com.example.evitected.math_piece.PlayingState.PlayNStateActivity;

public class PlayActivity extends AppCompatActivity {

    private Button btnPlayBack;
    private GridView gvLevel;
    GridLevel gvObj = new GridLevel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        getSupportActionBar().hide();
        bindWidget();
        setFontAwesome();

        createGridviewState();

    }

    private void createGridviewState() {
        int i = 1;
        if(i == 1){
            gvLevel.setAdapter(new CustomAdapter(getApplicationContext(), gvObj.getLockStateDefault()));
        }

        setOnClickState();
    }

    private void setOnClickState() {
        gvLevel.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int positionClick = position+1;
                Intent i = new Intent(PlayActivity.this, PlayNStateActivity.class);
                i.putExtra("positionClick", positionClick);
                startActivity(i);
            }
        });
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
