package com.liuwen.练习.运算问题;

/**
 * @description: 数的位运算：与（&）、按位或（|）、异或（^）、取反（~）、左移（<<）、右移（>>）、 无符号右移（>>>）
 * @author: Liu Wen
 * @create: 2020-03-12 20:24
 **/
public class Main2 {
    public static void main(String[] args) {
        //按位与运算符（&）：两位同时为“1”，结果才为“1”，否则为0。另，负数按补码(反码+1)形式参加按位与运算。
        System.out.println("3&5:" + (3 & 5));    //0000 0011 & 0000 0101 = 0000 0001  即1
        System.out.println("-3&5:" + (-3 & 5));  //1111 1101 & 0000 0101 = 0000 0101  即5
        //按位或运算符（|）：参加运算的两个对象只要有一个为1，其值为1。另，负数按补码形式参加按位或运算。
        System.out.println("3|5:" + (3 | 5));    //0000 0011 | 0000 0101 = 0000 0111  即7
        System.out.println("-3|5:" + (-3 | 5));  //1111 1101 | 0000 0101 = 1111 1101（减1取反）  → 1000 0011  即-3
        //异或运算符（^）：两个相应位值不同，则该位结果为1，否则为0（同0）
        System.out.println("3^5:" + (3 ^ 5));    //0000 0011 ^ 0000 0101 = 0000 0110 即6
        System.out.println("3^3:" + (3 ^ 3));    //0000 0011 ^ 0000 0011 = 0000 0000 即0
        //取反运算符（~）     运算规则：    ①(原码)     ②(取反)   ③(再取反(符号不动))  ④(再+1/-1)(正数+1/负数-1)
        System.out.println("~1:" + (~1));  //0000 0001 → 1111 1110   →  1000 0001  →  1000 0010 即-2
        System.out.println("7&~1:" + (7 & ~1));  //使一个数的最低位为零，可以表示为：a&~1。 0111 → 0110即6
        System.out.println("~0:" + (~0));  //0000 0000 → 1111 1111   →  1000 0000  →  1000 0001 即-1
        System.out.println("~-1:" + (~-1));//1000 0001 → 0111 1110   →  0000 0001  →  0000 0000 即0
        System.out.println("~5:" + (~5));  //0000 0101 → 1111 1010   →  1000 0101  →  1000 0110 即-6
        System.out.println("~-6:" + (~-6));//1000 0110 → 0111 1001   →  0000 0110  →  0000 0101 即5
        //左移运算符（<<）   简记为  *2^n    但是符号位不动
        System.out.println("1<<2:" + (1 << 2));   //0000 0001 → 0000 0100 即4
        System.out.println("3<<3:" + (3 << 3));   //0000 0011 → 0001 1000 即24
        System.out.println("-7<<2:" + (-7 << 2)); //1000 0111 → 1001 1100 即-28
        //实际上：    原码        补码         左移两位    作为补码        -1          取反
        System.out.println("-7<<2:" + (-7 << 2)); //1000 0111 → 1111 1001 → 1110 0100 → 1110 0100 → 1110 0011 → 1001 1100 即-28
        //右移运算符（<<）  -7:10000000 00000000 00000000 00000111          右移两位
        System.out.println("-7>>2:" + (-7 >> 2)); //1000 0111 → 1111 1001 → 1111 1110 → 1111 1110 → 1111 1101 → 0000 0010 即-2
        System.out.println("-5>>2:" + (-5 >> 2)); //1000 0101 → 1111 1011 → 1111 1110 → 1111 1110 → 1111 1101 → 0000 0010 即-2
        //无符号右移运算符（>>>）
        System.out.println("-14>>>2:" + (-14 >>> 2));
    }
}
