package com.liuwen.JVM虚拟机.并发编程;

import java.util.Vector;

/**
 * @description: ConcurrentModificationException解决方案1
 * @author: Liu Wen
 * @create: 2020-04-08 09:53
 **/
public class CMSSolve1 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                vector.add(10);
                System.out.println(vector);
            }).start();
        }
    }
}
