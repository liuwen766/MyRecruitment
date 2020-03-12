package com.liuwen.牛客网;


import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @description: 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 * @author: Liu Wen
 * @create: 2020-03-10 22:03
 **/
public class Main32 {
    public static void main(String[] args){
        int[] array = {1,2,3};
        String ans = PrintMinNumber(array);
        System.out.println(ans);
    }
    /**
     * @Description:     方法2： 朝着能使数最小的方式排序
     *                    实现了Comparator接口的compare方法，将集合元素按照compare方法的规则进行排序
      * @param numbers
     * @return java.lang.String
     * @date 20.3.10 22:09
     */
    public static String PrintMinNumber(int [] numbers) {
        String string = new String();
        String[] strings = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strings[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(strings, new Comparator<String>() {  //自动实现Comparator接口
            @Override
            public int compare(String o1, String o2) {   //自定义比较器（代码没有侵入性）
                return (o1+o2).compareTo(o2+o1);
            }
        });
        for (int i = 0; i < strings.length; i++) {
            string = string+strings[i];
        }
        return string;
    }
}
