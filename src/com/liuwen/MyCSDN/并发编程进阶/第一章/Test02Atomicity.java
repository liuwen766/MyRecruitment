package com.liuwen.MyCSDN.并发编程进阶.第一章;

import java.util.ArrayList;

/**
 * @description:    验证原子性
 * @author: Liu Wen
 * @create: 2020-03-26 23:26
 **/
public class Test02Atomicity {
    private static int number = 0;
    public static void main(String[] args) throws InterruptedException{
        Runnable runnable = ()->{
            for (int i = 0; i < 1000; i++) {
                number++;
            }
        };

        ArrayList<Thread> arrayList = new ArrayList<>();
        //开启五个线程运行runnable任务。
        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(runnable);
            t.start();
            arrayList.add(t);
        }

        //为了避免main主线程先执行完毕
        for (Thread t : arrayList) {
            t.join();
        }

        System.out.println("number:"+number);

    }
}
