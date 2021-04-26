package com.liuwen.MyCSDN.集合类;

import java.util.*;

/**
 * @description: ArrayList和LinkedList 是List接口的实现类
 * @author: Liu Wen           HashSet就是hashMap，TreeSet默认升序
 * @create: 2020-03-13 12:11
 **/
public class ArrayList_LinkedList_HashSet_TreeSet {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        HashSet hashSet = new HashSet();  //  public HashSet() {map = new HashMap<>();  HashSet其实就是HashMap
        TreeSet treeSet = new TreeSet();

        System.out.println(arrayList);
        System.out.println(linkedList);
        System.out.println(hashSet);
        System.out.println(treeSet);
    }
}
