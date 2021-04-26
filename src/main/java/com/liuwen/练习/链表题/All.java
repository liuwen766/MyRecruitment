package com.liuwen.练习.链表题;


/**
 * @description: 定义一个链表放在这里。供使用。
 * @author: Liu Wen
 * @create: 2020-03-25 20:21
 **/
public class All {
    public static void main(String[] args) {
        //    0→1→2→3→4→5→6
        ListNode root = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        root.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        //打印出来
        print(root);
    }

    public static void print(ListNode node) {
        ListNode temp = node;
        while (temp != null) {
            if (temp.next == null)
                System.out.print(temp.value);
            else
                System.out.print(temp.value + "→");
            temp = temp.next;
        }
    }


}
