package com.liuwen.练习.链表题;

/**
 * @description:   查找单链表中的倒数第K个结点（k > 0）: reGetKthNode
 * @author: Liu Wen
 * @create: 2020-03-25 20:18
 **/
public class Main3 {
    public static void main(String[] args){
        ListNode root = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        root.next = node1;node1.next = node2;node2.next = node3;
        node3.next = node4;node4.next = node5;node5.next = node6;
        int k = 0;
        ListNode result = reGetKthNode(root,k);
        if(result!=null)
        System.out.println("倒数第"+k+"个结点是:"+result.value);
        else
            System.out.println("输入k:"+k+"不在链表长度范围内!");
    }
    /**
     * @Description:     双指针思想。
     * @date 20.3.25 22:31
     */
    private static ListNode reGetKthNode(ListNode root,int k) {
        if(root==null)
            return root;
        ListNode temp = root;
        while (temp!=null && k >0){
            temp = temp.next;
            k--;
        }
        if(temp == null){
            return null;
        }
        ListNode temp2 = root;
        while (temp!=null){
            temp = temp.next;
            temp2 = temp2.next;
        }
        return temp2;
    }
}
