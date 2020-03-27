package com.liuwen.牛客网;

/**
 * @description:   输入两个链表，找出它们的第一个公共结点。
 * @author: Liu Wen
 * @create: 2020-03-16 16:58
 **/
public class Main36 {
    public static void main(String[] args){
        // 0→1→2→3→4→5→6
        ListNode head1 = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        head1.next = node1;node1.next=node2;node2.next=node3;
        node3.next=node4;node4.next=node5;node5.next=node6;
        //   9→8→3→4→5→6
        ListNode head2 = new ListNode(9);
        ListNode node8 = new ListNode(8);
        ListNode node9 = new ListNode(3);
        ListNode node10 = new ListNode(4);
        ListNode node11 = new ListNode(5);
        ListNode node12 = new ListNode(6);
        head2.next = node8;node8.next = node9;node9.next = node10;
        node10.next = node11;node11.next = node12;

        ListNode result = FindFirstCommonNode(head1,head2);
        if(result!=null)
            System.out.println("第一个公共结点：" + result.val);
    }
    /**
     * @Description:  找出2个链表的长度，然后让长的先走两个链表的长度差，然后再一起走。
     * @date 20.3.16 17:49         （因为2个链表用公共的尾部）。类似快慢指针。
     */

    public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1==null||pHead2==null){
            return null;
        }
        int size1 = getSize(pHead1);
        int size2 = getSize(pHead2);
        ListNode temp1 = pHead1;
        ListNode temp2 = pHead2;
        if(size1>size2){
            for (int i = 0; i < (size1 - size2); i++) {
                temp1 = temp1.next;
            }
        }else {
            for (int i = 0; i < (size2 - size1); i++) {
                temp2 = temp2.next;
            }
        }
        while (temp1.val!=temp2.val&&temp1.next!=null&&temp2.next!=null){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        if(temp1.val==temp2.val){
            return temp1;
        }else
        return null;
    }

    private static int getSize(ListNode pHead1) {
        if(pHead1==null){
            return 0;
        }
        ListNode temp = pHead1;
        int count = 0;
        while (temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
