package com.merchantsafeunipay.sdk.request.enumerated;


public enum Usability {

    STANDART,
    REQUIRED;


    public static Usability fromString(String input) {
        for (Usability ct : values()) {
            if (ct.name().equals(input))
                return ct;
        }
        return null;
    }
}
