package com.liuwen.JVM虚拟机.并发编程;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @description: 线程池
 * @author: Liu Wen
 * @create: 2020-03-14 16:19
 **/
public class TreadPoolDemo {
    public static void main(String[] args) throws Exception {
        //通过线程池工厂创建线程数量为5的线程池
        ExecutorService service = Executors.newFixedThreadPool(5);
        //执行线程,execute()适用于实现Runnable接口创建的线程
        service.execute(new ThreadDemo4());
        service.execute(new ThreadDemo6());
        service.execute(new ThreadDemo7());
        //submit()适用于实现Callable接口创建的线程
        Future<String> task = service.submit(new ThreadDemo5());
        //获取call()方法的返回值
        String result = task.get();
        System.out.println(result);
        //关闭线程池
        service.shutdown();
    }
}

//实现Runnable接口
class ThreadDemo4 implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ":" + "输出的结果");
    }
}

//实现Callable接口
class ThreadDemo5 implements Callable<String> {
    @Override
    public String call() throws Exception {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ":" + "输出的结果");
        return Thread.currentThread().getName() + ":" + "返回的结果";
    }
}

//实现Runnable接口
class ThreadDemo6 implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ":" + "输出的结果");
    }
}

//实现Runnable接口
class ThreadDemo7 implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ":" + "输出的结果");
    }
}
