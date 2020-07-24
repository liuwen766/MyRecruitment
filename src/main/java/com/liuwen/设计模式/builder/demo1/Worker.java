package com.liuwen.设计模式.builder.demo1;

/**
 * ----------------------------------------------------------------------
 *
 * @description: TODO
 * @author: Create by Liu Wen at  2020/7/24 22:24
 * ----------------------------------------------------------------------
 **/
public class Worker implements Builder{

    private Product product;

    public Worker() {
        product = new Product();
    }

    @Override
    public void buildA() {
        product.setBuildA("地基");
        System.out.println("地基");
    }

    @Override
    public void buildB() {
        product.setBuildB("钢筋");
        System.out.println("钢筋");
    }

    @Override
    public void buildC() {
        product.setBuildC("水泥");
        System.out.println("水泥");
    }

    @Override
    public void buildD() {
        product.setBuildD("粉刷");
        System.out.println("粉刷");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
