package com.liuwen.JVM虚拟机.关键字ThreadLocal;

/**
 * @description:      存在数据隔离问题
 * @author: Liu Wen
 * @create: 2020-04-02 12:31
 **/
public class MyDemo {
        public static void main(String[] args) {
            MyDemo demo = new MyDemo();
            for (int i = 0; i < 5; i++) {
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        demo.setContent(Thread.currentThread().getName() + "的数据");
                        System.out.println(Thread.currentThread().getName() + "——>" + demo.getContent());
                    }
                });
                thread.setName("线程" + i);
                thread.start();
            }
        }
        private String content;

        private String getContent() {
            return content;
        }

        private void setContent(String content) {
            this.content = content;
        }
}
