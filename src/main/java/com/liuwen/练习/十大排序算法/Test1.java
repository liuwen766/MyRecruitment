package com.liuwen.练习.十大排序算法;

import java.util.Arrays;

/**
 * @description: 合并两个有序数组
 * @author: Liu Wen
 * @create: 2020-03-05 16:00
 **/
public class Test1 {
    public static void main(String[] args) {
//        int[] A = {1,3,4,7,10,15};
//        int[] B = {2,8,12};
//        int[] result = merge(A,B);
        int[] B = {2, 8, 12, 5, 3, 1, 5, 3, 8, 9, 4, 2, 0};
        int L = 0;
        int R = B.length - 1;
        heapSort(B, B.length);
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
    }

    private static void heapSort(int[] tree, int n) {
        buildHeap(tree, n);
        for (int i = n - 1; i > 0; i--) {
            swap(tree, 0, i);
            heapify(tree, i, 0);
        }
    }

    private static void buildHeap(int[] tree, int n) {
        int lastNode = n - 1;
        int parent = (lastNode - 1) >> 1;
        for (int i = parent; i >= 0; i--) {
            heapify(tree, n, i);
        }
    }

    private static void heapify(int[] tree, int n, int i) {
        int c1 = 2 * i + 1;
        int c2 = 2 * i + 2;
        int max = i;
        if (c1 < n && tree[max] < tree[c1]) {
            max = c1;
        }
        if (c2 < n && tree[max] < tree[c2]) {
            max = c2;
        }
        if (max != i) {
            swap(tree, max, i);
            heapify(tree, n, max);
        }
    }

    private static void swap(int[] tree, int max, int i) {
        int temp = tree[max];
        tree[max] = tree[i];
        tree[i] = temp;
    }


}
