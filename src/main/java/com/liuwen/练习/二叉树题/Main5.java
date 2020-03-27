package com.liuwen.练习.二叉树题;

/**
 * @description: 将二叉查找树变为有序的双向链表
 * @author: Liu Wen
 * @create: 2020-03-09 17:30
 **/
public class Main5 {
    public static void main(String[] args){
        TreeNode root = new TreeNode(4);       //      root:     4
        TreeNode node2 = new TreeNode(2);       //             /   \
        TreeNode node3 = new TreeNode(5);       //            2     5
        TreeNode node4 = new TreeNode(1);       //           / \     \
        TreeNode node5 = new TreeNode(3);       //          1   3     6
        TreeNode node6 = new TreeNode(6);       //    中序排列：123456
        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.right = node6;

    }
}
