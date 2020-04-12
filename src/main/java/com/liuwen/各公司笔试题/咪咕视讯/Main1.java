package com.liuwen.各公司笔试题.咪咕视讯;

import java.util.Scanner;

/**
 * @description: Good good study,day day up!
 * @author: Liu Wen
 * @create: 2020-04-12 15:03
 **/
public class Main1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
//        2861866653
        long num = scanner.nextLong();
        solution(num);
    }

    private static void solution(long num) {
        if(num>(2^32)||num<0){
            System.out.println(0);
        }
        String s = Long.toBinaryString(num);
        StringBuffer stringBuffer = new StringBuffer(s);
        String res = stringBuffer.reverse().toString();
        System.out.println(Long.valueOf(res,2));
    }


}
