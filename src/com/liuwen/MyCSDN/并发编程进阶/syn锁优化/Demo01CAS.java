package com.liuwen.MyCSDN.并发编程进阶.syn锁优化;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description: Good good study,day day up!
 * @author: Liu Wen
 * @create: 2020-03-27 09:11
 **/
public class Demo01CAS {
    private static AtomicInteger atomicInteger = new AtomicInteger(0);
    public static void main(String[] args) throws InterruptedException{
        Runnable runnable = ()->{
            for (int i = 0; i < 1000; i++) {
               atomicInteger.incrementAndGet();
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

        System.out.println("number:"+atomicInteger);

    }
}
