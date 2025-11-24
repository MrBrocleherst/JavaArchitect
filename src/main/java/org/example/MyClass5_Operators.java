package org.example;

import java.util.Scanner;

public class MyClass5_Operators {
    public static void main(String[] args) {
        //  + - * /
        // %
        // < > <= >= == !=
        // ++ --
        // && || !

//        System.out.println( 8 % 2);
//        System.out.println( 8 % 3);
//        System.out.println( 8 % 4);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();
        if ((number % 2) == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        int x = 1;
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);
    }
}
