package com.merchantsafeunipay.sdk.request.enumerated;

import java.util.Arrays;
import java.util.List;


public enum CardBrand {

    VISA("Visa"),
    /**
     * MasterCard
     */
    MC("Master Card"),
    /**
     * AmericanExpress
     */
    AMEX("American Express"),
    /**
     * Discover Card
     */
    DISCOVER("Discover"),
    /**
     * Dina Card
     */
    DINACARD("Dina Card"),
    /**
     * Diner's Club
     */
    DINERS("Diner's Card"),
    /**
     * JCB - Japan Credit Bureau
     */
    JCB("JCB"),
    /**
     * Union Pay - China
     */
    UNIONPAY("Union Pay"),
    /**
     * Turkey’s Payment Method
     */
    TROY("TROY"),
    /**POM
     * UNKNOWN
     */
    UNKNOWN("Unknown");

    private String userInterfaceValue;

    CardBrand(String userInterfaceValue) {
        this.userInterfaceValue = userInterfaceValue;
    }

    public String getUserInterfaceValue() {
        return userInterfaceValue;
    }

    public static List<PaymentSystemType> getSupportedPaymentSystemTypes(CardBrand cardBrand) {
        if (CardBrand.JCB.equals(cardBrand)) {
            return Arrays.asList(PaymentSystemType.ISBANK, PaymentSystemType.GARANTI);
        }
        if (CardBrand.UNIONPAY.equals(cardBrand)) {
            return Arrays.asList(PaymentSystemType.ISBANK);
        } else {
            //AMEX
            return Arrays.asList(PaymentSystemType.ISBANK, PaymentSystemType.GARANTI);
        }
    }

    public static boolean isCardBrandSwitchSupportedBy(CardBrand cardBrand) {
        return Arrays.asList(CardBrand.AMEX, CardBrand.JCB, CardBrand.UNIONPAY).contains(cardBrand);
    }

    public static CardBrand fromString(String input) {
        for (CardBrand cb : values()) {
            if (cb.name().equals(input))
                return cb;
        }
        return null;
    }
}
