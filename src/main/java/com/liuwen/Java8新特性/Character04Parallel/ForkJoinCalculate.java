package com.liuwen.Java8新特性.Character04Parallel;

import java.util.concurrent.RecursiveTask;

/**
 * ----------------------------------------------------------------------
 * @description:     ForkJoin框架
 * @author: Create by Liu Wen at 2020-07-16 11:19
 * ----------------------------------------------------------------------
 **/
//继承RecursiveTask/RecursiveAction  使用fork/join框架
public class ForkJoinCalculate extends RecursiveTask<Long>{

    /**
     * @Description:   版本信息号
     */
    private static final long serialVersionUID =121223232165456465L;

    private long start;
    private long end;

    // 拆分门限值
    private static final long threshold = 10000;

    // 构造器
    public ForkJoinCalculate(long start, long end) {
        this.start = start;
        this.end = end;
    }

    /**
     * @Description:  fork/join计算
     * @date 20.7.16 13:55
     */
    @Override
    public Long compute(){
        long length = end - start;
        long sum = 0L;
        if(length<= threshold){
            for (long i = start; i <= end; i++) {
                sum += i;
            }
            return sum;
        }else {
            long middle = (end-start)/2+start;
            ForkJoinCalculate left = new ForkJoinCalculate(start,middle);
            left.fork();  //拆分子任务，同时压入线程队列

            ForkJoinCalculate right = new ForkJoinCalculate(middle+1,end);
            right.fork();
            //获取子任务的计算结果
            return left.join()+right.join();
        }

    }

}
