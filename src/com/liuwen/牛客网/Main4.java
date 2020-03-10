package com.liuwen.牛客网;

/**
 * @description: 重建二叉树
 * @author: Liu Wen
 * @create: 2020-03-07 19:36
 **/
public class Main4 {
    public static void main(String[] args){
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        TreeNode treeNode = reConstructBinaryTree(pre,in);
        preorderTraversal(treeNode);    //前序遍历查看结果

    }
    /**
     * @Description:  输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
     * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
      * @param pre
     * @param in
     * @return com.liuwen.牛客网.TreeNode
     * @date 20.3.10 15:21
     */
    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return null;
    }

    /**
     * @Description:  前序遍历
      * @param treeNode
     * @return void
     * @date 20.3.10 15:24
     */
    private static void preorderTraversal(TreeNode treeNode) {

    }
}
