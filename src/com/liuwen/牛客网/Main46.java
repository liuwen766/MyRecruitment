package com.liuwen.牛客网;

/**
 * @description:   孩子们的游戏(圆圈中最后剩下的数)
 * @author: Liu Wen
 * @create: 2020-03-24 11:45
 **/
public class Main46 {
    public static void main(String[] args){
        int n = 20;      //20个小朋友 0~19
        int m = 3;       //从0数到2
        int result = LastRemaining_Solution1(n,m);
        System.out.println(result);
    }
    /**
     * @Description:            方法2：递归；f[n]表示n个人玩游戏报m退出最后胜利者的编号
     *                          eg:   0  1  2  3  4  5  6  7  8  9  (n=10,m=4)
     * @date 20.3.24 12:10            6  7  8  √  0  1  2  3  4  5  （假设2是最后的胜利者，则（2+m）%10=6）
     */
    public static int LastRemaining_Solution(int n, int m) {
        if(n==0){
            return -1;
        }
        if(n==1){
            return 0;
        }
        return (LastRemaining_Solution(n-1,m)+m)%n;  //f(n) = [f(n-1)+m]%n
    }

    /**
     * @Description:     :方法1：使用数组来模拟环，思路还是比较简单，但是各种下标要理清
     * @date 20.3.24 11:46
     */
    public static int LastRemaining_Solution1(int n, int m) {
        if(n==0){
            return -1;
        }
        if(n==1){
            return 0;
        }
        int Sum = n;
        int i = -1;         //这样i才可以从0开始
        int count = 0;
        int[] N = new int[n];
        while (Sum>0){
            i++;
            if(i>=n){
                i=0;        //模拟环
            }
            if(N[i]==-1){   //如果是已经删除的对象，跳过
                continue;
            }
            count++;
            if(count==m){   //找到待删除的对象。
                N[i]=-1;    //删除
                count = 0;
                Sum--;
            }
        }
        return i;
    }
}
