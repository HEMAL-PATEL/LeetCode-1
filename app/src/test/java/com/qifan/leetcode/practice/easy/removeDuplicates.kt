package com.qifan.leetcode.practice.easy

import org.junit.Test
import org.junit.Assert.*

/**
 * Created by Qifan on 2018/6/1.
 */
class removeDuplicates {
    @Test
    fun test() {
        assertEquals(1, removeDuplicates(intArrayOf(1, 1, 1)))
        assertEquals(0, removeDuplicates(intArrayOf()))
        assertEquals(1, removeDuplicates(intArrayOf(1)))
        assertEquals(2, removeDuplicates(intArrayOf(1, 1, 2)))
        assertEquals(5, removeDuplicates(intArrayOf(1, 2, 3, 4, 5)))

    }

    fun removeDuplicates(nums: IntArray?): Int {

        if (nums == null || nums.isEmpty()) {
            return 0
        }

        var i = 0
        var j = 0

        while (i < nums.size) {
            if (nums[j] != nums[i]) {
                nums[++j] = nums[i]
            }
            i++
        }
        return j + 1
    }

}