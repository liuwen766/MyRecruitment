package com.liuwen.练习.V202话单;


import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;

/**
 * @author yaozhiyuan
 * @date 2020/8/12
 */
public class DateUtils {

    /**
     * YYYYMMDDHH24MISS
     */
    public static final DateTimeFormatter datefmt = DateTimeFormat.forPattern("yyyyMMddHHmmss");

    /**
     * YYYYMMDDHH24MI（12位）
     */
    public static final DateTimeFormatter datefmtNoSS = DateTimeFormat.forPattern("yyyyMMddHHmm");

    /**
     * @param dateTime
     * @return
     */
    public static String getDateTimefmt(DateTime dateTime, DateTimeFormatter dateTimeFormatter) {
        return dateTime.toString(dateTimeFormatter);
    }

    /**
     * @param date
     * @param dateTimeFormatter
     * @return
     */
    public static String getDatefmt(Date date, DateTimeFormatter dateTimeFormatter) {
        return new DateTime(date).toString(dateTimeFormatter);
    }

}
