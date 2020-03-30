package com.liuwen.练习.十大排序算法;

import java.util.ArrayList;

/**
 * @description: 桶排序
 * @author: Liu Wen
 * @create: 2020-03-18 12:35
 **/
public class Main9 {
    public static void main(String[] args){
        int[] arr = {2,5,6,4,9,3,2,4,5,2,6,6,6,8,1,3,5,};

    }
    /*
    1.人为设置一个BucketSize，作为每个桶所能放置多少个不同数值（例如当BucketSize==5时，该桶可以存放｛1,2,3,4,5｝这几种数字，但是容量不限，即可以存放100个3）；
    2.遍历输入数据，并且把数据一个一个放到对应的桶里去；
    3.对每个不是空的桶进行排序，可以使用其它排序方法，也可以递归使用桶排序；
    4.从不是空的桶里把排好序的数据拼接起来。 
     */
    public static ArrayList<Integer> BucketSort(ArrayList<Integer> array, int bucketSize){
        return null;
    }
}
