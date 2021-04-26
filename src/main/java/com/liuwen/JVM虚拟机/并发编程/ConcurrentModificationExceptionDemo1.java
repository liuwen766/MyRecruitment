package com.liuwen.JVM虚拟机.并发编程;

import java.util.ArrayList;

/**
 * @description: 并发异常      多线程修改一个对象时会出现ConcurrentModificationException
 * @author: Liu Wen             真正的并发修改异常
 * @create: 2020-04-07 18:50
 **/
public class ConcurrentModificationExceptionDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        //多个线程对一个集合对象进行操作可能会出现并发修改异常
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                arrayList.add(5);
                System.out.println(arrayList);
            }, "线程" + i).start();
        }
    }
}
