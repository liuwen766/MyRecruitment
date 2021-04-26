package com.liuwen.各公司笔试题.上海途虎春招;

import java.util.ArrayList;

/**
 * @description: 输出所有完数及对应的因子。    6 = 1+2+3
 * @author: Liu Wen
 * @create: 2020-03-18 17:59
 **/
public class Main1 {
    public static void main(String[] args) {
        solution();
    }

    public static void solution() {
        for (int i = 0; i < 10000; i++) {
            ArrayList<Integer> arrayList = findYingZi(i);
            int sum = 0;
            for (int j = 0; j < arrayList.size(); j++) {
                sum = sum + arrayList.get(j);
            }
            if (sum == i) {
                System.out.println("完数：" + i + "对应因子:" + arrayList);
            }
        }
    }

    private static ArrayList<Integer> findYingZi(int i) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (i < 1) {
            return arrayList;
        }
        if (i == 1) {
            arrayList.add(i);
            return arrayList;
        }
        for (int j = 1; j <= i / 2; j++) {
            if (i % j == 0) {
                arrayList.add(j);
            }
        }
        return arrayList;
    }
}



