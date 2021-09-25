package com.gugudan;

import java.util.Scanner;

public class GugudanMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] splitedInput = input.split(",");
        int num1 = Integer.parseInt(splitedInput[0]);
        int num2 = Integer.parseInt(splitedInput[1]);

        for (int i = 2; i <= num1; i++) {
            int[] list = Gugudan.saveInArray(i, num2);
            Gugudan.printResult(list);
        }
    }
}