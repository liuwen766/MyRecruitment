package com.liuwen.Java8新特性.Character01Lambada;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * ----------------------------------------------------------------------
 *
 * @description: Lambada 表达式 需要 函数式接口的支持  使用@FunctionalInterface标识
 * Java8内置四大核心函数式接口
 * @author: Create by Liu Wen at 2020-07-15 22:30
 * ----------------------------------------------------------------------
 **/

public class FunctionInterfaceTest {

    /**
     * @Description: 测试自定义函数式接口
     * @date 20.7.15 22:39
     */
    @Test
    public void test() {
        Integer var = operation(100, (x) -> x * x);
        System.out.println(var);

        Integer var1 = operation(100, (x) -> x + x);
        System.out.println(var1);
    }

    /**
     * @Description: 可以实现任何计算操作
     */
    public Integer operation(Integer n, Function f) {
        return f.getInteger(n);
    }


    /**
     * @Description: Java8内置四大核心函数式接口一：Consumer<T>  消费型接口
     * @date 20.7.15 22:45
     */
    @Test
    public void test1() {

        happy(1000d, (m) -> System.out.println("大保健消费：" + (++m)));
    }

    //Consumer<T>  消费型接口
    private void happy(Double money, Consumer<Double> con) {
        con.accept(money);
    }

    /**
     * @Description: Java8内置四大核心函数式接口二：Supplier<>   供给型接口
     * @date 20.7.15 22:45
     */
    @Test
    public void test2() {
        List<Integer> result = genInteger(10, () ->
                (int) (Math.random() * 100));
        for (Integer integer :
                result) {
            System.out.println(integer);
        }

    }

    //需求：产生指定个数的整数，并放入集合中
    private List<Integer> genInteger(Integer n, Supplier sup) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add((int) sup.get());
        }
        return list;
    }

    /**
     * @Description: Java8内置四大核心函数式接口三：Function<R,T>  函数型接口
     * @date 20.7.15 22:45
     */
    @Test
    public void test3() {
        Integer ans = getLength("helloJava8", (r) -> {
            int num = 0;
            for (int i = 0; i < r.length(); i++) {
                num++;
            }
            return num;
        });

        System.out.println(ans);
    }

    //需求：输入一个字符串，返回字符串的长度
    private Integer getLength(String s, java.util.function.Function<String, Integer> fun) {
        Integer ans = fun.apply(s);
        return ans;
    }

    /**
     * @Description: Java8内置四大核心函数式接口四：Predicate<T>   断言型接口
     * @date 20.7.15 22:45
     */
    @Test
    public void test4() {
        List<String> list = Arrays.asList("xixi", "liuwen", "xiaoming", "java", "Lambada");
        List<String> res = filter(list, (r) -> r.charAt(2) == 5);
        for (String s : res) {
            System.out.println(s);
        }

    }

    //需求：将满足条件的字符串放入集合中，返回集合
    private List<String> filter(List<String> strings, Predicate<String> pre) {
        List<String> res = new ArrayList<>();
        for (String s : strings) {
            if (pre.test(s)) {
                res.add(s);
            }
        }
        return res;
    }


}
