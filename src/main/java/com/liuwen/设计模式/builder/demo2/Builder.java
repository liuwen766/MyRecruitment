package com.liuwen.设计模式.builder.demo2;

/**
 * ----------------------------------------------------------------------
 *
 * @description:  静态内部类来实现,不需要指挥者
 * @author: Create by Liu Wen at  2020/7/24 22:37
 * ----------------------------------------------------------------------
 **/
public abstract class Builder {

    abstract Builder buileA(String msg);
    abstract Builder buileB(String msg);
    abstract Builder buileC(String msg);
    abstract Builder buileD(String msg);

    abstract Product getProduct();

}
