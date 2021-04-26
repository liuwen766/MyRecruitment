package com.liuwen.牛客网;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @description: 字符串的排列
 * @author: Liu Wen
 * @create: 2020-03-11 18:25
 **/
public class Main27 {
    public static void main(String[] args) {
        String string = "abc";
        ArrayList<String> arrayList = Permutation(string);
        System.out.println(arrayList);
    }

    /**
     * @param str （要用数组，所以转换为char[]，然后再去重）
     * @return java.util.ArrayList<java.lang.String>
     * @Description: 方法：利用数组的全排列
     * @date 20.3.12 15:56
     */
    public static ArrayList<String> Permutation(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (str != null && str.length() > 0) {
            char[] chars = str.toCharArray();
            perm(chars, 0, arrayList);
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    //进行数组的全排列（将全排列结果存在参数arrayList中）
    private static void perm(char[] chars, int L, ArrayList<String> arrayList) {
        if (L == chars.length - 1) {    //递归结束条件：当只有一个数字做全排列的时候，则就只有一种可能。
            String val = String.valueOf(chars);     //直接将字符数组转换为字符串
            if (!arrayList.contains(val)) {
                arrayList.add(val);
            }
        }
        for (int j = L; j < chars.length; j++) {
            swap(chars, L, j);
            perm(chars, L + 1, arrayList);
            swap(chars, L, j);
        }
    }

    //交换数组的两个元素
    private static void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}
