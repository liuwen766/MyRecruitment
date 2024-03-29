package com.liuwen.牛客网;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @description: 连续子数组的最大和
 * @author: Liu Wen
 * @create: 2020-03-10 20:20
 **/
public class Main30 {
    public static void main(String[] args) {
        int[] array = {2, 8, 1, 5, 9};
        int ans = FindGreatestSumOfSubArray1(array);
        System.out.println(ans);
    }

    /**
     * @param array
     * @return int
     * @Description: 方法2：动态规划
     * F（i）：以array[i]为末尾元素的子数组的和的最大值，子数组的元素的相对位置不变
     * F（i）= max（F（i-1）+array[i] ， array[i]）
     * res=max（res，F（i））    res：所有子数组的和的最大值
     * @date 20.3.10 21:36
     */
    public static int FindGreatestSumOfSubArray1(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int Fn = array[0];       //包含array[i]的连续数组最大值
        int res = array[0];      //记录当前所有子数组的和的最大值
        for (int i = 1; i < array.length; i++) {
            Fn = Math.max(Fn + array[i], array[i]);
            res = Math.max(Fn, res);
        }
        return res;
    }

    /**
     * @param array
     * @return int
     * @Description: 方法1：暴力搜索。把以每个元素为起始点的子数组的和都算出来，保留最大值。
     * @date 20.3.10 20:21
     */
    public static int FindGreatestSumOfSubArray(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (array.length == 0) {
            return 0;
        }
        for (int i = 0; i <= array.length - 1; i++) {
            int tmp = 0;
            int max = array[i];
            if (tmp > array[i]) {
                tmp = array[i];
            }
            for (int j = i; j <= array.length - 1; j++) {
                tmp = tmp + array[j];
                if (max <= tmp) {
                    max = tmp;
                }
            }
            arrayList.add(max);
        }
        Collections.sort(arrayList);
        return arrayList.get(arrayList.size() - 1);
    }
}
