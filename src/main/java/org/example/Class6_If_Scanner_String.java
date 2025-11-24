package org.example;

import java.util.Scanner;

public class Class6_If_Scanner_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter some text: ");
        String str = scanner.nextLine();
        if (str.contains(" ")) {
            System.out.println("You entered myliple words");
        } else {
            System.out.println("You entered one word ");
        }
    }
}
