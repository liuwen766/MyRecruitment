package com.liuwen.牛客网;

/**
 * @description: Good good study,day day up!
 * @author: Liu Wen
 * @create: 2020-03-08 16:25
 **/
public class Main14 {
    public static void main(String[] args){
        ListNode head = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        head.next = node1;node1.next=node2;node2.next=node3;
        node3.next=node4;node4.next=node5;node5.next=node6;
        ListNode result = FindKthToTail1(head,4);
        if(result!=null)
        System.out.println(result.value);

    }
    /**
     * @Description:  方法2：两个指针（类似于指针），一个先走k步，然后两个同时走。
      * @param head
     * @param i
     * @return com.liuwen.牛客网.ListNode
     * @date 20.3.8 22:28
     */
    public static ListNode FindKthToTail1(ListNode head, int i) {
        ListNode listNode1 = head;
        ListNode listNode2 = head;
        while (i>0){
            i--;
            if(listNode1!=null) {
                listNode1 = listNode1.next;
            }else {
                return null;
            }
        }
        while (listNode1!=null){
            listNode1=listNode1.next;
            listNode2=listNode2.next;
        }
        return listNode2;
    }
    /**
     * @Description:   方法1：先遍历，得到链表的长度size，再遍历到size-k即可。
      * @param head
     * @param k
     * @return com.liuwen.牛客网.ListNode
     * @date 20.3.8 20:58
     */
    public static ListNode FindKthToTail(ListNode head,int k) {
        ListNode result = null;
        int count = 0;
        ListNode tmp = head;
        while (tmp!=null){
            count++;
            tmp = tmp.next;
        }
        int flag = count-k;
        if(flag>=0){
            result = head;
            while (flag>0){
                result = result.next;
                flag--;
            }
        }
        return result;
    }
}

