package com.liuwen.effectivejava.Java8StreamAPI;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * ----------------------------------------------------------------------
 *
 * @description:
 * @author: Create by Liu Wen at 2020-07-12 18:48
 * ----------------------------------------------------------------------
 **/

public class JavaStream {

    @Test
    public void test() {
        Integer[] nums = new Integer[]{1, 2, 3, 4, 5};

        Arrays.stream(nums)
                .map((x) -> x * x)
                .forEach(System.out::println);
    }
}
