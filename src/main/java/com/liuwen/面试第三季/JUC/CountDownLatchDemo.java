package com.liuwen.面试第三季.JUC;

import lombok.val;

import java.util.concurrent.CountDownLatch;

/**
 * ----------------------------------------------------------------------
 *
 * @author Create by liu wen at 2021.12.1 22:47
 * <p>
 * ----------------------------------------------------------------------
 */
public class CountDownLatchDemo {
    public static void main(String[] args) {
//优先执行，执行完毕之后，才能执行 main
        //1、实例化计数器，100
        CountDownLatch lock = new CountDownLatch(20);
        new Thread(() -> {
            for (int i = 0; i < 15; i++) {
                System.out.println("++++++++++Thread---"+i);
                lock.countDown();
            }
        }).start();
        for (int i = 0; i < 5; i++) {
            System.out.println("---"+i);
            lock.countDown();
        }
        //2、调用 await 方法
        try {
            lock.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 20; i++) {
            System.out.println("main--------------"+i);
        }

    }
}
