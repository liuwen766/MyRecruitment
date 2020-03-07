package com.liuwen.练习.排序算法;

/**
 * @description: 归并排序
 * @author: Liu Wen
 * @create: 2020-03-05 16:36
 **/
public class Main5 {
    public static void main(String[] args) {
        int[] array = {7, 8, 1, 3, 5, 2, 4, 9, 6};
        int[] result = MergeSort(array);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    /**
     * @Description: 采用分治法，将已有序的子序列合并，得到完全有序的序列；
     * 即先使每个子序列有序，再使子序列段间有序。
     * 若将两个有序表合并成一个有序表，称为2-路归并。
      * @param array
     * @return
     * @date 20.3.5 16:37
     */
    private static int[] MergeSort(int[] array) {
        return new int[0];
    }

}
