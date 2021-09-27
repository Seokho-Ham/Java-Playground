package com.calendar;


public class MonthList {
    private static final int[] MONTH_LIST = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] LEAPYEAR_MONTH_LIST = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static int getLastDay(int year, int month) {
        if (checkLeapYear(year)) {
            return LEAPYEAR_MONTH_LIST[month - 1];
        }
        return MONTH_LIST[month - 1];
    }

    ;

    public static void printMonth(int year, int month) {
        System.out.printf("<<%4d %3d>>\n", year, month);
        System.out.println(" SUN MON TUE WED THU FRI SAT");
        System.out.println("----------------------------");
        int day = calculateStartDay(year)-1;
        int startDate = 7 - day;
        int endDate = startDate < 7 ? startDate : 0;
        for (int i = 0; i < day; i++) {
            System.out.print("    ");
        }
        for (int i = 1; i <= getLastDay(year, month); i++) {
            System.out.printf("%4d", i);
            if (i % 7 == endDate) {
                System.out.println();
            }
        }
    }

    public static void printMonth(int year, int month, int day) {
        System.out.printf("<<%4d %3d>>\n", year, month);
        System.out.println(" SUN MON TUE WED THU FRI SAT");
        System.out.println("----------------------------");
        int startDate = 7 - day;
        int endDate = startDate < 7 ? startDate : 0;
        for (int i = 0; i < day; i++) {
            System.out.print("    ");
        }
        for (int i = 1; i <= getLastDay(year, month); i++) {
            System.out.printf("%4d", i);
            if (i % 7 == endDate) {
                System.out.println();
            }
        }
    }

    public static boolean checkLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static int calculateStartDay(int year) {
        int fullYear = year - 1;
        int result = fullYear + fullYear / 4 - fullYear / 10 + fullYear / 400;

        return result % 7;
    }
}
