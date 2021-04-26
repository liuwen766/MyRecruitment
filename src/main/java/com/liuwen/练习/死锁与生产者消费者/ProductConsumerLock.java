package com.liuwen.练习.死锁与生产者消费者;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description: 生产者消费者模型  Lock锁实现
 * @author: Liu Wen
 * @create: 2020-03-10 22:28
 **/
public class ProductConsumerLock {
    public static void main(String[] args) {
        Data data = new Data();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                data.increment();
            }
        }, "生产者生产+1，当前库存：").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                data.decrement();
            }
        }, "消费者消费-1，当前库存：").start();

    }

    public static class Data {
        int num = 0;
        Lock lock = new ReentrantLock();
        Condition condition = lock.newCondition();     //lock锁可以绑定多个条件

        public void increment() {
            try {
                lock.lock();            //加锁
                while (num == 3) {
                    System.out.println("仓库已满，暂时不能执行生产任务!");
                    condition.await();  //condition条件等待
                }
                num++;
                condition.signal();     //condition条件唤醒
                System.out.println(Thread.currentThread().getName() + "→" + num);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();          //释放锁
            }
        }

        public void decrement() {
            try {
                lock.lock();
                while (num == 0) {
                    System.out.println("仓库已空，暂时不能执行消费任务!");
                    condition.await();
                }
                num--;
                condition.signal();
                System.out.println(Thread.currentThread().getName() + "→" + num);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }

    }
}

