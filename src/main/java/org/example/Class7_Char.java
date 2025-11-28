package org.example;

import java.util.Scanner;

public class Class7_Char {
    public static void main(String[] args) {
        char o1 = 'a', o2 = 'b', o3 = 'c', o4 = 'd', o5 = 'e', o6 = 'f', o7 = 'g', o8 = 'h',
                o9 = 'i', o10 = 'j', o11 = 'k', o12 = 'l', o13 = 'm', o14 = 'n', o15 = 'o', o16 = 'p',
                o17 = 'q', o18 = 'r', o19 = 's', o20 = 't', o21 = 'u', o22 = 'v', o23 = 'w', o24 = 'x',
                o25 = 'y', o26 = 'z' ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a symbol: ");
        char c = scanner.next().charAt(0);

        if (c == o1 || c == o5 || c == o9 || c == o13 || c == o17 || c == o21 || c == o25){
            System.out.println("It's a glass");
        } else if (c == o2 || c == o6 || c == o10 || c == o14 || c == o18 || c == o22 || c == o26){
            System.out.println("It's not a glass");
        } else {
            System.out.println("It's not a letter. This is a symbol");
        }
    }
}
