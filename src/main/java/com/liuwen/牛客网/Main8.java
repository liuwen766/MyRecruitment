package com.liuwen.牛客网;

import java.util.Scanner;

/**
 * @description: 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 * @author: Liu Wen
 * @create: 2020-03-07 17:07
 **/
public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        int result = JumpFloor(target);
        System.out.println(result);
    }

    /**
     * @param target
     * @return int
     * @Description: 递归
     * @date 20.3.7 17:09
     */
    public static int JumpFloor(int target) {
        if (target == 0) {
            return 0;
        }
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 2;
        }
        return JumpFloor(target - 1) + JumpFloor(target - 2);
    }
}
