package com.liuwen.牛客网;

/**
 * @description: 对称的二叉树
 * @author: Liu Wen
 * @create: 2020-03-22 17:53
 **/
public class Main58 {
    public static void main(String[] args) {
        TreeNode pRoot = new TreeNode(5);     //       5            5
        TreeNode node1 = new TreeNode(3);     //    3     3      3     3
        TreeNode node2 = new TreeNode(3);     //   5 1   1 5   5  1  1   5
        TreeNode node3 = new TreeNode(5);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(1);
        TreeNode node6 = new TreeNode(5);
        pRoot.left = node1;
        pRoot.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        boolean result = isSymmetrical(pRoot);
        System.out.println(result);
    }

    /**
     * @Description: 如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
     * @date 20.3.22 17:54
     */
    public static boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null) {
            return true;                 //空树也是镜像对称的
        }
        return helper(pRoot.left, pRoot.right);
    }

    private static boolean helper(TreeNode left, TreeNode right) {
        if (left == null && right == null) {     //递归截止条件 return true;
            return true;
        }
        if (right == null || left == null) {     //有一个为null，镜像怎么可能还对称 return false;
            return false;
        }
        if (left.val != right.val) {         //两个值不一样，镜像之后怎么会相等 return false;
            return false;
        }
        return helper(left.left, right.right) && helper(left.right, right.left);
    }
}
