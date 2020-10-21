package com.merchantsafeunipay.sdk.request.enumerated;

import java.util.Arrays;
import java.util.List;


public enum CardBrand {

    VISA,
    /**
     * MasterCard
     */
    MC,
    /**
     * AmericanExpress
     */
    AMEX,
    /**
     * Discover Card
     */
    DISCOVER,
    /**
     * Dina Card
     */
    DINACARD,
    /**
     * Diner's Club
     */
    DINERS,
    /**
     * JCB - Japan Credit Bureau
     */
    JCB,
    /**
     * Union Pay - China
     */
    UNIONPAY,
    /**
     * Turkey’s Payment Method
     */
    TROY,
    /**
     * UNKNOWN
     */
    UNKNOWN;

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
