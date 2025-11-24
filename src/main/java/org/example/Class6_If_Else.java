package org.example;

public class Class6_If_Else {
    public static void main(String[] args) {
        int x = 5;

        // Данный метод написания кода показан для наглядности
        // Код можно писать и по другому, но в этом варианте видна вложенность кода.
        if (x > 10) {
            System.out.println("x is greater than 10");
        } else {
            if (x > 100) {
                System.out.println("x is greater than 100");
            } else {
                if (x < 10) {
                    System.out.println("x is less than 10");
                } else {
                    if (x == 300) {
                        System.out.println("x is 300");
                    }
                }
            }
        }
    }
}
