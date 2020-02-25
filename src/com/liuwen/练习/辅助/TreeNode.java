package com.liuwen.练习.辅助;

/**
 * @description: 链表的结点定义
 * @author: Liu Wen
 * @create: 2020-02-25 14:19
 **/
public class TreeNode {
        public int data;
        public TreeNode leftNode;
        public TreeNode rightNode;

        //定义空结点
        public TreeNode() {
        }

        //定义有数据节点
        public TreeNode(int d) {
            data=d;
        }

        //定义有数据结点,同时指明左结点和右结点。
        public TreeNode(TreeNode left,TreeNode right,int d) {
            leftNode=left;
            rightNode=right;
            data=d;
        }
}
