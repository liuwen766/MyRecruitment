package com.liuwen.牛客网;

import java.util.*;

/**
 * @description:        二叉树的深度
 * @author: Liu Wen
 * @create: 2020-03-16 18:07
 **/
public class Main38 {

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);       //      root:     1
        TreeNode node2 = new TreeNode(2);       //             /   \
        TreeNode node3 = new TreeNode(3);       //            2     3
        TreeNode node4 = new TreeNode(4);       //           / \     \
        TreeNode node5 = new TreeNode(5);       //          4   5     6
        TreeNode node6 = new TreeNode(6);       //                   /
        TreeNode node7= new TreeNode(7);        //                  7
        root.left = node2;root.right = node3;
        node2.left = node4;node2.right = node5;
        node3.right = node6;node6.left = node7;

        int result = TreeDepth1(root);
        System.out.println(result);
    }
    /**
     * @Description:          方法1：递归解法
     * @date 20.3.16 18:10
     */
    public static int TreeDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftLength = TreeDepth(root.left)+1;
        int rightLength = TreeDepth(root.right)+1;
        return Math.max(leftLength,rightLength);
    }
    /**
     * @Description:      方法2：层序遍历。来计算二叉树的层数
     * @date 20.3.16 18:19
     */
    public static int TreeDepth1(TreeNode root) {
        int depth = 0;
        if(root==null){
            return depth;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int count = 0;             //记录当前层的个数
        int nextcount = 1;         //当前层个数
        while (!queue.isEmpty()){
            TreeNode treeNode = queue.poll();
            count++;
            if(treeNode.left!=null){
                queue.add(treeNode.left);
            }
            if(treeNode.right!=null){
                queue.add(treeNode.right);
            }
            if(count==nextcount){
                nextcount = queue.size();
                count = 0;
                depth++;
            }
        }
        return depth;
    }

    //树节点定义
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

}
