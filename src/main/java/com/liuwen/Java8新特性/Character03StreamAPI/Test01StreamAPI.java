package com.liuwen.Java8新特性.Character03StreamAPI;

import com.liuwen.Java8新特性.Character01Lambada.Employee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * ----------------------------------------------------------------------
 * Copyright © 2014-2020 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * The programs can not be copied and/or distributed without the express
 * permission of China Mobile (SuZhou) Software Technology Co.,Ltd.
 *
 * @description:   StreamAPI
 * @author: Create by Liu Wen at 2020-07-15 23:51
 * ----------------------------------------------------------------------
 **/

public class Test01StreamAPI {

    /**
     * @Description:   一、创建的流的三个步骤
     *                 1.创建Stream
     *                 2.中间操作
     *                 3.终止操作（终端操作）
     * @date 20.7.16 10:23
     */
    /**
     * @Description:  1.创建流的五种方式
     */
    @Test
    public void test01(){
        //方式1
        List<Integer> list = new ArrayList<>();
        Stream<Integer> integerStream = list.stream();
        //方式2
        Employee[] employees = new Employee[10];
        Arrays.stream(employees);
        //方式3
        Stream<Integer> stream = Stream.of(1, 2, 3);
        //方式4 无限流
        Stream<Integer> iterate = Stream.iterate(0, x -> x+2);
              //没有限制limit(10)，则会无限迭代
        iterate.limit(10).forEach(System.out::println);
        //方式5  无限流2
        Stream<Double> generate = Stream.generate(() -> Math.random());
        generate.limit(10).forEach(System.out::println);
    }

    /**
     * @Description:  2.中间操作
     *
     *  一、筛选与切片
     * filer——接收 Lambada，从流中排除某些元素。
     * limit——截断流，使其元素不超过给定数量。
     * skip（n）——跳过元素，返回一个扔掉了前n个元素的流。若流中元素不足n个，则返回一个空流。
     * distinct——筛选，通过流所生成元素的 hashcode（）和 equals（）来去除重复元素。
     *
     * 二、映射
     * map——接收Lambda，将元素转换成其他形式或提取信息。接收一个函数作为参数，该函数会被应用到每个。
     * flatMap——接收一个函数作为参数。将流中的每个值都换成另一个流，然后把所有流连接成一个流。
     *
     * 三、排序
     * sorted（）——自然排序
     * sorted（ Comparator com）——定制排序
     *
     * 四、匹配
     * allMatch——检查是否匹配所有元素
     * anyMatch——检查是否至少匹配一个元素
     * noneMatch——检查是否没有匹配所有元素
     * findFirst——返回第一个元素
     * findAny——返回当前流中的任意元素
     * count——返回流中元素的总个数
     * max——返回流中最大值
     * min——返回流中最小值
     *
     * 五、归约
     * reduce(T identity,BinaryOperator)可以将流中元素反复结合起来。
     *
     * 六、收集
     * collect——将流转换为其它形式。接收一个Collector接口的实现，用于给Stream中元素做汇总的方法。
     *
     */
}
