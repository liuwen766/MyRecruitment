package com.liuwen.MyCSDN.Object类的方法;

/**
 * @description: 关于Object类的方法
 * @author: Liu Wen
 * @create: 2020-03-13 11:07
 **/
/* 一共有十三种方法。
   常用：equals()、hashCode()、toString()（这三个方法往往都必须重写）
 1 registerNatives()            //本地私有方法
 2 getClass()                   //返回此 Object 的运行类。
 3 hashCode()                   //用于获取对象的哈希值。
 4 equals(Object obj)           //用于比较两个对象的地址。
 5 toString()                   //返回该对象地址的字符串表示。
 6 clone()                      //创建并返回此对象的一个副本。
 7 notify()                     //唤醒在此对象监视器上等待的单个线程。
 8 notifyAll()                  //唤醒在此对象监视器上等待的所有线程。
 9 wait()                       //用于让当前线程失去操作权限，当前线程进入等待序列
10 wait(long timeout)           //在其他线程调用此对象的 notify() 方法或 notifyAll() 方法，或者超过指定的时间量前，导致当前线程等待。
11 wait(long timeout, int nanos)//在其他线程调用此对象的 notify() 方法或 notifyAll() 方法，或者其他某个线程中断当前线程，或者已超过某个实际时间量前，导致当前线程等待。
12 finalize()                   //当垃圾回收器确定不存在对该对象的更多引用时，由对象的垃圾回收器调用此方法。
 */
public class TestObject {
    public static void main(String[] args) {
        Object objectA = new Object();
        Object objectB = new Object();
        Object objectC = objectA;

        System.out.println("objectA.equals(objectB):" + objectA.equals(objectB)); //equals()默认比较的是两个对象的地址。所以必须被重写方法以用于比较对象是否相等。
        System.out.println("objectA==objectB:" + (objectA == objectB));
        System.out.println("objectA.equals(objectC):" + objectA.equals(objectC));
        System.out.println("objectA==objectC:" + (objectA == objectC));
        System.out.println("objectA.hashCode():" + objectA.hashCode());            //hashCode()返回对象所在物理地址所计算出的哈希值。常会和equals方法同时重写，确保相等的两个对象拥有相等的.hashCode。
        System.out.println("objectA.toString():" + objectA.toString());            //toString()默认取得对象信息，输出的是对象的地址。重写toString()方法来输出对象属性信息。
        System.out.println("objectA.getClass():" + objectA.getClass());
//        objectA.wait();
//        objectA.wait(1);
//        objectA.wait(1,1);
//        objectA.notify();
//        objectA.notifyAll();
    }
}

class Object {

    private static native void registerNatives();

    static {
        registerNatives();
    }

//    public final native Class<?> getClass();

    public native int hashCode();

    public boolean equals(Object obj) {
        return (this == obj);
    }

    protected native Object clone() throws CloneNotSupportedException;

    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

//    public final native void notify();
//
//    public final native void notifyAll();
//
//    public final native void wait(long timeout) throws InterruptedException;

//    public final void wait(long timeout, int nanos) throws InterruptedException {
//        if (timeout < 0) {
//            throw new IllegalArgumentException("timeout value is negative");
//        }
//        if (nanos < 0 || nanos > 999999) {
//            throw new IllegalArgumentException(
//                    "nanosecond timeout value out of range");
//        }
//        if (nanos >= 500000 || (nanos != 0 && timeout == 0)) {
//            timeout++;
//        }
//        wait(timeout);
//    }

//    public final void wait() throws InterruptedException {
//        wait(0);
//    }

//    protected void finalize() throws Throwable { }    //从 Java 9 开始，Object.finalize() 方法被标记为 deprecated。
}                                                       //一个对象如果已经被标记为该回收，那么该对象就不应被救活。所以弃用finalize()方法
