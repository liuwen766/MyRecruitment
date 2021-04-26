package com.liuwen.各公司笔试题.wind万得;

/**
 * @description: 给定一个单链表（无环），请判断是否是回文结构。在删除倒数第K个节点后，是否为回文结构。
 * (回文结构：从头到尾遍历节点的值序列结果，与从尾到头遍历的值序列结果是一样的)
 * @author: Liu Wen
 * @create: 2020-03-09 19:45
 **/
public class Main2 {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(5);
        ListNode listNode4 = new ListNode(3);
        ListNode listNode5 = new ListNode(2);
        ListNode listNode6 = new ListNode(1);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        int K = 3;
        Boolean[] res = isHuiWen(listNode1, K);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    /**
     * @param root
     * @param k
     * @return java.lang.Boolean[]
     * @Description: 回文判断，转成字符串在做对比
     * @date 20.3.9 19:50
     */
    private static Boolean[] isHuiWen(ListNode root, int k) {
        Boolean ans1 = false;
        Boolean ans2 = false;
        Boolean[] res = new Boolean[2];
        if (root == null) {
            res[0] = ans1;
            res[1] = ans2;
            return res;
        }
        //转为字符串
        StringBuffer stringBuffer = new StringBuffer();
        ListNode temp = root;
        while (temp != null) {
            stringBuffer.append(temp.value);
            temp = temp.next;
        }
        //第一个判断
        String s = stringBuffer.toString();
        String s1 = stringBuffer.reverse().toString();
        if (s.equals(s1)) {
            ans1 = true;
        }
        //第二个判断
        StringBuffer stringBuffer2 = new StringBuffer();
        for (int i = 0; i < stringBuffer.length(); i++) {
            if (i != s.length() - k) {         //倒数第K的数去掉
                stringBuffer2.append(s.charAt(i));
            }
        }
        System.out.println(stringBuffer2);
        String s2 = stringBuffer2.toString();
        String s3 = stringBuffer2.reverse().toString();
        if (s2.equals(s3)) {
            ans2 = true;
        }
        res[0] = ans1;
        res[1] = ans2;
        return res;
    }
}

/**
 * @param
 * @Description: 链表结点定义
 * @return
 * @date 20.3.9 19:54
 */
class ListNode {
    int value;
    ListNode next = null;

    public ListNode(int value) {
        this.value = value;
    }
}
