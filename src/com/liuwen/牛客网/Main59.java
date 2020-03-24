package com.liuwen.牛客网;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @description:         请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，
 *                       第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
 * @author: Liu Wen
 * @create: 2020-03-22 14:03
 **/
public class Main59 {
    public static void main(String[] args){
        TreeNode pRoot = new TreeNode(5);     //       5
        TreeNode node1 = new TreeNode(3);     //    3     7
        TreeNode node2 = new TreeNode(7);     //   2 4   6 8
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(8);
        pRoot.left=node1;pRoot.right=node2;
        node1.left=node3;node1.right=node4;
        node2.left=node5;node2.right=node6;
        ArrayList<ArrayList<Integer>> res = Print(pRoot);
        System.out.println(res);
    }
    /**
     * @Description:         思路：层序遍历。   两个栈
     * @date 20.3.22 14:09
     */
    public static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        if(pRoot==null){
            return arrayLists;
        }
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.add(pRoot);
        while (!stack1.isEmpty()||!stack2.isEmpty()) {
            if (!stack1.isEmpty()) {
                ArrayList<Integer> arrayList = new ArrayList<>();
                while (!stack1.isEmpty()) {
                    TreeNode node = stack1.pop();
                    arrayList.add(node.val);
                    if (node.left != null) {             //先left再right
                        stack2.push(node.left);
                    }
                    if (node.right != null) {
                        stack2.push(node.right);
                    }
                }
                arrayLists.add(arrayList);
            } else {
                ArrayList<Integer> arrayList = new ArrayList<>();
                while (!stack2.isEmpty()) {
                    TreeNode node = stack2.pop();
                    arrayList.add(node.val);
                    if (node.right != null) {            //先right再left
                        stack1.push(node.right);
                    }
                    if (node.left != null) {
                        stack1.push(node.left);
                    }
                }
                arrayLists.add(arrayList);
            }
        }
        return arrayLists;
    }

    public static class TreeNode {
        int val;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }
}
