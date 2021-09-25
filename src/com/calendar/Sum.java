package com.calendar;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputStr = scanner.nextLine().split(" ");
        int firstInput = Integer.parseInt(inputStr[0]);
        int secondInput = Integer.parseInt(inputStr[1]);

//        System.out.println("두 수의 합은 " + (firstInput+secondInput) + "입니다.");
        System.out.printf("두 수의 합은 %d 입니다.",firstInput+secondInput);
        scanner.close();

    }
}
