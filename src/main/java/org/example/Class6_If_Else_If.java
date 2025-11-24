package org.example;

public class Class6_If_Else_If {
    public static void main(String[] args) {
        int x = 5;

        // этот метод написания кода более компактный но так же присутствует сложенность.
        // любой код строится как дерево, он ветвистый.
        if (x > 1000) {
            System.out.println("x is sooo big! more than 1000");
        } else if (x > 100) {
            System.out.println("x is very big");
            System.out.println("x is more than 100");
        } else if (x > 10) {
            System.out.println("x is greater than 10");
        } else {
            System.out.println("x is small");
        }
    }
}
