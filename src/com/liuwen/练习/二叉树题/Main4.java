package com.liuwen.练习.二叉树题;


import java.util.LinkedList;

/**
 * @description: 分层遍历二叉树
 * @author: Liu Wen
 * @create: 2020-03-09 16:33
 **/
public class Main4 {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);       //      root:     1
        TreeNode node2 = new TreeNode(2);       //             /   \
        TreeNode node3 = new TreeNode(3);       //            2     3
        TreeNode node4 = new TreeNode(4);       //           / \     \
        TreeNode node5 = new TreeNode(5);       //          4   5     6
        TreeNode node6 = new TreeNode(6);
        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.right = node6;

        levelTraversal(root);
    }
    /**
     * @Description:  层序遍历
      * @param root
     * @return void
     * @date 20.3.9 17:24
     */
    public static void levelTraversal(TreeNode root) {
        if(root==null){
            return;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode tmp = queue.remove();
            System.out.print(tmp.val+" ");
            if(tmp.left!=null){
                queue.add(tmp.left);
            }
            if(tmp.right!=null){
                queue.add(tmp.right);
            }
        }
    }
}
