package com.liuwen.JVM虚拟机.类加载;

/**
 * @description: Good good study,day day up!
 * @author: Liu Wen
 * @create: 2020-03-16 23:33
 **/
public class Father {
    int i = 1;

    Father() {
        System.out.println(i);            // -----------(1)
        int x = getValue();
        System.out.println(x);            // -----------(2)

    }

    {
        i = 2;
    }

    protected int getValue() {
        return i;
    }
}

