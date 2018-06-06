package com.qifan.leetcode.problems.twoSum

import org.junit.Test
import org.junit.Assert.assertArrayEquals
import org.junit.rules.Timeout
import org.junit.Rule
import java.util.HashMap


/**
 * Created by Qifan on 2018/6/2.
 */

class TwoSum {

    @Test
    fun Test0() {
        val nums = intArrayOf(2, 7, 11, 13)
        val target = 9
        val actuals = twoSum(nums, target)
        val expecteds = intArrayOf(0, 1)
        assertArrayEquals(expecteds, actuals)
    }

    @Test
    fun Test1() {
        val nums = intArrayOf(13, 7, 11, 2)
        val target = 9
        val actuals = twoSum(nums, target)
        val expecteds = intArrayOf(1, 3)
        assertArrayEquals(expecteds, actuals)
    }

    @Test
    fun Test4() {
        val nums = intArrayOf(13, 11, 7, 2)
        val target = 9
        val actuals = twoSum(nums, target)
        val expecteds = intArrayOf(2, 3)
        assertArrayEquals(expecteds, actuals)
    }

    @Test
    fun Test5() {
        val nums = intArrayOf(13, 11, 7, 2)
        val target = 24
        val actuals = twoSum(nums, target)
        val expecteds = intArrayOf(0, 1)
        assertArrayEquals(expecteds, actuals)
    }

    @Test
    fun Test6() {
        val nums = intArrayOf(13, 11, 7, 2)
        val target = 15
        val actuals = twoSum(nums, target)
        val expecteds = intArrayOf(0, 3)
        assertArrayEquals(expecteds, actuals)
    }

    @Test
    fun Test7() {
        val nums = intArrayOf(4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8)
        val target = -3
        val actuals = twoSum(nums, target)
        val expecteds = intArrayOf(5, 7)
        assertArrayEquals(expecteds, actuals)
    }

    private fun twoSum(nums: IntArray, target: Int): IntArray {
        val hashMap = HashMap<Int, Int>()
        for (i in nums.indices) {
            val result = target - nums[i]
            if (hashMap.containsKey(result)) {
                return intArrayOf(hashMap[result]!!, i)
            }
            hashMap[nums[i]] = i
        }
        throw IllegalArgumentException("No two sum solution")
    }
}