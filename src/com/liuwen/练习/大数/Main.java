package com.liuwen.练习.大数;

import java.math.*;
/**
 * @description: Good good study,day day up!
 * @author: Liu Wen
 * @create: 2020-02-26 13:05
 **/
public class Main{
    public static void main(String[] args) {
        //大数加减乘除
        int a = 156, b = 55, c = 1652;
        double d = 166.7,e = 55.5;
        BigInteger x, y, z, ans;
        BigDecimal num1,num2,res;
        x = BigInteger.valueOf(a);
        y = BigInteger.valueOf(b);
        z = BigInteger.valueOf(c);
        num1 = BigDecimal.valueOf(d);
        num2 = BigDecimal.valueOf(e);
        ans = x.add(y);
        System.out.println("a+b= "+ans);
        ans = x.subtract(y);
        System.out.println("a-b= "+ans);
        ans = x.multiply(y);
        System.out.println("a*b= "+ans);
        ans = z.divide(y);
        System.out.println("c/b= "+ans);
        ans = z.remainder(y);
        System.out.println("c%b= "+ans);
        res = num1.add(num2);
        System.out.println("num1+num2= "+res);
        res = num1.subtract(num2);
        System.out.println("num1-num2= "+res);
        res = num1.multiply(num2);
        System.out.println("num1*num2= "+res);
        res = num1.divide(num1);
        System.out.println("num1/num1= "+res);
        res = num1.remainder(num2);
        System.out.println("num1%num2= "+res);
        //进制转换
        String result1 = Integer.toHexString(15);                     //十进制转成十六进制
        String result2 = Integer.toOctalString(15) ;                  //十进制转成八进制
        String result3 = Integer.toBinaryString(15);                  //十进制转成二进制
        String result4 = Integer.valueOf("10",16).toString(); //十六进制转成十进制
        String result5 =Integer.valueOf("17",8).toString();   //八进制转成十进制
        String result6 = Integer.valueOf("0101",2).toString();  //二进制转十进制
        System.out.println("十进制转成十六进制："+result1);
        System.out.println("十进制转成八进制："+result2);
        System.out.println("十进制转成二进制："+result3);
        System.out.println("十六进制转成十进制："+result4);
        System.out.println("八进制转成十进制："+result5);
        System.out.println("二进制转十进制："+result6);

    }


}
