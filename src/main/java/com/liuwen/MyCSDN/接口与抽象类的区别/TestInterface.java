package com.liuwen.MyCSDN.接口与抽象类的区别;

/**
 * @description: Good good study,day day up!
 * @author: Liu Wen
 * @create: 2020-03-12 17:08
 **/
/*
1.接口中的方法，永远都被public来修饰；
2.接口中没有构造方法，也不能实例化接口对象；
3.接口中只有方法的声明，没有方法体；
4.接口中只有常量，如果定义变量，在编译的时候都会默认加上“public static final”；
5.接口中定义的方法都需要实现类来实现，如果实现类不能实现接口中的所有方法，则实现类需要定义为抽象类；
6.静态方法不能被子类重写（覆盖），因此接口中不定声明静态方法；
7.使用接口可以实现多继承
 */
public interface TestInterface {
    //    private void method1();
//    public TestInterface(){}
    public void method2();

    public abstract void method3();

    public int Changliang = 2;
    //    private int Changliang2 = 3;
    public final int Changliang3 = 2;
//    public static void method4();
}
