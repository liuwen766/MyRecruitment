package com.liuwen.JVM虚拟机.关键字volatile.单例模式;

/**
 * @description: 懒汉式（线程不安全 ,不推荐）
 * @author: Liu Wen
 * @create: 2020-03-11 20:43
 **/
public class SingletonDemo5 {
    private static SingletonDemo5 INSTANCE;

    private SingletonDemo5(){

    }

    public static SingletonDemo5 getInstance(){
        if(INSTANCE==null){
            synchronized (SingletonDemo5.class) {
                INSTANCE = new SingletonDemo5();
            }
        }
        return INSTANCE;
    }

}
