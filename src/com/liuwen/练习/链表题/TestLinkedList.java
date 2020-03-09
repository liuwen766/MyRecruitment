package com.liuwen.练习.链表题;

/**
 * @description: Good good study,day day up!
 * @author: Liu Wen
 * @create: 2020-02-28 13:49
 **/
public class TestLinkedList {
    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        //方法1：添加头结点
        linkedList.addHead(4);
        linkedList.addHead(3);
        linkedList.addHead(1);
        linkedList.addHead(5);
        //方法2：添加尾节点
        linkedList.addTail(6);
        linkedList.addTail(7);
        linkedList.addTail(8);
        linkedList.addTail(9);
        linkedList.addTail(10);

        //方法3：显示
        linkedList.display();
        //方法4：删除头结点
        linkedList.removeHead();
        System.out.println();
        System.out.println("删除头结点:");
        linkedList.display();
        //方法5：删除尾节点
        linkedList.removeTail();
        System.out.println();
        System.out.println("删除尾部结点:");
        linkedList.display();
        //方法6：删除指定结点
        Node node = new Node(3);
        linkedList.removeByNode(node);
        System.out.println();
        System.out.println("删除指定结点:"+node.value);
        linkedList.display();
        //方法7：修改指定index的结点
        int index = 3;
        linkedList.setNode(index,node);
        System.out.println();
        System.out.println("修改"+index+"处的结点为:"+node.value);
        linkedList.display();
        //方法8：查找结点。根据index，返回node
        int index2 = 5;
        Node result  = linkedList.findByIndex(index2);
        System.out.println();
        if(result!=null)
            System.out.println("index:" + index2 + "处的结点为:" + result.value);
        else
        System.out.println("index:"+index2+"处的结点为:"+result);
        //方法9：查找结点。根据node，返回index
        Node node2 = new Node(8);
        System.out.println("结点"+node2.value+"的index为："+linkedList.findByNode(node2));
        //方法10：获取链表的大小
        System.out.println("链表的大小："+linkedList.size());
//************************************************************************************
        /* 1. 求单链表中结点的个数: getListLength
         * 2. 将单链表反转: reverseList（遍历），reverseListRec（递归）
         * 3. 查找单链表中的倒数第K个结点（k > 0）: reGetKthNode
         * 4. 查找单链表的中间结点: getMiddleNode
         * 5. 从尾到头打印单链表: reversePrintListStack，reversePrintListRec（递归）
         * 6. 已知两个单链表pHead1 和pHead2 各自有序，把它们合并成一个链表依然有序: mergeSortedList, mergeSortedListRec
         * 7. 判断一个单链表中是否有环: hasCycle
         * 8. 判断两个单链表是否相交: isIntersect
         * 9. 求两个单链表相交的第一个节点: getFirstCommonNode
         * 10. 已知一个单链表中存在环，求进入环中的第一个节点: getFirstNodeInCycle, getFirstNodeInCycleHashMap
         * 11. 给出一单链表头指针pHead和一节点指针pToBeDeleted，O(1)时间复杂度删除节点pToBeDeleted: delete
         * */
        System.out.println("1.单链表中结点的个数:"+linkedList.getListLength());

        System.out.println("原链表：");
        linkedList.display();
        Node newhead = linkedList.reverseList();
        System.out.println();
        System.out.println("2.单链表反转:");
        linkedList.display(newhead);
        System.out.println();
        System.out.println("2.单链表反转2:");
        Node newHead2 = linkedList.reverseListRec(newhead);
        linkedList.display(newHead2);

    }
}
