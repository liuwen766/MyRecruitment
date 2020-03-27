package com.liuwen.MyCSDN.Java异常;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * @description: Good good study,day day up!
 * @author: Liu Wen
 * @create: 2020-03-14 11:00
 **/
public class Test {
    /*                                    Error       OutOfMemoryError ,StakeOverFlow等
        所有异常的超类 java.lang.Throwable
                                                      非运行时异常checked exceptions 都是Exception的子类：
                                          Exception             IOException、SQLException等等
                                                      运行时异常unchecked exceptions 都是RuntimeException类及其子类：
                                                                unchecked exceptions   checked exceptions
                                                                NullPointerException(空指针异常)、
                                                                IndexOutOfBoundsException(下标越界异常)
                                                                ClassCastException(类转换异常)
                                                                ConcurrentModificationException(并发修改异常)

       异常处理：try、catch、finally、throw、throws。
     */
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            new Thread(()->{
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();          //可能会抛出：java.util.ConcurrentModificationException
                }
                arrayList.add("A");
                System.out.println(arrayList);
            }).start();
        }
    }
}
