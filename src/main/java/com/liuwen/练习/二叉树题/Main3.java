package com.liuwen.练习.二叉树题;

/**
 * @description: 前序遍历，中序遍历，后序遍历
 * @author: Liu Wen
 * @create: 2020-03-09 16:16
 **/
public class Main3 {
    public static void main(String[] args) {
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

        preorderTraversal(root);
        System.out.println();
        inorderTraversal(root);
        System.out.println();
        postorderTraversal(root);
    }

    /**
     * @param root
     * @return void
     * @Description: 先序遍历
     * @date 20.3.9 16:25
     */
    public static void preorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    /**
     * @param root
     * @return void
     * @Description: 中序遍历
     * @date 20.3.9 16:26
     */
    public static void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.val);
        inorderTraversal(root.right);
    }

    /**
     * @param root
     * @return void
     * @Description: 后序遍历
     * @date 20.3.9 16:26
     */
    public static void postorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.val);
    }
}
