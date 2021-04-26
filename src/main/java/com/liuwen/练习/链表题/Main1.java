package com.liuwen.练习.链表题;

/**
 * @description: 求单链表中结点的个数: getListLength
 * @author: Liu Wen
 * @create: 2020-03-25 20:17
 **/
public class Main1 {
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

        int result = getListLength(root);
        System.out.println("链表的长度:" + result);
    }

    /**
     * @Description: 遍历即可
     * @date 20.3.25 22:31
     */
    private static int getListLength(ListNode root) {
        if (root == null)
            return 0;
        int count = 0;
        ListNode temp = root;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
