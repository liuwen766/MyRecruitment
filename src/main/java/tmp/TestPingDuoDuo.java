package tmp;

import java.util.concurrent.TimeUnit;

public class TestPingDuoDuo {

//    public static volatile boolean flag = true;

    public static boolean flag = true;

    //    public static volatile boolean flag = true;    //保证可见性
    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            while (flag) {
                //代码不会停止
//                System.out.println(flag);
            }
        }, "Thread-1").start();

        TimeUnit.SECONDS.sleep(2);

        new Thread(() -> {
            flag = false;
            System.out.println(Thread.currentThread().getName() + "已经将flag改为:" + flag);
        }, "Thread-2").start();
    }
//    public static void main(String[] args) {
//        String s = contactString("ssdwe", "sadd", "abcd");
//        System.out.println(s);
//    }
//    public static String contactString(String s1,String s2,String s3){
//        return new StringBuffer().append(s1).append(s2).append(s3).toString();
//    }
}
