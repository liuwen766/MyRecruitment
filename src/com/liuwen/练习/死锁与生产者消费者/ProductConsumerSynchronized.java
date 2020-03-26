package com.liuwen.练习.死锁与生产者消费者;
/**
 * @description:    生产者消费者模型  Synchronized锁实现
 * @author: Liu Wen
 * @create: 2020-03-10 22:26
 **/
public class ProductConsumerSynchronized {
    public static void main(String[] args){
        Data data = new Data();
        new Thread(()->{
            for (int i = 0; i < 30; i++) {
                data.increment();
            }
        },"生产者A生产+1，当前库存：").start();
        new Thread(()->{
            for (int i = 0; i < 30; i++) {
                data.decrement();
            }
        },"消费者B消费-1，当前库存：").start();
    }
    private static class Data{
        int num = 0;
        public synchronized void increment(){
             while (num==5){   //使用 while 可以多次检测，避免虚假唤醒的问题。
                System.out.println("仓库已满，暂时不能执行生产任务!");
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            num++;
            this.notify();
            System.out.println(Thread.currentThread().getName()+"→"+num);
        }
        public synchronized void decrement(){
            while (num==0){
                System.out.println("仓库已空，暂时不能执行消费任务!");
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.notify();
            num--;
            System.out.println(Thread.currentThread().getName()+"→"+num);
        }
    }
}


