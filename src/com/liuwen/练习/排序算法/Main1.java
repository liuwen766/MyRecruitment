package com.liuwen.练习.排序算法;

/**
 * @description: 冒泡算法
 * @author: Liu Wen
 * @create: 2020-03-02 14:15
 **/
public class Main1 {
    public static void main(String[] args){
        int[] array = {7,8,1,3,5,2,4,9,6};
        int[] result = BubbleSort(array);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }

    private static int[] BubbleSort(int[] array) {
        int tmp;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j]>array[j+1]){
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        return array;
    }

}
