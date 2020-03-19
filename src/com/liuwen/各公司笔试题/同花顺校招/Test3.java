package com.liuwen.各公司笔试题.同花顺校招;

/**
 * @description: Good good study,day day up!
 * @author: Liu Wen
 * @create: 2020-03-18 19:34
 **/
public class Test3 {
    public static void main(String[] args){
//        int num1 = 25;int num2 = 28;int num3 = 325;
//        int max = (Math.max(num1,num2))>num3?(Math.max(num1,num2)):num3;
//        System.out.println(max);
        StringBuffer stringBuffer = new StringBuffer();
        String s = "0001001100010111000100110001001";
        String s1 = s.substring(0,8);
        String s2 = s.substring(8,16);
        String s3 = s.substring(16,24);
        String s4 = s.substring(24);
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
//        System.out.println(s4);
        System.out.println(Integer.valueOf(s1,2).toString());
        stringBuffer.append(Integer.valueOf(s1,2).toString()).append(".").append(Integer.valueOf(s2,2).toString())
        .append(".").append(Integer.valueOf(s3,2).toString()).append(".").append(Integer.valueOf(s2,2).toString());
                System.out.println(stringBuffer);
    }
}
