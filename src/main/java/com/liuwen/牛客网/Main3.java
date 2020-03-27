package com.liuwen.牛客网;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;


/**
 * @description: 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 * @author: Liu Wen
 * @create: 2020-03-07 12:36
 **/
public class Main3 {
    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ArrayList<Integer> arrayList = printListFromTailToHead1(node1);
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }
    /**
     * @Description:  方法1：使用栈结构（先进后出）
      * @param listNode
     * @return java.util.ArrayList<java.lang.Integer>
     * @date 20.3.7 13:29
     */
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();          //使用栈结构
        while (listNode!=null){
            stack.push(listNode.val);
            listNode=listNode.next;
        }
        while (!stack.isEmpty()){
            result.add(stack.pop());
        }
        return result;
    }

    /**
     * @Description:     方法2：将链表反转（不推荐，破坏了原来的数据结构）
      * @param listNode
     * @return java.util.ArrayList<java.lang.Integer>
     * @date 20.3.7 13:37
     *
     */
    public static ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {
        ArrayList<Integer> result = new ArrayList<>();
        ListNode newHead = null;
        ListNode tmp = null;
        ListNode cur = listNode;
        //1→2→3→4→5→null
        while (cur!=null){
            tmp = cur;
            cur = cur.next;
            tmp.next=newHead;
            newHead = tmp;
        }
        ListNode temp = newHead;
        while (temp!=null){
            result.add(temp.val);
            temp = temp.next;
        }
        return result;
    }
    //结点定义
    public static class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }
}
