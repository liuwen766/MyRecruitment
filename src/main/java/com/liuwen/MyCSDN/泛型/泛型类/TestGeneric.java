package com.liuwen.MyCSDN.泛型.泛型类;

/**
 * @description: 泛型类的使用
 * @author: Liu Wen
 * @create: 2020-03-31 22:11
 **/
public class TestGeneric {
    public static void main(String[] args) {
        Generic<String> generic1 = new Generic<>("abc");
        String key1 = generic1.getKey();
        System.out.println("key1:" + key1);
        System.out.println("------------------------------");
        Generic<Integer> generic2 = new Generic<>(1);
        Integer key2 = generic2.getKey();
        System.out.println("key2:" + key2);
        System.out.println(generic1.getClass() == generic2.getClass());
    }
}
