package com.qifan.leetcode.problems.flippinganImage;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Qifan on 2018/6/7.
 */
public class FlippinganImage {

    public int[][] flipAndInvertImage(int[][] A) {
        int C = A[0].length;
        for (int[] row: A)
            for (int i = 0; i < (C + 1) / 2; ++i) {
                int tmp = row[i] ^ 1;
                row[i] = row[C - 1 - i] ^ 1;
                row[C - 1 - i] = tmp;
            }

        return A;
    }
}
