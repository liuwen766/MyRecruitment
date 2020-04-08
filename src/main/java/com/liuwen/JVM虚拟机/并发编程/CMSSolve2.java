package com.liuwen.JVM虚拟机.并发编程;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @description:       ConcurrentModificationException解决方案2
 * @author: Liu Wen
 * @create: 2020-04-08 09:44
 **/
public class CMSSolve2 {
    public static void main(String[] args){
        List<Integer> arrayList = Collections.synchronizedList(new ArrayList<>());
        //多个线程对一个集合对象进行操作可能会出现并发修改异常
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                arrayList.add(10);
                System.out.println(arrayList);
            },"线程"+i).start();
        }
    }
}
