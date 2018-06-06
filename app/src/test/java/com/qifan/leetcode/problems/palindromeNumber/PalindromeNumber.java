package com.qifan.leetcode.problems.palindromeNumber;

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
        // 特殊情况：
        // 如上所述，当 x < 0 时，x 不是回文数。
        // 同样地，如果数字的最后一位是 0，为了使该数字为回文，
        // 则其第一位数字也应该是 0
        // 只有 0 满足这一属性
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // 当数字长度为奇数时，我们可以通过 revertedNumber/10 去除处于中位的数字。
        // 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，revertedNumber = 123，
        // 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。
        return x == revertedNumber || x == revertedNumber/10;

    }
}
