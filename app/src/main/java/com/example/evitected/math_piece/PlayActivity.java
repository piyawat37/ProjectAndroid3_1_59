package com.example.evitected.math_piece;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import com.example.evitected.math_piece.GridModel.GridLevel;
import com.example.evitected.math_piece.PlayingState.PlayNStateActivity;

public class PlayActivity extends AppCompatActivity {

    private Button btnBack;
    private GridView gvLevel;
    GridLevel gvObj = new GridLevel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        getSupportActionBar().hide();
        bindWidget();
        setFontAwesome();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, gvObj.getLevelState());

        gvLevel.setAdapter(adapter);
        gvLevel.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
               /* Toast.makeText(getApplicationContext(),
                        ((TextView) v).getText()  , Toast.LENGTH_SHORT).show();*/
                Intent i = new Intent(PlayActivity.this, PlayNStateActivity.class);
                startActivity(i);
                if(((TextView) v).getText().equals("1")){

                }
            }
        });
    }
    private void setFontAwesome() {
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/fontawesome-webfont.ttf");
        btnBack.setTypeface(font);
        btnBack.setText("\uf053");
    }

    private void bindWidget() {
        gvLevel = (GridView) findViewById(R.id.gvLevel);
        btnBack = (Button)findViewById( R.id.back);
    }
}
