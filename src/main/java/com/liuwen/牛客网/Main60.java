package com.liuwen.牛客网;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @description:    把二叉树打印成多行
 * @author: Liu Wen
 * @create: 2020-03-21 19:35
 **/
public class Main60 {
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
     * @Description:     从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
     * @date 20.3.21 19:40
     */
    public static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        if(pRoot==null){
            return arrayLists;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int count = 0;int nextCount = 0;int cur = 1;
        while (!queue.isEmpty()){
            TreeNode ans = queue.poll();
            count++;
            arrayList.add(ans.val);
            if(ans.left!=null){
                queue.add(ans.left);
                nextCount++;
            }
            if(ans.right!=null){
                queue.add(ans.right);
                nextCount++;
            }
            if(count==cur){
                count=0;
                arrayLists.add(arrayList);
                arrayList = new ArrayList<>();
                cur = nextCount;
                nextCount = 0;
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
