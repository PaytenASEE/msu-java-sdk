package com.merchantsafeunipay.sdk.request.enumerated;

public enum InstallmentType {
    ONE_SHOT,
    MULTIPLE_SHOT;

    public static InstallmentType fromString(String input) {
        for (InstallmentType it : values()) {
            if (it.name().equals(input))
                return it;
        }
        return null;
    }
}
