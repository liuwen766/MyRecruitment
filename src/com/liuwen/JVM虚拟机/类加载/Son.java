package com.liuwen.JVM虚拟机.类加载;

/**
 * @description: Good good study,day day up!
 * @author: Liu Wen
 * @create: 2020-03-16 23:35
 **/
public class Son extends Father {
    int j = 1;

    Son() {
        j = 2;
    }

    {j = 3;}
    @Override
    protected int getValue() {
        return j;
    }
}
