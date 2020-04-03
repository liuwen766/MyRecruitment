package com.liuwen.MyCSDN.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @description: Good good study,day day up!
 * @author: Liu Wen
 * @create: 2020-04-03 12:04
 **/
public class iterator {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("aa");
        arrayList.add("bb");
        arrayList.add("cc");
        arrayList.add("dd");

        Iterator<String> iterator = arrayList.iterator();
//        while (iterator.hasNext()){
//            String s = iterator.next();
//            if(s.equals("dd"))
//                iterator.remove();
//            System.out.println(s);
//        }
        arrayList.clear();
        System.out.println(arrayList);
    }
}
