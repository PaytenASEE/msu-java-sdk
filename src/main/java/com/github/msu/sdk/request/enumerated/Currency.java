package com.github.msu.sdk.request.enumerated;

import java.util.Locale;


public enum Currency {
    TRY(new String[] { "TL", "TRL" }, "949", 2, "Turkish Lira"), //
    USD(new String[] { "$" }, "840", 2, "United States Dollar"), //
    EUR(new String[] { "€" }, "978", 2, "Euro"), //
    GBP(new String[] { "£" }, "826", 2, "Pound sterling"), //
    CAD(new String[] {}, "124", 2, "Canadian dollar"), //
    DKK(new String[] {}, "208", 2, "Danish krone"), //
    SEK(new String[] {}, "752", 2, "Swedish krona/kronor"), //
    CHF(new String[] {}, "756", 2, "Swiss franc"), //
    NOK(new String[] {}, "578", 2, "Norwegian krone"), //
    JPY(new String[] { "¥" }, "392", 0, "Japanese yen"), //
    AED(new String[] {}, "784", 2, "United Arab Emirates dirham"), //
    AUD(new String[] {}, "036", 2, "Australian dollar"), //
    RUB(new String[] {}, "643", 2, "Russian rouble"), //
    KWD(new String[] {}, "414", 3, "Kuwaiti dinar"), //
    ZAR(new String[] {}, "710", 2, "South African rand"), //
    BHD(new String[] {}, "048", 3, "Bahraini dinar"), //
    SAR(new String[] {}, "682", 2, "Saudi riyal"), //
    ILS(new String[] {}, "376", 2, "Israeli new sheqel"), //
    INR(new String[] {}, "356", 2, "Indian rupee"), //
    MXN(new String[] {}, "484", 2, "Mexican peso"), //
    HUF(new String[] {}, "348", 2, "Hungarian forint"), //
    NZD(new String[] {}, "554", 2, "New Zealand dollar"), //
    BRL(new String[] {}, "986", 2, "Brazilian real"), //
    IDR(new String[] {}, "360", 0, "Indonesian rupiah"), //
    CZK(new String[] {}, "203", 2, "Czech koruna"), //
    PLN(new String[] {}, "985", 2, "Polish zloty"), //
    BGN(new String[] {}, "975", 2, "Bulgarian lev"), //
    RON(new String[] {}, "946", 2, "Romanian new leu"), //
    CNY(new String[] {}, "156", 2, "Chinese yuan"), //
    ARS(new String[] {}, "032", 2, "Argentine peso"), //
    BOB(new String[] {}, "068", 2, "Boliviano"), //
    COP(new String[] {}, "170", 2, "Colombian peso"), //
    RSD(new String[] {}, "941", 2, "Serbian dinar");
    /**
     * Returns currency code The parameter should be defined as in ISO_4217 standards. See
     * http://en.wikipedia.org/wiki/ISO_4217 for details.
     * 
     * @param currencyCode
     * @return
     */
    public static Currency get(String currencyCode) {
        Currency currency = valueOf(currencyCode.toUpperCase(Locale.ENGLISH));
        if (currency != null)
            return currency;
        currencyCode = currencyCode.toUpperCase(Locale.ENGLISH);
        Currency[] currencies = values();
		for (int i = 0; i < currencies.length; i++) {
			for (int j = 0; j < currencies[i].validAbbreviations.length; j++) {
				if (currencyCode.contentEquals(currencies[i].validAbbreviations[j])) {
					return currencies[i];
				}
			}
			if (currencyCode.contentEquals(currencies[i].getNumcode())) {
				return currencies[i];
			}
		}
        return null;
    }

    private String[] validAbbreviations;
    private String numcode;
    private int decimalDigits;
    private String nameEn;

    private Currency(String[] validAbbreviations, String numcode, int decimalDigits, String nameEn) {
        this.validAbbreviations = validAbbreviations;
        this.numcode = numcode;
        this.decimalDigits = decimalDigits;
        this.nameEn = nameEn;
    }

    public int getDecimalDigits() {
        return decimalDigits;
    }

    public String getNameEn() {
        return nameEn;
    }

    public String getNumcode() {
        return numcode;
    }

    public static Currency fromString(String input) {
        for (Currency c : values()) {
            if (c.name().equals(input))
                return c;
        }
        return null;
    }
}
