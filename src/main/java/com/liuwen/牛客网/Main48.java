package com.liuwen.牛客网;
/**
 * @description: 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号
 * @author: Liu Wen
 * @create: 2020-03-09 00:46
 **/
public class Main48 {
    public static void main(String[] args){
        int result = Add1(12,13);
        System.out.print(result);
    }
    /**
     * @Description:   方法2：位操作
      * @param num1 num2
     * @param i1
     * @return int
     * @date 20.3.9 00:58
     */
    public static int Add1(int num1,int num2) {     // 加法计算分为三步
        while(num2!=0){                //进位为0计算结束   eg:5->101，7->111       5+7=?
            int tmp = num1^num2;       //step1:个位相加，不算进位，得到010，二进制每位相加就相当于各位做异或操作，101^111。
            num2 = (num1&num2)<<1;     //step2:计算进位值，得到1010，相当于个位做与操作得到101，再向左移一位得到1010，(101&111)<<1。
            num1 = tmp;                //step3:重复上述两步，个位相加 010^1010=1000，进位值为100=(010&1010)<<1。
        }                              //继续重复上述两步：1000^100 = 1100，进位值为0，跳出循环，1100为最终结果。
        return num1;
    }
    /**
     * @Description:   方法1：数学工具。虽然符合题目要求，但是失去了这道题目的意义。
      * @param num1
     * @param num2
     * @return int
     * @date 20.3.9 00:51
     */
    public static int Add(int num1,int num2) {
        return Math.addExact(num1,num2);
    }
}
