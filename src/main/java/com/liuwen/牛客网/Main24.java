package com.liuwen.牛客网;

import java.util.ArrayList;

/**
 * @description: 输入一颗二叉树的根节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * (注意: 在返回值的list中，数组长度大的数组靠前)
 * @author: Liu Wen
 * @create: 2020-03-10 15:12
 **/
public class Main24 {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);       //      root:     1
        TreeNode node2 = new TreeNode(2);       //             /   \
        TreeNode node3 = new TreeNode(3);       //            2     3
        TreeNode node4 = new TreeNode(4);       //           / \   / \
        TreeNode node5 = new TreeNode(5);       //          4   5 3   4
        TreeNode node6 = new TreeNode(3);
        TreeNode node7 = new TreeNode(4);
        root.left = node2;root.right = node3;
        node2.left = node4;node2.right = node5;
        node3.right = node6;node3.left = node7;
        int target = 7;
        ArrayList<ArrayList<Integer>> result = FindPath1(root,target);
        System.out.println(result.toString());
    }

    /**
     * @Description:           方法1：递归(代码超级简洁)
     * @date 20.3.20 23:16
     */
    static ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
    static ArrayList<Integer> arrayList = new ArrayList<>();
    public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if(root==null){
            return arrayLists;
        }
        arrayList.add(root.val);
        target = target-root.val;
        if(target==0&&root.left==null&&root.right==null){
            arrayLists.add(new ArrayList<>(arrayList));    //重新new一个新的arrayList
        }
        FindPath(root.left,target);
        FindPath(root.right,target);
        // 当前路径不对，（递归）去掉最后一个节点，从其父节点开始重新寻找
        arrayList.remove(arrayList.size()-1);
        return arrayLists;
    }

    /**
     * @Description:                 方法2：利用传参返回
     * @date 20.3.24 23:59
     */
    public static ArrayList<ArrayList<Integer>> FindPath1(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        if(root==null){
            return arrayLists;
        }
        int sum = 0;
        helper(root,target,arrayLists,arrayList,sum);
        return arrayLists;
    }

    private static void helper(TreeNode root, int target, ArrayList<ArrayList<Integer>> arrayLists, ArrayList<Integer> arrayList, int sum) {
        if(root==null){
            return;
        }
        sum += root.val;
        arrayList.add(root.val);
        if(sum==target && root.left==null && root.right==null){  //截止条件
            arrayLists.add(new ArrayList<>(arrayList));
        }
        helper(root.left,target,arrayLists,arrayList,sum);
        helper(root.right,target,arrayLists,arrayList,sum);
        arrayList.remove(arrayList.size()-1);
    }
}
