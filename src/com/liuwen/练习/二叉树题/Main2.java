package com.liuwen.练习.二叉树题;


/**
 * @description: 求二叉树的深度
 * @author: Liu Wen
 * @create: 2020-03-09 16:14
 **/
public class Main2 {
    public static void main(String[] args) {         //        初始化一个二叉树：
        TreeNode root = new TreeNode(1);       //      root:     1
        TreeNode node2 = new TreeNode(2);       //             /   \
        TreeNode node3 = new TreeNode(3);       //            2     3
        TreeNode node4 = new TreeNode(4);       //           / \     \
        TreeNode node5 = new TreeNode(5);       //          4   5     6
        TreeNode node6 = new TreeNode(6);
        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.right = node6;

        int result = getDepth(root);
        System.out.print(result);

    }

    private static int getDepth(TreeNode root) {
        if (root==null) {
            return 0;
        }
        return maxDepth((getDepth(root.left)+1),(getDepth(root.right)+1));
    }

    private static int maxDepth(int a,int b) {
        return a>b?a:b;
    }
}