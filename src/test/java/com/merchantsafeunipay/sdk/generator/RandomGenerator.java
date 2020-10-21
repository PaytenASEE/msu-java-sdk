package com.merchantsafeunipay.sdk.generator;

import java.util.Random;

public class RandomGenerator {

    private static final String SOURCES =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    /**
     * Generates random string based on given length.
     * @param length
     * @return
     * @throws Exception
     */
    public static String generateString(int length) throws Exception {
        if (length <= 0) {
            throw new Exception("Please enter valid length. Length should bigger than 0.");
        }
        char[] text = new char[length];
        for (int i = 0; i < length; i++) {
            text[i] = SOURCES.charAt(new Random().nextInt(SOURCES.length()));
        }
        return new String(text);
    }
}
