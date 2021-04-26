package com.liuwen.JVM虚拟机.关键字synchronized.三个特性;

/**
 * @description: Good good study,day day up!
 * @author: Liu Wen
 * @create: 2020-03-31 13:38
 **/
public class 可重入 {
    public static void main(String[] args) {
        Object obj = new Object();
        Runnable sellTicket = new Runnable() {
            @Override
            public void run() {
                synchronized (obj) {
                    System.out.println("我是run");
                    test01();
                }
            }

            public void test01() {
                synchronized (obj) {
                    System.out.println("我是test01");
                }
            }
        };
        new Thread(sellTicket).start();
        new Thread(sellTicket).start();
    }
}
