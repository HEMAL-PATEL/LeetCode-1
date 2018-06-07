package com.qifan.leetcode.problems.jewelsAndStones;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Qifan on 2018/6/6.
 */
public class JewelsAndStones {
    @Test
    public void test1() throws Exception {
        String J = "aA";
        String S = "aAAbbbb";
        assertEquals(3, numJewelsInStones(J, S));
    }

    @Test
    public void test2() throws Exception {
        String J = "z";
        String S = "ZZ";
        assertEquals(0, numJewelsInStones(J, S));
    }

    private int numJewelsInStones(String J, String S) {
        int index = 0;
        for (int i = 0; i < J.length(); i++) {
            for (int j = 0; j < S.length(); j++) {
                if (J.charAt(i) == S.charAt(j)) {
                    index++;
                }
            }
        }
        return index;
    }
}
