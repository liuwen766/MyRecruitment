package com.liuwen.MyCSDN.String;

import org.junit.Test;
import java.util.Arrays;

/**
 * @description:    String字符串学习
 * @author: Liu Wen
 * @create: 2020-03-24 13:43
 **/
public class StringDemo {
    public static void main(String[] args){
        //String常用方法：
        char[] array = {'J','a','v','a',',','H','e','l','l','o',',','W','o','r','l','d'};
        String str = new String(array);
        System.out.println("str:"+str);
        System.out.println("str⻓度："+str.length());
        System.out.println("str是否为空："+str.isEmpty());
        System.out.println("下标为2的字符是："+str.charAt(2));
        System.out.println("H的下标是："+str.indexOf('H'));
        String str2 = "Hello";
        System.out.println("str和str2是否相等："+str.equals(str2));
        String str3 = "HELLO";
        System.out.println("str2和str3忽略⼤⼩写是否相等："+str2.equalsIgnoreCase(str3));
        System.out.println("str是否以Java开头："+str.startsWith("Java"));
        System.out.println("str是否以Java结尾："+str.endsWith("Java"));
        System.out.println("从2开始截取str："+str.substring(2));
        System.out.println("从2到6截取str："+str.substring(2, 6));
        System.out.println("将str中的World替换为Java："+str.replaceAll("World", "Java"));
        System.out.println("用逗号分割str："+ Arrays.toString(str.split(",")));
        System.out.println("将str转为char类型数组："+Arrays.toString(str.toCharArray()));
        System.out.println("str3转为⼩写："+str3.toLowerCase());
        System.out.println("str2转为⼤写："+str2.toUpperCase());
    }
    @Test
    public void test1(){
        String str1 = "Hello World";
        String str2 = "Hello"+" World";
        System.out.println(str1 == str2);
    }
    /*
true,"Hello" 和 " World" 都是字符串字面值，字符串字面值 + 字符串字面值的结果仍然保存在字符串
常量池中，所以 str1 和 str2 相同。
     */
    @Test
    public void test2(){
        String str1 = "Hello World";
        String str2 = "Hello";
        str2 += " World";
        System.out.println(str1 == str2);
    }
    /*
false,因为 str2 是⼀一个字符串变量，" World" 是字符串字⾯面值，当字符串字面值与 String 类型变量拼接
时，得到的新字符串不再保存在常量池中，而是在堆中开辟一块新的空间来存储。
     */
    @Test
    public void test3(){
        String str1 = "Hello World";
        String str2 = " World";
        String str3 = "Hello"+str2;
        System.out.println(str1 == str3);
    }
    /*
false,str2 是变量，"Hello" 是字符串字面值，字符串字面值 + 变量会在堆内存中开辟新的空间来存
储，所以 str1 和 str3 不同。
     */
    @Test
    public void test4(){
        String str1 = "Hello World";
        final String str2 = " World";
        String str3 = "Hello"+str2;
        System.out.println(str1 == str3);
    }
    /*
true,"Hello" 是字符串字面值，str2 是常量，字符串字面值+常量的结果仍然保存在字符串常量池中，
所以 str1 和 str3 相同。
     */
    @Test
    public void test5(){
        String str1 = "Hello World";
        final String str2 = new String(" World");
        String str3 = "Hello"+str2;
        System.out.println(str1 == str3);
    }
    /*
false,str2 是常量，但是 new String(" World") 保存在堆内存中，所以即使用 final 进⾏修饰，
str2仍然保存在堆中，则str3也就保存在堆中，所以 str1 和 str3 不同。
     */
    @Test
    public void test6(){
        String str1 = "Hello World";
        String str2 = "Hello";
        String str3 = " World";
        String str4 = str2 + str3;
        System.out.println(str4 == str1);
        System.out.println(str4.intern() == str1);
    }
    /*
true，当调用 str4 的 intern 方法时，如果字符串常量池已经包含一个等于 str4 的字符串，则返回该字
符串，否则将 str4 添加到字符串常量池中，并返回其引用，所以 str4.intern() 与 str1 相同。
     */
}
