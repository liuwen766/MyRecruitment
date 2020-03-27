package com.liuwen.JVM虚拟机.并发编程;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @description:             线程池
 * @author: Liu Wen
 * @create: 2020-03-14 21:42
 **/
public class ThreadPoolTest {
    public static void main(String[] args){
          //指定线程数，固定的个数
        ExecutorService executorService = Executors.newFixedThreadPool(5);
          //单列线程池
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
        //线程池个数看电脑配置
//        ExecutorService executorService = Executors.newCachedThreadPool();
        //安排5个，但是也可以灵活变化
//        ExecutorService executorService = Executors.newScheduledThreadPool(5);
        for (int i = 0; i < 10; i++) {
            final int temp = i;
            executorService.execute(()->{
               System.out.println(Thread.currentThread().getName()+":"+ temp);
            });
        }
        executorService.shutdown();
    }
}
