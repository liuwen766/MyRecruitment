package com.liuwen.练习.辅助;

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
/**
 * @description: 链表的创建（链表结点的增、删、改、查）
 * @author: Liu Wen
 * @create: 2020-02-28 13:49
 **/
public class LinkedList {
    public Node head;    //定义链表的头结点

    //可以链表结点定义在内部类，也可以定义在外部。
//    public class Node{
//        public Node next;
//        public int value;
//
//        public Node(int value){
//            this.value = value;
//        }
//    }
    //方法1：头部添加结点
    public void addHead(int value){
        Node newNode = new Node(value);
        if(head==null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }
    //方法2：尾部添加结点
    public void addTail(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        }else{
            Node tmp = head;
            while (tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = newNode;
        }
    }
    //方法3：显示打印（遍历）
    public void display(){
        if(head==null){
            System.out.print("null");
        }else {
            Node tmp = head;
            while (tmp != null) {
                System.out.print(tmp.value+"-->");
                tmp = tmp.next;
            }
        }
    }
    public void display(Node head){
        if(head==null){
            System.out.print("null");
        }else {
            Node tmp = head;
            while (tmp != null) {
                System.out.print(tmp.value+"-->");
                tmp = tmp.next;
            }
        }
    }
    //方法4：删除头结点
    public void removeHead(){
        if(head==null){
            return;
        }else {
            head = head.next;
        }
    }
    //方法5：删除尾节点
    public void removeTail(){
        if(head == null){
            return;
        }
        if(head.next==null){
            head = null;
        }else {
            Node tmp = head;
            while (tmp.next.next != null) {
                tmp = tmp.next;
            }
            tmp.next = null;
        }
    }
    //方法6：删除指定结点（传入node）
    public void removeByNode(Node node){
        Node tmp = head;
        if(node.value == tmp.value){  //若是头结点
            removeHead();
        }else {            //说明不是头结点
            while (tmp != null) {
                if(tmp.next!=null)
                if (tmp.next.value == node.value) {
                    tmp.next = tmp.next.next;
                    break;
                }
                tmp = tmp.next;
            }
        }
    }
    //方法7：修改节点的信息, 根据no编号来修改，即no编号不能改.
    public void setNode(int index,Node node){
        int size = size();
        if(index > 0 && index <= size){
            Node tmp = head;
            for (int i = 0; i < index-1; i++) {
                tmp = tmp.next;
            }
            tmp.value = node.value;
        }
    }
    //方法8：查找结点。根据index，返回node
    public Node findByIndex(int index) {
        int size2 = size();
        Node tmp = head;
        if (index > 0 && index <= size2) {
            for (int i = 0; i < index - 1; i++) {
                tmp = tmp.next;
            }
        }else {
            tmp = null;
        }
        return tmp;
    }
    //方法9：查找结点。根据node，返回index
    public int findByNode(Node node){
        int index = 1;
        Node tmp = head;
        while (tmp!=null){
            if(tmp.value==node.value){
                return index;
            }
            index++;
            tmp = tmp.next;
        }
        return 0;
    }
    //方法10：获取到单链表的节点的个数(如果是带头结点的链表，需求不统计头节点)
    public int size(){
        int num = 0;
        if(head==null){
            return num;
        }
        Node tmp = head;
        while (tmp != null){
            num++;
            tmp = tmp.next;
        }
        return num;
    }
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

    // * 1. 求单链表中结点的个数: getListLength
    public int getListLength(){
        return size();
    }

    // * 2. 将单链表反转: reverseList（遍历），reverseListRec（递归）
    public Node reverseList(){
        if(head == null||head.next == null){
            return head;
        }
        Node tmp = head;
        Node newHead = null;
        while(tmp!=null){
            Node pretmp = tmp;       //保存当前结点
            tmp = tmp.next;          //更新tmp
            pretmp.next = newHead;   //当前结点的next引用更新
            newHead = pretmp;        //newHead指向要处理结点的前一结点（即当前结点）
        }
        return newHead;
    }
    //递归
    public Node reverseListRec(Node head){
        if(head == null||head.next==null) {
            return head;
        }
        Node newHead = reverseListRec(head.next);
        head.next.next = head;		// 把head接在reHead串的最后一个后面
        head.next = null;				// 防止循环链表
        return newHead;
    }
    // * 3. 查找单链表中的倒数第K个结点（k > 0）: reGetKthNode
    public int reGetKthNode(){

        return 0;
    }

    // * 4. 查找单链表的中间结点: getMiddleNode
    // * 5. 从尾到头打印单链表: reversePrintListStack，reversePrintListRec（递归）
    // * 6. 已知两个单链表pHead1 和pHead2 各自有序，把它们合并成一个链表依然有序: mergeSortedList, mergeSortedListRec
    // * 7. 判断一个单链表中是否有环: hasCycle
    // * 8. 判断两个单链表是否相交: isIntersect
    // * 9. 求两个单链表相交的第一个节点: getFirstCommonNode
    // * 10. 已知一个单链表中存在环，求进入环中的第一个节点: getFirstNodeInCycle, getFirstNodeInCycleHashMap
    // * 11. 给出一单链表头指针pHead和一节点指针pToBeDeleted，O(1)时间复杂度删除节点pToBeDeleted: delete


}
