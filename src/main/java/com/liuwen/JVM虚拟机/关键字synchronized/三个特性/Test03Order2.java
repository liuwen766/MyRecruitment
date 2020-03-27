package com.liuwen.JVM虚拟机.关键字synchronized.三个特性;

/**
 * @description: Good good study,day day up!
 * @author: Liu Wen
 * @create: 2020-03-27 19:05
 **/
public class Test03Order2 {
    private static int i = 0, j = 0;
    private static int a = 0, b = 0;
//    private volatile static int i = 0, j = 0;   //禁止重排序
//    private volatile static int a = 0, b = 0;
    public static void main(String[] args) throws InterruptedException {
        int count = 0; // 计数
        while(true) {
            count++;
            i = 0;
            j = 0;
            a = 0;
            b = 0;
            Thread one = new Thread(new Runnable() {
                @Override
                public void run() {
                    a = 1;
                    i = b;
                }
            });
            Thread two = new Thread(new Runnable() {
                @Override
                public void run() {
                    b = 1;
                    j = a;
                }
            });
            two.start();
            one.start();
            one.join();
            two.join();
            String result = "第" + count + "次（ i= " + i + ", j= " + j + ")";
            if (i == 0 && j == 0) {
                System.out.println(result);
                break;
            } else {
                System.out.println(result);
            }
        }
    }
}
