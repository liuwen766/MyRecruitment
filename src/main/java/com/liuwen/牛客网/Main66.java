package com.liuwen.牛客网;

/**
 * @description: 机器人的运动范围
 * @author: Liu Wen
 * @create: 2020-03-21 11:05
 **/
public class Main66 {
    public static void main(String[] args) {
        int threshold = 4;
        int rows = 4;
        int cols = 4;
        int result = movingCount(threshold, rows, cols);
        System.out.println(result);
    }

    /**
     * @Description: version_3:回溯法
     * 核心思路：
     * 1.从(0,0)开始走，每成功走一步标记当前位置为true,然后从当前位置往四个方向探索，
     * 返回1 + 4 个方向的探索值之和。
     * 2.探索时，判断当前节点是否可达的标准为：
     * 1）当前节点在矩阵内；
     * 2）当前节点未被访问过；
     * 3）当前节点满足limit限制
     * @date 20.3.21 11:07
     */
    public static int movingCount(int threshold, int rows, int cols) {
        boolean[][] buer = new boolean[rows][cols];
        return helper(threshold, rows, cols, 0, 0, buer);
    }

    private static int helper(int threshold, int rows, int cols, int r, int c, boolean[][] buer) {
        if (r < 0 || r >= rows || c < 0 || c >= cols || bitSum(r) + bitSum(c) > threshold || buer[r][c]) {
            return 0;
        }
        buer[r][c] = true;
        return helper(threshold, rows, cols, r - 1, c, buer) +
                helper(threshold, rows, cols, r + 1, c, buer) +
                helper(threshold, rows, cols, r, c - 1, buer) +
                helper(threshold, rows, cols, r, c + 1, buer) +
                1;
    }

    private static int bitSum(int num) {       //数位之和
        int count = 0;
        while (num != 0) {
            count += num % 10;
            num = num / 10;
        }
        return count;
    }
}
