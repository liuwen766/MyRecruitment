package com.liuwen.牛客网;

import java.util.Scanner;

/**
 * @description: 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 * @author: Liu Wen
 * @create: 2020-03-07 16:55
 **/
public class Main7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = Fibonacci(n);
        System.out.println(result);
    }
    /**
     * @Description:  递归解决
      * @param n
     * @return int
     * @date 20.3.7 16:58
     */
    public static int Fibonacci(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
}
