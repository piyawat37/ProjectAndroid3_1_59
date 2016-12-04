package com.example.evitected.math_piece.PlayingState;

import android.content.ClipData;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.evitected.math_piece.CustomAdapter;
import com.example.evitected.math_piece.GridModel.GridLevel;
import com.example.evitected.math_piece.R;

public class PlayNStateActivity extends AppCompatActivity {

    private Button btnBack;
    private GridView gvLevel_1;
    GridLevel gvObj = new GridLevel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_nstate);
        getSupportActionBar().hide();
        bindWidget();
        setFontAwesome();
        customAdap();
    }
    private void customAdap() {
        gvLevel_1.setAdapter(new CustomAdapter(getApplicationContext(), gvObj.getLevel_1()));
        gvLevel_1.setOnDragListener(new DragListener());
    }

    class DragListener implements View.OnDragListener {
        @Override
        public boolean onDrag(View v, DragEvent event) {
            final View view = (View) event.getLocalState();
            switch (event.getAction()) {
                case DragEvent.ACTION_DRAG_LOCATION:
                    // do nothing if hovering above own position
                    if (view == v) return true;
                    // get the new list index
                    final int index = calculateNewIndex(event.getX(), event.getY());
                    //remove the view from the old position
                    gvLevel_1.removeView(view);
                    // and push to the new
                    gvLevel_1.addView(view, index);
                    break;
                case DragEvent.ACTION_DROP:
                    view.setVisibility(View.VISIBLE);
                    break;
                case DragEvent.ACTION_DRAG_ENDED:
                    if (!event.getResult()) {
                        view.setVisibility(View.VISIBLE);
                    }
                    break;
            }
            return true;
        }
    }
    private int calculateNewIndex(float x, float y) {
        // calculate which column to move to
        final float cellWidth = gvLevel_1.getWidth() / gvLevel_1.getNumColumns();
        final int column = (int)(x / cellWidth);

        // calculate which row to move to
        final float cellHeight = gvLevel_1.getHeight() / gvLevel_1.getColumnWidth();
        final int row = (int)Math.floor(y / cellHeight);

        // the items in the GridLayout is organized as a wrapping list
        // and not as an actual grid, so this is how to get the new index
        int index = row * gvLevel_1.getNumColumns() + column;
        if (index >= gvLevel_1.getChildCount()) {
            index = gvLevel_1.getChildCount() - 1;
        }

        return index;
    }
    private void setFontAwesome() {
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/fontawesome-webfont.ttf");
        btnBack.setTypeface(font);
        btnBack.setText("\uf053");
    }

    private void bindWidget() {
        gvLevel_1 = (GridView) findViewById(R.id.gvLevel_1);
        btnBack = (Button)findViewById( R.id.back);
    }
}
