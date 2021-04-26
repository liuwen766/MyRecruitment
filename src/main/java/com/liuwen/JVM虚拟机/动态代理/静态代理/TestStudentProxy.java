package com.liuwen.JVM虚拟机.动态代理.静态代理;

/**
 * @description: Good good study,day day up!
 * @author: Liu Wen
 * @create: 2020-03-27 14:46
 **/
public class TestStudentProxy {
    public static void main(String[] args) {
        //被代理的学生，他的上交班费由代理对象stuProxy完成。
        Person stu = new Student("稳稳");
        //生成代理对象，并将稳稳传给代理对象。
        Person stuProxy = new StudentProxy(stu);
        //代理对象stuProxy完成上交班费动作。
        stuProxy.giveMoney();
        //这里并没有直接通过被代理对象stu来执行上交班费的行为，而是通过代理对象stuProxy来代理执行了。这就是代理模式。
        //可以看到，只需要在代理类中帮stu上交班费之前，执行其他操作就可以了。这种操作，也是使用代理模式的一个很大的优点。
        //最直白的就是在Spring中的面向切面编程（AOP），我们能在一个切点之前执行一些操作，在一个切点之后执行一些操作，
        //这个切点就是一个个方法。这些方法所在类肯定就是被代理了，在代理过程中切入了一些其他操作。
    }
}
