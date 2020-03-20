package com.liuwen.牛客网;

import com.sun.tools.javac.Main;

import java.util.ArrayList;

/**
 * @description:    和为S的连续正数序列
 * @author: Liu Wen 输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
 * @create: 2020-03-16 19:21
 **/
public class Main41 {
    public static void main(String[] args){
        int sum = 100;
        ArrayList<ArrayList<Integer>> arrayLists = FindContinuousSequence(sum);
        System.out.println(arrayLists);
    }
    /**
     * @Description:          双指针思想
     * @date 20.3.16 19:28
     */
    public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        if(sum<1){
            return arrayLists;
        }
        int left = 1;
        int right = 2;
        int SUM;
        while (left<right){
            SUM = (left+right)*(right-left+1)/2;        //求和公式
            if(SUM>sum){
                left++;
            }
            if(SUM<sum){
                right++;
            }
            if(SUM == sum){
                ArrayList<Integer> arrayList = new ArrayList<>();
                for (int i = left; i <=right ; i++) {
                    arrayList.add(i);
                }
                arrayLists.add(arrayList);
                left++;
            }
        }
        return arrayLists;
    }
}
