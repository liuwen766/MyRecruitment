package com.liuwen.JVM虚拟机.并发编程;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

/**
 * @description:       每执行多少个线程任务，放行一次。  对执行的线程数进行计数
 * @author: Liu Wen
 * @create: 2020-03-14 20:26
 **/
public class CyclicBarrierTest {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(30,()->{
            System.out.println("放行");
        });
        for (int i = 1; i < 91; i++) {
            final int temp = i;
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"-------->"+temp);
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();

        }
    }
}
