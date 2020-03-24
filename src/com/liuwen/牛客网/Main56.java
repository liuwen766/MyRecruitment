package com.liuwen.牛客网;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**
 * @description:   删除链表中重复的结点
 * @author: Liu Wen
 * @create: 2020-03-22 18:53
 **/
public class Main56 {
    public static void main(String[] args){

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        print(node1);
        System.out.println("去重后:");

        ListNode result = deleteDuplication(node1);
        print(result);
    }
    /**
     * @Description: 1. 首先添加一个头节点，以方便碰到第一个，第二个节点就相同的情况  (秒啊)
     *               2. 设置 pre，cur指针，pre指针指向当前确定不重复的那个节点，而cur指针相当于工作指针，一直往后面搜索。
     * @date 20.3.23 20:04
     */
    public static ListNode deleteDuplication(ListNode pHead) {
        if(pHead==null||pHead.next==null){
            return pHead;
        }
        ListNode root = new ListNode(-1);
        root.next = pHead;
        ListNode pre = root;             //pre指针指向当前确定不重复的那个节点
        ListNode cur = pHead;            //cur指针相当于当前工作指针
        while (cur!=null){
            if(cur.next!=null && cur.val==cur.next.val){
                while (cur.next!=null && cur.val==cur.next.val){
                    cur = cur.next;
                }
                pre.next = cur.next;
                cur = cur.next;
            }else {
                pre = pre.next;
                cur = cur.next;
            }
        }
        return root.next;
    }

    //打印节点
    public static void print(ListNode node){
        ListNode tmp = node;
        while (tmp!=null){
            System.out.print(tmp.val+"->");
            tmp=tmp.next;
        }
    }
    //树节点定义
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
