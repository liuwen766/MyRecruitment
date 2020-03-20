package com.liuwen.牛客网;

/**
 * @description:      统计一个数字在排序数组中出现的次数。
 * @author: Liu Wen
 * @create: 2020-03-16 17:41
 **/
public class Main37 {
    public static void main(String[] args){
        int [] array = {1,3,3,3,3,4,5};
        int k = 2;
        int result = GetNumberOfK1(array,k);
        System.out.println(result);
    }
    /**
     * @Description:      方法1：简单的遍历。用count计算次数。
     * @date 20.3.16 17:46
     */
    public static int GetNumberOfK(int [] array , int k) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>k){              //当k已经小于array[i]，说明后面已经不可能有k了，提前结束遍历
                break;
            }
            if(array[i]==k){
                count++;
            }
        }
        return count;
    }

    /**
     * @Description:        方法2：二分查找（因为是有序数组）    二分查找代码练习
     * @date 20.3.16 17:53         step1:二分查找出第一个k; → 递归实现二分
     *                             step2:二分查找出最后一个k; → 循环实现二分
     */
    public static int GetNumberOfK1(int[] array, int k) {
        if(array.length==0){
            return 0;
        }
        int left = findFirstk(array,k,0,array.length-1);   //递归实现二分
        int right = findLastk(array,k,0,array.length-1);    //循环实现二分
        if(left==-1)      //未找到数，返回0；
            return 0;
        return right-left+1;
    }

    private static int findFirstk(int[] array, int k,int left,int right) {
        if(left>right){
            return -1;
        }
        int mid = left+(right-left)/2;
        if(array[mid]>k){
            int res = findFirstk(array,k,left,mid-1);
            return res;
        }else if(array[mid]<k){
            int res = findFirstk(array,k,mid+1,right);
            return res;
        }else if(mid-1>=0&&array[mid-1]==k){   //****关键****
            int res = findFirstk(array,k,left,mid-1);
            return res;
        }else {
            return mid;
        }
    }
    //{1,2,2,2,3,4,5,5,6,7,8,8,9};
    public static int findLastk(int[] array, int k,int left,int right) {
        int mid = left+(right-left)/2;
        while (left<=right){
            if(array[mid]>k){
                right = mid-1;
            }else if (array[mid]<k){
                left = mid+1;
            }else if(mid+1<=right&&array[mid+1]==k){    //****关键****
                left = mid+1;
            }else {
                return mid;
            }
            mid = left+(right-left)/2;
        }
        return -1;
    }

}
