package com.liuwen.牛客网;

/**
 * @description: 经典：二叉树的下一个结点
 * @author: Liu Wen
 * @create: 2020-03-22 18:47
 **/
public class Main57 {
    public static void main(String[] args) {
        TreeLinkNode pNode = new TreeLinkNode(10);    //            10
        TreeLinkNode node1 = new TreeLinkNode(1);     //        //      \\
        TreeLinkNode node2 = new TreeLinkNode(2);     //       1         2
        TreeLinkNode node3 = new TreeLinkNode(3);     //     //  \\    //
        TreeLinkNode node4 = new TreeLinkNode(4);     //    3     4    5
        TreeLinkNode node5 = new TreeLinkNode(5);     //   //    //     \\
        TreeLinkNode node6 = new TreeLinkNode(6);     //  6      7       8
        TreeLinkNode node7 = new TreeLinkNode(7);     //       //
        TreeLinkNode node8 = new TreeLinkNode(8);     //       9
        TreeLinkNode node9 = new TreeLinkNode(9);//中序排列结果:6 3 1 9 7 4 10 5 8 2
        pNode.left = node1;
        node1.next = pNode;
        pNode.right = node2;
        node2.next = pNode;
        node1.left = node3;
        node3.next = node1;
        node1.right = node4;
        node4.next = node1;
        node2.left = node5;
        node5.next = node2;
        node3.left = node6;
        node6.next = node3;
        node4.left = node7;
        node7.next = node4;
        node5.right = node8;
        node8.next = node5;
        node7.left = node9;
        node9.next = node7;
        TreeLinkNode result = GetNext(node5);
        if (result != null)
            System.out.println(result.val);
//        inOder(pNode);
    }

    /**
     * @Description: 找出二叉树中序遍历顺序的下一个结点并且返回。
     * @date 20.3.22 18:47   注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
     */
    public static TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode == null) {
            return null;
        }
        //1、有右子树的，那么下个结点就是右子树最左边的点
        if (pNode.right != null) {
            pNode = pNode.right;
            while (pNode.left != null) {
                pNode = pNode.left;
            }
            return pNode;
        }
        //2、没有右子树的，也可以分成两类，
        while (pNode.next != null) {        //向上一直找父节点的父节点
            //①是父节点的左孩子,那么父节点就是下一个节点;
            if (pNode.next.left == pNode) {
                return pNode.next;
            }
            //②是父节点的右孩子,找他的父节点
            pNode = pNode.next;
        }
        return null;
    }

    //中序遍历
    private static void inOder(TreeLinkNode pNode) {
        if (pNode == null) {
            return;
        }
        inOder(pNode.left);
        System.out.print(pNode.val + "  ");
        inOder(pNode.right);
    }

    //树节点定义
    public static class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }
}

