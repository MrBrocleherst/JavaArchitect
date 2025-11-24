package org.example;

import java.util.Scanner;

public class Class6_If_IfElse_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x; ");
        int x = scanner.nextInt();
        System.out.print("y; ");
        int y = scanner.nextInt();
        System.out.print("z; ");
        int z = scanner.nextInt();

        System.out.print("Max is: ");
        if (x > y) {
            if (x > z) {
                System.out.println(x);
            } else {
                System.out.println(z);
            }
        } else {
            if (y > z) {
                System.out.println(y);
            } else {
                System.out.println(z);
            }
        }
    }
}
