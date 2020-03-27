package com.liuwen.练习.单例模式;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

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
