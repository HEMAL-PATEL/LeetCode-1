package com.qifan.leetcode.problems.maximumDepthofBinaryTree;

import com.qifan.leetcode.utils.TreeNode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Qifan on 22/06/2018.
 */
public class MaximumDepthofBinaryTree {

    @Test
    public void test(){
        Integer[] array = {3,9,20,null,null,15,7};
        assertEquals(3, maxDepth(TreeNode.buildTree(array)));
    }
    public static int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return leftDepth > rightDepth ? (leftDepth + 1) : (rightDepth + 1);
    }
}
