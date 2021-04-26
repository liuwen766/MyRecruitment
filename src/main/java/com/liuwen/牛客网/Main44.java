package com.liuwen.牛客网;

/**
 * @description: 翻转单词顺序列
 * @author: Liu Wen
 * @create: 2020-03-11 23:31
 **/
public class Main44 {
    public static void main(String[] args) {
        String str = "student. a am I";
        String result = ReverseSentence(str);
        System.out.println(result);
    }

    /**
     * @param str
     * @return java.lang.String
     * @Description: 方法1：先整个反转，再逐个反转。
     * @date 20.3.11 23:32
     */   //student. a am I  →  I am a student.
    public static String ReverseSentence(String str) {
        if (str.trim().equals("")) {         //用于删除字符串的头尾空白符。
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            stringBuffer.append(str.charAt(i));
        }
        stringBuffer.reverse();
        String string = stringBuffer.toString();
        String[] strings = string.split(" ");
        for (int i = 0; i < strings.length; i++) {
            StringBuffer newStringBuffer = new StringBuffer();
            newStringBuffer.append(strings[i]);
            newStringBuffer.reverse();
            if (i == strings.length - 1) {
                result.append(newStringBuffer);
            } else {
                result.append(newStringBuffer + " ");
            }
        }
        return result.toString();
    }
}
