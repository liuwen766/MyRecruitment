package com.liuwen.练习.单例模式;

/**
 * @description: 懒汉式（volatile双重检查模式,推荐）
 * @author: Liu Wen
 * @create: 2020-03-27 23:34
 **/
public class SingletonDemo6 {
    // 静态属性，volatile保证可见性和禁止指令重排序
    private volatile static SingletonDemo6 INSTANCE;

    private SingletonDemo6(){

    }
    public static SingletonDemo6 getInstance(){
        // 第一重检查锁定
        if(INSTANCE==null){
            // 同步锁定代码块
            synchronized (SingletonDemo6.class){
                // 第二重检查锁定
                if(INSTANCE==null){
                    // 注意：这里是非原子操作，所以需要volatile关键字修饰INSTANCE
                    INSTANCE = new SingletonDemo6();
                }
            }
        }
        return INSTANCE;
    }
}
