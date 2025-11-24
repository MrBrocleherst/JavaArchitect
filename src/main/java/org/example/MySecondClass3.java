package org.example;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class MySecondClass3 {
    public static void main(String[] args) throws IOException {
        String sourceCode = downloadWebPage("https://www.google.com");
        writeToFile(sourceCode);
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

    public static void writeToFile(String str) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/macbook/Desktop/myPage.html"));
        writer.write(str);

        writer.close();
    }
}
