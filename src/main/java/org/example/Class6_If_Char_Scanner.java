package org.example;

import java.util.Scanner;

public class Class6_If_Char_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter some letter: ");
        char letter = scanner.next().charAt(0);


        if (letter >= '0' && letter < '9') {
            System.out.println("You entered a char");
        } else if (letter >= 'а' && letter <= 'я') {
            System.out.println("You entered a letter");
        } else if (letter >= 'А' && letter <= 'Я') {
            System.out.println("You entered a letter");
        } else if (letter >= 'a' && letter <= 'g') {
            System.out.println("You entered a letter");
        } else if (letter >= 'A' && letter <= 'G') {
            System.out.println("You entered a letter");
        } else {
            System.out.println("You entered something else. Just character?");
        }
    }
}
