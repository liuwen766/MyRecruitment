package com.liuwen.JVM虚拟机.并发编程;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @description:       读写分离
 * @author: Liu Wen    写入锁也叫独占锁，只能被一个线程占用，读取锁也叫共享锁，多个线程可以同时占用。
 * @create: 2020-03-14 21:05
 **/
public class ReadWriteLockTest {
    public static void main(String[] args) {
        Cache cache = new Cache();
        //5个线程写
        for (int i = 0; i < 5; i++) {
            final int temp = i;
            new Thread(()->{
                cache.write(temp,String.valueOf(temp));
            }).start();
        }
        //5个线程读
        for (int i = 0; i < 5; i++) {
            final int temp = i;
            new Thread(()->{
                cache.read(temp);
            }).start();
        }
    }
}
class Cache{
    private Map<Integer,String> map = new HashMap<>();
    ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    /**
     * 写         只能有一个线程拿到锁
     */
    public void write(Integer key,String value){
        //加写入锁
        readWriteLock.writeLock().lock();
        System.out.print(key+"开始写入...");
        map.put(key,value);
        System.out.println(key+"写入完毕...");
        //释放写入锁
        readWriteLock.writeLock().unlock();
    }
    /**
     * 读          可以由多个线程拿到锁
     */
    public void read(Integer key){
        //加读取锁
        readWriteLock.readLock().lock();
        System.out.print(key+"开始读取...");
        map.get(key);
        System.out.println(key+"读取完毕...");
        //释放读取锁
        readWriteLock.readLock().unlock();
    }
}
