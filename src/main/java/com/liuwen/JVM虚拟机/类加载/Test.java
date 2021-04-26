package com.liuwen.JVM虚拟机.类加载;

/**
 * @description: 父类的类构造器() -> 子类的类构造器() -> 父类的成员变量和实例代码块
 * -> 父类的构造函数-> 子类的成员变量和实例代码块 -> 子类的构造函数。
 * @author: Liu Wen
 * @create: 2020-03-16 23:36
 **/
public class Test {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.getValue());
    }
}
