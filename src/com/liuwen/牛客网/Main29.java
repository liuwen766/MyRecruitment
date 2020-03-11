package com.liuwen.牛客网;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @description: 输入n个整数，找出其中最小的K个数。
 * 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 * @author: Liu Wen
 * @create: 2020-03-10 20:05
 **/
public class Main29 {
    public static void main(String[] args){
        int[] input = {4,5,1,6,2,7,3,8};
        int k = 4;
        ArrayList<Integer> result = GetLeastNumbers_Solution2(input,k);
        System.out.println(result);
    }
    /**
     * @Description:     方法3：用优先队列建立一个长度为K的队列，每次把队列头部的数据和遍历数据做对比即可
      * @param input
     * @param k
     * @return java.util.ArrayList<java.lang.Integer>
     * @date 20.3.11 18:48
     */
    public static ArrayList<Integer> GetLeastNumbers_Solution2(int[] input, int k) {
        return null;
    }

    /**
     * @Description:    排好序，找出最小的k个数
      * @param input
     * @param k
     * @return java.util.ArrayList<java.lang.Integer>
     * @date 20.3.11 18:47
     */
    public static ArrayList<Integer> GetLeastNumbers_Solution1(int[] input, int k) {
        return null;
    }

    /**
     * @Description:    方法1：利用工具类将集合排好序，取出前k个即可
      * @param input
     * @param k
     * @return java.util.ArrayList<java.lang.Integer>
     * @date 20.3.10 20:08
     */
    public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (input.length==0||k<1||k>input.length){
            return arrayList;
        }
        for (int i = 0; i < input.length; i++) {
            arrayList.add(input[i]);
        }
        Collections.sort(arrayList);
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(arrayList.get(i));
        }
        return result;
    }
}
