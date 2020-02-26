package com.liuwen.练习.辅助;

/**
 * @description: 链表的创建
 * @author: Liu Wen
 * @create: 2020-02-26 15:17
 **/
//创建链表
public class LinkList {
    public Node head;

    public LinkList(){
        head = new Node();
    }

    //头结点添加
    public void addFirst(int val){
        Node newNode = new Node(val);
        if(head==null){
            head = newNode;
        }
        newNode.next = head;
        head = newNode;
    }
    //尾结点添加
    public void addLast(int val){
    }

    //显示链表[遍历]
    public void display(){
        if(head==null||head.next==null){
            System.out.println(head.value);
        }
        Node tmp = head;
        while(tmp.next!=null){
            System.out.print(tmp.value+"->");
            tmp = tmp.next;
        }
    }


    //删除节点
    //思路
    //1. head 不能动，因此我们需要一个temp辅助节点找到待删除节点的前一个节点
    //2. 说明我们在比较时，是temp.next.no 和  需要删除的节点的no比较
    public void remove(){

    }

    //修改节点的信息, 根据no编号来修改，即no编号不能改.
    public void set(int index,Node node){

    }

    //查找单链表中的倒数第k个结点 【新浪面试题】

    //获取到单链表的节点的个数(如果是带头结点的链表，需求不统计头节点)
    public int size(){
        return 0;
    }

    //将单链表反转

    //逆序打印链表
}