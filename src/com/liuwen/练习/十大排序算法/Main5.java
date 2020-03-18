package com.liuwen.练习.十大排序算法;

import java.util.Arrays;

/**
 * @description: 归并排序
 * @author: Liu Wen
 * @create: 2020-03-05 16:36
 **/
public class Main5 {
    public static void main(String[] args) {
        int[] array = {7, 8, 1, 3, 5, 2, 4, 9, 6};
        int[] result = MergeSort(array);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    /**
     * @Description: 采用分治法，将已有序的子序列合并，得到完全有序的序列；
     * 即先使每个子序列有序，再使子序列段间有序。
     * 若将两个有序表合并成一个有序表，称为2-路归并。
      * @param array
     * @return
     * @date 20.3.5 16:37
     */
    private static int[] MergeSort(int[] array) {
        if(array.length==1){          //数组长度为1的时候直接返回
            return array;
        }
        int mid = array.length/2;
        int[] leftArray = Arrays.copyOfRange(array,0,mid);
        int[] rightArray = Arrays.copyOfRange(array,mid,array.length);
        return merge(MergeSort(leftArray),MergeSort(rightArray));
    }
    //有序子序列的合并
    private static int[] merge(int[] mergeSort1, int[] mergeSort2) {
        if(mergeSort1.length==0&&mergeSort2.length==0)
            return null;
        if(mergeSort1.length==0)
            return mergeSort2;
        if(mergeSort2.length==0){
            return mergeSort1;
        }
        int length = mergeSort1.length+mergeSort2.length;
        int[] newArray = new int[length];
        int j = 0; int k = 0;
        for (int i = 0; i < length; i++) {
            if(j>=mergeSort1.length){
                newArray[i]=mergeSort2[k++];
            }else if(k>=mergeSort2.length){
                newArray[i]=mergeSort1[j++];
            }else if(mergeSort1[j]<mergeSort2[k]){
                newArray[i]=mergeSort1[j++];
            }else {
                newArray[i]=mergeSort2[k++];
            }
//            newArray[i]=mergeSort1[j]<mergeSort2[k]?mergeSort1[j++]:mergeSort2[k];
//            newArray[i]=mergeSort1[j]>=mergeSort2[k]?mergeSort2[k++]:mergeSort1[j];
        }
        return newArray;
    }

}
