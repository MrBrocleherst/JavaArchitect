package org.example;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // 10
        // *
        // 20
        // =
        // 200
        System.out.println("Please enter math operation: "); // предлагает нам ввести число
        Scanner scanner = new Scanner(System.in); // предлагает нам считать число
        double x = scanner.nextDouble();
        char operator = scanner.next().charAt(0);
        double y = scanner.nextDouble();

        System.out.println("=");
        if (operator == '+') {
            System.out.println(x + y);
        } else if (operator == '-') {
            System.out.println(x - y);
        } else if (operator == '*') {
            System.out.println(x * y);
        } else if (operator == '/') {
            System.out.println(x / y);
        } else if (operator == '^') {
            System.out.println(Math.pow(x, y));
        }
    }
}
