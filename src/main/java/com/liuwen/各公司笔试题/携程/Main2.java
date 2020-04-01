package com.liuwen.各公司笔试题.携程;

import java.util.Scanner;

/**
 * @description: 携程海洋馆中有 n 只萌萌的小海豚，初始均为 0 岁，每只小海豚的寿命是 m 岁，
 * 且这些小海豚会在 birthYear[i] 这些年份生产出一位宝宝海豚（1 <= birthYear[i] <= m），每位宝宝海豚刚出生为 0 岁。
 * 问 x 年时，携程海洋馆有多少只小海豚？
 *
 * 输入样例：
 * 5
 * 5
 * 2
 * 2
 * 4
 * 5
 * 输出样例：
 * 20
 *
 * @author: Liu Wen
 * @create: 2020-04-01 19:27
 **/
public class Main2 {
    /*
    n（初始海豚数）
    m（海豚寿命）

    海豚生宝宝的年份数量(假设为p)
    海豚生宝宝的年份1
    ...
    海豚生宝宝的年份p

    x（几年后）x年后，共有多少只小海豚
     */
    static long countDolphin(int n, int m, int[] birthYear, int x) {
        int res = 0;
        //计算一只小海豚变多少只小海豚
        int count = countHelper(m,birthYear,x);
        res = n*count;
        return res;
    }

    private static int countHelper(int m, int[] birthYear, int x) {
        int count = 1;int ans = 0;int res = 0;
        for (int i = 0; i < x; i++) {
            for (int var : birthYear) {
                if (i == var && i<m) {
                    count++;
                    res = countHelper(m,birthYear,x-var);
                }
                if(i>=m){
                    count--;
                }
                ans = res+count;
            }
        }
        return ans;
    }
    /******************************结束写代码******************************/

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long res;

        int _n;
        _n = Integer.parseInt(in.nextLine().trim());

        int _m;
        _m = Integer.parseInt(in.nextLine().trim());

        int _birthYear_size = 0;
        _birthYear_size = Integer.parseInt(in.nextLine().trim());
        int[] _birthYear = new int[_birthYear_size];
        int _birthYear_item;
        for(int _birthYear_i = 0; _birthYear_i < _birthYear_size; _birthYear_i++) {
            _birthYear_item = Integer.parseInt(in.nextLine().trim());
            _birthYear[_birthYear_i] = _birthYear_item;
        }

        int _x;
        _x = Integer.parseInt(in.nextLine().trim());

        res = countDolphin(_n, _m, _birthYear, _x);
        System.out.println(String.valueOf(res));

    }
}