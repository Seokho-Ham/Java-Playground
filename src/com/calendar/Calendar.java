package com.calendar;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Calendar {
    private static final String PROMPT = "> ";
    public static final String today = LocalDate.now().format(DateTimeFormatter.ISO_DATE);

    //Step 2. 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
    public static void step2(Scanner scanner) {
        System.out.println("월을 입력하세요.");
        System.out.print("> ");
        int month = scanner.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("1월부터 12월 사이의 월을 입력해주세요.");
        } else {
            System.out.printf("%d월은 %d까지 있습니다.", month, MonthList.getMaxDay(2021,month - 1));
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
            System.out.printf("%d월은 %d일까지 있습니다.\n", months[i], MonthList.getMaxDay(2021,months[i]));
        }

    }

    //Step 4. 반복적으로 월을 입력할 수 있도록 한다.
    public static void step4(Scanner scanner) {
        while (true) {
            System.out.println("월을 입력해주세요.");
            System.out.print(PROMPT);
            int inputMonth = scanner.nextInt();
            if (inputMonth == -1) {
                System.out.println("Have a nice day!");
                break;
            } else {
                System.out.printf("%d월은 %d일까지 있습니다. \n", inputMonth, MonthList.getMaxDay(2021,inputMonth));
            }
        }

    }

    //Step 5. input으로 받은 월의 달력을 출력해라.
    //1일은 일요일로 정해도 된다.
    public static void step5(Scanner scanner) {
        while (true) {
            System.out.println("월을 입력해주세요.");
            System.out.print(PROMPT);
            int inputMonth = scanner.nextInt();
            if (inputMonth == -1) {
                System.out.println("Have a nice day!");
                break;
            } else {
                MonthList.printMonth(2021, inputMonth);
                System.out.println("\n");
            }
        }
    }

    //Step 6. 입력받은 요일을 1일로 설정해서 달력 출력하기.
    public static void step6(Scanner scanner) {
        while (true) {
            System.out.println("년을 입력해주세요.");
            System.out.print(PROMPT);
            int inputYear = scanner.nextInt();
            if (inputYear == -1) {
                System.out.println("Have a nice day!");
                break;
            }
            System.out.println("월을 입력해주세요.");
            System.out.print(PROMPT);
            int inputMonth = scanner.nextInt();
            if (inputMonth == -1) {
                System.out.println("Have a nice day!");
                break;
            }
            System.out.println("시작일을 골라주세요.");
            System.out.println("1.SUN | 2.MON | 3.TUE | 4.WED | 5.THU | 6.FRI | 7.SAT");
            int inputDay = scanner.nextInt();
            MonthList.printMonth(inputYear, inputMonth, inputDay - 1);
            System.out.println("\n");
        }
    }


    //Step 7. 년, 월만 입력받아서 정확한 달력을 출력할 것.
    //특정 년도에서 그 다음해 같은 월 같은 일일 경우 해당 요일은 하루 밀린다.
    //윤년일 경우 이틀이 밀린다.
    public static void step7(Scanner scanner){
        System.out.println("년도를 입력해주세요.");
        int year = scanner.nextInt();
        System.out.println("월을 입력해주세요.");
        int month = scanner.nextInt();
        MonthList.printMonth(year,month);

    }
}
