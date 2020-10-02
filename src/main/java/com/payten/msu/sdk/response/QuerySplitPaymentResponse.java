package com.payten.msu.sdk.response;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.payten.msu.sdk.response.model.SplitPayment;

public class QuerySplitPaymentResponse extends ApiResponse {
	@JsonProperty(value = "splitPaymentList")
	@XmlElementWrapper(name = "splitPaymentList")
	@XmlElement(name = "splitPaymentList")
	private List<SplitPayment> splitPaymentList = new ArrayList<>();

	public List<SplitPayment> getSplitPaymentList() {
		return splitPaymentList;
	}
}
