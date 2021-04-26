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
        build_heap(tree, n);     //先建立有序堆
        for (int i = n - 1; i >= 0; i--) {
            swap(tree, i, 0);   //每次取最顶的数
            heapify(tree, i, 0);  //最后heapify
        }
    }

    //step2:build_head()   建立有序堆
    public static void build_heap(int[] tree, int n) {
        int lastNode = n - 1;
        int parent = (lastNode - 1) / 2;
        for (int i = parent; i >= 0; i--) {
            heapify(tree, n, i);
        }
    }

    //step1:heapify()   建立大顶堆
    public static void heapify(int[] tree, int n, int i) {
        int c1 = 2 * i + 1;
        int c2 = 2 * i + 2;
        int max = i;
        if (c1 < n && tree[c1] > tree[max]) {
            max = c1;
        }
        if (c2 < n && tree[c2] > tree[max]) {
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
