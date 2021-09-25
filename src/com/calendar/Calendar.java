package com.calendar;

public class Calendar {
    public static void main(String[] args) {

        System.out.printf("%3s%3s%3s%3s%3s%3s%3s%n", "일", "월", "화", "수", "목", "금", "토");
        System.out.println("----------------------");
        for (int i = 1; i < 29; i++) {
            if (i % 7 == 0) {
                System.out.printf("%3d%n", i);
            } else {
                System.out.printf("%3d", i);
            }
        }

    }
}
