package com.liuwen.牛客网;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @description:     一个整型数组里除了两个数字之外，其他的数字都出现了两次。
 * @author: Liu Wen       请写程序找出这两个只出现一次的数字。
 * @create: 2020-03-15 14:44
 **/
public class Main40 {
    public static void main(String[] args) {
        int[] array = {2,4,3,6,3,2,5,5};
        int[] num1 = new int[1];            //num1,num2分别为长度为1的数组。传出参数
        int[] num2 = new int[1];            //将num1[0],num2[0]设置为返回结果
        FindNumsAppearOnce(array, num1, num2);
    }

    /**
     * @Description: 方法1：排序后异或，比较相邻两值，同出0；
     * @date 20.3.15 15:11
     */
    public static void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
            if(array.length==0){
                return;
            }
            Arrays.sort(array);                     //排序后异或，比较相邻两值
            int index = 0;
            int[] arr = new int[2];
            for (int i = 0; i < array.length-1; i++) {
                if((array[i]^array[i+1])==0){       //说明两值一样
                    i = i+1;
                }else {
                    arr[index++] = array[i];
                }
            }
            if(arr[1]==0){
                arr[1]=array[array.length-1];
            }
            System.out.println(Arrays.toString(arr));
            num1[0] = arr[0];
            num2[0] =arr[1];
    }
    /**
     * @Description: 方法2：使用map的键值对。找出value等于1的key即可。
     * @date 20.3.15 15:12
     */
    public static void FindNumsAppearOnce1(int[] array, int[] num1, int[] num2) {
        if(array.length<2){
            return;
        }
        HashMap<Integer,Integer> hashMap = new LinkedHashMap<>();
        for (int i = 0; i < array.length; i++) {
            if(hashMap.containsKey(array[i])){
                int value = hashMap.get(array[i]);
                hashMap.put(array[i],++value);
            }else {
                hashMap.put(array[i],1);
            }
        }
        int[] arr = new int[2];
        int index = 0;
        for (Integer val:hashMap.keySet()) {
            if(hashMap.get(val)==1){
                arr[index]=val;
                index++;
            }
        }
        num1[0] = arr[0];
        num2[0] = arr[1];
    }
}
