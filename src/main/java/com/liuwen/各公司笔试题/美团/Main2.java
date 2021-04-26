package com.liuwen.各公司笔试题.美团;

/**
 * @description: 给出一个序列包含n个正整数的序列A，然后给出一个正整数x，你可以对序列进行任意次操作的，
 * 每次操作你可以选择序列中的一个数字，让其与x做按位或运算。你的目的是让这个序列中的众数出现的次数最多。
 * 请问众数最多出现多少次。
 * @author: Liu Wen
 * @create: 2020-03-12 16:41
 **/
public class Main2 {
    public static void main(String[] args) {
        int n = 5;      // 输入第一行仅包含两个正整数n和x，表示给出的序列的长度和给定的正整数。(1<=n<=100000,1<=x<=1000)
        int x = 2;      // 接下来一行有n个正整数，即这个序列，中间用空格隔开。(1<=a_i<=1000)
        int[] nums = {3, 1, 3, 2, 5};

        int res = findZhongShu(n, x, nums);    //输出仅包含一个正整数，表示众数最多出现的次数。
        System.out.println(res);             //3
        /*                                                                         按位或
        例如如果序列中所有数字都不修改时，众数为3，3出现的次数为2，如果我们把两个3都做如题操作，序列会变
        为3，3，3，2，7，此时众数为3，出现次数为3，所以我们选择后者方案，输出众数出现的次数，即3。其余内
        容不变。
         */
    }

    /**
     * @param n    给出的序列的长度n
     * @param x    给定的正整数x
     * @param nums 有n个正整数组成的数组
     * @return int
     * @Description:
     * @date 20.3.12 19:31
     */
    public static int findZhongShu(int n, int x, int[] nums) {
        int[] newNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {

        }
        return 0;
    }
}
