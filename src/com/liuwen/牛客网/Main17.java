package com.liuwen.牛客网;

/**
 * @description: 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * @author: Liu Wen
 * @create: 2020-03-09 22:29
 **/
public class Main17 {
    public static void main(String[] args){
        //初始化树1
        TreeNode root1 = new TreeNode(1);       //      root:    1
        TreeNode node2 = new TreeNode(2);       //             /   \
        TreeNode node3 = new TreeNode(3);       //            2     3
        TreeNode node4 = new TreeNode(4);       //           / \     \
        TreeNode node5 = new TreeNode(5);       //          4   5     6
        TreeNode node6 = new TreeNode(6);
        root1.left = node2;root1.right = node3;
        node2.left = node4;node2.right = node5;
        node3.right = node6;
        //初始化树2
        TreeNode root2 = new TreeNode(2);       //      root:     2
        TreeNode node22 = new TreeNode(4);       //             /   \
        TreeNode node23 = new TreeNode(5);       //            4     5
        TreeNode node26 = new TreeNode(6);
        root2.left = node22;
        root2.right = node23;

        boolean res = HasSubtree(root1,root2);
        System.out.println(res);
    }
    /**
     * @Description:    递归
      * @param root1
     * @param root2
     * @return boolean
     * @date 20.3.9 22:29
     */
    public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean result = false;

        return result;
    }
    //判断树1含有树2吗？
    public static boolean isTree1HasTree2(TreeNode root1, TreeNode root2) {
        return false;
    }
}
