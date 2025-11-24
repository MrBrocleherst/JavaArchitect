package org.example;

import java.util.Scanner;

public class ProgramChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a character: ");
        char c = scanner.next().charAt(0);
        int charCode = c;
        if (charCode >= 48 && charCode <= 57) {  // && - логическое И
            // так же можно написать таким образом
            // if (charCode >= '0' && charCode <= '9') {  // && - логическое И

            System.out.println("It is a digit");
        } else {
            System.out.println("It is not a digit");
        }
    }
}
