package com.liuwen.牛客网;

/**
 * @description: Good good study,day day up!
 * @author: Liu Wen
 * @create: 2020-03-07 20:16
 **/
public class Test {
    public static void main(String[] args) {
        char[] chars = {'j', 'k', 'd', '5', '/'};
        String string = String.valueOf(chars);
        System.out.println(string);
        int num = 89;
        int count = 0;
        while (num != 0) {
            count += num % 10;
            num = num / 10;
        }
        System.out.println("数位之和：" + count);
    }
}

