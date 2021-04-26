package com.liuwen.各公司笔试题.交行;

import java.util.Scanner;

/**
 * @description: 字符串最小距离
 * @author: Liu Wen
 * @create: 2020-04-19 15:46
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        //TODO
        int res = calculateStringDistance(str1, str2);
        System.out.println(res);
    }

    public static int calculateStringDistance(String str1, String str2) {
        //TODO
        int len1 = str1.length();
        int len2 = str2.length();

        if (len1 * len2 == 0)
            return len1 + len2;

        int[][] D = new int[len1 + 1][len2 + 1];

        for (int i = 0; i < len1 + 1; i++) {
            D[i][0] = i;
        }
        for (int j = 0; j < len2 + 1; j++) {
            D[0][j] = j;
        }

        for (int i = 1; i < len1 + 1; i++) {
            for (int j = 1; j < len2 + 1; j++) {
                int left = D[i - 1][j] + 1;
                int bottom = D[i][j - 1] + 1;
                int leftBottom = D[i - 1][j - 1];
                if (str1.charAt(i - 1) != str2.charAt(j - 1)) {
                    leftBottom += 1;
                }
                D[i][j] = Math.min(left, Math.min(bottom, leftBottom));
            }
        }
        return D[len1][len2];
    }

    public static int min(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
}
