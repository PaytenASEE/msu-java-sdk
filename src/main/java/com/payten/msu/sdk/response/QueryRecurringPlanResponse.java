package com.payten.msu.sdk.response;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.payten.msu.sdk.response.model.RecurringPayment;
import com.payten.msu.sdk.response.model.RecurringPlan;

public class QueryRecurringPlanResponse extends ApiResponse {
	@JsonProperty(value = "recurringPlanList")
	@XmlElementWrapper(name = "recurringPlanList")
	@XmlElement(name = "recurringPlanList")
	private List<RecurringPlan> recurringPlanVOList;
	@JsonProperty(value = "recurringPlan")
	private RecurringPlan recurringPlanVO;
	@JsonProperty(value = "recurringPaymentList")
	@XmlElementWrapper(name = "recurringPaymentList")
	@XmlElement(name = "recurringPayments")
	private List<RecurringPayment> recurringPayments;

	public List<RecurringPlan> getRecurringPlanVOList() {
		return recurringPlanVOList;
	}

	public RecurringPlan getRecurringPlanVO() {
		return recurringPlanVO;
	}

	public List<RecurringPayment> getRecurringPayments() {
		return recurringPayments;
	}

}
