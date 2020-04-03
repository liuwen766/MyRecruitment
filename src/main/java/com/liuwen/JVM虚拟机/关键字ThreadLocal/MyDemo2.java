package com.liuwen.JVM虚拟机.关键字ThreadLocal;

/**
 * @description:     ThreadLocal解决数据隔离问题
 * @author: Liu Wen
 * @create: 2020-04-02 12:33
 **/
public class MyDemo2 {
    public static void main(String[] args) {
        MyDemo2 demo = new MyDemo2();
        for (int i = 0; i < 5; i++) {
            new Thread(()->{
                demo.setContent(Thread.currentThread().getName() + "的数据");
                System.out.println(Thread.currentThread().getName()+"——>"+demo.getContent());
            },"线程"+i).start();
        }
    }
        private static ThreadLocal<String> tl = new ThreadLocal<>();

        private String content;

        private String getContent() {
            return tl.get();
        }

        private void setContent(String content) {
            tl.set(content);
        }
}
