package com.liuwen.设计模式.builder.demo2;

/**
 * ----------------------------------------------------------------------
 *
 * @description: TODO
 * @author: Create by Liu Wen at  2020/7/24 22:56
 * ----------------------------------------------------------------------
 **/
public class Test {
    public static void main(String[] args) {
        Worker worker = new Worker();

        //定制化操作
        Product product = worker.buileA("鸡腿堡").getProduct();

        System.out.println(product.toString());

    }
}
