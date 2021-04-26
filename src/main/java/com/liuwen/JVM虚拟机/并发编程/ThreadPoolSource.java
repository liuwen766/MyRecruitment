package com.liuwen.JVM虚拟机.并发编程;

import java.util.concurrent.*;

/**
 * @description: 线程池：7大参数、四种拒绝策略
 * @author: Liu Wen
 * @create: 2020-03-14 22:28
 **/
public class ThreadPoolSource {
    public static void main(String[] args) {
        ExecutorService executorService = new ThreadPoolExecutor(
                2,
                3,
                1L,
                TimeUnit.SECONDS,                               //时间单位
                new ArrayBlockingQueue<>(2),            //workQueue：工作队列，阻塞队列
                Executors.defaultThreadFactory(),               //线程工厂，用来创建线程对象

//                new ThreadPoolExecutor.AbortPolicy()          //抛出异常
//                new ThreadPoolExecutor.DiscardPolicy()        //不抛出异常（不管不顾）
//                 new ThreadPoolExecutor.DiscardOldestPolicy() //会与workQueue中的第一个竞争
                new ThreadPoolExecutor.CallerRunsPolicy()       //谁调用谁处理
        );
    }
}
