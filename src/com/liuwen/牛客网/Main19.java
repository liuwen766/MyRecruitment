package com.liuwen.牛客网;

import java.util.ArrayList;

/**
 * @description: 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下4 X 4矩阵：
 *        1  2   3   4
 *       5  6   7   8
 *      9  10  11  12
 *     13  14  15  16   则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 *
 * @author: Liu Wen
 * @create: 2020-03-09 22:53
 **/
public class Main19 {
    public static void main(String[] args){
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        ArrayList<Integer> result = printMatrix1(matrix);
        System.out.println(result);
    }
    /**
     * @Description: 思想，用左上和右下的坐标定位出一次要旋转打印的数据，一次旋转打印结束后，往对角分别前进和后退一个单位。
     *     提交代码时，主要的问题出在没有控制好后两个for循环，需要加入条件判断，防止出现单行或者单列的情况。
     * * @param matrix
     * @return java.util.ArrayList<java.lang.Integer>
     * @date 20.3.9 22:57
     */
    public static ArrayList<Integer> printMatrix(int [][] matrix) {

        return null;
    }
    /**
     * @Description:     可以模拟魔方逆时针旋转的方法，一直做取出第一行的操作
      * @param matrix     输出并删除第一行后，再进行一次逆时针旋转。    重复上述操作
     * @return java.util.ArrayList<java.lang.Integer>
     * @date 20.3.9 23:05
     */
    public static ArrayList<Integer> printMatrix1(int[][] matrix) {
        return null;
    }

}
