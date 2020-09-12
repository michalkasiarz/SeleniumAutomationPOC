package com.automationpractice.utils;

import java.util.Random;

public class FakePostalCode {

    private String postalCode;

    public String generateFakePostalCode() {
        Random random = new Random();

        String postalCode = "";
        for (int i = 0; i < 5; i++) {
            String digit = String.valueOf(random.nextInt(10));
            postalCode += digit;
        }
        return postalCode;
    }

    public FakePostalCode() {
        this.postalCode = generateFakePostalCode();
    }

    public String getPostalCode() {
        return postalCode;
    }
}
