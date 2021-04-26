package com.liuwen.牛客网;

/**
 * @description: 输入一个链表，反转链表后，输出新链表的表头。
 * @author: Liu Wen
 * @create: 2020-03-08 22:38
 **/
public class Main15 {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        ListNode newHead = ReverseList(head);
        ListNode tmp = newHead;
        while (tmp != null) {
            System.out.print(tmp.value + "->");
            tmp = tmp.next;
        }
    }

    /**
     * @param head 它利用递归走到链表的末端，然后再更新每一个node的next值，实现链表的反转。
     * @return com.liuwen.牛客网.ListNode
     * @Description: 递归方法
     * @date 20.3.8 22:50
     */
    public static ListNode ReverseList1(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode newHead = ReverseList(head.next);
        //**********************************//    head→→→head.next
        head.next.next = head;    //     head.next ← 1     →    2  ↓
        head.next = null;         //        null  ←  1     ←    2  ↓
        return newHead;         //         ← head.next.next ←←←↓
    }

    /**
     * @param head
     * @return com.liuwen.牛客网.ListNode
     * @Description: 方法1：常规方法
     * @date 20.3.8 22:39
     */
    public static ListNode ReverseList(ListNode head) {
        ListNode newHead = null;
        if (head == null) {
            return newHead;
        }
        ListNode cur = head;
        newHead = null;
        ListNode tmp = null;
        while (cur != null) {
            //      0→1→2→3→4→5→6→null
            //null←0←1←2←3←4←5←6
            tmp = cur;
            cur = cur.next;
            tmp.next = newHead;
            newHead = tmp;
        }
        return newHead;
    }

}

