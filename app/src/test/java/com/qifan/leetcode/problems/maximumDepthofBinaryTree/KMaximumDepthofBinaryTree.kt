package com.qifan.leetcode.problems.maximumDepthofBinaryTree

import com.qifan.leetcode.utils.TreeNode

/**
 * Created by Qifan on 22/06/2018.
 */

class Solution {
    fun maxDepth(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }
        val leftDeepth = maxDepth(root.left)
        val rightDeepth = maxDepth(root.right)
        return if (leftDeepth > rightDeepth) leftDeepth + 1 else rightDeepth + 1
    }
}