package com.liuwen.JVM虚拟机.动态代理;

import java.util.concurrent.TimeUnit;

/**
 * @description: 创建需要被代理的实际类
 * @author: Liu Wen
 * @create: 2020-03-27 15:04
 **/
public class Student implements Person {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void giveMoney() {
        try {
            TimeUnit.SECONDS.sleep(1);    //数钱用时
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println(name + "上交班费30元!");
    }

    @Override
    public void submitHomework() {
        try {
            TimeUnit.SECONDS.sleep(5);   //写作业用时
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + "提交作业");
    }
}
