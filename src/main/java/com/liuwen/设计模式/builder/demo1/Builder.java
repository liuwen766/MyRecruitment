package com.liuwen.设计模式.builder.demo1;

/**
 * ----------------------------------------------------------------------
 *
 * @description: TODO
 * @author: Create by Liu Wen at  2020/7/24 22:19
 * ----------------------------------------------------------------------
 **/
public interface Builder {

    abstract void buildA();

    abstract void buildB();

    abstract void buildC();

    abstract void buildD();

    abstract Product getProduct();

}
