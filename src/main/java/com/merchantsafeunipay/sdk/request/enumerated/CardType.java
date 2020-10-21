package com.merchantsafeunipay.sdk.request.enumerated;


public enum CardType {
    /**
     * Debit
     */
    DEBIT,
    /**
     * Credit Card
     */
    CREDIT,
    /**
     * Charge Card
     */
    CHARGE,
    /**
     * Stored-value Card
     */
    STORED,
    /**
     * Stored-value Card
     */
    PREPAID,
    /**
     * UNKNOWN
     */
    UNKNOWN;


    public static CardType fromString(String input) {
        for (CardType ct : values()) {
            if (ct.name().equals(input))
                return ct;
        }
        return null;
    }
}
