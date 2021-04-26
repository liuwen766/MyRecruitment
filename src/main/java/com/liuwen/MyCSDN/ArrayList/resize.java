package com.liuwen.MyCSDN.ArrayList;

import java.util.ArrayList;

/**
 * @description: ArrayList频繁扩容导致添加性能急剧下降，如何处理？
 * @author: Liu Wen
 * @create: 2020-04-03 12:54
 **/
public class resize {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>(10000);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i + "");
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
