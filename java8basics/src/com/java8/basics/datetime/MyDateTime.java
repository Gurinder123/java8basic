package com.java8.basics.datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;

/**
 * Created by gurinder on 30/9/16.
 */
public class MyDateTime {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.getDayOfMonth() + "-" + localDate.getMonthValue() + "-" + localDate.getYear());
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime.getHour() + ":" + localTime.getMinute() + ":" + localTime.getSecond());
//        TemporalField field = ChronoField.YEAR;
//        System.out.println(localTime.get(field));
    }
}
