package com.liuwen.JVM虚拟机.关键字synchronized.三个特性;

import java.util.concurrent.TimeUnit;

/**
 * @description:    验证可见性
 * @author: Liu Wen
 * @create: 2020-03-26 23:13
 **/
public class Test01Visibility {
    public static boolean flag = true;
//    public static volatile boolean flag = true;    //保证可见性
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
