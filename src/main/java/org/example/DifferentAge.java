package org.example;

import java.util.Scanner;

public class DifferentAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько лет вашему лучшему другу?");
        int age1 = scanner.nextInt();
        System.out.println("Сколько лет было человеку, с которым вы последний раз говорили?");
        int age2 = scanner.nextInt();
        System.out.println("Сколько лет вашему учителю?");
        int difference = Math.abs(age1-age2);
        System.out.println("Их разница в возрасте: " + difference + " лет");
        int ageMax = Math.max(age1, age2);
        System.out.println("Самому старшему человеку: " + ageMax + " лет");
        int ageMin = Math.min(age1, age2);
        System.out.println("Самому младшему человеку: " + ageMin + " лет");
    }
}
