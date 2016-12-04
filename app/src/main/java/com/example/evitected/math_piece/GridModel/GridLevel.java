package com.example.evitected.math_piece.GridModel;

import com.example.evitected.math_piece.R;

/**
 * Created by Evitected on 24/11/2559.
 */
public class GridLevel {
    private String[] levelState = new String[]{
            "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25"
    };
    private int[] level_1 = new int[]{
            R.drawable.space_number,R.drawable.space_number,R.drawable.space_number,R.drawable.space_number,R.drawable.space_number,
            R.drawable.space_number,R.drawable.a3,          R.drawable.space_number,R.drawable.space_number,R.drawable.space_number,
            R.drawable.c1,          R.drawable.plus,        R.drawable.c2,          R.drawable.equals,      R.drawable.space_number,
            R.drawable.space_number,R.drawable.space_number,R.drawable.space_number,R.drawable.space_number,R.drawable.space_number,
            R.drawable.space_number,R.drawable.space_number,R.drawable.space_number,R.drawable.space_number,R.drawable.space_number,
    };

    public int[] getLevel_1() {
        return level_1;
    }

    public String[] getLevelState() {
        return levelState;
    }
}
