package com.liuwen.Java8新特性.Character01Lambada;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * ----------------------------------------------------------------------
 * Copyright © 2014-2020 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * The programs can not be copied and/or distributed without the express
 * permission of China Mobile (SuZhou) Software Technology Co.,Ltd.
 *
 * @description:  Lambada表达式学习  格式：参数列表->Lambada体
 * @author: Create by Liu Wen at 2020-07-15 21:49
 * ----------------------------------------------------------------------
 **/

public class LambadaLearning {

    /**
     * @Description:   Lambada语法格式一：无参数，无返回值
     * @date 20.7.15 21:54
     */
    @Test
    public void test1(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Lambada语法格式一");
            }
        };
        runnable.run();

        System.out.println("--------------------------");

        Runnable runnable1 = ()->System.out.println("Lambada语法格式一");
        runnable1.run();

    }

    /**
     * @Description:   Lambada语法格式二：有一个参数，无返回值（一个参数的时候，括号可以省略）
     * @date 20.7.15 21:54
     */
    @Test
    public void test2(){
        Consumer<String> consumer = (r)->System.out.println(r);
        consumer.accept("小括号可以省略，如下：");
        System.out.println("--------------------------");
        Consumer<Integer> consumer1 = r->System.out.println(r);
        consumer1.accept(100);

    }

    /**
     * @Description:   Lambada语法格式三：有两个参数，有返回值，且Lambad体中有多个语句
     * @date 20.7.15 21:54
     */
    @Test
    public void test3(){
        Comparator<Integer> comparator = (x,y)->{
            System.out.println("多条语句必须用大括号{}");
            return Integer.compare(x,y);
        };
    }

    /**
     * @Description:   Lambada语法格式四：如果只有一条语句，{}可以省略，return也可以不写
     * @date 20.7.15 21:54
     */
    @Test
    public void test4(){
        Comparator<Integer> comparator = (x,y)-> Integer.compare(x,y);
    }

    /**
     * @Description:   Lambada语法格式五：参数类型可以不写，JVM可以自己推断（类型推断）
     * @date 20.7.15 21:54
     */
    @Test
    public void test5(){
        Comparator<Integer> comparator = (Integer x,Integer y)-> Integer.compare(x,y);

        //类型推断
        List<Integer> list = new ArrayList<>();
        String[] strings = {"a","b","c"};
//        String[] strings;
//        strings = {"a","b","c"};  //报错
    }





}
