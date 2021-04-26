package com.liuwen.Java8新特性.Character04Parallel;

import org.junit.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.LongStream;

/**
 * ----------------------------------------------------------------------
 *
 * @description: ForkJoin框架适合做任务耗时长的大数据量任务。
 * @author: Create by Liu Wen at 2020-07-16 11:14
 * ----------------------------------------------------------------------
 **/

public class ForkJoinTest {

    /**
     * @Description: 使用ForkJoin框架
     * @date 20.7.16 14:22
     */
    @Test
    public void test01() {
        //当前计时
        Instant start = Instant.now();

        //ForkJoin线程池用于执行fork/join线程子任务
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        //父类引用，实例化子类（多态？）
        ForkJoinTask<Long> task = new ForkJoinCalculate(0, 50000000000L);
        //叫线程池来干活
        Long sum = forkJoinPool.invoke(task);
        System.out.println(sum);

        //当前计时
        Instant end = Instant.now();
        //总耗时 毫秒
        System.out.println("Forkjoin框架总耗时:" + Duration.between(start, end).toMillis() + "毫秒");

    }

    /**
     * @Description: 使用传统方法
     * @date 20.7.16 14:21
     */
    @Test
    public void test02() {

        Instant start = Instant.now();

        long sum = 0;
        for (long i = 0; i <= 50000000000L; i++) {
            sum += i;
        }
        System.out.println(sum);

        Instant end = Instant.now();
        System.out.println("普通方法总耗时:" + Duration.between(start, end).toMillis() + "毫秒");
    }

    /**
     * @Description: Java8 新特性：并行流
     * @date 20.7.16 14:28
     */
    @Test
    public void test() {
        Instant start = Instant.now();

        long reduce = LongStream.rangeClosed(0, 50000000000L)
//                .sequential()      //串行   Java串行流总耗时:65251毫秒
                .parallel()        //并行  Java并行流总耗时:5128毫秒
                .reduce(0, Long::sum);
        System.out.println(reduce);

        Instant end = Instant.now();
        System.out.println("Java并行流总耗时:" + Duration.between(start, end).toMillis() + "毫秒");
    }


}
