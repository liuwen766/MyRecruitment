package com.liuwen.各公司笔试题.上海途虎春招;

import java.util.concurrent.TimeUnit;

/**
 * @description:   死锁
 * @author: Liu Wen
 * @create: 2020-03-18 18:33
 **/
public class Main3 {
    public static void main(String[] args){
        DeadLock deadLock1 = new DeadLock(1);
        DeadLock deadLock2 = new DeadLock(2);
        new Thread(()->{
            deadLock1.lock();
        },"deadLock1").start();
        new Thread(()->{
            deadLock2.lock();
        },"deadLock2").start();
    }

}
class Data{}
class DeadLock{
    private int num;
    private static Data data1 = new Data();
    private static Data data2 = new Data();

    public DeadLock(int num) {
        this.num = num;
    }
    public void lock(){
        if(num==1){
            System.out.println("我是线程"+Thread.currentThread().getName());
            synchronized (data1){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (data2){
                    System.out.println("我是线程"+Thread.currentThread().getName());
                }
            }
        }
        if(num==2){
            System.out.println("我是线程"+Thread.currentThread().getName());
            synchronized (data2){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (data1){
                    System.out.println("我是线程"+Thread.currentThread().getName());
                }
            }
        }
    }
}
