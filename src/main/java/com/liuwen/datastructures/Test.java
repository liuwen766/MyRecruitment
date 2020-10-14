package com.liuwen.datastructures;

/**
 * ----------------------------------------------------------------------
 * <p>File name: Test.java
 * <p>Desc: 测试类
 * <p>
 *
 * @author Create by liuwen at  2020/10/14 18:28
 * <p>
 * ----------------------------------------------------------------------
 **/
public class Test {
    public static void main(String[] args) {
        // write your code here
        String str = "Java,Java, hello,world!";
        String newStr = str.replaceAll("Java", "尚硅谷~");
        System.out.println("newStr=" + newStr);

    }
}
