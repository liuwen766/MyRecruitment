package com.liuwen.练习.全排列;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @description: 全排列：有返回值的全排列
 * @author: Liu Wen
 * @create: 2020-03-23 16:00
 **/
public class Main2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ArrayList<ArrayList<Integer>> arrayLists = permutation(arr);

        //结果用二维数组显示
        int[][] ans = new int[arrayLists.size()][arr.length];
        for (int i = 0; i < arrayLists.size(); i++) {
            for (int j = 0; j < arr.length; j++) {
                ans[i][j] = arrayLists.get(i).get(j);
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.toString(ans));
//        System.out.println(arrayLists.toString());
    }

    private static ArrayList<ArrayList<Integer>> permutation(int[] arr) {
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        permHelper(arrayLists, arr, 0, arr.length - 1);
        return arrayLists;
    }

    private static void permHelper(ArrayList<ArrayList<Integer>> arrayLists, int[] nums, int start, int end) {
        //结束条件：当只有一个数字做全排列的时候，则就只有一种可能。
        if (start == end) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                arrayList.add(nums[i]);
            }
            arrayLists.add(arrayList);         //结果保存在传参 arrayLists 中
        } else {
            for (int i = start; i <= end; i++) {

                //step1:把第一个数与第i个交换；
                int tmp = nums[start];
                nums[start] = nums[i];
                nums[i] = tmp;

                //step2:对后面的数组做全排列；
                permHelper(arrayLists, nums, start + 1, end);

                //step3:在交换第一个数与第i+1个数之前，把原来的交换复原。
                tmp = nums[start];
                nums[start] = nums[i];
                nums[i] = tmp;
            }

        }
    }

}
