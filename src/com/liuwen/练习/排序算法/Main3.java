package com.liuwen.练习.排序算法;

/**
 * @description: 插入排序
 * @author: Liu Wen
 * @create: 2020-03-02 14:24
 **/
public class Main3 {

    public static void main(String[] args){
        int[] array = {7,8,1,3,5,2,4,9,6};
        int[] result = InsertSort1(array);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }

    /**
     * @Description: 插入排序的工作原理是通过构建有序序列，对于未排序数据，
     * 在已排序序列中从后向前扫描，找到相应位置并插入。
     * @param array
     * @return int[]
     * @date 20.3.2 17:41
     */
    private static int[] InsertSort(int[] array) {
        int preIndex; int cur;
        for (int i = 1; i < array.length; i++) {
            cur = array[i]; preIndex = i-1;
            while (preIndex>=0&&array[preIndex]>cur){
                array[preIndex+1]=array[preIndex];
                preIndex--;
            }
            array[preIndex+1]=cur;
        }
        return array;
    }
     //                preIndex   i
     //练习1 2   4   6     7      3    4    1
    //                           cur
    private static int[] InsertSort1(int[] array) {
        int preindex;
        int cur = 0;
        for (int i = 1; i < array.length; i++) {
            preindex = i-1;
            cur = array[i];
            while (preindex>=0&&array[preindex]>cur){
                array[preindex+1] = array[preindex];
                preindex--;
            }
            array[preindex+1] = cur;
        }
        return array;
    }
}
