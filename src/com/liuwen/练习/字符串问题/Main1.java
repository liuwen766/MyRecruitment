package com.liuwen.练习.字符串问题;

/**
 * @description: 从一字符串中找出其无重复最长子串字符及长度
 * @author: Liu Wen
 * @create: 2020-03-02 12:01
 **/
public class Main1 {
    public static void main(String[] args){
        String string = "bbbbbbbbbbb";
        String result = solution(string);
        System.out.println(result);
    }
    //获取无重复最长子串 ：abcabcbb
    private static String solution(String string) {
        int maxlen = 0;
        String result = "";
        String s = "";
        for (int i = 0; i < string.length(); i++) {
            //如果检查的字符在这个空的字符串中没有,将他加入这个空字符串中
            if(!result.contains(""+string.charAt(i))){
                  result = result+string.charAt(i);
                  //记录最大不重复子字符串及其长度
                  if(maxlen<result.length()){
                      maxlen = result.length();
                      s = result;
                  }
            }else {
                result=""+string.charAt(i);
            }
        }
        return s;
    }





}
