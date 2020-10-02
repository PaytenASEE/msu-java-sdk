package com.payten.msu.sdk.response;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.payten.msu.sdk.response.model.RecurringPayment;

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
