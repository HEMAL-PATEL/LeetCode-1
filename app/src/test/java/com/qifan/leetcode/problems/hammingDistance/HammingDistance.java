package com.qifan.leetcode.problems.hammingDistance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Qifan on 2018/6/8.
 */
public class HammingDistance {
    @Test
    public void test1() throws Exception {
        int a = 1;
        int b = 4;

        assertEquals(2, hammingDistance(a, b));
    }

    private int hammingDistance(int x, int y) {
        if (x <= 0 && x >= Math.pow(2, 31) && y < 0 && y >= Math.pow(2, 31)) {
            throw new IllegalArgumentException("input number is not valid ");
        } else {
            int i = x ^ y;
            int count = 0;
            while (i != 0) {
                ++count;
                i = (i - 1) & i;
            }
            return count;
        }
    }
}
