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

    /**
     * @Description: 选择排序首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
     * 以此类推，直到所有元素均排序完毕。
      * @param array
     * @return int[]
     * @date 20.3.2 17:41
     */
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
