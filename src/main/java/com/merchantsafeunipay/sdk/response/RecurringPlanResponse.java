package com.merchantsafeunipay.sdk.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.merchantsafeunipay.sdk.response.model.RecurringPayment;

import javax.xml.bind.annotation.XmlElement;

public class RecurringPlanResponse extends ApiResponse {
    private String recurringPlanCode;
    @JsonProperty(value = "recurringPayment")
    @XmlElement(name = "recurringPayment")
    private RecurringPayment recurringPayment;

    public String getRecurringPlanCode() {
        return recurringPlanCode;
    }

    public RecurringPayment getRecurringPayment() {
        return recurringPayment;
    }
}
