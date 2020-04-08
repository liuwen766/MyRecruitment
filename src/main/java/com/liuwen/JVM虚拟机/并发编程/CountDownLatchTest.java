package com.liuwen.JVM虚拟机.并发编程;

import java.util.concurrent.CountDownLatch;

/**
 * @description:        减法计数器，对子线程的执行次数进行限制
 * @author: Liu Wen
 * @create: 2020-03-14 20:25
 **/
public class CountDownLatchTest {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(100);
        new Thread(()->{
            for (int i = 0; i < 99; i++) {
                System.out.println(i);
                countDownLatch.countDown();
            }
        }).start();

        countDownLatch.await();

        for (int i = 100; i < 110; i++) {
            System.out.println(i);
        }
    }
}
