package com.liuwen.JVM虚拟机.栈内存溢出异常;

/**
 * @description: 栈内存溢出
 * @author: Liu Wen           测试：修改栈内存大小    -Xss256k    -Xss10m
 * @create: 2020-03-30 23:48
 **/
public class StackOverFlowError {
    public static void main(String[] args) {
        try {
            method();
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println(count);
        }
    }

    private static int count;

    private static void method() {
        count++;
        method();
    }
}
