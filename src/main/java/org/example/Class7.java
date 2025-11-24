package org.example;

import java.util.Scanner;

public class Class7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char sym = scanner.next().charAt(0);

        // && - логическое И
        if (sym > '0' && sym < '9') {
            System.out.println("I'ts a digit");
        } else {
            System.out.println("It's not a digit");
        }
    }
}
