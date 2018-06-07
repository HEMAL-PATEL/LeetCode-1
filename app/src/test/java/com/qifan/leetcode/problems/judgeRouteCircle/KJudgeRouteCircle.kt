package com.qifan.leetcode.problems.judgeRouteCircle

import java.util.HashMap

/**
 * Created by Qifan on 2018/6/7.
 */

 class Solution {
    fun judgeCircle(moves: String): Boolean {
        var x = 0
        var y = 0
        for (move in moves.toCharArray()) {
            when (move) {
                'U' -> y--
                'D' -> y++
                'L' -> x--
                'R' -> x++
            }
        }
        return x == 0 && y == 0
    }
}