package com.liuwen.JVM虚拟机.关键字volatile.单例模式;

/**
 * @description: 懒汉式（线程不安全，不推荐的方案）
 * @author: Liu Wen
 * @create: 2020-03-11 20:43
 **/
public class SingletonDemo3 {
    private static SingletonDemo3 INTANCE;

    private SingletonDemo3(){

    }
    public static SingletonDemo3 getInstance(){

        //A,B
        if(INTANCE==null){
            INTANCE = new SingletonDemo3();
        }
        return INTANCE;
    }


    public static void main(String[] args){
        SingletonDemo3 singletonDemo3 = SingletonDemo3.getInstance();
        SingletonDemo3 singletonDemo31 = SingletonDemo3.getInstance();
        System.out.println(singletonDemo3==singletonDemo31);
    }
}
