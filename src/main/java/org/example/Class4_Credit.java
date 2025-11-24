package org.example;

import java.util.Scanner;

public class Class4_Credit {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Please enter credit sum: ");
        int creditSum = myScan.nextInt();
        System.out.println("Please enter credit percent: ");
        double creditPercent = myScan.nextDouble();
        System.out.println(creditSum + creditSum * (creditPercent / 100));
    }
}
