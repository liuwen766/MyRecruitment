package com.liuwen.牛客网;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @description:    第一个只出现一次的字符：在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到
 * @author: Liu Wen         第一个只出现一次的字符,并返回它的位置,如果没有则返回 -1（需要区分大小写）.
 * @create: 2020-03-15 14:43
 **/
public class Main34 {
    public static void main(String[] args){
        String string = "google";
        int res = FirstNotRepeatingChar(string);
        System.out.println(res);
    }
    /**
     * @Description:     方法2：使用map的键值对来存字母及字母出现得次数
     * @date 20.3.15 15:03
     */
    public static int FirstNotRepeatingChar1(String string) {
        if(string.length()==0)
            return -1;
//        Map<Character,Integer> map = new LinkedHashMap<>();   //按加入的顺序排列
        Map<Character,Integer> map = new HashMap<>();   //按字母排序
        for (int i = 0; i < string.length(); i++) {
            if(map.containsKey(string.charAt(i))){
                int value = map.get(string.charAt(i));
                map.put(string.charAt(i),++value);
            }else {
                map.put(string.charAt(i),1);
            }
        }
//        for (Character c:map.keySet()) {
//            if (map.get(c)==1){
//                return string.indexOf(c);
//            }
//        }
        for (int i = 0; i < string.length(); i++) {
            if(map.get(string.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }

    /**
     * @Description:      方法1：熟练调用String的方法
     * @date 20.3.15 15:02
     */
    public static int FirstNotRepeatingChar(String str) {
        if(str.length()==0)
            return -1;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(!str.substring(0,i).contains(c+"")&&!str.substring(i+1).contains(c+"")){
              return i;
            }
        }
        return -1;
    }
}
