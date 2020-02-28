package com.liuwen.牛客网.b第二个十题;

import java.util.Scanner;

/**
 * @description: 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * @author: Liu Wen
 * @create: 2020-02-27 20:08
 **/
public class Main1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = NumberOf12(num);
        System.out.println(result);

    }

    /**
     * @Description:  方法1
      * @param n
     * @return int
     * @date 20.2.27 21:15
     */
    public static int NumberOf1(int n) {
        String string = Integer.toBinaryString(n);
        int result = 0;
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i)=='1'){
                result++;
            }
        }
        return result;
    }

    /**
     * @Description: 把一个整数减去1，再和原整数做与运算，会把该整数最右边一个1变成0.
      * @param n
     * @return int
     * @date 20.2.27 21:16
     */
    public static int NumberOf12(int n) {
        int result = 0;
        while(n!=0){
            n = n & (n-1);
            result++;
        }
        return result;
    }
}
