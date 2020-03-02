package com.liuwen.练习.字符串问题;

/**
 * @description: 求两个字符串的最长公共子串
 * @author: Liu Wen
 * @create: 2020-03-02 12:47
 **/
public class Main2 {
    public static void main(String[] args){
        String string1 = "acbcabcef";
        String string2 = "abcbcefd";
        String result = solution(string1,string2);
        System.out.println("最长公共子串："+result);
    }

    /*
    1、把两个字符串分别以行和列组成一个二维矩阵。
    2、比较二维矩阵中每个点对应行列字符中否相等，相等的话值设置为1，否则设置为0。
    3、通过查找出值为1的最长对角线就能找到最长公共子串。
     */
    private static String solution(String string1, String string2) {
        if(string1 == null || string2 == null){
            return null;
        }
        int[][] arr = new int[string1.length()][string2.length()];
        for (int i = 0; i < string1.length(); i++) {
            for (int j = 0; j < string2.length(); j++) {
                if(string1.charAt(i)==string2.charAt(j)){
                    arr[i][j]=1;
                }else {
                    arr[i][j]=0;
                }
//                System.out.print(arr[i][j]);
            }
//            System.out.println();
        }
        //找出最大值
        int maxLen = 0;
        int maxEnd = 0;
        for (int i = 1; i < string1.length(); i++) {
            for (int j = 1; j < string2.length(); j++) {
                if(arr[i-1][j-1]>0){
                    if(arr[i][j]>0){
                        arr[i][j]=arr[i-1][j-1]+1;
                    }
                }
//                maxLen = max>arr[i][j]?max:arr[i][j];
                if(arr[i][j]>maxLen){
                    maxLen = arr[i][j];
                    maxEnd = i;
                }
            }
        }
//        System.out.println(maxEnd);
//        System.out.println(maxLen);
        return string1.substring(maxEnd-maxLen+1,maxEnd-maxLen+1+maxLen);
    }
}
