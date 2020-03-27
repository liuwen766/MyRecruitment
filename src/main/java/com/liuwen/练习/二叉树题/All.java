package com.liuwen.练习.二叉树题;

/**
 * @description:    定义一个二叉树放在这里。供使用。
 * @author: Liu Wen
 * @create: 2020-03-25 22:42
 **/
public class All {
    public static void main(String[] args) {         //        初始化一个二叉树：
        TreeNode root = new TreeNode(4);       //       root:    4
        TreeNode node2 = new TreeNode(2);       //             /   \
        TreeNode node3 = new TreeNode(6);       //            2     6
        TreeNode node4 = new TreeNode(1);       //           / \   / \
        TreeNode node5 = new TreeNode(3);       //          1   3 5   7
        TreeNode node6 = new TreeNode(5);
        TreeNode node7 = new TreeNode(7);
        root.left = node2;root.right = node3;
        node2.left = node4;node2.right = node5;
        node3.left = node6;node3.right = node7;

        inorderTraversal(root);
    }
    /**
     * @Description:    中序遍历
     * @date 20.3.25 22:46
     */
    public static void inorderTraversal(TreeNode root) {
        if (root==null){
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.val+" ");
        inorderTraversal(root.right);
    }
}
