package com.liuwen.MyCSDN.泛型;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:       使用泛型的意义在于
 *        1,适用于多种数据类型执行相同的代码（代码复用）
 *        2, 泛型中的类型在使用时指定，不需要强制类型转换（类型安全，编译器会检查类型）
 * @author: Liu Wen
 * @create: 2020-03-19 15:14
 **/
public class Test2 {
    static class C{

    }
    public static void main(String[] args){
        List list=new ArrayList();
        list.add("A");
        list.add("B");
        list.add(new C());
        list.add(100);
        //1.当我们将一个对象放入集合中，集合不会记住此对象的类型，当再次从集合中取出此对象时，改对象的编译类型变成了Object类型，但其运行时类型任然为其本身类型。
        //2.因此，//1处取出集合元素时需要人为的强制类型转化到具体的目标类型，且很容易出现“java.lang.ClassCastException”异常。
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
//            String value= (String) list.get(i);
//            System.out.println(value);
        }
    }
}
