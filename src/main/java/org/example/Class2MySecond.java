package org.example;

public class Class2MySecond {
    public static void main(String[] args) {
        int x = 3;

        if (x < 10) {
            System.out.println("x is less than 10");
            if (x < 5) {
                System.out.println("x is less than 5");
                if (x < 3) {
                    System.out.println("x is less than 3");
                } else {
                    System.out.println("x is greater than or equal to 3");
                }
            }
        } else {
            System.out.println("x is greater than or equal to 10");
        }

        while (x < 2000) {
            x = x + 1;
            System.out.println(x);
        }

        String str = "Hello";
        String str2 = str.toUpperCase();
        System.out.println(str2);

    }
}
