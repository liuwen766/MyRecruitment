package com.liuwen.Java8新特性.Character01Lambada;

/**
 * ----------------------------------------------------------------------
 * @description:
 * @author: Create by Liu Wen at 2020-07-15 19:40
 * ----------------------------------------------------------------------
 **/

public interface MyStrategy<T> {
    boolean test(T t);
}
