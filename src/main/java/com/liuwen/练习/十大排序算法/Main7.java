package com.liuwen.练习.十大排序算法;

/**
 * @description: 堆排序
 * @author: Liu Wen
 * @create: 2020-03-18 12:35
 **/
public class Main7 {
    public static void main(String[] args) {
        int[] array = {2, 5, 3, 1, 10, 4};
        heapSort(array, array.length);
        for (int val : array) {
            System.out.print(val + " ");
        }
    }

    //step3:heapSort     完成堆排序，每次取最顶的数，然后heapify
    public static void heapSort(int[] tree, int n) {
    }

    //step2:build_head()   建立有序堆


    //step1:heapify()   建立大顶堆


}
