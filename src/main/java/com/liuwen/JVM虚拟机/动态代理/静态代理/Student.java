package com.liuwen.JVM虚拟机.动态代理.静态代理;

/**
 * @description: Student类实现Person接口。Student可以具体实施上交班费的动作。
 * @author: Liu Wen
 * @create: 2020-03-27 14:42
 **/
public class Student implements Person {
    public String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void giveMoney() {
        System.out.println(name + "上交班费30元");
    }
}
