package com.liuwen.练习.排序算法;

/**
 * @description: 插入排序
 * @author: Liu Wen
 * @create: 2020-03-02 14:24
 **/
public class Main3 {

    public static void main(String[] args){
        int[] array = {7,8,1,3,5,2,4,9,6};
        int[] result = InsertSort(array);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }

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
}
