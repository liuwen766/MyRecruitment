package com.liuwen.JVM虚拟机.并发编程;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @description:    限制线程的个数   限流
 * @author: Liu Wen
 * @create: 2020-03-14 20:50
 **/
public class SemaphoreTest {
    public static void main(String[] args){
        Semaphore semaphore = new Semaphore(5);
        for (int i = 0; i < 60; i++) {
            new Thread(()->{
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName()+"进店消费");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println(Thread.currentThread().getName()+"出店");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    semaphore.release();
                }
            }).start();
        }
    }
}
