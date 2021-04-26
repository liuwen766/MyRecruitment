package com.liuwen.牛客网;

/**
 * @description: 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 * @author: Liu Wen
 * @create: 2020-03-23 21:55
 **/
public class Main55 {
    public static void main(String[] args) {
        //6->1->2->3->4->5
        //         ↑     ↓
        //         8<-7<-6
        ListNode root = new ListNode(6);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);
        root.next = node1;
        node4.next = node5;
        node1.next = node2;
        node5.next = node6;
        node2.next = node3;
        node6.next = node7;
        node3.next = node4;
        node7.next = node8;
        node8.next = node3;

        ListNode result = EntryNodeOfLoop(root);
        System.out.println(result.value);
    }

    /**
     * @Description: 先判断是否有环（快慢指针），有环则（慢慢指针）开始查找。
     * 1、设置快慢指针，假如有环，他们最后一定相遇。
     * 2、两个指针分别从链表头和相遇点继续出发，每次走一步，最后一定相遇与环入口。
     * @date 20.3.23 22:33
     */
    public static ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null) {
            return null;
        }
        //step1:先判断是否有环;
        boolean flag = false;
        ListNode slow = pHead;
        ListNode quick = pHead;
        while (quick != null && quick.next != null) {
            slow = slow.next;
            quick = quick.next.next;
            if (slow == quick) {
                flag = true;
                break;
            }
        }
        //step2:有环则找入口点;   相遇点离环的开始处的距离等于链表头到环开始处的距离，
        if (flag) {
            slow = pHead;
            while (slow.next != null) {
                if (slow == quick) {
                    return slow;
                }
                slow = slow.next;
                quick = quick.next;
            }
        }
        //step3:无环则返回null。
        return null;
    }
}
