package com.qifan.leetcode.problems.hammingDistance

/**
 * Created by Qifan on 2018/6/8.
 */

class Solution{

    private fun hammingDistance(x: Int, y: Int): Int {
        if (x <= 0 && x >= Math.pow(2.0, 31.0) && y < 0 && y >= Math.pow(2.0, 31.0)) {
            throw IllegalArgumentException("input number is not valid ")
        } else {
            var i = x xor y
            var count = 0
            while (i != 0) {
                ++count
                i = i - 1 and i
            }
            return count
        }
    }
}