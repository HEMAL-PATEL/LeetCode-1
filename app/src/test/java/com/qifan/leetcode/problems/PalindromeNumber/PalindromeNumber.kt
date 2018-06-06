package com.qifan.leetcode.problems.PalindromeNumber

import junit.framework.Assert.assertTrue
import org.junit.Test

/**
 * Created by Qifan on 2018/6/6.
 */
class PalindromeNumber {
    @Test
    fun Test1() {
        val x = -2
        assertTrue(!isPalindrome(x))
    }

    @Test
    fun Test2() {
        val x = -101
        assertTrue(!isPalindrome(x))
    }

    @Test
    fun Test3() {
        val x = 2
        assertTrue(isPalindrome(x))
    }

    @Test
    fun Test4() {
        val x = 202
        assertTrue(isPalindrome(x))
    }

    @Test
    fun Test5() {
        val x = 2021
        assertTrue(!isPalindrome(x))
    }

    @Test
    fun Test6() {
        val x = 2147483647
        assertTrue(!isPalindrome(x))
    }

    @Test
    fun Test7() {
        val x = 21477412
        assertTrue(isPalindrome(x))
    }

    @Test
    fun Test8() {
        val x = 0
        assertTrue(isPalindrome(x))
    }

    fun isPalindrome(x: Int): Boolean {

    }
}