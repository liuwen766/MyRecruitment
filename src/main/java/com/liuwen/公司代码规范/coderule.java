package com.liuwen.公司代码规范;

import com.liuwen.MyCSDN.集合类.Collection_Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * ----------------------------------------------------------------------
 * @description:  公司代码规范（
 * @author: Create by Liu Wen at 2020-07-10 14:13
 * ----------------------------------------------------------------------
 **/

public class coderule {
    public static void main(String[] args){
        //1.	【强制】代码中的命名均不能以下划线或美元符号开始，也不能以下划线或美元符号结束。

        //2.	【强制】代码中的命名严禁使用拼音与英文混合的方式，更不允许直接使用中文的方式。

        //3.	【强制】类名使用 UpperCamelCase 风格，但以下情形例外：DO / BO / DTO / VO / AO / PO / UID 等。

        //4.	【强制】方法名、参数名、成员变量、局部变量都统一使用 lowerCamelCase 风格，必须遵从驼峰形式。

        //5.	【强制】代码中的命名严禁使用拼音与英文混合的方式，更不允许直接使用中文的方式。

        //6.	【推荐】抽象类命名使用 Abstract 或 Base 开头；异常类命名使用 Exception 结尾；测试类命名以它要测试的类的名称开始，以 Test 结尾。

        //7.	【推荐】类型与中括号紧挨相连来表示数组。

        //8.	【强制】POJO 类中布尔类型的变量，都不要加 is 前缀，否则部分框架解析会引起序列化错误。

        long a = 1L;
        Long b = 1L;
        System.out.println(a == b);

        String string = "abcde";

        Collection collections = new ArrayList<Integer>();
        collections.stream();


        System.out.println(stringHandler("string",(s)->s.toUpperCase()));

    }

    public static String stringHandler(String s,MyFunction mf){
        return mf.getVlaue(s);
    }
}
