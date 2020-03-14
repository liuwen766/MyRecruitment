package com.liuwen.MyCSDN.并发编程;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/**
 * @description:         需求：0到20亿相加
 * @author: Liu Wen
 * @create: 2020-03-15 00:02
 **/
public class ForkJoinTest {
    public static void main(String[] args){
        Long startTime = System.currentTimeMillis();
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkJoinTask<Long> task = new ForkJoinDemo(0L,20_0000_0000L);
        forkJoinPool.execute(task);
        Long sum = 0L;
        try {
            sum = task.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println(sum+",耗时："+(endTime-startTime));

    }
}
/**
 * @Description:                 ForkJoin解决问题
 * @date 20.3.15 00:18
 */
class ForkJoinDemo extends RecursiveTask<Long>{
    private Long start;
    private Long end;
    private Long temp = 10_0000L;

    public ForkJoinDemo(Long start, Long end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        if((end-start)<temp){
            Long sum = 0L;
            for (Long i = start; i <= end; i++) {
                sum += i;
            }
            return sum;
        }else {
            Long avg = (start+end)/2;
            ForkJoinDemo task1 = new ForkJoinDemo(start,avg);
            task1.fork();
            ForkJoinDemo task2 = new ForkJoinDemo(avg,end);
            task2.fork();
            return task1.join()+task2.join();
        }

    }
}
