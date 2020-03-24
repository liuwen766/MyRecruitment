package com.liuwen.牛客网;

import java.util.Arrays;

/**
 * @description:     构建乘积数组
 * @author: Liu Wen
 * @create: 2020-03-24 17:51
 **/
public class Main51 {
    public static void main(String[] args){
        int[] A = {1,2,3,4,5};
        int[] result = multiply1(A);
        System.out.println(Arrays.toString(result));
    }

    /**
     * @Description:      方法2：矩阵，先从上往下计算下三角（计算出B[i]的一部分），
     *                          再从下往上计算上三角（计算出B[i]的另一部分）  算法复杂度O(2n)
     *                    B0     1   A1   A2 ... An-2  An-1
     *                    B1     A0   1   A2 ... An-2  An-1
     *                    B2     A0  A1   1  ... An-2  An-1
     *                    ..     A0  A1   A2  1  An-2  An-1
     *                    Bn-2   A0  A1   A2 ...   1   An-1
     *                    Bn-1   A0  A1   A2 ... An-2   1
     * @date 20.3.24 18:05
     */
    public static int[] multiply1(int[] A) {
        int length = A.length;
        int[] B = new int[length];
            //先计算下三角
            B[0] = 1;
            for (int i = 1; i < length; i++) {
                B[i] = B[i-1]*A[i-1];
            }
            //再计算上三角
            int tmp = 1;
            for (int i = length-2; i >=0 ; i--) {
                tmp *= A[i+1];
                B[i] *= tmp;
            }
        return B;
    }

    /**
     * @Description:      方法1：两个for循环解决（算法复杂度n^2）
     * @date 20.3.24 18:03
     */
    public static int[] multiply(int[] A) {
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int muliply = 1;
            for (int j = 0; j < A.length; j++) {
               if(i==j){
                   continue;
               }
               muliply *= A[j];
            }
            B[i]=muliply;
        }
        return B;
    }
}
