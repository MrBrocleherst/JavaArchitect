package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BankAmount {
    public static void main(String[] args) {
        BigDecimal amount = new BigDecimal("134.955");
        BigDecimal taxRate = new BigDecimal("0.13");

        BigDecimal tax = amount.multiply(taxRate)
                .setScale(2, RoundingMode.HALF_EVEN);

        BigDecimal total = amount.add(tax);

        System.out.println("Tax: " + tax);     // 17.54
        System.out.println("Total: " + total); // 152.49

    }
}
