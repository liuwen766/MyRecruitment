package com.liuwen.JVM虚拟机.关键字synchronized.syn锁优化;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @description: 锁粗化
 * @author: Liu Wen
 * @create: 2020-03-31 16:50
 **/
public class Demo03LockCuhua {
    public static void main(String[] args) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 100; i++) {
            sb.append("aa");
        }
        System.out.println(sb.toString());
    }
}
