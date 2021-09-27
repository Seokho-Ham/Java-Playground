package com.calendar;

import java.util.Scanner;

public class Calendar {
    //Step 2. 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
    public static void step2(Scanner scanner) {
        System.out.println("월을 입력하세요.");
        System.out.print("> ");
        int month = scanner.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("1월부터 12월 사이의 월을 입력해주세요.");
        } else {
            System.out.printf("%d월은 %d까지 있습니다.", month, MonthList.getLastDay(month - 1));
        }
    }

    //Step 3. 원하는 횟수만큼 입력을 받고 해당 월의 마지막일을 출력하기
    public static void step3(Scanner scanner) {
        System.out.println("반복 횟수를 입력하세요.");
        int repeatTimes = scanner.nextInt();
        int[] months = new int[repeatTimes];
        System.out.println("월을 입력하세요.");
        for (int i = 0; i < repeatTimes; i++) {
            int month = scanner.nextInt();
            months[i] = month;
        }
        for (int i = 0; i < months.length; i++) {
            System.out.printf("%d월은 %d일까지 있습니다.\n", months[i], MonthList.getLastDay(months[i]));
        }

    }

    public static void step4(Scanner scanner) {
        while (true) {
            System.out.println("월을 입력해주세요.");
            System.out.print("> ");
            int inputMonth = scanner.nextInt();
            if (inputMonth == -1) {
                System.out.println("Have a nice day!");
                break;
            } else {
                System.out.printf("%d월은 %d일까지 있습니다. \n", inputMonth, MonthList.getLastDay(inputMonth));
            }
        }

    }

    public static void main(String[] args) {
        //Step 1. 달력을 출력해라
        System.out.printf("%3s%3s%3s%3s%3s%3s%3s%n", "일", "월", "화", "수", "목", "금", "토");
        System.out.println("----------------------");
        for (int i = 1; i < 29; i++) {
            if (i % 7 == 0) {
                System.out.printf("%3d%n", i);
            } else {
                System.out.printf("%3d", i);
            }
        }
        Scanner scanner = new Scanner(System.in);

//        step2(scanner);
//        step3(scanner);
        step4(scanner);
    }

}
