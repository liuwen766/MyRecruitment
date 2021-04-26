package com.liuwen.JVM虚拟机.关键字synchronized.syn锁优化;

/**
 * @description: 锁消除
 * @author: Liu Wen
 * @create: 2020-03-31 16:45
 **/
public class Demo02LockElimination {
    public static void main(String[] args) {
        contactString("aa", "bb", "cc");
    }

    public static String contactString(String s1, String s2, String s3) {
        return new StringBuffer().append(s1).append(s2).append(s3).toString();
    }
}
