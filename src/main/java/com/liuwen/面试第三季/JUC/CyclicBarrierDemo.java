package com.liuwen.面试第三季.JUC;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * ----------------------------------------------------------------------
 * @author Create by liu wen at 2021.12.1 22:53
 * <p>
 * ----------------------------------------------------------------------
 */
public class CyclicBarrierDemo {
    public static void main(String[] args) {
        //定义一个计数器，当计数器的值累加到10，输出"放行"
        CyclicBarrier lock = new CyclicBarrier(10,()->{
            System.out.println("放行");
        });
        for (int i = 1; i <= 90; i++) {
            final int temp = i;
            new Thread(()->{
                System.out.println("-->"+temp);
                try {
                    lock.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }

    }
}
