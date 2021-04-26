package com.liuwen.牛客网;

/**
 * @description: 输入两个单调递增的链表，输出两个链表合成后的链表，
 * 当然我们需要合成后的链表满足单调不减规则。
 * @author: Liu Wen
 * @create: 2020-03-08 23:17
 **/
public class Main16 {
    public static void main(String[] args) {
        //链表1
        ListNode head1 = new ListNode(1);
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(6);
        ListNode node4 = new ListNode(8);
        head1.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        //链表2
        ListNode head2 = new ListNode(1);
        ListNode node5 = new ListNode(2);
        ListNode node6 = new ListNode(5);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(9);
        head2.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        //合并得到一个新链表
        ListNode newHead = Merge(head1, head2);
        ListNode tmp = newHead;
        while (tmp != null) {
            System.out.print(tmp.value + "->");
            tmp = tmp.next;
        }
    }

    /**
     * @param list1 step2：依次比较两个链表的大小，小的先取下来；
     * @param list2 step3：直到其中一个链表取完了，比较结束；
     * @return com.liuwen.牛客网.ListNode            step4：取完剩下的一个链表。
     * @Description: 方法1：类似于合并两个有序数组  step1：确定头结点；
     * @date 20.3.8 23:17
     */
    public static ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        if (list1 == null || list2 == null) {
            return list1 == null ? list2 : list1;
        }
        ListNode newHead = null;
        if (list1.value < list2.value) {   //step1：确定头结点；
            newHead = list1;
            list1 = list1.next;
        } else {
            newHead = list2;
            list2 = list2.next;
        }
        ListNode tmp = newHead;
        while (list1 != null && list2 != null) {
            if (list1.value <= list2.value) {   //step2：依次比较两个链表的大小，小的先取下来；
                tmp.next = list1;
                list1 = list1.next;
            } else {
                tmp.next = list2;
                list2 = list2.next;
            }
            tmp = tmp.next;
        }                                     //tep3：直到其中一个链表取完了，比较结束；
        if (list1 != null) {                     //step4：取完剩下的一个链表。
            tmp.next = list1;
        }
        if (list2 != null) {
            tmp.next = list2;
        }
        return newHead;
    }
}
