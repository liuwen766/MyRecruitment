package com.liuwen.练习.V202话单;


import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;

/**
 * ----------------------------------------------------------------------
 * <p>Copyright © 2014-2020 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * <p>The programs can not be copied and/or distributed without the express
 * permission of China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * <p>File name: TestDigOrder.java
 * <p>Desc: TODO
 * <p>
 *
 * @author Create by liuwen at  2020/10/29 15:51
 * <p>
 * ----------------------------------------------------------------------
 **/
@Slf4j
public class TestDigOrder {

    static AtomicLong atomicLong = new AtomicLong(195);

    public static void main(String[] args) {


        System.out.println("---------------");
        log.error("第{}次话单上传{}至FTP服务器失败", 1, "fileName");
        System.out.println("---------------");

        for (int i = 0; i < 10; i++) {
            System.out.println(getBossStreamNumber());
        }


    }

    public static String getBossStreamNumber() {
        if (atomicLong.weakCompareAndSet(199, 100)) {
            atomicLong = new AtomicLong(100);
        }
        long ebossStreamNumber = atomicLong.getAndIncrement();
        long result = ebossStreamNumber % 999L;
        result = result < 0 ? result + 999L : result;
        return String.format("%03d", result + 1);
    }


}
