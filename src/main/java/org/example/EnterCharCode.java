package org.example;

import java.util.Scanner;

public class EnterCharCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter char code: ");
        int letterCode2 = scanner.nextInt();
        char letter = (char) letterCode2;
        System.out.print("This is will be: ");
        System.out.println(letter);

        int letterCode3 = 1072;
        while (letterCode3 <= 1103) {
             char letter3 = (char) letterCode3;
            System.out.println(letter3);
            letterCode3++;
        }
    }
}
