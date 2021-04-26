package com.liuwen.各公司笔试题.咪咕视讯;

/**
 * @description: Good good study,day day up!
 * @author: Liu Wen
 * @create: 2020-04-12 15:49
 **/
public class Test1 {
    static class Inner {
        void sayHi() {
            System.out.println("Hi");
        }
    }

    public static void main(String[] args) {
        Inner inner = new Inner();
        inner.sayHi();
    }
}
