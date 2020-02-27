package com.liuwen.华为;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @description:  阶乘的倒数之和    1+1/2！+1/3！+1/4！+...
 * @author: Liu Wen
 * @create: 2020-02-26 19:05
 **/
public class Main1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double result = solution(n);
//        String res = new DecimalFormat("#.0000").format(result);
        System.out.println(result);
    }

    private static double solution(int n) {
        double result = 0;
        for (int i = 1; i <= n; i++) {
            result = result + 1/jieshu(i);
        }

        return result;
    }

    private static double jieshu(int i) {
        double res = 1;
        for (int j = i; j > 0; j--) {
            res = res*j;
        }
        return res;
    }

}
