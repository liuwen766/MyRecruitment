package com.liuwen.各公司笔试题.交行;

/**
 * @description: 输入字符串是一个完全二叉树的广度搜索，给出输出：其深度搜索的字符串
 * @author: Liu Wen
 * @create: 2020-04-19 14:56
 **/
import java.util.Map;
import java.util.HashMap;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class  main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        //TODO
    }

    //把广度遍历的字符串转换成二叉树
    public static TreeNode string2Tree(String[] chars, int index) {
        //TODO
        return null;
    }

    //把二叉树以深度遍历输出
    public static String tree2String(TreeNode treeRootNode) {
        //TODO
        return null;
    }
}

class TreeNode {
    String nodeName;
    TreeNode leftNode;
    TreeNode rightNoed;
    public TreeNode(String nodeName) {
        this.nodeName = nodeName;
    }
}
