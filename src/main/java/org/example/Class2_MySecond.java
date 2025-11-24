package org.example;

public class Class2_MySecond {
    public static void main(String[] args) {
//        String str = "Я буду программистом";
        String str = "Программисты";

//        int x = 10;
        int x = str.length() - 1;
        while (x >= 0) {
            System.out.print(str.charAt(x));
            x = x - 1;
        }

    }
}
