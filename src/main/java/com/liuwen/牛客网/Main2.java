package com.liuwen.牛客网;

import java.util.Scanner;

/**
 * @description: 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * @author: Liu Wen
 * @create: 2020-02-27 18:20
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        StringBuffer stringBuffer = new StringBuffer(string);
        String result = replaceSpace2(stringBuffer);
        System.out.println(result);
    }

    /**
     * @param str
     * @return java.lang.String
     * @Description: 使用 String 自带函数 replaceAll()
     * @date 20.2.27 19:24
     */
    public static String replaceSpace(StringBuffer str) {
        String result = "";
        String s = str.toString();
        result = s.replaceAll(" ", "%20");
        return result;
    }

    /**
     * @param str
     * @return java.lang.String
     * @Description: 方法2. 遍历，遇见一个空格则加一个%20
     * @date 20.2.27 19:23
     */
    public static String replaceSpace1(StringBuffer str) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str == null) {
            return stringBuffer.toString();
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                stringBuffer.append("%20");
            } else {
                stringBuffer.append(c);
            }
        }
        return stringBuffer.toString();
    }

    /**
     * @param str
     * @return java.lang.String
     * @Description: 从后向前遍历
     * @date 20.2.27 19:23
     */
    public static String replaceSpace2(StringBuffer str) {
        //计算出新字符串的长度
        int space = 0;
        int oldLength = str.length();
        int newLength = 0;
        for (int i = 0; i < oldLength; i++) {
            if (str.charAt(i) == ' ') {
                space++;
            }
        }
        System.out.println(space);
        newLength = oldLength + space * 2;
        int newIndex = newLength - 1;
        str.setLength(newLength);
        for (int i = oldLength - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {

                str.setCharAt(newIndex--, '0');
                str.setCharAt(newIndex--, '2');
                str.setCharAt(newIndex--, '%');

            } else {
                str.setCharAt(newIndex--, str.charAt(i));
            }
        }
        return str.toString();
    }


}
