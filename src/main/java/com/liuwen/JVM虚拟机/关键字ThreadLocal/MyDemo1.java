package com.liuwen.JVM虚拟机.关键字ThreadLocal;

/**
 * @description: synchronized解决数据隔离问题
 * @author: Liu Wen
 * @create: 2020-04-02 12:41
 **/
public class MyDemo1 {
    public static void main(String[] args) {
        MyDemo1 demo = new MyDemo1();
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                synchronized (MyDemo1.class) {
                    demo.setContent(Thread.currentThread().getName() + "的数据");
                    System.out.println(Thread.currentThread().getName() + "——>" + demo.getContent());
                }
            }, "线程" + i).start();
        }
    }

    private String content;

    private void setContent(String content) {
        this.content = content;
    }

    private String getContent() {
        return content;
    }

}
