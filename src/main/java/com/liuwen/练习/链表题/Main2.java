package com.liuwen.练习.链表题;

/**
 * @description:   将单链表反转: reverseList（遍历），reverseListRec（递归）
 * @author: Liu Wen
 * @create: 2020-03-25 20:17
 **/
public class Main2 {
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
        print(root);
        ListNode newRoot = reverseList(root);
//        ListNode newRoot = reverseListRec(root);
        System.out.println();
        print(newRoot);

    }
    /**
     * @Description:    递归实现(代码简洁)
     * @date 20.3.25 22:31
     */
    private static ListNode reverseListRec(ListNode root) {
        if(root==null||root.next==null)    //递归截止条件
            return root;
        ListNode newHead = reverseListRec(root.next);
        root.next.next=root;               //防止出现闭环
        root.next=null;
        return newHead;
    }
    /**
     * @Description:    非递归实现
     * @date 20.3.25 22:31
     */
    private static ListNode reverseList(ListNode root) {
        if(root==null)
            return root;
        ListNode newHead = null;
        ListNode temp = null;
        ListNode cur = root;
        while (cur!=null){
            temp = cur;
            cur = cur.next;
            temp.next = newHead;
            newHead = temp;
        }
        return newHead;
    }

    public static void print(ListNode node){
        ListNode temp = node;
        while (temp != null){
            if(temp.next == null)
                System.out.print(temp.value);
            else
                System.out.print(temp.value+"→");
            temp = temp.next;
        }
    }
}
