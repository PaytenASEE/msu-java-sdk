package com.github.msu.sdk.request.enumerated;

/**
 * Payment Policy Option
 *
 * @author Isah Bllaca <isah.bllaca@asseco-see.com>
 */
public enum PPolicy {
    /**
     * None - Do not use 3D Secure at all
     */
    NO_THD_ALL,
    /**
     *
     */
    THD_ALL,
    /**
     * 3D Secure is optional(Card Holder decides)
     */
    THD_OPT,
    /**
     * Option: Use 3D Secure for unsaved cards(for e-wallet cards, 3D Secure is
     * optional)
     */
    THD_UNSAVED_CARDS_EW_OPT,

    /**
     * Use 3D Secure for unsaved cards(for e-wallet cards, do not use 3D Secure
     * at all)
     */
    THD_UNSAVED_CARDS_EW_NO,
    /**
     * Use 3D Secure depending on the Transaction Amount
     */
    THD_BASED_ON_LIMIT;

    public static PPolicy fromString(String input){
        for(PPolicy s: values()){
            if(s.name().equals(input))
                return s;
        }
        return null;
    }
}
