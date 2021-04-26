package com.liuwen.练习.V220工单;

import com.alibaba.fastjson.JSONArray;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * ----------------------------------------------------------------------
 * <p>Copyright © 2014-2020 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * <p>The programs can not be copied and/or distributed without the express
 * permission of China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * <p>File name: Test.java
 * <p>Desc: TODO
 * <p>
 *
 * @author Create by liuwen at  2020/10/28 10:32
 * <p>
 * ----------------------------------------------------------------------
 **/
public class Test {
    private static AtomicLong atomicLong = new AtomicLong(299);

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        long time = 1604719112909L;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        java.util.Date date = new Date(time);
        String str = sdf.format(date);
        System.out.println(str);


        list.add("zhi");
        list.add("bing");
        list.add("ze");

        System.out.print("未经json处理:");
        System.out.println(list);

        String json = JSONArray.toJSONString(list);

        System.out.print("经json处理:");
        System.out.println(json);

        for (int i = 0; i < 105; i++) {
            String billOrderNumber = getBillOrderNumber();
            System.out.println(billOrderNumber);
        }

    }

    public static String getBillOrderNumber() {
        if (atomicLong.weakCompareAndSet(399L, 299L)) {
            atomicLong = new AtomicLong(299L);
        }
        long ebossStreamNumber = atomicLong.getAndIncrement();
        long result = ebossStreamNumber % 999L;
        result = result < 0 ? result + 999L : result;
        return String.format("%03d", result);
    }
}
