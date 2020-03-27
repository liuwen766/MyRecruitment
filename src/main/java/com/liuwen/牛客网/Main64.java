package com.liuwen.牛客网;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;


/**
 * @description:         滑动窗口的最大值：给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 * @author: Liu Wen
 * @create: 2020-03-15 10:31
 **/
public class Main64 {
    public static void main(String[] args){
        int[] array = {2,3,4,2,6,2,5,1};
        int size = 3;
        ArrayList<Integer> res = maxInWindows2(array,size);
        System.out.println(res);
    }
    /**
     * @Description:     方法3：用一个双端队列（算法复杂度n)），队列第一个位置保存当前窗口的最大值，当窗口滑动一次
     *                   step1.判断当前最大值是否过期；
     *                   step2.新增加的值从队尾开始比较，把所有比他小的值丢掉
     * @date 20.3.15 10:56
     */
    public static ArrayList<Integer> maxInWindows2(int[] num, int size) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (num.length<1||size>num.length||size<1){
            return arrayList;
        }
        Deque<Integer> deque = new ArrayDeque<>();                 //双端队列，用于存num数组的索引
        for (int i = 0; i < num.length; i++) {
            while (!deque.isEmpty()&&num[deque.getLast()]<num[i]){  //保持双端队列的升序
                deque.pollLast();
            }
            deque.addLast(i);                                        //往双端队列里添加索引
            while (!deque.isEmpty()&&deque.getFirst()<=i-size){      //保持双端队列的长度为size
                deque.pollFirst();
            }
            if(i>=size-1){
                arrayList.add(num[deque.getFirst()]);
            }
        }
        return arrayList;
    }
    /**
     * @Description:       方法2：双指针，容易理解(但是算法复杂度和方法1一样，为k*n)
     * @date 20.3.15 13:52
     */
    public static ArrayList<Integer> maxInWindows1(int[] num, int size) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (num.length<1||size>num.length||size<1){
            return arrayList;
        }
        int left = 0;int right = size-1;
        while (right<num.length){
            int max = caqulateMax(num,left,right);
            arrayList.add(max);
            left++;right++;
        }
        return arrayList;
    }
    private static int caqulateMax(int[] num, int left, int right) {
        int max = num[left];
        for (int i = left; i <= right ; i++) {
            if(max<num[i]){
                max = num[i];
            }
        }
        return max;
    }
    /**
     * @Description:       方法1：遍历 num.length-size 次数组，每次找出size个长度中的最大值，保存下来
     * @date 20.3.15 10:34
     */
    public static ArrayList<Integer> maxInWindows(int [] num, int size){
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (num.length<1||size>num.length||size<1){
            return arrayList;
        }
        for (int i = 0; i <= num.length - size; i++) {
            int max = num[i];
            for (int j = i; j < i + size; j++) {
                max = Math.max(max,num[j]);
            }
            arrayList.add(max);
        }
        return arrayList;
    }
}
