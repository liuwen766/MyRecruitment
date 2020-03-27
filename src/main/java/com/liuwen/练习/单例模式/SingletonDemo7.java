package com.liuwen.练习.单例模式;

/**
 * @description: 静态内部类方式，可用
 * @author: Liu Wen
 * @create: 2020-03-27 23:34
 **/
public class SingletonDemo7 {

    private SingletonDemo7(){

    }

    private static class SingletonInner{
        private static final SingletonDemo7 INSTANCE = new SingletonDemo7();
    }

    public static SingletonDemo7 getInstance(){
        return SingletonInner.INSTANCE;
    }
    //1. 静态内部类是在被调用时才会被加载，这种方案实现了懒汉单例的一种思想，需要用到的时候才去创建
    // 单例，加上JVM的特性，这种方式又实现了线程安全的创建单例对象。
    //对比SingletonDemo7，基于volatile的双重检查锁定方案有一个额外的优势：除了可以对静态字段实现
    // 延迟加载初始化外，还可以对实例字段实现延迟初始化。
}
