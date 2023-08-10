package com.liuwen.leetCode.zijie;

import com.liuwen.练习.链表题.ListNode;

// 后端算法题：https://blog.csdn.net/qq_41822345/article/details/123122339
// 字节算法题
public class Solution {
    public static void main(String[] args) {
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
        ListNode listNode = reverseKGroup(root, 2);

    }


    // 25. K 个一组翻转链表
    // https://leetcode-cn.com/problems/reverse-nodes-in-k-group
    public static ListNode reverseKGroup(ListNode head, int k) {
        return new ListNode(0);
    }

    // 3. 无重复字符的最长子串
    // https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
    public static int lengthOfLongestSubstring(String s) {
        return 5;
    }
}



