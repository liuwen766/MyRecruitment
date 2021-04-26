package com.liuwen.牛客网;

/**
 * @description: 剪绳子            动态规划题
 * @author: Liu Wen
 * @create: 2020-03-15 12:13
 **/
public class Main67 {
    public static void main(String[] args) {
        int target = 4;
        int res = cutRope1(target);
        System.out.println(res);
    }

    /**
     * @Description: 方法2：动态规划求解问题的四个特征：
     * ①求一个问题的最优解；
     * ②整体的问题的最优解是依赖于各个子问题的最优解；
     * ③小问题之间还有相互重叠的更小的子问题；
     * ④从上往下分析问题，从下往上求解问题；
     * @date 20.3.15 12:17
     */
    public static int cutRope1(int target) {
        if (target < 2) {
            return 0;
        }
        if (target == 2) {
            return 1;
        }
        if (target == 3) {
            return 2;
        }
         /*
        下面3行是n>=4的情况，跟n<=3不同，4可以分很多段，比如分成1、3，
        这里的3可以不需要再分了，因为3分段最大才2，不分就是3。记录最大的。
         */
        int[] dp = new int[target + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        int res = 0;
        for (int i = 4; i < target + 1; i++) {
            for (int j = 0; j <= i / 2; j++) {
                res = Math.max(res, dp[j] * dp[i - j]);
            }
            dp[i] = res;
        }
        return dp[target];
    }

    /**
     * @Description: 方法1：找2和3的个数（一个数被拆分，要么是2，要么是3 ，它们的乘积才最大）
     * 贪心算法：不是对所有问题都能得到整体最优解，关键是贪心策略的选择，
     * 选择的贪心策略必须具备无后效性，即某个状态以前的过程不会影响以后的状态，只与当前状态有关。
     * @date 20.3.15 12:15
     */
    public static int cutRope(int target) {
        if (target < 2) {
            return 0;
        }
        if (target == 2) {
            return 1;
        }
        if (target == 3) {
            return 2;
        }
        int numOf2 = target % 3;
        int numOf3 = target / 3;
        int sum = 1;
        if (numOf2 == 0) {
            for (int i = 0; i < numOf3; i++) {
                sum *= 3;
            }
        }
        if (numOf2 == 1) {
            for (int i = 0; i < numOf3 - 1; i++) {
                sum *= 3;
            }
            sum *= 4;
        }
        if (numOf2 == 2) {
            for (int i = 0; i < numOf3; i++) {
                sum *= 3;
            }
            sum *= 2;
        }
        return sum;
    }
}
