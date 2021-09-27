package com.calendar;

public class MonthList {
    private static final int[] list = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static int getLastDay(int month){
        return list[month-1];
    };
}
