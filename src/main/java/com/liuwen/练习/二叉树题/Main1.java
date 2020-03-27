package com.liuwen.练习.二叉树题;

import java.util.LinkedList;

/**
 * @description: 求二叉树中的节点个数
 * @author: Liu Wen
 * @create: 2020-03-09 15:49
 **/
public class Main1 {
    public static void main(String[] args){         //        初始化一个二叉树：
        TreeNode root = new TreeNode(1);       //       root:    1
        TreeNode node2 = new TreeNode(2);       //             /   \
        TreeNode node3 = new TreeNode(3);       //            2     3
        TreeNode node4 = new TreeNode(4);       //           / \     \
        TreeNode node5 = new TreeNode(5);       //          4   5     6
        TreeNode node6 = new TreeNode(6);
        root.left = node2;root.right = node3;
        node2.left = node4;node2.right = node5;
        node3.right = node6;

        int result = getNodeNum1(root);
        System.out.print(result);
    }
    /**
     * @Description:   方法2：迭代    层序遍历法
      * @param root
     * @return int
     * @date 20.3.9 16:13
     */
    public static int getNodeNum1(TreeNode root) {
        if (root==null){
            return 0;
        }
        int count = 1;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode tmp = queue.remove();
            if(tmp.left!=null){
                 queue.add(tmp.left);
                 count++;
            }
            if(tmp.right!=null){
                queue.add(tmp.right);
                count++;
            }
        }
        return count;
    }

    /**
     * @Description:    方法1：递归
      * @param root
     * @return int
     * @date 20.3.9 16:05
     */
    public static int getNodeNum(TreeNode root) {
        if(root==null) {
            return 0;
        }
        return getNodeNum(root.left)+getNodeNum(root.right)+1;
    }

}
