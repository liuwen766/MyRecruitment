package com.liuwen.练习;

/**
 * @author oldmonk
 * @description 矩阵转置
 * @time 2017年8月18日
 */
public class test {

    public static void main(String[] args) {
        int data[][] = new int[][]{{1, 2, 3, 4}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("----------------转置前------------------------");
        transposition_Arrays2D();
        System.out.println("----------------转置后------------------------");

    }

    public static void transposition_Arrays2D() {
/**定义要用于转置的二维数组**/
        int arr2D[][] = {
                {1, 2, 3},
                {4, 5, 6, 11},
                {7, 8, 9}};
/**构造结果新二维数组用于存放转置结果**/
// 而构造二维数组可以为维度来进行，不一定是一个矩阵，即每一行的长度不一定相同
        int second = 0;
// 取出二维中最大的数组长度
        for (int temp[] : arr2D) {
            second = second > temp.length ? second : temp.length;
        }
        int result_arr[][] = new int[second][];// 先实现第一维
// 再实现第二维,实际上二维的长度应该是一样的
        for (int i = 0; i < second; i++) {
            result_arr[i] = new int[arr2D.length];
        }


/*****输出用于转置的二维数组*******/
        for (int x[] : arr2D) {
            for (int e : x) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
        System.out.println();


/** 进行元素倒置  **/
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                result_arr[j][i] = arr2D[i][j]; // 转置核心
            }
        }


/** 打印转置后的结果：对于缺少的元素，只能默认打印出0 **/
        for (int x[] : result_arr) {
            for (int e : x) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }

}