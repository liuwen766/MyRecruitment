package com.liuwen.牛客网;

import java.util.Arrays;

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
        if (pre.length!=in.length||pre.length==0){
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);      //找出根节点
        int i = 0;
        for (i = 0; i < pre.length; i++) {
            if(in[i]==pre[0]){
                break;
            }
        }
        /*
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
                          i
         */ //分别找出新的左右子树的前序遍历和中序遍历
        int[] Leftnewpre = Arrays.copyOfRange(pre,1,i+1);
        int[] Leftnewin = Arrays.copyOfRange(in,0,i);
        int[] Rigntnewpre = Arrays.copyOfRange(pre,i+1,pre.length);
        int[] Rightnewin = Arrays.copyOfRange(in,i+1,in.length);
        root.left = reConstructBinaryTree(Leftnewpre,Leftnewin); //找出根节点的左子树的根结点
        root.right = reConstructBinaryTree(Rigntnewpre,Rightnewin);//找出根节点的右子树的根节点
        return root;
    }
    /**
     * @Description:  前序遍历  用于可视化检验结果
      * @param treeNode
     * @return void
     * @date 20.3.10 15:24
     */
    private static void preorderTraversal(TreeNode treeNode) {
        if(treeNode==null){
            return;
        }
        System.out.print(treeNode.val);
        preorderTraversal(treeNode.left);
        preorderTraversal(treeNode.right);
    }
}
