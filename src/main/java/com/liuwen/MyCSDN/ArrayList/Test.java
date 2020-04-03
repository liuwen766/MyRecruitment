package com.liuwen.MyCSDN.ArrayList;

import java.util.ArrayList;

/**
 * @description: Good good study,day day up!
 * @author: Liu Wen
 * @create: 2020-04-02 20:24
 **/
public class Test {

    public static void main(String[] args){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(5);
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<String> arrayList = new ArrayList<>(5);
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("e");
        arrayList.add("f");
        arrayList.add("g");
        for (String s:arrayList) {
         System.out.print(s);
        }

    }
}
