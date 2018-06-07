package com.qifan.leetcode.problems.jewelsAndStones

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by Qifan on 2018/6/6.
 */

class Solution {

    @Test
    @Throws(Exception::class)
    fun test1() {
        val J = "aA"
        val S = "aAAbbbb"
        assertEquals(3, numJewelsInStones(J, S))
    }

    @Test
    @Throws(Exception::class)
    fun test2() {
        val J = "z"
        val S = "ZZ"
        assertEquals(0, numJewelsInStones(J, S))
    }


     private fun numJewelsInStones(J: String, S: String): Int {
        var index = 0
        for (j in J) {
            for (s in S) {
                if (j == s) {
                    index++
                }
            }
        }
        return index
    }
}