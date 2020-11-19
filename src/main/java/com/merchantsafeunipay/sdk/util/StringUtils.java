package com.merchantsafeunipay.sdk.util;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Random;

public class StringUtils {

    private static final String SOURCES =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    /**
     * <p>
     * Checks if a CharSequence is whitespace, empty ("") or null.
     * </p>
     *
     * <pre>
     * StringUtils.isBlank(null)      = true
     * StringUtils.isBlank("")        = true
     * StringUtils.isBlank(" ")       = true
     * StringUtils.isBlank("bob")     = false
     * StringUtils.isBlank("  bob  ") = false
     * </pre>
     *
     * @param cs the CharSequence to check, may be null
     * @return {@code true} if the CharSequence is null, empty or whitespace
     * @since 2.0
     * @since 3.0 Changed signature from isBlank(String) to isBlank(CharSequence)
     */
    public static boolean isBlank(final CharSequence cs) {
        int strLen;
        if (cs == null || (strLen = cs.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if (Character.isWhitespace(cs.charAt(i)) == false) {
                return false;
            }
        }
        return true;
    }

    /**
     * Generates random string based on given length.
     *
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

    /**
     * Returns date as string based on given formatter and days which are going to be added in current date.
     * @param formatter
     * @param days
     * @return
     */
    public static String getDateAfterAddedInDays(DateFormat formatter, int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_WEEK,days);
        return formatter.format(calendar.getTime());
    }
}
