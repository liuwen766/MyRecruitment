package com.liuwen.JVM虚拟机.关键字volatile.单例模式;

/**
 * @description: 懒汉式（线程安全 ,性能差，不推荐）
 * @author: Liu Wen
 * @create: 2020-03-11 20:43
 **/
public class SingletonDemo4 {

    private static SingletonDemo4 INSTANCE;

    private SingletonDemo4(){

    }

    public synchronized static SingletonDemo4 getInstance(){
        if(INSTANCE==null){
            INSTANCE = new SingletonDemo4();
        }
        return INSTANCE;
    }
}
