package com.qifan.leetcode.problems.peakIndexInMountainArray;

import android.util.Log;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class PeakIndexInAMountainArray {

    @Test
    public void Test1() {
        int[] array = {0, 2, 1, 0};
        assertEquals(peakIndexInMountainArray(array), 1);
    }

    @Test
    public void Test2() {
        int[] array = {0, 1, 0};
        assertEquals(peakIndexInMountainArray2(array), 1);
    }

    private int peakIndexInMountainArray(int[] A) {
        int i = 0;
        while (A[i] < A[i+1]) i++;
        return i;
    }

    private int peakIndexInMountainArray2(int[] A) {
        int lo = 0, hi = A.length - 1;
        while (lo < hi) {
            int mi = lo + (hi - lo) / 2;
            if (A[mi] < A[mi + 1])
                lo = mi + 1;
            else
                hi = mi;
        }
        return lo;
    }
}