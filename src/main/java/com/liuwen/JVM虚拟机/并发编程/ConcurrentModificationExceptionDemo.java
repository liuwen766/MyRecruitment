package com.liuwen.JVM虚拟机.并发编程;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @description: 并发异常       遍历时修改会出现ConcurrentModificationException
 * @author: Liu Wen
 * @create: 2020-04-07 18:29
 **/
public class ConcurrentModificationExceptionDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Integer cur = iterator.next();
            if (cur == 5) {          //倒数第二个数不会产生ConcurrentModificationException
                arrayList.remove(cur);
            }
            System.out.println(cur);
        }
    }
}
