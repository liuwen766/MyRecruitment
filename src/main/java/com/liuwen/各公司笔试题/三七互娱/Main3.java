package com.liuwen.各公司笔试题.三七互娱;

/**
 * //ForkJoin框架 //ForkJoin框架 //ForkJoin框架 //ForkJoin框架 //ForkJoin框架
 *
 * @description: 有3.7亿个数据（存在负数），给你一个数组，判断它们是否在大数里存在？
 * @author: Liu Wen             eg：{1,5,8,7,9,20,14，...}    {4,5,14,18}  返回 false，true，true，false
 * @create: 2020-03-13 17:46
 **/
public class Main3 {
    public static void main(String[] args) {
        int[] bigArray = {1, 5, 8, 7, 9, 20, 14};
        int[] array = {4, 5, 14, 18};
        boolean[] res = checkExist(bigArray, array);
        for (boolean bool : res) {
            System.out.println(bool);
        }
    }

    public static boolean[] checkExist(int[] bigArray, int array[]) {
        boolean[] res = {true, false};
        return res;
    }
}
