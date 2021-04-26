package com.liuwen.JVM虚拟机.并发编程;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/**
 * @description: ConcurrentModificationException解决方案3
 * @author: Liu Wen
 * @create: 2020-04-08 09:55
 **/
public class CMSSolve3 {

    public static void main(String[] args) {
        List<Integer> arrayList = new CopyOnWriteArrayList<>();
        //多个线程对一个集合对象进行操作可能会出现并发修改异常
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                arrayList.add(8);
                System.out.println(arrayList);
            }, "线程" + i).start();
        }
    }
}
