package com.liuwen.练习.全排列;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @description:     全排列问题：给你一串数字（不重复），返回它的全排列
 * @author: Liu Wen                       eg：1，2，3的全排列：
 * @create: 2020-03-12 11:43              123，132，213，231，312，321
 **/
public class Main1 {
    public static void main(String[] args){
        int[] nums = {1,2,3};
        perm(nums,0,2);                          // Permutation Sequence 全排列
    }
    /**
     * @Description:       递归实现
      * @param nums
     * @return void
     * @date 20.3.12 11:52
     */
    public static void perm(int[] nums,int L, int R) {
        if(L==R){                     //结束条件：当只有一个数字做全排列的时候，则就只有一种可能。
              System.out.println(Arrays.toString(nums));
        }
        for (int i = L; i <= R; i++) {
            swap(nums,L,i);             //step1:把第一个数与第i个交换；
            perm(nums,L+1,R);         //step2:全排列后面的数组；
            swap(nums,L,i);             //step3:在交换第一个数与第i+1个数之前，把原来的交换复原。
        }
    }
    //交换数组中的两个数（必须传递下标，要不然完不成交换）
    private static void swap(int[] nums, int p,int q) {
        int temp = nums[p];
        nums[p] = nums[q];
        nums[q] = temp;
    }
    //打印数组
    private static void printPerm(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
        System.out.println();       //每打印一组就换行
    }

}
