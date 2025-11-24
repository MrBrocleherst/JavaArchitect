package org.example;

import java.util.Scanner;

public class Class6_If_WordType_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter some text: ");
        String str = scanner.nextLine();
        String wordType = "";
        if (str.endsWith("ся")) {
            wordType = "глагол 1";
        } else if (str.endsWith("ет")) {
            wordType = "глагол 2";
        } else if (str.endsWith("ют")) {
            wordType = "глагол 3";
        } else if (str.endsWith("ть")) {
            wordType = "глагол 4";
        } else if (str.endsWith("аю")) {
            wordType = "глагол 5";
        } else if (str.endsWith("шь")) {
            wordType = "глагол 6";
        } else if (str.endsWith("ая")) {
            wordType = "прилагательное 1";
        } else if (str.endsWith("ое")) {
            wordType = "прилагательное 2";
        } else if (str.endsWith("ее")) {
            wordType = "прилагательное 3";
        } else if (str.endsWith("ий")) {
            wordType = "прилагательное 4";
        } else if (str.endsWith("ый")) {
            wordType = "прилагательное 5";
        } else {
            wordType = "cуществительное 6";
        }
        System.out.println("Вы ввели: " + wordType);
    }
}
