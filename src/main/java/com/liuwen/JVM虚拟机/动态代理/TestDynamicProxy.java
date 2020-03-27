package com.liuwen.JVM虚拟机.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @description: Good good study,day day up!
 * @author: Liu Wen
 * @create: 2020-03-27 15:10
 **/
public class TestDynamicProxy {
    public static void main(String[] args){
        //创建一个实例对象，这个对象是被代理的对象
        Person stu = new Student("稳稳");

        //创建一个与代理对象相关联的InvocationHandler
        InvocationHandler stuHandler = new StuInvocationHandler<Person>(stu);

        //创建一个代理对象stuProxy来代理stu，代理对象的每个执行方法都会替换执行Invocation中的invoke方法
        Person stuProxy = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class<?>[]{Person.class}, stuHandler);

        //代理执行上交班费的方法 ，代理执行提交作业方法！
        stuProxy.giveMoney();
        stuProxy.submitHomework();
    }
}
