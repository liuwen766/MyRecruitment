package com.liuwen.牛客网;

/**
 * @description:   从1到n整数中1出现的次数
 * @author: Liu Wen
 * @create: 2020-03-10 21:41
 **/
public class Main31 {
    public static void main(String[] args){
        int n = 13;
        int res = NumberOf1Between1AndN_Solution1(n);
        System.out.println(res);
    }
 /**
     * @Description:     方法1：遍历。
      * @param n           遍历的过程中将数字转化为字符串，再数每个字符串中1的个数
     * @return int
     * @date 20.3.10 21:50
     */
    public static int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            String string = String.valueOf(i);
            for (int j = 0; j < string.length(); j++) {
                if(string.charAt(j)=='1'){
                    count++;
                }
            }
        }
        return count;
    }
    /**
     * @Description:   方法2：设定整数点（如1、10、100等等）作为位置点i（对应n的各位、十位、百位等等），分别对每个数位上有多少包含1的点进行分析
      * @param n                int a = n/i,b = n%i;
     * @return int              count=count+(a+8)/10*i+(a%10==1)*(b+1);
     * @date 20.3.10 21:57
     */
    public static int NumberOf1Between1AndN_Solution1(int n) {
        int count=0;
        for(int i=1;i<=n;i*=10)
        {
            //i表示当前分析的是哪一个数位
            int a = n/i;int b = n%i;
            if(a%10==1) {
                count = count + (a + 8) / 10 * i + b + 1;
            }else {
                count = count + (a + 8) / 10 * i;
            }
        }
        return count;
    }
}
