package com.liuwen.牛客网;

/**
 * @description:    输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 * @author: Liu Wen
 * @create: 2020-03-16 18:21
 **/
public class Main39 {
    public static void main(String[] args){        //1 2 3 4 5 # # # # 6
        TreeNode root = new TreeNode(1);       //      root:     1
        TreeNode node2 = new TreeNode(2);       //             /   \
        TreeNode node3 = new TreeNode(3);       //            2     3
        TreeNode node4 = new TreeNode(4);       //           / \
        TreeNode node5 = new TreeNode(5);       //          4   5
        TreeNode node6 = new TreeNode(6);       //             /
        root.left = node2;root.right = node3;       //            6
        node2.left = node4;node2.right = node5;
        node5.left = node6;
        boolean result = IsBalanced_Solution(root);
        System.out.println(result);
    }
    /**
     * @Description:          方法1：平衡二叉树的左右子树深度差 <=1
     * @date 20.3.16 18:23
     */
    public static boolean IsBalanced_Solution(TreeNode root) {
        if (root==null){
            return true;
        }
        int leftLength = getDepth(root.left);
        int rightLength = getDepth(root.right);
        return (leftLength-rightLength)==0||(rightLength-leftLength)==1||(leftLength-rightLength)==1||(rightLength-leftLength)==0;
    }
    private static int getDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftDepth = getDepth(root.left)+1;
        int rightDepth = getDepth(root.right)+1;
        return Math.max(leftDepth,rightDepth);
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
