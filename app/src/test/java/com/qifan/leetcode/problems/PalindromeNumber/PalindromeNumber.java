package com.qifan.leetcode.problems.PalindromeNumber;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by Qifan on 2018/6/6.
 */
public class PalindromeNumber {
    @Test
    public void Test1() {
        int x = -2;
        assertTrue(!isPalindrome(x));
    }

    @Test
    public void Test2() {
        int x = -101;
        assertTrue(!isPalindrome(x));
    }

    @Test
    public void Test3() {
        int x = 2;
        assertTrue(isPalindrome(x));
    }

    @Test
    public void Test4() {
        int x = 202;
        assertTrue(isPalindrome(x));
    }

    @Test
    public void Test5() {
        int x = 2021;
        assertTrue(!isPalindrome(x));
    }

    @Test
    public void Test6() {
        int x = 2147483647;
        assertTrue(!isPalindrome(x));
    }

    @Test
    public void Test7() {
        int x = 21477412;
        assertTrue(isPalindrome(x));
    }

    @Test
    public void Test8() {
        int x = 0;
        assertTrue(isPalindrome(x));
    }
    private boolean isPalindrome(int x) {

    }
}
