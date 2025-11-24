package org.example;

import java.util.Scanner;

public class Class3_MyThird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner это олбьект считывания
        System.out.print("Please enter x:");
        int x = scanner.nextInt();
        System.out.print("Please enter y:");
        int y = scanner.nextInt();

        System.out.println("y will" + y);
        if (x > y) {
            System.out.println("x is greater than y");
        } else {
            System.out.println("y is greater(or maybe equal)to x");
        }
    }
}
