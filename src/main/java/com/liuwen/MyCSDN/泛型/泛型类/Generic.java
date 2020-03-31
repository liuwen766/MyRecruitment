package com.liuwen.MyCSDN.泛型.泛型类;

/**
 * @description:   泛型类定义
 * @author: Liu Wen
 * @create: 2020-03-31 22:07
 **/
public class Generic<T> {
    //类型T 由外部使用类的时候决定。
    private T key;

    public Generic(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Generic{" +
                "key=" + key +
                '}';
    }
}
