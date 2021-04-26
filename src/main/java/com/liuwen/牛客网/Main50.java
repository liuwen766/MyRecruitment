package com.liuwen.牛客网;

/**
 * @description: 数组中重复的数字
 * @author: Liu Wen
 * @create: 2020-03-15 12:19
 **/
public class Main50 {
    public static void main(String[] args) {
        int[] nums = {2, 1, 3, 1, 4};
        int[] duplication = new int[1];
        boolean res = duplicate1(nums, nums.length, duplication);
        System.out.println(res);
    }

    /**
     * @Description: 方法2：使用boolean只占一位
     * @date 20.3.15 14:38
     */
    public static boolean duplicate1(int numbers[], int length, int[] duplication) {
        boolean result = false;
        boolean[] buer = new boolean[length];
        for (int i = 0; i < length; i++) {
            if (buer[numbers[i]] == true) {       //**关键**//
                result = true;
                duplication[0] = numbers[i];
                break;
            } else {
                buer[numbers[i]] = true;
            }
        }
        return result;
    }

    /**
     * @Description: 方法1：最简单的方法：
     * 最直接的想法就是构造一个容量为N的辅助数组B，原数组A中每个数对应B中下标，
     * 首次命中，B中对应元素+1。如果某次命中时，B中对应的不为0，说明，前边已经
     * 有一样数字了，那它就是重复的了。
     * @date 20.3.15 12:23
     */
    public static boolean duplicate(int numbers[], int length, int[] duplication) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length - 1; j++) {
                if (numbers[i] == numbers[j]) {
                    duplication[0] = numbers[i];
                    return true;
                }
            }
        }
        return false;
    }
}
