package com.liuwen.JVM虚拟机.关键字synchronized.三个特性;

import java.util.concurrent.TimeUnit;

/**
 * @description:    验证可见性
 * @author: Liu Wen          一个线程对共享变量的修改,另一个线程不能立即得到最新值
 * @create: 2020-03-26 23:13
 **/
public class Test01Visibility {
    public static boolean flag = true;
//    public static volatile boolean flag = true;    //保证可见性
    public static void main(String[] args) throws InterruptedException {
        new Thread(()->{

            while (flag){
                // 增加对象共享数据的打印，println是同步方法
//                    System.out.println(flag);
            }
        },"Thread-1").start();

        TimeUnit.SECONDS.sleep(2);

        new Thread(()->{
            flag = false;
            System.out.println(Thread.currentThread().getName()+"已经将flag改为:"+flag);
        },"Thread-2").start();
    }
}
