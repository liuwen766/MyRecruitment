package com.liuwen.练习.十大排序算法;

/**
 * @description   快速排序
 * @author: Liu Wen
 * @create: 2020-03-18 10:33
 **/
public class Main6 {
    public static void main(String[] args){
        int[] array = {7, 8, 1, 3, 5, 2, 4, 9, 6};
        int[] result = quickSort(array,0,array.length-1);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    /**
     * @Description:
     * @date 20.3.18 11:37
     */
    private static int[] quickSort(int[] array, int start, int end) {

        return new int[0];
    }

}
