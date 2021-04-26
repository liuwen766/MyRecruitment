package com.liuwen.五大算法题.贪心算法;

/**
 * ----------------------------------------------------------------------
 * n个货物需要装到体积为C的集装箱中，问最需要几个箱子？
 *
 * @author Create by liu wen at 2021.4.26 17:34
 * <p>
 * ----------------------------------------------------------------------
 */
public class GoodsPack {
    public static void main(String[] args) {
        //eg: 10个货物，箱子体积为10，货物体积如下
        int n = 10;
        int[] goodsV = {4, 2, 7, 3, 5, 4, 2, 3, 6, 2};
        int C = 10;

        //------------------------//
        int resultV = firstFit(goodsV, C);
        System.out.println("最先适宜策略：" + resultV);
        System.out.println("---------------");

        int resultV2 = bestFit(goodsV, C);
        System.out.println("最优适宜策略（贪心）需要几个箱子：" + resultV2);

    }


    /**
     * 最先适宜策略
     */
    public static int firstFit(int[] goodsV, int C) {
        //需要k个箱子
        int k = 0;
        int j;
        //箱子的容量
        int[] b = new int[goodsV.length];
        for (int i = 0; i < goodsV.length; i++) {
            //每次从第一个箱子开始计算剩余容量够不够
            j = 0;
            while (C - b[j] < goodsV[i]) {
                //说明不够
                j++;
            }
            //说明够，装箱
            b[j] = b[j] + goodsV[i];
            k = k > (j + 1) ? k : (j + 1);
        }
        return k;
    }

    /**
     * 最优适宜策略（贪心）
     */
    public static int bestFit(int[] goodsV, int C) {
        int i, j, min, m, temp;
        int k = 0;
        //箱子的容量
        int[] b = new int[goodsV.length];
        for (i = 0; i < goodsV.length; i++) {
            min = C;
            //当前所需要的集装箱数目
            m = k + 1;
            //循环遍历箱子，找出最适合的箱子
            for (j = 0; j < k + 1; j++) {
                //保存当前的箱子剩余容量
                temp = C - b[j] - goodsV[i];
                //判断是不是最合适的箱子
                if (temp > 0 && temp < min) {
                    min = temp;
                    m = j;
                }
            }
            //装箱  这里是m不是j，m是当前所需要的集装箱数目
            b[m] = b[m] + goodsV[i];
            k = k > (m + 1) ? k : (m + 1);
        }
        return k;
    }


}
