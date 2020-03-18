package com.liuwen.练习.十大排序算法;

/**
 * @description: 合并两个有序数组
 * @author: Liu Wen
 * @create: 2020-03-05 16:00
 **/
public class Test1 {
    public static void main(String[] args){
        int[] A = {1,3,4,7,10,15};
        int[] B = {2,8,12};
        int[] result = merge(A,B);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }

    private static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length+b.length];
        if(a.length==0&&b.length==0){
            return result;
        }
        if(a.length==0){
            return b;
        }
        if(b.length==0){
            return a;
        }
        int i=0;int j=0;int k=0;
        while(i<a.length&&j<b.length){
            if(a[i]<b[j]){
                result[k]=a[i];
                k++;i++;
            }else{
                result[k]=b[j];
                k++;j++;
            }
        }
        while (i<a.length){
            result[k++]=a[i++];
        }
        while (j<b.length){
            result[k++]=b[j++];
        }
        return result;
    }

}
