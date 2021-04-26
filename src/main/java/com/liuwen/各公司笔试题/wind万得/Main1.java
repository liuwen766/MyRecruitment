package com.liuwen.各公司笔试题.wind万得;

import java.util.ArrayList;

/**
 * @description: 输入一个递增排序的数组nums和一个数字target (数组nums中的数字和target的数值均为正整数)，
 * 在数组中查找两个数，使得它们的乘积正好是target。如果有多对数字的乘积等于target，输出全部组合。
 * 递增排序的数组（不存在两值相等）。如果数组中不存在目标值，返回 [-1, -1]。
 * @author: Liu Wen
 * @create: 2020-03-09 19:23
 **/
public class Main1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 7, 8, 11, 12, 15};
        int target = 60;
        ArrayList<ArrayList<Integer>> result = getMutiplyOfAB(nums, target);
        System.out.println(result);
    }

    /**
     * @param nums
     * @param target
     * @return java.util.ArrayList<java.util.ArrayList < java.lang.Integer>>
     * @Description: 双指针思想
     * @date 20.3.9 19:49
     */
    private static ArrayList<ArrayList<Integer>> getMutiplyOfAB(int[] nums, int target) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int L = 0;
        int R = nums.length - 1;
        while (L < R) {
            if (nums[L] * nums[R] > target) {
                R--;
            } else if (nums[L] * nums[R] < target) {
                L++;
            } else {
                arrayList.add(nums[L]);
                arrayList.add(nums[R]);
                result.add(arrayList);
                L++;
            }
            arrayList = new ArrayList<>();
        }
        if (result.size() == 0) {
            arrayList.add(-1);
            arrayList.add(-1);
            result.add(arrayList);
        }
        return result;
    }
}
