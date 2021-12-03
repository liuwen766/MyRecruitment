package com.liuwen.面试第三季.JUC;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * ----------------------------------------------------------------------
 *
 * @author Create by liu wen at 2021.12.1 23:03
 * <p>
 * ----------------------------------------------------------------------
 */
public class ReentrantReadWriteDemo {
    public static void main(String[] args) {
        Cache cache = new Cache();
        //5个线程写
        for (int i = 0; i < 5; i++) {
            final int temp = i;
            new Thread(() -> {
                cache.write(temp, String.valueOf(temp));
            }).start();
        }
        //5个线程读
        for (int i = 0; i < 5; i++) {
            final int temp = i;
            new Thread(() -> {
                cache.read(temp);
            }).start();
        }
    }
}

class Cache {
    private Map<Integer, String> map = new HashMap<>();
    ReadWriteLock lock = new ReentrantReadWriteLock();
    /**
     * 写
     */
    public void write(Integer key, String value) {
        //加写入锁
        lock.writeLock().lock();
        System.out.println(key + "开始写入...");
        map.put(key, value);
        System.out.println(key + "写入完毕...");
        //释放写入锁
        lock.writeLock().unlock();
    }

    /**
     * 读
     */
    public void read(Integer key) {
        //加读取锁
        lock.readLock().lock();
        System.out.println(key + "开始读取...");
        map.get(key);
        System.out.println(key + "读取完毕...");
        //释放读取锁
        lock.readLock().unlock();
    }
}
