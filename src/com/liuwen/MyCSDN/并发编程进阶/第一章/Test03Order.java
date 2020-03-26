package com.liuwen.MyCSDN.并发编程进阶.第一章;

import java.util.concurrent.TimeUnit;

/**
 * @description: Good good study,day day up!
 * @author: Liu Wen
 * @create: 2020-03-26 23:48
 **/
public class Test03Order {
    static int num = 0;
    static boolean flag = false;
    static int result = 0;
    public static void main(String[] args) {
        new Thread(()->{
            if(flag){
                result = num+num;     //result的值有可能为0,1,4
            }else {
                result = 1;
            }
        }).start();

        new Thread(()->{
            num = 2;
            flag = true;     //先执行flag = true;后执行num = 2;就会出现结果为0
        }).start();

        System.out.println("result:"+result);
    }
}
