package com.liuwen.JVM虚拟机.关键字volatile.单例模式;

/**
 * @description:          饿汉式（静态代码块）（可用）
 * @author: Liu Wen
 * @create: 2020-03-11 20:42
 **/
public class SingletonDemo2 {
    private static final SingletonDemo2 INSTANCE;

    static {
        INSTANCE = new SingletonDemo2();
    }

    private SingletonDemo2(){}

    public static SingletonDemo2 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args){
        SingletonDemo2 singletonDemo2 = SingletonDemo2.getInstance();
        SingletonDemo2 singletonDemo21 = SingletonDemo2.getInstance();
        System.out.println(singletonDemo2 == singletonDemo21);
    }
}
