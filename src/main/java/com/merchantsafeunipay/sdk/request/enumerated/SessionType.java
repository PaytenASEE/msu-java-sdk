package com.merchantsafeunipay.sdk.request.enumerated;

/**
 * SessionType
 *
 * @author Erhun Baycelik <Erhun.Baycelik@asseco-see.com.tr>
 */
public enum SessionType {
    PAYMENTSESSION, WALLETSESSION, SPLITPAYMENTSESSION, QUERYOPERATIONSESSION;

    public static SessionType[] toEnums(String... values) {
        SessionType[] sessionTypes = new SessionType[values.length];
        int i = 0;
        for (String value : values) {
            sessionTypes[i++] = valueOf(value);
        }
        return sessionTypes;
    }

    public static SessionType fromString(String value) {
        for (SessionType st : values()) {
            if (st.name().equals(value)) {
                return st;
            }
        }
        return null;
    }

    public static boolean contains(String value) {
        for (SessionType st : values()) {
            if (st.name().equals(value)) {
                return true;
            }
        }
        return false;
    }
}
