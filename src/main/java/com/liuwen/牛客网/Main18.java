package com.liuwen.牛客网;

/**
 * @description: 操作给定的二叉树，将其变换为原二叉树的镜像。
 * @author: Liu Wen
 * @create: 2020-03-09 22:30
 **/
public class Main18 {
    public static void main(String[] args){
        TreeNode root1 = new TreeNode(8);       //      root:    8
        TreeNode node2 = new TreeNode(6);       //             /   \
        TreeNode node3 = new TreeNode(10);       //           6     10
        TreeNode node4 = new TreeNode(5);       //           / \     \
        TreeNode node5 = new TreeNode(7);       //          5   7    11
        TreeNode node6 = new TreeNode(11);
        root1.left = node2;root1.right = node3;
        node2.left = node4;node2.right = node5;
        node3.right = node6;

        Mirror(root1);
    }
    /**
     * @Description:   方法1：迭代
     * /* 先前序遍历这棵树的每个结点，如果遍历到的结点有子结点，就交换它的两个子节点，
     * 当交换完所有的非叶子结点的左右子结点之后，就得到了树的镜像
      * @param root1
     * @return void
     * @date 20.3.9 22:51
     */
    public static void Mirror(TreeNode root1) {
        if(root1==null){
            return;
        }
        TreeNode temp = root1.left;
        root1.left = root1.right;
        root1.right = temp;

        Mirror(root1.left);
        Mirror(root1.right);
    }
}
