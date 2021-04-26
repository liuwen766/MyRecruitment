package com.liuwen.牛客网;

import java.util.Scanner;

/**
 * @description: 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个21的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 * @author: Liu Wen
 * @create: 2020-03-07 19:11
 **/
public class Main10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = RectCover(n);
        System.out.println(result);
    }

    /**
     * @param n 1  2  3  5  8  13 21 34
     * @return int
     * @Description: 1  2  3  4  5  6  7  8
     * @date 20.3.7 19:16
     */
    public static int RectCover(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return n;
        }
        return RectCover(n - 1) + RectCover(n - 2);
    }
}
