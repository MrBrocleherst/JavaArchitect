package org.example;

import java.util.Scanner;

public class Class7_str {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a symbol: ");
        char c = scanner.next().charAt(0);
        String str = scanner.nextLine();
        boolean x = str.contains(". ");
        boolean y = str.contains("! ");
        boolean z = str.contains("? ");
        boolean a = c >= '0';
        boolean b = c <= '9';
        boolean cond1 = a || b; // true || false = true

        if (cond1) {
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
