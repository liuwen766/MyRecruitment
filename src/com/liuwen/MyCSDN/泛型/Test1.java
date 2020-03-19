package com.liuwen.MyCSDN.泛型;

import com.liuwen.各公司笔试题.同花顺校招.Test;

/**
 * @description:   为什么需要泛型？
 * @author: Liu Wen
 * @create: 2020-03-19 15:10
 **/
public class Test1 {
    public static void main(String[] args){
        Test1.add(1,2);
        Test1.add(1f, 2f);
        Test1.add(1d, 2d);
        Test1.add(Integer.valueOf(1), Integer.valueOf(2));
        Test1.add(Float.valueOf(1), Float.valueOf(2));
        Test1.add(Double.valueOf(1), Double.valueOf(2));

    }
    /*
    如果要实现不同类型的加法，每种类型都需要重载一个add方法
     */
    private static int add(int a, int b) {
        System.out.println(a + "+" + b + "=" + (a + b));
        return a + b;
    }

    private static float add(float a, float b) {
        System.out.println(a + "+" + b + "=" + (a + b));
        return a + b;
    }

    private static double add(double a, double b) {
        System.out.println(a + "+" + b + "=" + (a + b));
        return a + b;
    }

    private static <T extends Number> double add(T a, T b) {
        System.out.println(a + "+" + b + "=" + (a.doubleValue() + b.doubleValue()));
        return a.doubleValue() + b.doubleValue();
    }

}
