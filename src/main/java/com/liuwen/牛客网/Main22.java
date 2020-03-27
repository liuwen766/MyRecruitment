package com.liuwen.牛客网;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @description: 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * @author: Liu Wen
 * @create: 2020-03-10 14:38
 **/
public class Main22 {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);       //      root:     1
        TreeNode node2 = new TreeNode(2);       //             /   \
        TreeNode node3 = new TreeNode(3);       //            2     3
        TreeNode node4 = new TreeNode(4);       //           / \   / \
        TreeNode node5 = new TreeNode(5);       //          4   5 7   6
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        root.left = node2;root.right = node3;
        node2.left = node4;node2.right = node5;
        node3.right = node6;node3.left = node7;

        ArrayList<Integer> arrayList = PrintFromTopToBottom(root);
        System.out.println(arrayList);

    }
    /**
     * @Description:  层序遍历     使用队列结构
      * @param root
     * @return java.util.ArrayList<java.lang.Integer>
     * @date 20.3.10 14:39
     */
    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root==null){
            return result;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode tmp = queue.remove();
            result.add(tmp.val);
            if(tmp.left!=null){
                queue.add(tmp.left);
            }
            if(tmp.right!=null){
                queue.add(tmp.right);
            }
        }
        return result;
    }
}
