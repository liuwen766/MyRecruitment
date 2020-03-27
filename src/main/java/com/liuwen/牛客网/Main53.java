package com.liuwen.牛客网;

/**
 * @description:        表示数值的字符串
 * @author: Liu Wen
 * @create: 2020-03-24 11:25
 **/
public class Main53 {
    public static void main(String[] args){
        char[] str = {'+','1','1','0','e','2'};
        boolean res = isNumeric(str);
        System.out.println(res);
    }

    /**
     * @Description:     方法2：排除法
     * （1）+，-只能放在首位或者E,e的后面
     * （2）E或e，以及小数点只能出现一次，并且：在有E或者e的情况下，小数点不能在E，e后面出现
     * （3）不能有除了数字，E，e，小数点，+，-之外的其他字符出现
     * （4）e或E后面必须出现数字，如果后面是+或-，continue，继续判单有没有数字，直到找到为止。
     * （5）不能是空符号串
     * @date 20.3.24 11:20
     */
    public static boolean isNumeric1(char[] str) {
        return false;
    }
    /**
     * @Description:      方法1：正则表达式
     * @date 20.3.24 11:17
     */
    public static boolean isNumeric(char[] str) {
        String string = String.valueOf(str);
        return string.matches("[\\+\\-]?\\d*(\\.\\d+)?([eE][\\+\\-]?\\d+)?");
//        return string.matches("[+-]?[0-9]*(\\.[0-9]*)?([eE][+-]?[0-9]+)?");
    }

}
