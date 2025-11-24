package org.example;

public class Class1MyFirst {
    public static void main(String[] args) {
        // a*x +  b*x*x + c = 0
        int a = 5;
        int c = -3;
        double b = -2;
        double D = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(D)) / (2 * a);
        double x2 = (-b - Math.sqrt(D)) / (2 * a);
        System.out.println(x1);
        System.out.println(x2);


    }
}
