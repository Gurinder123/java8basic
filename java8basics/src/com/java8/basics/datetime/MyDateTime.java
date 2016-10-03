package com.java8.basics.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 * Created by gurinder on 30/9/16.
 */
public class MyDateTime {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.getDayOfMonth() + "-" + localDate.getMonthValue() + "-" + localDate.getYear());
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime.getHour() + ":" + localTime.getMinute() + ":" + localTime.getSecond());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDateTime myLocalDateTime = LocalDateTime.of(1991, Month.MARCH, 22, 0, 0);
        System.out.println(myLocalDateTime.format(formatter));
    }
}
