package com.qifan.leetcode.problems.twoSum;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

/**
 * Created by Qifan on 2018/6/2.
 */
public class twoSum {
    @Test
    public void test() throws Exception {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = new int[]{0, 1};
        assertEquals(result, twoSum(nums, target));
    }

    //bad solution
  /*
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
*/
    private int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i];
            if (hashMap.containsKey(result)) {
                return new int[]{hashMap.get(result), i};
            }
            hashMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }


}
