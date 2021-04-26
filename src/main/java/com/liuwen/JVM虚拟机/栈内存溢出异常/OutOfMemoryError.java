package com.liuwen.JVM虚拟机.栈内存溢出异常;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 堆内存溢出
 * @author: Liu Wen                    测试：设置堆内存大小    -Xmx10m
 * @create: 2020-03-30 23:53
 **/
public class OutOfMemoryError {
    public static void main(String[] args) {
        int count = 0;
        try {
            List<String> list = new ArrayList<>();
            String s = "liuwen";
//            for (int i = 0; i < 20; i++) {
//                list.add(s);
//                s+=s;
//                count++;
//            }
            while (true) {
                list.add(s);
//                s+=s;
                count++;
            }
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println(count);
        }
    }
}
