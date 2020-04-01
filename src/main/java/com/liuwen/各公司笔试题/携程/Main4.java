package com.liuwen.各公司笔试题.携程;

import java.util.Scanner;

/**
 * @description: Good good study,day day up!
 * @author: Liu Wen
 * @create: 2020-04-01 19:46
 **/
public class Main4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String result = findInString(str);
        System.out.println(result);
    }

    private static String findInString(String str) {
        String [] strings = {"surprise", "happy", "ctrip", "travel", "wellcome","student","system","program","editor"};
        for (int i = 0; i < strings.length; i++) {
            int ans = minCRUD(str,strings[i]);
            if(ans<=2){
                return strings[i];
            }
        }
        return null;
    }

    public static int minCRUD(String str1,String str2){
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
                D[i][j] = Math.min(left,Math.min(bottom,leftBottom));
            }
        }
        return D[len1][len2];
    }

}
