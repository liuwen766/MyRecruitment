package com.liuwen.设计模式.builder.demo2;

/**
 * ----------------------------------------------------------------------
 *
 * @description: TODO
 * @author: Create by Liu Wen at  2020/7/24 22:51
 * ----------------------------------------------------------------------
 **/
public class Worker extends Builder{

    private Product product;

    public Worker() {
        product = new Product();
    }

    @Override
    Builder buileA(String msg) {
        product.setBuildA(msg);
        return this;
    }

    @Override
    Builder buileB(String msg) {
        product.setBuildB(msg);
        return this;
    }

    @Override
    Builder buileC(String msg) {
        product.setBuildC(msg);
        return this;
    }

    @Override
    Builder buileD(String msg) {
        product.setBuildD(msg);
        return this;
    }

    @Override
    Product getProduct() {
        return product;
    }
}
