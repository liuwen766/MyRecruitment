package com.liuwen.五大算法题.分治法;

/**
 * ----------------------------------------------------------------------
 * 快速排序
 *
 * @author Create by liu wen at 2021.4.26 19:23
 * <p>
 * ----------------------------------------------------------------------
 */
public class QuickSort {
    public static void main(String[] args) {
        //构造一个数组
        int[] arr = {5, 6, 1, 9, 3, 4, 9, 7, 2, 6, 5, 48, 2, 8, 4, 21, 3, 69, 9, 4, 16, 5, 4, 6, 4, 2, 3, 598, 5};
        //调用快速排序方法
        int left = 0;
        int right = arr.length - 1;
        quickSort(arr, left, right);
        //打印这个数组
        print(arr);


    }

    /**
     * 快速排序
     *
     * @param arr
	 * @param left
	 * @param right
     * @return void
     * @date 11:10 2021.4.29
     */
    private static void quickSort(int[] arr, int left, int right) {
        //递归结束条件
        if (left >= right) {
            return;
        }
        //以第一个数为分界
        int temp = arr[left];
        int i = left;
        int j = right + 1;
        //每次调用完成一次分组,所以用while循环，里面设置break条件
        while (true) {
            //从左往右边找出第一个比所选值temp大的数
            while (arr[++i] < temp) {
//                i++;
                //当循环到最右边，停止
                if (i == right) {
                    break;
                }
            }
            //从右往左边找出第一个比所选值temp小的数
            while (arr[--j] > temp) {
//                j--;
                if (j == left) {
                    break;
                }
            }
            //交换之前判断一下，能否交换，这也是循环终止条件之一
            if (i >= j) {
                break;
            }
            //交换
            swap(arr, i, j);
        }
        //完成一次排序之后，交换所选值与arr[j]
        swap(arr, left, j);

        //递归快排
        quickSort(arr, left, j - 1);
        quickSort(arr, j + 1, right);

    }

    /**
     * 交换数组中的两个值，传数组索引（引用和传值）
     * @param arr  数组
	 * @param i  数组索引
	 * @param j  数组索引
     * @date 10:52 2021.4.29
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
