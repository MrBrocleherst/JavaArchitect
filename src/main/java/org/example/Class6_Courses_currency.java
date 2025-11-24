package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Class6_Courses_currency {
    public static void main(String[] args) throws IOException {
String page = downloadWebPage("https://minfin.com.ua/currency/banks/");
int startIndex = page.indexOf("USD Курс НБУ");
int endIndex = page.indexOf("EUR Курс НБУ");
String courseStr = page.substring(startIndex, endIndex);
System.out.println();
    }

    private static String downloadWebPage(String url) throws IOException {

        StringBuilder result = new StringBuilder();
        String line;
        URLConnection urlConnection = new URL(url).openConnection();
        try (InputStream is = urlConnection.getInputStream();
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {

            while ((line = br.readLine()) != null) {
                result.append(line);
            }
        }
        return result.toString();
    }
}
