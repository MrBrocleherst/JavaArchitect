package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class MySecondClass2 {
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
