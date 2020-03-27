package com.liuwen.MyCSDN.基本数据类型;

/**
 * @description:         byte(1), short(2), int(4), long(8), float(4), double(8), Boolean(1), char(2)
 * @author: Liu Wen       2^7-1
 * @create: 2020-03-12 17:12
 **/
/*
整型：
byte：-2^7 ~ 2^7-1，即-128 ~ 127。1字节。Byte。末尾加B
short：-2^15 ~ 2^15-1，即-32768 ~ 32767。2字节。Short。末尾加S
有符号int：-2^31 ~ 2^31-1，即-2147483648 ~ 2147483647。4字节。Integer。
无符号int：0~2^32-1。
long：-2^63 ~ 2^63-1，即-9223372036854774808 ~ 9223372036854774807。8字节。Long。末尾加L。（也可以不加L）
浮点型：
float：4字节。Float。末尾加F。（也可以不加F）
double：8字节。Double。
字符型：
char：2字节。Character。
布尔型：
boolean：Boolean。
 */
public class Test1 {
    public static void main(String[] args){
        int num = 127;
        Integer integer = num+1;
        System.out.println(integer);
        byte num1 = 127;
        Integer integer1 = num1+1;
        System.out.println(integer1);
        byte integer2 = (byte)(num1+1);
        System.out.println(integer2);
    }
}
