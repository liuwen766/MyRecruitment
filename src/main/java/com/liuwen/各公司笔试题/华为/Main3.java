package com.liuwen.各公司笔试题.华为;

import java.util.Scanner;

/**
 * @description: n(n<30)个人站成一圈，逆时针编号1~n。
 * 有A、B两人，A从1开始逆时针数k个，B则从n开始数m个（有可能停在同一个人）。
 * 接下来从A、B各自选中的人挑（1或2个）人离开队伍。
 * eg：输入：10 4 3
 *     输出：  4  8,  9  5,  3  1,  2  6, 10,  7
 * @author: Liu Wen
 * @create: 2020-02-26 20:06
 **/
public class Main3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        solution(str);
    }

    private static void solution(String str) {
        int[] arr = new int[3];
        String[] strArr = str.split(" ");
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.valueOf(strArr[i]);
        }
        int n = arr[0];int k = arr[1];int m = arr[2];
        System.out.println("  4  8,  9  5,  3  1,  2  6, 10,  7");
    }
}
