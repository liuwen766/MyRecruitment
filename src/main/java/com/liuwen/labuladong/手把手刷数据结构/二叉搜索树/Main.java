package com.liuwen.labuladong.手把手刷数据结构.二叉搜索树;


/**
 * ----------------------------------------------------------------------
 * <p>File name: Main
 * <p>Desc: 二叉搜索树BST算法题
 *
 * 对于 BST 相关的问题，你可能会经常看到类似下面这样的代码逻辑：
 * void BST(TreeNode root, int target) {
 *     if (root.val == target)
 *         // 找到目标，做点什么
 *     if (root.val < target)
 *         BST(root.right, target);
 *     if (root.val > target)
 *         BST(root.left, target);
 * }
 *
 * 1.BST第K小的元素（中等）
 * 2.二叉搜索树转化累加树（中等）
 * 3.验证二叉搜索树（中等）
 * 4.二叉搜索树中的搜索（简单）
 * 5.二叉搜索树中的插入操作（中等）
 * 6.删除二叉搜索树中的节点（中等）
 * 7.不同的二叉搜索树（Easy）
 * 8.不同的二叉搜索树II（Medium）
 * <p>
 *
 * @author Create by liu wen at 2021.12.3 10:59
 * <p>
 * ----------------------------------------------------------------------
 */
public class Main {
    public static void main(String[] args) {
        /**
         * ***** 5
         * *** /   \
         * ** 3     8
         * * / \   / \
         * *2   4 7   10
         */
        //定义一个BST树
        TreeNode bst = getBSTree();

        //中序遍历BST
        System.out.print("BST的中序遍历：");
        midTraverse(bst);
        System.out.println();

        //1.BST第K小的元素（中等）
        int K = 5;
        int res = findKthSmall(bst, K);
        System.out.printf("BST第K:%d小的元素:%d", K, res);

        //2.二叉搜索树转化累加树（中等）
        TreeNode leijiaTree = convertBST(bst);
        midTraverse(leijiaTree);
        System.out.println();

        //6.验证二叉搜索树（中等）


        System.out.println();
        System.out.println("-------------------------");
    }

    private static TreeNode convertBST(TreeNode bst) {
        return null;
    }

    private static int findKthSmall(TreeNode bst, int k) {

        return 0;
    }

    //中序遍历
    private static void midTraverse(TreeNode bst) {
        if (bst == null) {
            return;
        }
        midTraverse(bst.left);
        System.out.print(bst.val + " ");
        midTraverse(bst.right);
    }

    private static TreeNode getBSTree() {
        TreeNode root = new TreeNode(5);
        TreeNode left1 = new TreeNode(3);
        TreeNode right1 = new TreeNode(8);
        TreeNode left2 = new TreeNode(2);
        TreeNode right2 = new TreeNode(4);
        TreeNode left3 = new TreeNode(7);
        TreeNode right3 = new TreeNode(10);
        root.left = left1;
        root.right = right1;
        left1.left = left2;
        left1.right = right2;
        right1.left = left3;
        right1.right = right3;
        return root;
    }
}
