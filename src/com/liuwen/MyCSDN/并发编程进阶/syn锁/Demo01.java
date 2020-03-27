package com.liuwen.MyCSDN.并发编程进阶.syn锁;

/**
 * @description:           通过字节码文件查看syn原理
 * @author: Liu Wen
 * @create: 2020-03-27 08:05
 **/
public class Demo01 {
    private static Object obj = new Object();
    public static void main(String[] args){
        synchronized (obj){
            System.out.println("1");
        }
    }
    public synchronized void test(){
        System.out.println("a");
    }
}
