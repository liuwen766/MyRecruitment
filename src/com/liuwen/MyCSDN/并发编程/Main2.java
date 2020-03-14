package com.liuwen.MyCSDN.并发编程;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @description:                 如何实现多线程？三种方式。
 * @author: Liu Wen
 * @create: 2020-03-14 14:43
 **/
public class Main2 {
    public static void main(String[] args){
        System.out.println("当前主线程："+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread.currentThread().setName("我是主线程！我改名字啦！");
        System.out.println("当前主线程："+Thread.currentThread().getName());
        //1：继承 Thread
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread1.start();
        myThread2.start();
        //2.实现 Runnable
        MyThreadRunnable myThreadRunnable1 = new MyThreadRunnable();
        Thread thread3 = new Thread(myThreadRunnable1);
        thread3.start();
        //3.实现 Callable
        MyThreadCallable myThreadCallable = new MyThreadCallable();
        FutureTask futureTask = new FutureTask(myThreadCallable);
        Thread thread = new Thread(futureTask);
        thread.start();
              //获取Callable的返回值
        try {
            System.out.println("Callable的返回值:"+futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

    /**
     * @Description:    1：继承 Thread
     * @date 20.3.14 15:50
     */
    static class MyThread extends Thread{
        @Override
        public void run() {
           System.out.println(Thread.currentThread().getName()+" 方法1继承Tread正在运行！");
        }
    }

    /**
     * @Description:    2.实现 Runnable
     * @date 20.3.14 16:07
     */
    static class MyThreadRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+" 方法2实现接口正在运行!");
        }
    }

    /**
     * @Description:     3.实现 Callable
     * @date 20.3.14 16:09
     */
    static class MyThreadCallable implements Callable{
        @Override
        public String call() throws Exception {      //有返回值，可以抛错
            System.out.println("I'm Callable！");
            return "我是callable！";
        }
    }

}
