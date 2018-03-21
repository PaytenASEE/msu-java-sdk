package com.github.msu.sdk.request.enumerated;

public enum DealerPortalLandingPage {
    /**
     * Dealer Portal Dashboard
     */
    DASHBOARD,
    /**
     * Payment on Dealer Portal
     */
    BASIC_PAYMENT,
    /**
     * Dealer Transaction Report
     */
    TRANSACTION_REPORT;

    public static DealerPortalLandingPage fromString(String input) {
        for (DealerPortalLandingPage landingPage : values()) {
            if (landingPage.name().equals(input))
                return landingPage;
        }
        return null;
    }
}
