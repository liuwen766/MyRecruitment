package com.liuwen.牛客网;

/**
 * @description: 二叉搜索树与双向链表
 * @author: Liu Wen
 * @create: 2020-03-24 19:56
 **/
public class Main26 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);       //      root:     4
        TreeNode node2 = new TreeNode(2);       //             /   \
        TreeNode node3 = new TreeNode(6);       //            2     6
        TreeNode node4 = new TreeNode(1);       //           / \   / \
        TreeNode node5 = new TreeNode(3);       //          1   3 5   7
        TreeNode node6 = new TreeNode(5);
        TreeNode node7 = new TreeNode(7);
        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        inOrder(root);
        TreeNode result = Convert(root);
        if (result != null)
            System.out.println(result.val);
    }

    /**
     * @Description: 方法1：递归（解题思路）
     * 1.将左子树构造成双链表，并返回链表头节点。
     * 2.定位至左子树双链表最后一个节点。(用于3)
     * 3.如果左子树链表不为空的话，将当前root追加到左子树链表。
     * 4.将右子树构造成双链表，并返回链表头节点。
     * 5.如果右子树链表不为空的话，将该链表追加到root节点之后。
     * 6.根据左子树链表是否为空确定返回的节点。
     * @date 20.3.25 00:33
     */
    public static TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null)
            return null;
        TreeNode leftNode = Convert(pRootOfTree.left);
        TreeNode position = leftNode;
        while (position != null && position.right != null) {
            position = position.right;
        }
        if (leftNode != null) {
            position.right = pRootOfTree;
            pRootOfTree.left = position;
        }
        TreeNode rightNode = Convert(pRootOfTree.right);
        if (rightNode != null) {
            pRootOfTree.right = rightNode;
            rightNode.left = pRootOfTree;
        }
        return leftNode == null ? pRootOfTree : leftNode;
    }

    /**
     * @Description: 方法2：中序遍历法非递归（利用Stack）
     * @date 20.3.25 00:41
     */
    public static TreeNode Convert1(TreeNode root) {
        return null;
    }

    //中序遍历
    public static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }
}
