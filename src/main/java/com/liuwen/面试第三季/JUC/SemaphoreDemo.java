package com.liuwen.面试第三季.JUC;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * ----------------------------------------------------------------------
 * @author Create by liu wen at 2021.12.1 22:58
 * <p>
 * ----------------------------------------------------------------------
 */
public class SemaphoreDemo {
    public static void main(String[] args) {
        //同时只能进5个人
        Semaphore lock = new Semaphore(5);
        for (int i = 0; i < 15; i++) {
            new Thread(()->{
                try {
                    //获得许可
                    lock.acquire();
                    System.out.println(Thread.currentThread().getName()+"进店购物");
                    TimeUnit.SECONDS.sleep(5);
                    System.out.println(Thread.currentThread().getName()+"出店");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    //释放许可
                    lock.release();
                }
            },String.valueOf(i)).start();
        }
    }
}
