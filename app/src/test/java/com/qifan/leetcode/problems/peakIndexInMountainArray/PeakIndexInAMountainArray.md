我们把符合下列属性的数组 A 称作山脉：

    A.length >= 3
    存在 0 < i < A.length - 1 使得A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]

给定一个确定为山脉的数组，返回任何满足 A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1] 的 i 的值。

 
```
示例 1：

输入：[0,1,0]
输出：1

示例 2：

输入：[0,2,1,0]
输出：1
```
 
```
提示：

    3 <= A.length <= 10000
    0 <= A[i] <= 10^6
    A 是如上定义的山脉
```

```
思路一：
将原来的数组以i分割成两个数组1和数组2，
然后判断数组1和数组2分别是从大到小排列和从小到大排列即可 

思路二：
讲数组顺势比较

算法复杂度：
    - 时间复杂度: O(N), where N is the length of A.

    - 空间复杂度: O(1).

思路三：
二分法加快比较算法运行效率
The comparison A[i] < A[i+1] in a mountain array looks like [True, True, True, ..., True, False, False, ..., False]: 1 or more boolean Trues, followed by 1 or more boolean False. For example, in the mountain array [1, 2, 3, 4, 1], the comparisons A[i] < A[i+1] would be True, True, True, False.

We can binary search over this array of comparisons, to find the largest index i such that A[i] < A[i+1].

算法复杂度：
    - 时间复杂度: O(logN), where N is the length of A.
    - 空间复杂度: O(1).

```