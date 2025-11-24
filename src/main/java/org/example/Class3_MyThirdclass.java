package org.example;

import java.util.Scanner;

public class Class3_MyThirdclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x:");
        int x = scanner.nextInt();
        System.out.println("Enter y:");
        int y = scanner.nextInt();
        System.out.println("Enter z:");
        int z = scanner.nextInt();
        int max = x;

        if (x > y) {
            if (z > x) {
                max = z;
            } else {
                max = x;
            }
        }

        if (y >= x) {
            if (z > y) {
                max = z;
            } else {
                max = y;
            }
        }
        System.out.println("Max is " + max);
    }
}
