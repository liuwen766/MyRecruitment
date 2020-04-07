package com.liuwen.JVM虚拟机.并发编程;

import java.util.concurrent.TimeUnit;

/**
 * @description:              死锁的实现
 * @author: Liu Wen
 * @create: 2020-04-07 15:42
 **/
public class DeadLockDemo {
    public static void main(String[] args) {
        DeadLock deadLock1 = new DeadLock(1);
        DeadLock deadLock2 = new DeadLock(2);
        //两个线程
        new Thread(()->{
            try {
                deadLock1.lock();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(()->{
            try {
                deadLock2.lock();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}

//锁
class Data{}

//死锁的实现
class DeadLock{

    private int num;
    private static Data data1 = new Data();    //静态锁
    private static Data data2 = new Data();    //静态锁

    public DeadLock(int num) {
        this.num = num;
    }

    public void lock() throws InterruptedException {
        if (num==1){
            System.out.println(Thread.currentThread().getName()+"持有锁!");
            synchronized (data1){
                TimeUnit.SECONDS.sleep(2);
                synchronized (data2){
                    System.out.println(Thread.currentThread().getName()+"释放锁!");
                }
            }
        }
        if(num==2){
            synchronized (data2){
                System.out.println(Thread.currentThread().getName()+"持有锁!");
                TimeUnit.SECONDS.sleep(2);
                synchronized (data1){
                    System.out.println(Thread.currentThread().getName()+"释放锁!");
                }
            }
        }

    }
}

