package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char znak = '/';
        String primer = scanner.nextLine();

        if (primer.contains("-")) {
            znak = '-';
        } else if (primer.contains("+")) {
            znak = '+';
        } else if (primer.contains("*")) {
            znak = '*';
        } else if (primer.contains("/")) {
            znak = '/';
        }

        String[] arr = primer.split("[-*+/]");

        switch (znak) {

            case '-':
                System.out.println("Результат = "+(Integer.parseInt(arr[0]) - Integer.parseInt(arr[1])));
                break;
            case '+':
                System.out.println("Результат = "+(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1])));
                break;
            case '*':
                System.out.println("Результат = "+(Integer.parseInt(arr[0]) * Integer.parseInt(arr[1])));
                break;
            case '/':
                System.out.println("Результат = "+(Double.parseDouble(arr[0]) / Double.parseDouble(arr[1])));
                break;
            default:
                System.out.println("Ошибка!");
        }

    }


}
