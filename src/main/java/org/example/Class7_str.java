package org.example;

import java.util.Scanner;

public class Class7_str {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        boolean x = str.contains(". ");
        boolean y = str.contains("! ");
        boolean z = str.contains("? ");

        if (x) {
            System.out.println("There is a symvols");
        } else if (y) {
            System.out.println("There is a symvols");
        } else if (z) {
            System.out.println("There is a symvols");
        } else {
            System.out.println("It's not a digit");
        }
    }
}
