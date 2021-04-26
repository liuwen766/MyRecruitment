package com.liuwen.JVM虚拟机.JVM工具使用;


import java.util.ArrayList;
import java.util.List;

/**
 * @description: JConsole测试
 * @author: Liu Wen
 * @create: 2020-04-14 21:02
 **/
public class JConsoleTest {

    private byte[] bytes = new byte[64 * 1024];

    public static void main(String[] args) throws Exception {
        System.in.read();      //输入start，则开始运行程序。
        List<JConsoleTest> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            Thread.sleep(100);
            list.add(new JConsoleTest());
        }
        System.gc();
    }
}
