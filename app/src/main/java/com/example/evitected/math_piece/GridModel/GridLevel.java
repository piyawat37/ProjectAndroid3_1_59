package com.example.evitected.math_piece.GridModel;

import com.example.evitected.math_piece.R;

/**
 * Created by Evitected on 24/11/2559.
 */
public class GridLevel {
    //State Level Update 1.0
    private int[] levelState = new int[]{
            R.drawable.c1, R.drawable.c2, R.drawable.c3, R.drawable.c4, R.drawable.c5,
            R.drawable.c6, R.drawable.c7, R.drawable.c8, R.drawable.c9, R.drawable.c10,
            R.drawable.c11, R.drawable.c12, R.drawable.c13, R.drawable.c14, R.drawable.c15,
            R.drawable.c16, R.drawable.c17, R.drawable.c18, R.drawable.c19, R.drawable.c20,
            R.drawable.c21, R.drawable.c22, R.drawable.c23, R.drawable.c24, R.drawable.c25,
    };

    //State Level Update 1.1 5-12-59 18:29
    private int[] LockStateDefault = new int[] {
            R.drawable.c1, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
    };
    //Answer Update 1.1
    private int[] Answer = new int[]{
            R.drawable.a0, R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4,
            R.drawable.a5, R.drawable.a6, R.drawable.a7, R.drawable.a8, R.drawable.a9,
    };

    public int[] getAnswer() {
        return Answer;
    }

    public int[] getLevelState() {
        return levelState;
    }

    public int[] getLockStateDefault() {
        return LockStateDefault;
    }
}
