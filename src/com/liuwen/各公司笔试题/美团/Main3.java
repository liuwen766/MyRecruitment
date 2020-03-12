package com.liuwen.各公司笔试题.美团;


/**
 * @description: 小美曾经有一个特殊的数组，这个数组的长度为n。但是她在打恐怖游戏的时候被吓得忘记了这个数组
 *            长什么样了。不过她还记得这个数组满足一些条件。首先这个数组的每个数的范围都在L和R之间。包括端点。
 *            除此之外，这个数组满足数组中的所有元素的和是k的倍数。
 *            但是这样的数组太多了，小美想知道有多少个这样的数组。你只需要告诉她在模1e9+7意义下的答案就行了。
 * @author: Liu Wen
 * @create: 2020-03-12 16:42
 **/
public class Main3 {
    public static void main(String[] args){
        int n = 9;       //数组的长度为n
        int k = 1;       //所有元素的和是k的倍数    1≤k≤10
        int L = 1;       //每个数的范围都在L和R之间
        int R = 3;
        int res = findArray(n,k,L, R);
        System.out.println(res);
    }
    /**
     * @Description:
      * @param n         //数组的长度为n
     * @param k        //所有元素的和是k的倍数    1≤k≤10
     * @param L        //每个数的范围都在L和R之间
     * @param R              eg:  9 1 1 3
     * @return int                 19683
     * @date 20.3.12 19:16
     */
    public static int findArray(int n, int k, int L, int R) {
        int ans = 0;
        if(n<1){
            return ans;
        }

        return ans;
    }
}
