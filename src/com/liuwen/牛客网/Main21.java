package com.liuwen.牛客网;

/**
 * @description: 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
 * @author: Liu Wen
 * @create: 2020-03-10 11:52
 **/
public class Main21 {
    public static void main(String[] args){
        int[] A = {1,2,3,4,5};
        int[] B = {4,5,3,2,1};
        boolean res = IsPopOrder(A,B);
        System.out.println(res);
    }
    /**
     * @Description: 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，
     *  序列4,5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
     * （注意：这两个序列的长度是相等的）
      * @param pushA
     * @param popA
     * @return boolean
     * @date 20.3.10 11:53
     */
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        boolean res = false;
        
        return res;
    }
}
