package com.liuwen.练习.回朔法;

/**
 * @description: 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向
 * 移动一格，但是不能进入行坐标和列坐标的数位之和大于k的格子。 例如，当k为18时，机器人能够进入方格
 * （35,37），因为3+5+3+7 = 18。但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人
 * 能够达到多少个格子？
 * @author: Liu Wen
 * @create: 2020-03-22 13:31
 **/
public class 机器人的运动范围 {
    public static void main(String[] args) {
        int threshold = 4;
        int rows = 4;
        int cols = 4;
        int result = movingCount(threshold, rows, cols);
        System.out.println(result);
    }


    public static int movingCount(int threshold, int rows, int cols) {
        return 2;
    }

}
