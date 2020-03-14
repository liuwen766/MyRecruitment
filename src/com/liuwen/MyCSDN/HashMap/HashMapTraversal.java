package com.liuwen.MyCSDN.HashMap;

import java.util.*;

/**
 * @description:      HashMap的遍历方法
 * @author: Liu Wen
 * @create: 2020-03-13 13:10
 **/
public class HashMapTraversal {
    public static void main(String[] args){
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"西西");
        hashMap.put(2,"刘稳");
        hashMap.put(3,"康康");
        hashMap.put(4,"金玉");
        Traversal1(hashMap);          //建议
        Traversal2(hashMap);
        Traversal3(hashMap);          //建议
        Traversal4(hashMap);          //不建议

        int[] arr = {1,5,3,6};
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(8);
        arrayList.add(5);
        arrayList.add(2);
        Collections.sort(arrayList);
        for (Integer a:arrayList) {
            System.out.println(a);
        }

    }
   /**
     * @Description: 方法1：使用For-Each迭代entrySet ——— 当key和value都需要的时候
     * @date 20.3.13 13:20
     */
    public static void Traversal1(HashMap<Integer, String> hashMap) {
        System.out.println();
        for (HashMap.Entry<Integer,String> map:hashMap.entrySet()) {
            System.out.print(map.getKey()+": "+map.getValue());
        }
    }
   /**
    * @Description:  方法2：使用For-Each迭代keys和values ———key和value只需要其中之一时
    * @date 20.3.13 13:22
    */
    private static void Traversal2(HashMap<Integer, String> hashMap) {
        System.out.println();
        for (Integer key : hashMap.keySet()) {
            System.out.print(key+" ");
        }

        System.out.println();

        for (String value:hashMap.values()) {
            System.out.print(value+" ");
        }
    }
    /**
     * @Description:  方法3 使用Iterator迭代 ———万金油方法（迭代器）
     * @date 20.3.13 13:25
     */
    private static void Traversal3(HashMap<Integer, String> hashMap) {
        System.out.println();
        Iterator iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()){
//            Map.Entry entry = (Map.Entry)iterator.next();
//            System.out.print(entry.getKey()+"-"+entry.getValue());
            System.out.print(iterator.next()+" ");
        }
    }
    /**
     * @Description:  方法4 迭代keys并搜索values（低效的） ———最慢的方法
     * @date 20.3.13 13:26
     */
    private static void Traversal4(HashMap<Integer, String> hashMap) {
        System.out.println();
        for (Integer key:hashMap.keySet()) {
            String value = hashMap.get(key);
            System.out.print(key+"+"+value+" ");
        }
    }
}
