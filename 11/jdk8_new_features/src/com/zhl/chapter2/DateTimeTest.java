package com.zhl.chapter2;

import java.time.*;

public class DateTimeTest {
    public static void main(String[] args) {

        /*-------------------------------------
        jdk8之前的Date类计算使用复杂
         */
        //日期
        LocalDate localDate = LocalDate.now();
        //时间
        LocalTime localTime = LocalTime.now();
        //日期时间
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("日期: " + localDate + "时间: " + localTime + "日期时间: " + localDateTime);

        //详细API
        int year = localDate.getYear();
        System.out.println("现在的年份是: " + year);
        Month month = localDate.getMonth();
        System.out.println("现在的月份是: " + month);
        int monthValue = localDate.getMonthValue();
        System.out.println("现在的月份是(数字): " + monthValue);
        int date = localDate.getDayOfMonth();
        System.out.println("现在的日期是: " + date);
        DayOfWeek week = localDate.getDayOfWeek();
        System.out.println("现在的星期是: " + week);

        //加减
        LocalDate changeDate = localDate.plusMonths(2);
        System.out.println("加过的年份是: " + changeDate);

        //比较
        boolean isAfter = changeDate.isAfter(localDate);
        System.out.println(changeDate + "是否在" + localDate + "之后： " + isAfter);

    }
}
