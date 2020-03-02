package com.liuwen.练习.排序算法;

/**
 * @description: 选择排序
 * @author: Liu Wen
 * @create: 2020-03-02 14:23
 **/
public class Main2 {
    public static void main(String[] args){
        int[] array = {7,8,1,3,5,2,4,9,6};
        int[] result = SelectSort(array);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }

    private static int[] SelectSort(int[] array) {
        int minIndex = 0;
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            minIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if(array[j]<array[minIndex]){
                    minIndex = j;
                }
            }
            tmp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tmp;
        }
        return array;
    }
}
