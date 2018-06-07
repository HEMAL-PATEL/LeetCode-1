package com.qifan.leetcode.problems.judgeRouteCircle;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

/**
 * Created by Qifan on 2018/6/7.
 */
public class JudgeRouteCircle {
    @Test
    public void test1() throws Exception {
        assertEquals(true, judgeCircle("UD"));
    }

    @Test
    public void test2() throws Exception {
        assertEquals(false, judgeCircle("LL"));
    }

    private boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        HashMap<Character, Integer[]> hashMap = new HashMap<>();
        hashMap.put('R', new Integer[]{1, 0});
        hashMap.put('L', new Integer[]{-1, 0});
        hashMap.put('U', new Integer[]{0, 1});
        hashMap.put('D', new Integer[]{0, -1});


        for (int i = 0; i < moves.length(); i++) {
            Character key = moves.charAt(i);
            x += hashMap.get(key)[0];
            y += hashMap.get(key)[1];
        }

        return x == 0 && y == 0;
    }
}
