package com.liuwen.牛客网;

import java.util.Scanner;

/**
 * @description: 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * @author: Liu Wen
 * @create: 2020-03-07 18:20
 **/
public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        int result = JumpFloorII1(target);
        System.out.println(result);
    }

    /**
     * @param target 1   2   4   8   16
     * @return int
     * @Description: 方法1： 递归         1   2   3   4   5
     * @date 20.3.7 18:22
     */
    public static int JumpFloorII(int target) {
        if (target == 0) {
            return 0;
        }
        if (target == 1) {
            return 1;
        }
        return 2 * JumpFloorII(target - 1);
    }

    /**
     * @param target 1   2   4   8   16 ... 2^(n-1)
     * @return int
     * @Description: 方法 2    ： 1   2   3   4   5  ... n
     * @date 20.3.7 19:07
     */
    public static int JumpFloorII1(int target) {
        int result = (int) Math.pow(2, target - 1);
        return result;
    }
}
