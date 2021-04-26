package com.liuwen.牛客网;

import java.util.Arrays;

/**
 * @description: 数组中的逆序对
 * @author: Liu Wen
 * @create: 2020-03-20 15:19
 **/
public class Main35 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 0};
        int res = InversePairs1(array);
        System.out.println(res);
    }

    /**
     * @Description: 归并排序（牛逼的算法）
     * @date 20.3.20 16:39
     */
    /*
   array  5 7   4 6      5 7   4 6      5 7   4 6
            ↑p1   ↑p2      ↑p1   ↑p2      ↑p1   ↑p2
    copy          7            6 7          5 6 7
     */
    public static int InversePairs1(int[] array) {

        return 0;
    }

    /**
     * @Description: 逐个扫描，计算逆序对；时间复杂度为O(n^2)。运行时间过长，算法不通过。
     * @date 20.3.20 16:31
     */
    public static int InversePairs(int[] array) {
        int res = 0;
        if (array.length == 0) {
            return res;
        }
        int[] newArr = new int[array.length - 1];
        for (int i = 0; i < array.length - 1; i++) {
            int count = 0;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    count++;
                }
            }
            newArr[i] = count;
        }
        for (int i = 0; i < newArr.length; i++) {
            res += newArr[i];
        }
        return res % 1000000007;
    }
}
