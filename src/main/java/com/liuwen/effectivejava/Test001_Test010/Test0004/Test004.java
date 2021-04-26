package com.liuwen.effectivejava.Test001_Test010.Test0004;

/**
 * ----------------------------------------------------------------------
 *
 * @description: （第11个建议）：使用try-with-resources 语句替代try-finally 语句
 * @author: Create by Liu Wen at  2020/7/26 16:48
 * ----------------------------------------------------------------------
 **/
public class Test004 {
    public static void main(String[] args) {

        try (Resource1 resource = new Resource1(); Resource2 resource2 = new Resource2()) {
            resource.sayHello();
            resource2.sayhello();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
