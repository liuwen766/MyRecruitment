package com.liuwen.MyCSDN.并发编程进阶.第一章;

import java.util.concurrent.TimeUnit;

/**
 * @description:    验证程序的可见性
 * @author: Liu Wen
 * @create: 2020-03-26 23:13
 **/
public class Test01Visibility {
    public static boolean flag = true;
    public static void main(String[] args) throws InterruptedException {
        new Thread(()->{
            while (flag){

            }
        },"Thread-1").start();

        TimeUnit.SECONDS.sleep(2);

        new Thread(()->{
            flag = false;
            System.out.println(Thread.currentThread().getName()+"已经将flag改为:"+flag);
        },"Thread-2").start();
    }
}
