package com.liuwen.MyCSDN.接口与抽象类的区别;

/**
 * @description: 定义一个抽象类
 * @author: Liu Wen
 * @create: 2020-03-12 17:02
 **/
/*
1.如果一个类中有抽象方法，那么这个类一定是抽象类；
2.抽象类中不一定有抽象方法；
3.抽象类中可以存在抽象方法；
4.抽象类中可以存在构造方法；
5.抽象类中可以存在普通属性、方法、静态属性和静态方法；
6.抽象类中的抽象方法需要有子类实现，如果子类不实现，则子类也需要定义为抽象的。
 */
public abstract class TestClass {
    public abstract void Test1();
    public abstract void Test2();
    int id = 0;
    static String name = "静态属性";
    public TestClass(){
        System.out.println("我是构造方法");
    }
    public void method(){
        System.out.println("我是普通方法");
    }
    public static void method2(){
        System.out.println("我是静态方法");
    }

}
