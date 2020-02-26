package com.liuwen.练习.链表题;

import com.liuwen.练习.辅助.LinkList;

/**
 * @description: 链表的创建，包括添加、显示、删除、修改
 * @author: Liu Wen
 * @create: 2020-02-25 14:50
 **/
public class LinkedList {
    public static void main(String[] args){
        //先创建头节点
        LinkList linkList = new LinkList();
        //创建要给的链表
        linkList.addFirst(1);
        linkList.addFirst(2);
        linkList.addFirst(3);
        linkList.addLast(15);
        linkList.display();
        //显示一把
        int i = 0;


        //测试修改节点的代码

        //删除一个节点

        // 测试一下单链表的反转功能

        //测试一下 求单链表中有效节点的个数

        //测试一下看看是否得到了倒数第K个节点

    }





}
