package com.liuwen.MyCSDN.并发编程;

import java.util.concurrent.*;

/**
 * @description:               线程池：7大参数、四种拒绝策略
 * @author: Liu Wen
 * @create: 2020-03-14 22:28
 **/
public class ThreadPoolSource {
    public static void main(String[] args){
        ExecutorService executorService = new ThreadPoolExecutor(
                2,
                3,
                1L,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(2),
                Executors.defaultThreadFactory(),                 //四种拒绝策略：
//                new ThreadPoolExecutor.AbortPolicy()            //抛出异常
//                new ThreadPoolExecutor.DiscardPolicy()          //不抛出异常（不管不顾）
//                 new ThreadPoolExecutor.DiscardOldestPolicy()   //会与workQueue中的第一个竞争
                new ThreadPoolExecutor.CallerRunsPolicy()         //谁调用谁处理
        );
    }
}
