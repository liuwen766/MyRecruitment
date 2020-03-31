package com.liuwen.MyCSDN.泛型.泛型是什么;

import java.util.ArrayList;

/**
 * @description:     泛型提出背景
 * @author: Liu Wen
 * @create: 2020-03-31 20:53
 **/
public class Demo01 {
    public static void main(String[] args){
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add("string");
        arrayList.add(true);
        for (Object obj : arrayList) {
            Integer i = (Integer) obj;
            System.out.println(i);
        }
    }
}
