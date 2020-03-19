package com.liuwen.MyCSDN.泛型;

/**
 * @description: 泛型类的使用:自定义类
 * @author: Liu Wen
 * @create: 2020-03-19 15:17
 **/
public class Test3<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static void main(String[] args){
        Test3<String> test3 = new Test3<>();
        test3.setData("TEST");
        System.out.println(test3.getData());
    }

}
