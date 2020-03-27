package com.liuwen.JVM虚拟机.类加载;
/**
 * @description:      实例初始化不一定要在类初始化结束之后才开始初始化。
 * @author: Liu Wen
 * @create: 2020-03-17 00:32
 **/
public class StaticTest {

    public static void main(String[] args) {
        staticFunction();
    }

    static StaticTest st = new StaticTest();
    static {
        System.out.println("1");             //静态代码块
    }

    {
        System.out.println("2");             //实例代码块
    }

    StaticTest() {                           //实例构造器
        System.out.println("3");
        System.out.println("a=" + a + ",b=" + b);
    }

    public static void staticFunction() {
        System.out.println("4");
        System.out.println(b);
    }
    int a = 110;                             //实例变量
    static int b = 112;                      //静态变量
 }
 /*
   在类的初始化阶段需要做的是执行类构造器<clinit>()。类构造器本质上是编译器收集所有静态语句块和类变量的
赋值语句按语句在源码中的顺序合并生成类构造器<clinit>()。因此，对上述程序而言，JVM将先执行第一条静态变量
的赋值语句在实例化上述程序中的st变量时，实际上是把实例初始化嵌入到了静态初始化流程中，并且在上面的程序中，
嵌入到了静态初始化的起始位置。这就导致了实例初始化发生在静态初始化静态方法之前，当然，这也是导致a为110，
b为0的原因。
 */
//因此执行顺序如下：
/*
public class StaticTest {
    <clinit>(){                    //执行clinit()
        a = 110;                   // 实例变量
        System.out.println("2");   // 实例代码块
        System.out.println("3");   // 实例构造器
        System.out.println("a=" + a + ",b=" + b);
        System.out.println("1");   // 静态代码块
        System.out.println("4");   // 方法调用
        System.out.println(b);
    }
}
*/