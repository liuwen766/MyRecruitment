package com.liuwen.练习.排序算法;

/**
 * @description: 希尔排序
 * @author: Liu Wen
 * @create: 2020-03-05 14:32
 **/
public class Main4 {
    public static void main(String[] args) {
        int[] array = {7, 8, 1, 3, 5, 2, 4, 9, 6};
        int[] result = ShellSort(array);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    /**
     * @Description: 它与插入排序的不同之处在于，
     *                它会优先比较距离较远的元素。
     *                希尔排序又叫缩小增量排序。
      * @param array
     * @return int[]
     * @date 20.3.5 14:33
     */
    private static int[] ShellSort(int[] array) {
        int gap = array.length/2;
        int cur;
        int preIndex;
        while (gap>0){
            for (int i = gap; i < array.length; i++) {
                cur = array[i];
                preIndex = i - gap;
                while (preIndex>=0&&array[preIndex]>cur){
                    array[preIndex+gap] = array[preIndex];
                    preIndex = preIndex-gap;
                }
                array[preIndex+gap] = cur;
            }
            gap = gap/2;
        }
        return array;
    }
}
