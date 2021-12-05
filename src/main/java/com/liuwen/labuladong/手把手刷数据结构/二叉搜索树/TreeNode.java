package com.liuwen.labuladong.手把手刷数据结构.二叉搜索树;

/**
 * ----------------------------------------------------------------------
 * <p>File name: TreeNode
 * <p>Desc: 二叉树基本结构
 *
 * @author Create by liu wen at 2021.8.30 13:49
 * ----------------------------------------------------------------------
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
