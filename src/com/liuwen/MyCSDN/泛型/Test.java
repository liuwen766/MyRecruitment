package com.liuwen.MyCSDN.泛型;

import java.util.ArrayList;

/**
 * @description:    类型擦除
 * @author: Liu Wen
 * @create: 2020-03-19 15:45
 **/
public class Test {
    public static void main(String[] args){
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("abc");

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(123);

        System.out.println(list1.getClass() == list2.getClass());
    }
}
