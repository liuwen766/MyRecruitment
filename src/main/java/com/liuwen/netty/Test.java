package com.liuwen.netty;

import io.netty.util.NettyRuntime;

/**
 * ----------------------------------------------------------------------
 * <p>File name: Test.java
 * <p>Desc: 测试核数
 * <p>
 *
 * @author Create by liuwen at  2020/10/18 12:22
 * <p>
 * ----------------------------------------------------------------------
 **/
public class Test {
    public static void main(String[] args) {
        System.out.println(NettyRuntime.availableProcessors());
        //话单头记录
        System.out.println("                                                                                                                                                                                                                                                                                                                                                                                                                                                         ".length());
        //话单尾记录
        System.out.println("                                                                                                                                                                                                                                                                                                                                                                                                                                                        ".length());
        System.out.println("44,d04c3f146ad94345941153472fec6d".length());
        System.out.println("                               ".length());
    }
}
