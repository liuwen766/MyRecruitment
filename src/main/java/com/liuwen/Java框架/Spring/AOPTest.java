package com.liuwen.Java框架.Spring;

/**
 * @description:     AOP：面向切面编程
 * @author: Liu Wen
 * @create: 2020-03-20 11:02
 **/
public class AOPTest {

    /*
    package com.liuwen.utils;

    import java.lang.reflect.InvocationHandler;
    import java.lang.reflect.Method;
    import java.lang.reflect.Proxy;
    import java.util.Arrays;

    public class MyInvocationHandler implements InvocationHandler {
    //接收委托对象
    private Object object = null;
    //返回代理对象
    public Object bind(Object object){
        this.object = object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),this);
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName()+"方法的参数是："+ Arrays.toString(args));
        Object result = method.invoke(this.object,args);
        System.out.println(method.getName()+"的结果是"+result);
        return result;
    }
}

     */
}
