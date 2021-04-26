package com.liuwen.牛客网;

import java.util.TreeSet;

/**
 * @description: 旋转数组的最小数字
 * @author: Liu Wen
 * @create: 2020-03-07 14:40
 **/
public class Main6 {
    public static void main(String[] args) {
        int[] array = {4, 5, 6, 1, 2, 3};
        int result = minNumberInRotateArray2(array);
        System.out.println(result);
    }

    /**
     * @param array
     * @return int
     * @Description: 方法1：找出最小的数的索引（选择排序）
     * @date 20.3.8 12:34
     */
    public static int minNumberInRotateArray(int[] array) {
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[minIndex] >= array[i]) {
                minIndex = i;
            }
        }
        return array[minIndex];
    }

    /**
     * @param array
     * @return int
     * @Description: 方法2：利用TreeSet（TreeSet默认升序）  最简单但耗时耗内存
     * @date 20.3.7 15:11
     */
    public static int minNumberInRotateArray1(int[] array) {
        TreeSet treeSet = new TreeSet();
        for (int i = 0; i < array.length; i++) {
            treeSet.add(array[i]);
        }
        return Integer.valueOf(treeSet.first().toString());
    }

    /**
     * @param array
     * @return int
     * @Description: 方法3：二分查找      最优解，也是出这题的人希望看到的答案
     * @date 20.3.7 15:28
     */
    //       5,6,7,8,9,1,4
    public static int minNumberInRotateArray2(int[] array) {
        int mid = 0;
        int L = 0;
        int R = array.length - 1;
        while (L < R) {
            mid = L + (R - L) / 2;
            if (array[mid] > array[R]) {            //情况1
                L = mid + 1;
            } else if (array[mid] == array[R]) {     //情况2
                R--;
            } else {                                //情况3
                R = mid;
            }
        }
        return array[L];
    }
}
