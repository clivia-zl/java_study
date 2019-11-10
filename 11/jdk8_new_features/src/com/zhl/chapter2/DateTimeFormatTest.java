package com.zhl.chapter2;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatTest {
    public static void main(String[] args) {

        /**************************************
         * jdk8之前的SimpleDateFormat类线程不安全
         */
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("格式化之前的日期: " + localDateTime);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dateTimeString = dateTimeFormatter.format(localDateTime);
        System.out.println("格式化之后的日期: " + dateTimeString);

        //构造日期
        LocalDateTime newDateTime = LocalDateTime.of(2021,11,11,11,11,11,124);
        //计算差值
        Duration duration = Duration.between(localDateTime, newDateTime);
        long dayNum = duration.toDays();
        long hourNum = duration.toHours();
        long minuteNum = duration.toMinutes();
        long millisNum = duration.toMillis();
        long nanosNum = duration.toNanos();
        System.out.println("两者的时间相差的天数: " + dayNum);
        System.out.println("两者的时间相差的小时数: " + hourNum);
        System.out.println("两者的时间相差的分钟数: " + minuteNum);
        System.out.println("两者的时间相差的毫秒数: " + millisNum);
        System.out.println("两者的时间相差的纳秒数: " + nanosNum);

    }
}
