package com.liuwen.牛客网;

/**
 * @description: 二叉搜索树的第k个结点
 * @author: Liu Wen
 * @create: 2020-03-21 12:26
 **/
public class Main62 {
    public static void main(String[] args) {
        //5，3，7，2，4，6，8
        TreeNode pRoot = new TreeNode(5);     //       5
        TreeNode node1 = new TreeNode(3);     //    3     7
        TreeNode node2 = new TreeNode(7);     //   2 4   6 8
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(8);
        pRoot.left = node1;
        pRoot.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;

//        inOrder(pRoot);   //中序排列测试

        int k = 1;
        TreeNode result = KthNode(pRoot, k);
        System.out.println("第" + k + "小的结点:" + result.val);
    }

    /**
     * @Description: 方法1：中序排列（递归）
     * @date 20.3.21 13:20
     */
    static int index = 0;       //去掉static方可测试通过

    public static TreeNode KthNode(TreeNode root, int k) {
        if (root != null) {
            TreeNode node = KthNode(root.left, k);
            if (node != null)
                return node;
            index++;
            if (index == k) {
                return root;
            }
            node = KthNode(root.right, k);
            if (node != null)
                return node;
        }
        return null;
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

    //中序排列测试
    private static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + "  ");
        inOrder(root.right);
    }

}
