package com.liuwen.牛客网.第一个十题;

/**
 * @description:  二维数组的查找
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * @author: Liu Wen
 * @create: 2020-02-26 16:48
 **/
public class Main1 {

    public static void main(String[] args){
        int target = 15;
        int [][] arr = {{11,12,13},{14,15,16},{18,20,25}};
//        for (int i = 0;i<arr.length;i++){
//            for(int j = 0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]+"  ");
//            }
//            System.out.println();
//        }
        Boolean result = new Main1().Find(37,arr);
        System.out.println(result);
    }

    /*
     *               11    12    13
     *               14    15    16
     *               18    20    25
     */
    public boolean Find(int target, int [][] array) {
        Boolean result = false;
        if(array.length<1){
            return result;
        }
        int i = array.length-1;
        int j = 0;
        while (i>=0&&j<=array[0].length-1){
                if(array[i][j]<target){
                    j++;
                }else if(array[i][j]>target){
                    i--;
                }else if(array[i][j]==target){
                    result = true;
                    break;
                }
        }
        return result;
    }
}
