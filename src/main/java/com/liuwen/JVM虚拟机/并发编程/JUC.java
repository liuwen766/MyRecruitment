package com.liuwen.JVM虚拟机.并发编程;

import java.util.concurrent.TimeUnit;

/**
 * @description:          JUC：java.util.concurrent，JDK 提供的并发编程工具包。
 * @author: Liu Wen       是由一组类和接口组成，可以更好的支持高并发任务。
 * @create: 2020-03-14 16:03
 **/
public class JUC {
    public static void main(String[] args){

        //实现Runnable接口，还是耦合的写法。
        Account1 account = new Account1();
        new Thread(account, "A").start();
        new Thread(account, "B").start();
        new Thread(account, "C").start();

        //解耦：资源和任务分开。（实现Runnable接口，解耦的写法）
        Account2 account2 = new Account2();
        new Thread(()->{
            for (int i = 0; i < 5; i++) {
                account2.getCount();
            }
        },"解耦A").start();
        new Thread(()->{
            account2.getCount();
        },"解耦B").start();
    }
    /**
     * @Description:      解耦：资源和任务分开。（实现Runnable接口，解耦的写法）
     * @date 20.3.14 17:34
     */
    static class Account2{
        private static int num;
        public synchronized void getCount(){
            num++;
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"是第"+num+"位访客！");
        }

    }

    /**
     * @Description:      耦合：资源和任务写在了一起
     * @date 20.3.14 17:32
     */
   static class Account1 implements Runnable{
        private static int num;
        @Override
        public synchronized void run() {
            num++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"是第"+num+"位访客");
        }
    }

}
