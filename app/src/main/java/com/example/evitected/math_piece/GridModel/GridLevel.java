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
            R.drawable.c21, R.drawable.c22, R.drawable.c23, R.drawable.c24, R.drawable.c25
    };

    //State Level Update 1.1 5-12-59 18:29
    private int[] LockStateDefault = new int[] {
            R.drawable.c1, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state
    };

    //All State Achievement State Level Update 1.2 5-12-59 19.20
    private int[] State2 = new int[] {
            R.drawable.c1_check, R.drawable.c2, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state
    };
    private int[] State3 = new int[] {
            R.drawable.c1_check, R.drawable.c2_check, R.drawable.c3, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state
    };
    private int[] State4 = new int[] {
            R.drawable.c1_check, R.drawable.c2_check, R.drawable.c3_check, R.drawable.c4, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state
    };
    private int[] State5 = new int[] {
            R.drawable.c1_check, R.drawable.c2_check, R.drawable.c3_check, R.drawable.c4_check, R.drawable.c5,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state
    };
    private int[] State6 = new int[] {
            R.drawable.c1_check, R.drawable.c2_check, R.drawable.c3_check, R.drawable.c4_check, R.drawable.c5_check,
            R.drawable.c6, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state
    };
    private int[] State7 = new int[] {
            R.drawable.c1_check, R.drawable.c2_check, R.drawable.c3_check, R.drawable.c4_check, R.drawable.c5_check,
            R.drawable.c6_check, R.drawable.c7, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state
    };
    private int[] State8 = new int[] {
            R.drawable.c1_check, R.drawable.c2_check, R.drawable.c3_check, R.drawable.c4_check, R.drawable.c5_check,
            R.drawable.c6_check, R.drawable.c7_check, R.drawable.c8, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state
    };
    private int[] State9 = new int[] {
            R.drawable.c1_check, R.drawable.c2_check, R.drawable.c3_check, R.drawable.c4_check, R.drawable.c5_check,
            R.drawable.c6_check, R.drawable.c7_check, R.drawable.c8_check, R.drawable.c9, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state
    };
    private int[] State10 = new int[] {
            R.drawable.c1_check, R.drawable.c2_check, R.drawable.c3_check, R.drawable.c4_check, R.drawable.c5_check,
            R.drawable.c6_check, R.drawable.c7_check, R.drawable.c8_check, R.drawable.c9_check, R.drawable.c10,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state
    };
    private int[] State11 = new int[] {
            R.drawable.c1_check, R.drawable.c2_check, R.drawable.c3_check, R.drawable.c4_check, R.drawable.c5_check,
            R.drawable.c6_check, R.drawable.c7_check, R.drawable.c8_check, R.drawable.c9_check, R.drawable.c10_check,
            R.drawable.c11, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state
    };
    private int[] State12 = new int[] {
            R.drawable.c1_check, R.drawable.c2_check, R.drawable.c3_check, R.drawable.c4_check, R.drawable.c5_check,
            R.drawable.c6_check, R.drawable.c7_check, R.drawable.c8_check, R.drawable.c9_check, R.drawable.c10_check,
            R.drawable.c11_check, R.drawable.c12, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state
    };
    private int[] State13 = new int[] {
            R.drawable.c1_check, R.drawable.c2_check, R.drawable.c3_check, R.drawable.c4_check, R.drawable.c5_check,
            R.drawable.c6_check, R.drawable.c7_check, R.drawable.c8_check, R.drawable.c9_check, R.drawable.c10_check,
            R.drawable.c11_check, R.drawable.c12_check, R.drawable.c13, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state
    };
    private int[] State14 = new int[] {
            R.drawable.c1_check, R.drawable.c2_check, R.drawable.c3_check, R.drawable.c4_check, R.drawable.c5_check,
            R.drawable.c6_check, R.drawable.c7_check, R.drawable.c8_check, R.drawable.c9_check, R.drawable.c10_check,
            R.drawable.c11_check, R.drawable.c12_check, R.drawable.c13_check, R.drawable.c14, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state
    };
    private int[] State15 = new int[] {
            R.drawable.c1_check, R.drawable.c2_check, R.drawable.c3_check, R.drawable.c4_check, R.drawable.c5_check,
            R.drawable.c6_check, R.drawable.c7_check, R.drawable.c8_check, R.drawable.c9_check, R.drawable.c10_check,
            R.drawable.c11_check, R.drawable.c12_check, R.drawable.c13_check, R.drawable.c14_check, R.drawable.c15,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state
    };
    private int[] State16 = new int[] {
            R.drawable.c1_check, R.drawable.c2_check, R.drawable.c3_check, R.drawable.c4_check, R.drawable.c5_check,
            R.drawable.c6_check, R.drawable.c7_check, R.drawable.c8_check, R.drawable.c9_check, R.drawable.c10_check,
            R.drawable.c11_check, R.drawable.c12_check, R.drawable.c13_check, R.drawable.c14_check, R.drawable.c15_check,
            R.drawable.c16, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state
    };
    private int[] State17 = new int[] {
            R.drawable.c1_check, R.drawable.c2_check, R.drawable.c3_check, R.drawable.c4_check, R.drawable.c5_check,
            R.drawable.c6_check, R.drawable.c7_check, R.drawable.c8_check, R.drawable.c9_check, R.drawable.c10_check,
            R.drawable.c11_check, R.drawable.c12_check, R.drawable.c13_check, R.drawable.c14_check, R.drawable.c15_check,
            R.drawable.c16_check, R.drawable.c17, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state
    };
    private int[] State18 = new int[] {
            R.drawable.c1_check, R.drawable.c2_check, R.drawable.c3_check, R.drawable.c4_check, R.drawable.c5_check,
            R.drawable.c6_check, R.drawable.c7_check, R.drawable.c8_check, R.drawable.c9_check, R.drawable.c10_check,
            R.drawable.c11_check, R.drawable.c12_check, R.drawable.c13_check, R.drawable.c14_check, R.drawable.c15_check,
            R.drawable.c16_check, R.drawable.c17_check, R.drawable.c18, R.drawable.lock_state, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state
    };
    private int[] State19 = new int[] {
            R.drawable.c1_check, R.drawable.c2_check, R.drawable.c3_check, R.drawable.c4_check, R.drawable.c5_check,
            R.drawable.c6_check, R.drawable.c7_check, R.drawable.c8_check, R.drawable.c9_check, R.drawable.c10_check,
            R.drawable.c11_check, R.drawable.c12_check, R.drawable.c13_check, R.drawable.c14_check, R.drawable.c15_check,
            R.drawable.c16_check, R.drawable.c17_check, R.drawable.c18_check, R.drawable.c19, R.drawable.lock_state,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state
    };
    private int[] State20 = new int[] {
            R.drawable.c1_check, R.drawable.c2_check, R.drawable.c3_check, R.drawable.c4_check, R.drawable.c5_check,
            R.drawable.c6_check, R.drawable.c7_check, R.drawable.c8_check, R.drawable.c9_check, R.drawable.c10_check,
            R.drawable.c11_check, R.drawable.c12_check, R.drawable.c13_check, R.drawable.c14_check, R.drawable.c15_check,
            R.drawable.c16_check, R.drawable.c17_check, R.drawable.c18_check, R.drawable.c19_check, R.drawable.c20,
            R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state
    };
    private int[] State21 = new int[] {
            R.drawable.c1_check, R.drawable.c2_check, R.drawable.c3_check, R.drawable.c4_check, R.drawable.c5_check,
            R.drawable.c6_check, R.drawable.c7_check, R.drawable.c8_check, R.drawable.c9_check, R.drawable.c10_check,
            R.drawable.c11_check, R.drawable.c12_check, R.drawable.c13_check, R.drawable.c14_check, R.drawable.c15_check,
            R.drawable.c16_check, R.drawable.c17_check, R.drawable.c18_check, R.drawable.c19_check, R.drawable.c20_check,
            R.drawable.c21, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state
    };
    private int[] State22 = new int[] {
            R.drawable.c1_check, R.drawable.c2_check, R.drawable.c3_check, R.drawable.c4_check, R.drawable.c5_check,
            R.drawable.c6_check, R.drawable.c7_check, R.drawable.c8_check, R.drawable.c9_check, R.drawable.c10_check,
            R.drawable.c11_check, R.drawable.c12_check, R.drawable.c13_check, R.drawable.c14_check, R.drawable.c15_check,
            R.drawable.c16_check, R.drawable.c17_check, R.drawable.c18_check, R.drawable.c19_check, R.drawable.c20_check,
            R.drawable.c21_check, R.drawable.c22, R.drawable.lock_state, R.drawable.lock_state, R.drawable.lock_state
    };
    private int[] State23 = new int[] {
            R.drawable.c1_check, R.drawable.c2_check, R.drawable.c3_check, R.drawable.c4_check, R.drawable.c5_check,
            R.drawable.c6_check, R.drawable.c7_check, R.drawable.c8_check, R.drawable.c9_check, R.drawable.c10_check,
            R.drawable.c11_check, R.drawable.c12_check, R.drawable.c13_check, R.drawable.c14_check, R.drawable.c15_check,
            R.drawable.c16_check, R.drawable.c17_check, R.drawable.c18_check, R.drawable.c19_check, R.drawable.c20_check,
            R.drawable.c21_check, R.drawable.c22_check, R.drawable.c23, R.drawable.lock_state, R.drawable.lock_state
    };
    private int[] State24 = new int[] {
            R.drawable.c1_check, R.drawable.c2_check, R.drawable.c3_check, R.drawable.c4_check, R.drawable.c5_check,
            R.drawable.c6_check, R.drawable.c7_check, R.drawable.c8_check, R.drawable.c9_check, R.drawable.c10_check,
            R.drawable.c11_check, R.drawable.c12_check, R.drawable.c13_check, R.drawable.c14_check, R.drawable.c15_check,
            R.drawable.c16_check, R.drawable.c17_check, R.drawable.c18_check, R.drawable.c19_check, R.drawable.c20_check,
            R.drawable.c21_check, R.drawable.c22_check, R.drawable.c23_check, R.drawable.c24, R.drawable.lock_state
    };
    private int[] State25 = new int[] {
            R.drawable.c1_check, R.drawable.c2_check, R.drawable.c3_check, R.drawable.c4_check, R.drawable.c5_check,
            R.drawable.c6_check, R.drawable.c7_check, R.drawable.c8_check, R.drawable.c9_check, R.drawable.c10_check,
            R.drawable.c11_check, R.drawable.c12_check, R.drawable.c13_check, R.drawable.c14_check, R.drawable.c15_check,
            R.drawable.c16_check, R.drawable.c17_check, R.drawable.c18_check, R.drawable.c19_check, R.drawable.c20_check,
            R.drawable.c21_check, R.drawable.c22_check, R.drawable.c23_check, R.drawable.c24_check, R.drawable.c25
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

    /*GET STATE ACHIEVEMENT*/

    public int[] getState2() {
        return State2;
    }

    public int[] getState3() {
        return State3;
    }

    public int[] getState4() {
        return State4;
    }

    public int[] getState5() {
        return State5;
    }

    public int[] getState6() {
        return State6;
    }

    public int[] getState7() {
        return State7;
    }

    public int[] getState8() {
        return State8;
    }

    public int[] getState9() {
        return State9;
    }

    public int[] getState10() {
        return State10;
    }

    public int[] getState11() {
        return State11;
    }

    public int[] getState12() {
        return State12;
    }

    public int[] getState13() {
        return State13;
    }

    public int[] getState14() {
        return State14;
    }

    public int[] getState15() {
        return State15;
    }

    public int[] getState16() {
        return State16;
    }

    public int[] getState17() {
        return State17;
    }

    public int[] getState18() {
        return State18;
    }

    public int[] getState19() {
        return State19;
    }

    public int[] getState20() {
        return State20;
    }

    public int[] getState21() {
        return State21;
    }

    public int[] getState22() {
        return State22;
    }

    public int[] getState23() {
        return State23;
    }

    public int[] getState24() {
        return State24;
    }

    public int[] getState25() {
        return State25;
    }
}
