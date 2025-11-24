package org.example;

import java.util.Scanner;

public class Class7_Char {
    public static void main(String[] args) {
        char o1 = 'a';
        char o2 = 'b';
        char o3 = 'c';
        char o4 = 'd';
        char o5 = 'e';
        char o6 = 'f';
        char o7 = 'g';
        char o8 = 'h';
        char o9 = 'i';
        char o10 = 'j';
        char o11 = 'k';
        char o12 = 'l';
        char o13 = 'm';
        char o14 = 'n';
        char o15 = 'o';
        char o16 = 'p';
        char o17 = 'q';
        char o18 = 'r';
        char o19 = 's';
        char o20 = 't';
        char o21 = 'u';
        char o22 = 'v';
        char o23 = 'w';
        char o24 = 'x';
        char o25 = 'y';
        char o26 = 'z';
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
