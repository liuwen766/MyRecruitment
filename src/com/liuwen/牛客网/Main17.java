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
        if(root1==null||root2==null){
            return result;
        }
        if(root1.val==root2.val){
            result = isTree1HasTree2(root1,root2);  //判断以root为起点的树是否包含树2
        }
        if(!result){          //如果没有找到，则判断树1的左字节点是否是树2的根节点
            result = HasSubtree(root1.left,root2);
        }
        if(!result){          //如果还没有找到，则判断树1的左字节点是否是树2的根节点
            result = HasSubtree(root1.right,root2);
        }
        return result;
    }
    //判断树1含有树2吗？
    public static boolean isTree1HasTree2(TreeNode root1, TreeNode root2) {
        if(root2==null){          //递归截止条件1（如果Tree2已经遍历完了都能对应的上，返回true）
            return true;
        }
        if(root1==null){          //递归截止条件2（如果Tree2还没有遍历完，Tree1却遍历完了。返回false）
            return false;
        }
        if(root1.val!=root2.val){ //若节点出现不一致，直接返回false
            return false;
        }         //如果根节点一致，分别比较左右子结点。
        return isTree1HasTree2(root1.left,root2.left)&&isTree1HasTree2(root1.right,root2.right);
    }
}
