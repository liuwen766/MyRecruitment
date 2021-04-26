package com.liuwen.练习.回朔法;

/**
 * @description: Good good study,day day up!
 * @author: Liu Wen
 * @create: 2020-03-22 13:31
 **/
public class 矩阵中的路径 {
    public static void main(String[] args) {
        char[] matrix = {'a', 'b', 'c', 'e', 's', 'f', 'c', 's', 'a', 'd', 'e', 'e'};
        int rows = 3;
        int cols = 4;
        char[] str = {'b', 'c', 'c', 'e', 'd'};
        boolean result = hasPath(matrix, rows, cols, str);
        System.out.println(result);
    }

    public static boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        return false;
    }
}
