package com.automationpractice.utils;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class FakePostalCode {

    private String postalCode;
    private Random random = SecureRandom.getInstanceStrong();

    public String generateFakePostalCode() {
        StringBuilder generatedPostalCode = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            String digit = String.valueOf(random.nextInt(10));
            generatedPostalCode.append(digit);
        }
        return generatedPostalCode.toString();
    }

    public FakePostalCode() throws NoSuchAlgorithmException {
        this.postalCode = generateFakePostalCode();
    }

    public String getPostalCode() {
        return postalCode;
    }
}
