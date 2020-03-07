package com.liuwen.牛客网;

import java.util.TreeSet;

/**
 * @description: 旋转数组的最小数字
 * @author: Liu Wen
 * @create: 2020-03-07 14:40
 **/
public class Main6 {
    public static void main(String[] args){
        int[] array = {3,4,5,9,1,2};
        int result = minNumberInRotateArray2(array);
        System.out.println(result);
    }
    /**
     * @Description:      方法1：利用TreeSet（TreeSet默认升序）  最简单但耗时耗内存
     * @param array
     * @return int
     * @date 20.3.7 15:11
     */
    public static int minNumberInRotateArray(int[] array) {
        TreeSet treeSet = new TreeSet();
        for (int i = 0; i < array.length; i++) {
            treeSet.add(array[i]);
        }
        return Integer.valueOf(treeSet.first().toString());
    }
    /**
     * @Description:  方法2：找出一个数，比两边都小。（注意处理第一个数和最后一个数）   最容易理解
      * @param array
     * @return int
     * @date 20.3.7 14:47
     */
    public static int minNumberInRotateArray1(int [] array) {
        if (array.length==0){
            return 0;
        }
        if(array.length==1){
            return array[0];
        }else {
            //处理第一个数
            if (array[0] <= array[1] && array[0] <= array[array.length - 1]) {
                return array[0];
            }
            //处理最后一个数
            if (array[array.length - 1] <= array[array.length - 2] && array[array.length - 1] <= array[0]) {
                return array[array.length - 1];
            }
            //处理中间的数
            for (int i = 1; i < array.length - 1; i++) {
                if (array[i] <= array[i - 1] && array[i] <= array[i + 1]) {
                    return array[i];
                }
            }
        }
        return 0;
    }
    /**
     * @Description:     方法3：二分查找         最优
      * @param array
     * @return int
     * @date 20.3.7 15:28
     */
    //       5,6,8,9,11,12,13,1,2,3,4,5,5
    private static int minNumberInRotateArray2(int[] array) {
        int result = 0;
        int start = 0;
        int end = array.length-1;
        while (start<end){
            int midIndex = (start+end)/2;
            if(array[start]<array[midIndex]){
                start = midIndex+1;
            }else if(array[end]>array[midIndex]){
                 end = midIndex;
            }else {
               break;
            }
        }
        result = array[start];
        return result;
    }

}
