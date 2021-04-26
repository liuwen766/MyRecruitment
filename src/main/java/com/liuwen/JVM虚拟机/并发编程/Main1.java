package com.liuwen.JVM虚拟机.并发编程;

/**
 * @description: 多线程？
 * @author: Liu Wen               并发编程是指使系统允许多个任务在重叠的时间段内执行的设计结构。（不一定是同时执行）
 * @create: 2020-03-14 11:51      高并发是指我们设计的程序，可以支持海量任务的同时执行（任务的执行在时间段上有重叠的情况）
 **/
public class Main1 {
    /*
    为什么要用多线程？
     以前我认为多线程的作用就是提升性能。
    实际上，多线程并不一定能提升性能（甚至还会降低性能）；多线程也不只是为了提升性能。
     1、避免阻塞（类似异步调用）  eg：ajax
     2、避免CPU空转               eg：访问服务器server，CPU处理请求
     3、提升性能
     */
    /*
     线程池的基本参数有哪些?
    corePoolSize：线程池的核心大小，也可以理解为最小的线程池大小。
    maximumPoolSize：最大线程池大小。
    keepAliveTime：空余线程存活时间，指的是超过corePoolSize的空余线程达到多长时间才进行销毁。
    unit：销毁时间单位。
    workQueue：存储等待执行线程的工作队列。
    threadFactory：创建线程的工厂，一般用默认即可。
    handler：拒绝策略，当工作队列、线程池全已满时如何拒绝新任务，默认抛出异常。
     */
    /*
    五种进程调度算法：
    1、时间片轮转调度算法（RR）
    2、先来先服务调度算法（FCFS）
    3、优先级调度算法（HPF）
    4、多级反馈队列调度算法
    5、高响应比优先调度算法

    两种线程调度算法：
    协同式调度
    抢占式调度
     */
}
