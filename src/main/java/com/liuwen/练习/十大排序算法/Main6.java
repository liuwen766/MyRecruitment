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
        int L = start;
        int R = end;
        //递归结束条件
        if(L>=R){
            return array;
        }
        int pivot = array[L];
        while (L<R){
            //step1：从右向左找到第一个比pivot小的数
            while (L<R&&array[R]>=pivot){
                R--;
            }
            //找到之后交换
            if(L<R){
                array[L]=array[R];
            }
            //step2：从左向右找到第一个比pivot大的数
            while (L<R&&array[L]<=pivot){
                L++;
            }
            //找到之后交换
            if(L<R){
                array[R]=array[L];
            }
            //当L与R相遇的时候，一遍找完。
            if(L==R){
                array[L]=pivot;
            }
        }
        //step3：两边子数组分别递归
        quickSort(array,start,L-1);
        quickSort(array,L+1,end);
        //step4：递归结束时返回
        return array;
    }

}
