package com.liuwen.labuladong.手把手刷数据结构.二叉树;

/**
 * ----------------------------------------------------------------------
 * <p>File name: Main
 * <p>Desc: 二叉树算法题
 * <p>
 *
 * @author Create by liu wen at 2021.8.30 13:57
 * <p>
 * ----------------------------------------------------------------------
 */
public class Main {
    public static void main(String[] args) {
        /**
         * ***** 4
         * *** /   \
         * ** 2     7
         * * / \   / \
         * *1   3 6   9
         */
        //1.定义一个二叉树
        TreeNode root = getNewTree();
        //2.二叉树遍历
        System.out.print("前序遍历：");
        preTraverse(root);
        System.out.print("中序遍历：");
        midTraverse(root);
        System.out.print("后序遍历：");
        postTraverse(root);
        //3.获取二叉树的节点数
        int count = Count(root);
        System.out.println();
        System.out.print("二叉树的节点数：");
        System.out.println(count);
        //4.翻转二叉树

        //

        //

        //

        //
    }

    private static int Count(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftCount = Count(root.left);
        int rightCount = Count(root.right);
        return 1 + leftCount + rightCount;
    }

    private static void postTraverse(TreeNode root) {
        if (root == null) {
            return;
        }
        postTraverse(root.left);
        postTraverse(root.right);
        System.out.print(root.val + " ");
    }

    private static void midTraverse(TreeNode root) {
        if (root == null) {
            return;
        }
        midTraverse(root.left);
        System.out.print(root.val + " ");
        midTraverse(root.right);
    }

    private static void preTraverse(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preTraverse(root.left);
        preTraverse(root.right);
    }

    private static TreeNode getNewTree() {
        TreeNode root = new TreeNode(4);
        TreeNode left1 = new TreeNode(2);
        TreeNode right1 = new TreeNode(7);
        TreeNode left2 = new TreeNode(1);
        TreeNode right2 = new TreeNode(3);
        TreeNode left3 = new TreeNode(6);
        TreeNode right3 = new TreeNode(9);
        root.left = left1;
        root.right = right1;
        left1.left = left2;
        left1.right = right2;
        right1.left = left3;
        right1.right = right3;
        return root;
    }

}
