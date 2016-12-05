package com.example.evitected.math_piece.GridModel;

import com.example.evitected.math_piece.R;

/**
 * Created by Evitected on 24/11/2559.
 */
public class GridLevel {
    private int[] levelState = new int[]{
            R.drawable.c1, R.drawable.c2, R.drawable.c3, R.drawable.c4, R.drawable.c5,
            R.drawable.c6, R.drawable.c7, R.drawable.c8, R.drawable.c9, R.drawable.c10,
            R.drawable.c11, R.drawable.c12, R.drawable.c13, R.drawable.c14, R.drawable.c15,
            R.drawable.c16, R.drawable.c17, R.drawable.c18, R.drawable.c19, R.drawable.c20,
            R.drawable.c21, R.drawable.c22, R.drawable.c23, R.drawable.c24, R.drawable.c25,
    };
    public int[] getLevelState() {
        return levelState;
    }
}
