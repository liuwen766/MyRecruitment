package com.liuwen.牛客网;

/**
 * @description:   扑克牌顺子
 * @author: Liu Wen
 * @create: 2020-03-24 11:45
 **/
public class Main45 {
    public static void main(String[] args){
        int[] numbers = {};
        boolean result = isContinuous(numbers);
        System.out.println(result);
    }
    /**
     * @Description: 满足条件 1.数组长度为5;  2.除0外没有重复的数字(牌) ; 3.max - min <5 ;
     * @date 20.3.24 11:46
     */
    public static boolean isContinuous(int [] numbers) {
        if(numbers.length!=5){
            return false;
        }
        int[] duplication = new int[14];   //用于登记除0外重复的数字(牌)(1~13+大小王=14)
        int max = -1;
        int min = 15;
        for (int i = 0; i < 5; i++) {
            duplication[numbers[i]]++;
            if(numbers[i]==0){             //如果是大小王，跳过本次循环
                continue;
            }
            if(duplication[numbers[i]]>1){
                return false;
            }
            max = max>numbers[i]?max:numbers[i];
            min = min<numbers[i]?min:numbers[i];
        }
        if(max-min<5){
            return true;
        }
        return false;
    }
}
