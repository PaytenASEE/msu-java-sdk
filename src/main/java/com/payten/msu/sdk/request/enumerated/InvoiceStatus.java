package com.payten.msu.sdk.request.enumerated;



public enum InvoiceStatus {

    PAID,


    UNPAID;

    public static InvoiceStatus fromString(String input) {
        for (InvoiceStatus status : values()) {
            if (status.name().equals(input))
                return status;
        }
        return null;
    }

    public static InvoiceStatus[] toEnums(String... values) {
        InvoiceStatus[] statuses = new InvoiceStatus[values.length];
        int i = 0;
        for (String value : values) {
            statuses[i++] = valueOf(value);
        }
        return statuses;
    }
}

