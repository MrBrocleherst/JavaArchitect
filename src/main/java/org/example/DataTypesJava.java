package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataTypesJava {
    public static void main(String[] args) {
        byte byteValue = 100;
        short shortValue = 10000;
        int intValue = 1000000000;
        long longValue = 1079999999999999999L;
        float floatValue = 10.5f;

        BigDecimal bigDecimalValue = new BigDecimal("10.5"); // BigDecimal это класс для работы с числами с плавающей точкой
        System.out.println(bigDecimalValue);

        BigDecimal balance = new BigDecimal("10.56789")
                .setScale(2, RoundingMode.HALF_UP);
        System.out.println(balance); // 10.57


        double doubleValue = 10.5;
        char charValue = 'a';
        boolean booleanValue = true;
        boolean booleanValue2 = false;
        String stringValue = "Hello";
        System.out.println(byteValue);
        System.out.println(shortValue);
        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
        System.out.println(charValue);
        System.out.println(booleanValue);
        System.out.println(booleanValue2);
        System.out.println(stringValue);

        String str = "Hello";
        System.out.println(str.charAt(0));
    }
}
