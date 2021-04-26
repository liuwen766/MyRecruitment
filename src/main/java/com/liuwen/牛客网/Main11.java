package com.liuwen.牛客网;

import java.util.Scanner;

/**
 * @description: 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * @author: Liu Wen
 * @create: 2020-03-08 13:45
 **/
public class Main11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = NumberOf12(n);
        System.out.println(result);
    }

    /**
     * @param n eg： 7： 0111     1次
     * @return int                      6： 0110   n&n-1 → 0110   2次
     * 0101  n&n-1 → 0100   三次
     * @Description: 方法2：n&n-1执行的次数可以确定1的个数       这个方法绝了
     * @date 20.3.8 13:52                                                 0011   n&n-1 → 0000
     */
    public static int NumberOf12(int n) {
        int count = 0;
        while (n != 0) {
            n = n & n - 1;
            count++;
        }
        return count;
    }

    /**
     * @param n
     * @return int
     * @Description: 方法1：转成二进制再数1
     * @date 20.3.8 13:48
     */
    public static int NumberOf1(int n) {
        String string = Integer.toBinaryString(n);
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}

