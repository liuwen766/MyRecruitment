package com.liuwen.练习.单例模式;

/**
 * @description: 饿汉式（静态常量）
 * @author: Liu Wen
 * @create: 2020-03-11 20:41
 **/
public class SingletonDemo1 {

    private static final SingletonDemo1 INSTANCE = new SingletonDemo1();

    // 私有化构造器
    private SingletonDemo1() {

    }

    public static SingletonDemo1 getInstace() {
        return INSTANCE;
    }

    //测试
    public static void main(String[] args) {
        SingletonDemo1 singletonDemo1 = SingletonDemo1.getInstace();
        SingletonDemo1 singletonDemo11 = SingletonDemo1.getInstace();
        System.out.println(singletonDemo1 == singletonDemo11);
    }
}
