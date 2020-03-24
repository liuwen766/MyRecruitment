package com.liuwen.牛客网;

/**
 * @description:    矩阵中的路径
 * @author: Liu Wen
 * @create: 2020-03-21 11:22
 **/
public class Main65 {
    public static void main(String[] args){
        char[] matrix = {'a','b','c','e','s','f','c','s','a','d','e','e'};
        int rows = 3;
        int cols = 4;
        char[] str = {'b','c','c','e','d'};
        boolean result = hasPath(matrix,rows,cols,str);
        System.out.println(result);
    }
    /**
     * @Description:    回朔法：
     *               0.根据给定数组，初始化一个标志位数组，初始化为false，表示未走过，true表示已经走过，不能走第二次
     *               1.根据行数和列数，遍历数组，先找到一个与str字符串的第一个元素相匹配的矩阵元素，进入judge
     *               2.根据i和j先确定一维数组的位置，因为给定的matrix是一个一维数组
     *               3.确定递归终止条件：越界，当前找到的矩阵值不等于数组对应位置的值，已经走过的，这三类情况，都直接false，说明这条路不通
     *               4.若k，就是待判定的字符串str的索引已经判断到了最后一位，此时说明是匹配成功的
     *               5.下面就是本题的精髓，递归不断地寻找周围四个格子是否符合条件，只要有一个格子符合条件，就继续再找这个符合条件的格子的四周是否存在符合条件的格子，直到k到达末尾或者不满足递归条件就停止。
     *               6.走到这一步，说明本次是不成功的，我们要还原一下标志位数组index处的标志位，进入下一轮的判断。
     * @date 20.3.21 12:12
     */
    public static boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        boolean[] buer = new boolean[matrix.length];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                //循环遍历二维数组，找到起点等于str第一个元素的值，再递归判断四周是否有符合条件的----回溯法
                if(helper(matrix,i,j,rows,cols,buer,str,0)){
                    return true;
                }
            }
        }
        return false;
    }
    private static boolean helper(char[] matrix, int i, int j, int rows, int cols, boolean[] buer, char[] str, int k) {
        //先根据i和j计算匹配的第一个元素转为一维数组的位置
        int index = cols*i+j;
        //递归终止条件   ①越界  ②当前找到的矩阵值不等于数组对应位置的值    ③已经走过的
        if(i<0||i>=rows||j<0||j>=cols||matrix[index]!=str[k]||buer[index]==true){
            return false;
        }
        //若k已经到达str末尾了，说明之前的都已经匹配成功了，直接返回true即可
        if(k==str.length-1){
            return true;
        }
        //要走的第一个位置置为true，表示已经走过了
        buer[index] = true;
        //回溯，递归寻找，每次找到了就给k加一，找不到，还原           *****************
        if(helper(matrix,i+1,j,rows,cols,buer,str,k+1)||
           helper(matrix,i-1,j,rows,cols,buer,str,k+1)||
           helper(matrix,i,j+1,rows,cols,buer,str,k+1)||
           helper(matrix,i,j-1,rows,cols,buer,str,k+1)){
            return true;
        }
        //走到这，说明这一条路不通，还原，再试其他的路径
        buer[index]=false;
        return false;
    }
}
