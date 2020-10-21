package com.merchantsafeunipay.sdk.request.enumerated;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


/**
 * RecurringPlanStatus
 *
 * @author Alketa Fazliu <alketa.fazliu@asseco-see.com>
 */
public enum RecurringPlanStatus {
    ACTIVE,
    COMPLETED,
    INACTIVE,
    CARD_REQUIRED;

    public static RecurringPlanStatus fromString(String input) {
        for (RecurringPlanStatus s : values()) {
            if (s.name().equals(input))
                return s;
        }
        return null;
    }

    public static List<RecurringPlanStatus> getSortedRecurringPlanStatuses(RecurringPlanStatus... status) {
        List<RecurringPlanStatus> currencies = Arrays.asList(status);
        currencies.sort(new Comparator<RecurringPlanStatus>() {
            @Override
            public int compare(RecurringPlanStatus o1, RecurringPlanStatus o2) {
                return o1.name().compareTo(o2.name());
            }
        });
        return currencies;
    }
}