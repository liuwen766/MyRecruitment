package com.liuwen.JVM虚拟机.关键字synchronized.对象头;

import org.openjdk.jol.info.ClassLayout;

/**
 * @description: 查看对象头布局
 * @author: Liu Wen
 * @create: 2020-03-27 11:38
 **/
public class TestLayout {
    public static void main(String[] args) {
        LockObj lockObj = new LockObj();
        System.out.println(Integer.toHexString(lockObj.hashCode()));
        System.out.println(ClassLayout.parseInstance(lockObj).toPrintable());
    }
}
