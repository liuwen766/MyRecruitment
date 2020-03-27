package com.liuwen.牛客网;

/**
 * @description: 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * @author: Liu Wen
 * @create: 2020-03-08 14:00
 **/
public class Main12 {
    public static void main(String[] args){
        double base = 5;
        int exponent = -6;
        double result = Power(base,exponent);
        System.out.println(result);
    }

    /**
     * @Description:   方法1：递归解法
      * @param base
    * @param exponent
     * @return double
     * @date 20.3.8 14:04
     */
    public static double Power1(double base, int exponent) {
        if(exponent<0){
            return 1/(base*Power1(base,-exponent-1));
        }
        if(exponent==0){
            return 1;
        }
        if(exponent==1){
            return base;
        }
        return base*Power1(base,exponent-1);
    }
    /**
     * @Description:       方法1：数学公式
      * @param base
     * @param exponent
     * @return double
     * @date 20.3.8 14:02
     */
    public static double Power(double base, int exponent) {
        return Math.pow(base,exponent);
    }
}
