package com.liuwen.MyCSDN.ArrayList;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @description: Good good study,day day up!
 * @author: Liu Wen
 * @create: 2020-04-03 14:40
 **/
public class copyOnWrite {
    public static void main(String[] args) throws InterruptedException{
        CopyOnWriteArrayList<String> arr = new CopyOnWriteArrayList<>();
//        ArrayList<String> arr = new ArrayList<>();
        arr.add("tom");
        arr.add("jerry");
        arr.add("Jmmy");
        for (int i = 0; i < 5; i++) {
            new Thread(()->{
                for (String var:arr) {
                    System.out.print(var+" ");
                    arr.add("coco");
                }
                System.out.println();
            }).start();

        }
        Thread.sleep(5);
        System.out.println(arr);
    }
}
