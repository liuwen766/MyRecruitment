package com.liuwen.effectivejava.Test001_Test010.Test0004;

/**
 * ----------------------------------------------------------------------
 *
 * @description: 定义第二个资源类；
 * @author: Create by Liu Wen at  2020/7/26 16:45
 * ----------------------------------------------------------------------
 **/
public class Resource2 implements AutoCloseable {
    public void sayhello() {
        System.out.println("Resource2 say hello");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Resource2 is closed");
    }
}