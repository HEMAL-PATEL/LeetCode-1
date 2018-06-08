package com.qifan.leetcode.problems.flippinganImage

/**
 * Created by Qifan on 2018/6/7.
 */

class Solution {
    fun flipAndInvertImage(A: Array<IntArray>): Array<IntArray> {
        val C = A[0].size
        for (row in A)
            for (i in 0 until (C + 1) / 2) {
                val tmp = row[i] xor 1
                row[i] = row[C - 1 - i] xor 1
                row[C - 1 - i] = tmp
            }

        return A
    }
}