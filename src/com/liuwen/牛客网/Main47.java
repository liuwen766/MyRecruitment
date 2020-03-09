package com.liuwen.牛客网;

/**
 * @description: 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、
 *                               switch、case等关键字及条件判断语句（A?B:C）。
 * @author: Liu Wen
 * @create: 2020-03-09 00:25
 **/
public class Main47 {
    public static void main(String[] args){
        int result = Sum_Solution(10);
        System.out.println(result);
    }
    /**
     * @Description:  方法1：递归
      * @param n
     * @return int
     * @date 20.3.9 00:27
     */
    public static int Sum_Solution(int n) {
        if(n == 1){
            return 1;
        }
        return n+Sum_Solution(n-1);
    }
}
