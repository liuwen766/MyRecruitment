package com.liuwen.JVM虚拟机.并发编程;

/**
 * @description:         生产者消费者
 * @author: Liu Wen
 * @create: 2020-04-07 15:42
 **/
public class ProductConsumer {
    public static void main(String[] args){

        Num NUM = new Num();

        //线程Pro复杂生成
        new Thread(()->{
            for (int i = 0; i < 30; i++) {
                NUM.producter();
            }
        },"Pro").start();

        //线程Con复杂消费
        new Thread(()->{
            for (int i = 0; i < 30; i++) {
                NUM.consuer();
            }
        },"Con").start();

    }
}

class Num{
    private int num = 0;
    /*
    生产者
     */
    public synchronized void producter()  {
        while (num==5){      //当仓库满时
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            num++;
            this.notify();
            System.out.println(Thread.currentThread().getName()+num);
    }

    /*
    消费者
     */
    public synchronized void consuer() {
        while (num==0){     //当仓库空时
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        num--;
        this.notify();
        System.out.println(Thread.currentThread().getName()+num);
    }

}
