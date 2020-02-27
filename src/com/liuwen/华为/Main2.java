package com.liuwen.华为;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @description: 给定一个数组，其中有正有负，首先去除重复元素，然后升序排列输出
 * @author: Liu Wen
 * @create: 2020-02-26 19:45
 **/
public class Main2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        solution(str);
    }

    private static void solution(String str) {
        TreeSet treeSet = new TreeSet();
        //1.将输入的字符串数组转化成数组
        String s = str.substring(1,str.length()-1);
//        System.out.println(s);
        if(s.length()==0){
            System.out.print("");
            return;}
        if(s.length()==1){
            int res = Integer.valueOf(s);
            System.out.println(res);
        }
        String[] strArr = s.split(" ");
        int[] arr = new int[strArr.length];
        for (int i = 0; i <arr.length; i++) {
            arr[i] = Integer.valueOf(strArr[i]);
            treeSet.add(arr[i]);
        }
        //遍历TreeSet即可
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()){
                System.out.print(iterator.next() + " ");
        }
    }
}
