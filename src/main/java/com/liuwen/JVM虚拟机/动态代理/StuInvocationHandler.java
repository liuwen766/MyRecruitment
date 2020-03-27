package com.liuwen.JVM虚拟机.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description:   创建StuInvocationHandler类，实现InvocationHandler接口，这个类中持有一
 *                 个被代理对象的实例target。InvocationHandler中有一个invoke方法，所有执行
 *                 代理对象的方法都会被替换成执行invoke方法。
 * @author: Liu Wen
 * @create: 2020-03-27 15:07
 **/
public class StuInvocationHandler<T> implements InvocationHandler {

    //invocationHandler持有的被代理对象
    T target;

    public StuInvocationHandler(T target) {
        this.target = target;
    }
    /**
     * proxy: 代表动态代理对象
     * method：代表正在执行的方法
     * args：代表调用目标方法时传入的实参
     * @date 20.3.27 15:09
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        System.out.println("代理执行" +method.getName() + "方法");
        System.out.println(proxy.getClass());
//        System.out.println("方法前加强！");
        Object result = method.invoke(target, args);
//        System.out.println("方法后加强！");
        return result;
    }
    //jdk为我们的生成了一个叫$Proxy0（这个名字后面的0是编号，有多个代理类会一次递增）的代理类，这个
    // 类文件是放在内存中的。我们在创建代理对象时，就是通过反射获得这个类的构造方法，然后创建的代理实
    // 例。

    //我们可以把InvocationHandler看做一个中介类，中介类持有一个被代理对象，在invoke方法中调用了被
    // 代理对象的相应方法。通过聚合方式持有被代理对象的引用，把外部对invoke的调用最终都转为对被代理
    // 对象的调用。代理类调用自己方法时，通过自身持有的中介类对象来调用中介类对象的invoke方法，从而
    // 达到代理执行被代理对象的方法。也就是说，动态代理通过中介类实现了具体的代理功能。
}
