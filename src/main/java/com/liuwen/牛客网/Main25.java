package com.liuwen.牛客网;

import java.util.HashMap;

/**
 * @description: 复杂链表的复制
 * @author: Liu Wen
 * @create: 2020-03-24 19:56
 **/
public class Main25 {
    public static void main(String[] args) {
        RandomListNode root = new RandomListNode(0);
        RandomListNode node1 = new RandomListNode(1);
        RandomListNode node2 = new RandomListNode(2);
        RandomListNode node3 = new RandomListNode(3);
        RandomListNode node4 = new RandomListNode(4);
        // 0→1→2→3
        root.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        root.random = node2;
        node1.random = node4;
        node3.random = node1;
        print(root);
        RandomListNode proot = Clone(root);
        print(proot);
    }

    /**
     * @Description: 方法2：递归完成（使用Map集合来装）
     * @date 20.3.25 18:26
     */
    public static HashMap<RandomListNode, RandomListNode> hashMap = new HashMap<>();

    public static RandomListNode Clone(RandomListNode node) {
        if (node == null)
            return null;
        if (hashMap.containsKey(node)) {
            return hashMap.get(node);        //用于返回random结点
        }
        RandomListNode copyNode = new RandomListNode(node.label);
        hashMap.put(node, copyNode);
        copyNode.next = Clone(node.next);
        copyNode.random = Clone(node.random);
        return copyNode;
    }

    /*
     *解题思路：
     *1、遍历链表，复制每个结点，如复制结点A得到A1，将结点A1插到结点A后面；
     *2、重新遍历链表，复制老结点的随机指针给新结点，如A1.random = A.random.next;
     *3、拆分链表，将链表拆分为原链表和复制后的链表.
     */
    public static RandomListNode Clone1(RandomListNode pHead) {
        if (pHead == null) {
            return null;
        }
        //step1、遍历链表，复制每个结点，如复制结点A得到A1，将结点A1插到结点A后面；
        RandomListNode cur = pHead;
        while (cur != null) {
            RandomListNode copyNode = new RandomListNode(cur.label); //复制新节点
            RandomListNode nextNode = cur.next;
            cur.next = copyNode;
            copyNode.next = nextNode;
            cur = nextNode;
        }
        //step2、重新遍历链表，复制老结点的随机指针给新结点，如A1.random = A.random.next;
        cur = pHead;
        while (cur != null) {
            if (cur.random != null) {
                cur.next.random = cur.random.next;
            }
            cur = cur.next.next;
        }
        //step3、拆分链表，将链表拆分为原链表和复制后的链表.
        cur = pHead;
        RandomListNode newHead = cur.next;
        while (cur != null) {
            RandomListNode copyNode = cur.next;
            cur.next = copyNode.next;
            if (copyNode.next != null) {
                copyNode.next = copyNode.next.next;
            }
            cur = cur.next;
        }
        return newHead;
    }

    //节点定义
    public static class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    //打印链表
    public static void print(RandomListNode root) {
        if (root == null)
            return;
        RandomListNode tmp = root;
        while (tmp != null) {
            System.out.print(tmp.label + "→");
            tmp = tmp.next;
        }
    }

}
