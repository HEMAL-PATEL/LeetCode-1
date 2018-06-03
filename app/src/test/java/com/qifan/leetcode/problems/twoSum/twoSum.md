给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。

你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。

```
示例:

给定 nums = [2, 7, 11, 15], target = 9

因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
```

这个题目的最开始的时候我试用了暴力解法，因为最直观，因为第一次做算法题目也没想到去优化什么的。

``` java
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
```
后来看了个别人的解法，关于使用hashMap的 感觉瞬间优化了很多有了现在的心得，题目上真的不难，主要还是思维训练。

