package com.liuwen.练习.V202话单;

import org.joda.time.DateTime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * ----------------------------------------------------------------------
 * <p>Copyright © 2014-2020 China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * <p>The programs can not be copied and/or distributed without the express
 * permission of China Mobile (SuZhou) Software Technology Co.,Ltd.
 * <p>
 * <p>File name: TestDate.java
 * <p>Desc: hua
 * <p>
 *
 * @author Create by liuwen at  2020/10/28 10:31
 * <p>
 * ----------------------------------------------------------------------
 **/
public class TestDate {
    public static void main(String[] args) throws ParseException {

        DailyCountRequest dailyCountRequest = new DailyCountRequest();
        DailyCountResponse dailyCountResponse = new DailyCountResponse();
        DailyCountRequestItems dailyCountRequestItems = new DailyCountRequestItems();

        try {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS Z");
            Long startTimeFrom = df.parse(df.format(new Date())).getTime();
            Calendar cal = Calendar.getInstance();
            cal.setTime(df.parse(df.format(new Date())));
            cal.add(Calendar.HOUR, 24);
            Long startTimeTo = cal.getTimeInMillis();


            System.out.println(df.parse(df.format(new Date())));
            System.out.println(startTimeFrom);
            System.out.println(startTimeTo);
            System.out.println("-----------------------");

        } catch (ParseException ex) {
            throw ex;
        }


        DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

        String format = simpleDateFormat.format(new Date(System.currentTimeMillis() - 2700000));
        System.out.println(format);
        String format1 = simpleDateFormat1.format(new Date(System.currentTimeMillis() - 2700000));
        System.out.println(format1);

        long currentTime = new Date(System.currentTimeMillis()).getTime();
        long beginTime = new Date(System.currentTimeMillis() - 89100000).getTime();
        long endTime = new Date(System.currentTimeMillis() - 2700000).getTime();

        System.out.println("当前时间:    "+simpleDateFormat.format(currentTime));
        System.out.println("计费开始时间: "+simpleDateFormat.format(beginTime));
        System.out.println("计费结束时间: "+simpleDateFormat.format(endTime));

        long beginTime1 =  1603296000000L;
        System.out.println(beginTime1);

        for (int i = 0; i < 10; i++) {
            String eBossNnn = (new Random().nextInt(100) + 100) + "";
            System.out.println("随机生成的三位数:"+eBossNnn);
        }

        System.out.println("**********");
        DateTime now = DateTime.now();
        String dateTimeFmt = DateUtils.getDateTimefmt(now, DateUtils.datefmt);
        System.out.println(dateTimeFmt);

    }
}
