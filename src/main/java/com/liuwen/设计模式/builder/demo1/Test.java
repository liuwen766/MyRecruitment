package com.liuwen.设计模式.builder.demo1;

/**
 * ----------------------------------------------------------------------
 *
 * @description: TODO
 * @author: Create by Liu Wen at  2020/7/24 22:28
 * ----------------------------------------------------------------------
 **/
public class Test {
    public static void main(String[] args) {
        Director director = new Director();
        Product product = director.build(new Worker());
        System.out.println(product.toString());
    }
}
