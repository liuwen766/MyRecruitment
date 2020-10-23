package com.liuwen.JVM虚拟机.内存规范;

/**
 * ----------------------------------------------------------------------
 * <p>File name: TestPC.java
 * <p>Desc: 测试PC计数器
 * <p>
 *
 * @author Create by liuwen at  2020/10/22 23:20
 * <p>
 * ----------------------------------------------------------------------
 **/
public class TestPC {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = a + b;
        System.out.println(c);
    }
}
