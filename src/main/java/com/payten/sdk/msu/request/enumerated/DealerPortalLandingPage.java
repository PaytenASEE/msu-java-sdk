package com.payten.sdk.msu.request.enumerated;

public enum DealerPortalLandingPage {

    DASHBOARD,

    BASIC_PAYMENT,

    TRANSACTION_REPORT;

    public static DealerPortalLandingPage fromString(String input) {
        for (DealerPortalLandingPage landingPage : values()) {
            if (landingPage.name().equals(input))
                return landingPage;
        }
        return null;
    }
}
