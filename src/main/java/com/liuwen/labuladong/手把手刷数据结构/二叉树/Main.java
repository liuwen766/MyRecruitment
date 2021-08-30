package com.liuwen.labuladong.手把手刷数据结构.二叉树;

import java.util.ArrayList;
import java.util.List;

/**
 * ----------------------------------------------------------------------
 * <p>File name: Main
 * <p>Desc: 二叉树算法题
 * 把题目的要求细化，搞清楚根节点应该做什么，然后剩下的事情抛给前/中/后序的遍历框架
 * 1.定义一个二叉树
 * 2.二叉树遍历
 * 3.获取二叉树的节点数
 * 4.翻转二叉树
 * 5.填充二叉树节点的右侧指针
 * 6.将二叉树展开为链表
 * 7.最大二叉树
 * 8.前序/中序遍历结果还原二叉树
 * 9.后序/中序遍历结果还原二叉树
 * 10.二叉树序列化
 * 11.寻找重复子树
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
        TreeNode newRoot = invertTree(root);
        midTraverse(newRoot);
        //5.填充二叉树节点的右侧指针
        Node root1 = new Node();
        Node conn = connect(root1);
        //6.将二叉树展开为链表
        flatten(root);
        //7.最大二叉树
        int[] nums = {3, 2, 1, 6, 0, 5};
        TreeNode maxTreeRoot = constructMaximumBinaryTree(nums);
        //8.前序/中序遍历结果还原二叉树
        int[] preorder1 = {3, 9, 20, 15, 7};
        int[] inorder1 = {9, 3, 15, 20, 7};
        TreeNode buildroot1 = buildTree1(preorder1, inorder1);
        //9.后序/中序遍历结果还原二叉树
        int[] inorder2 = {9, 3, 15, 20, 7};
        int[] postorder2 = {9, 15, 7, 20, 3};
        TreeNode buildroot2 = buildTree2(inorder2, postorder2);
        //10.二叉树序列化
        String str = seriesOfTree(root);
        System.out.println("序列化二叉树：");
        System.out.println(str);
        //11.寻找重复子树
        List<TreeNode> result = findDuplicateSubtrees(root);

    }


    private static List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        return null;
    }

    private static String seriesOfTree(TreeNode root) {
        return traverse(root);
    }

    private static String traverse(TreeNode root) {
        if (root == null) {
            return "#";
        }
        String leftStr = traverse(root.left);
        String rightStr = traverse(root.right);
        return leftStr + "," + rightStr + "," + root.val;
    }

    private static TreeNode buildTree2(int[] inorder2, int[] postorder2) {
        if (inorder2.length == 0 && postorder2.length == 0) {
            return null;
        }
        TreeNode root = buildTreeFromInorderAndPostorder(inorder2, 0, inorder2.length - 1, postorder2, 0, postorder2.length - 1);
        return root;
    }

    private static TreeNode buildTreeFromInorderAndPostorder(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd) {
        if (postStart > postEnd) {
            return null;
        }
        int rootVal = postorder[postEnd];
        int index = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootVal) {
                index = i;
                break;
            }
        }
        //构造根节点
        TreeNode root = new TreeNode(rootVal);
        //构造左右子树
        int leftSize = index - inStart;
        root.left = buildTreeFromInorderAndPostorder(inorder, inStart, index - 1, postorder, postStart, postStart + leftSize - 1);
        root.right = buildTreeFromInorderAndPostorder(inorder, index + 1, inEnd, postorder, postStart + leftSize, postEnd - 1);
        return root;
    }

    private static TreeNode buildTree1(int[] preorder, int[] inorder) {
        return null;
    }

    private static TreeNode constructMaximumBinaryTree(int[] nums) {
        return null;
    }

    private static void flatten(TreeNode root) {
    }

    ;

    //todo
    private static Node connect(Node root) {
        if (root == null || root.left == null) {
            return root;
        }
        root.left.next = root.right;
        // 将传入的两个节点连接
        // 连接相同父节点的两个子节点
        // 连接跨越父节点的两个子节点
        connect(root.left);
        connect(root.right);
        return root;
    }

    public static class Node {
        int val;
        Node left;
        Node right;
        Node next;

        public Node() {
        }

        public Node(int val) {
        }
    }

    private static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        //翻转当前节点的左右节点
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        //递归
        invertTree(root.left);
        invertTree(root.right);
        return root;
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
