package com.github.msu.sdk.response;

import java.util.Set;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.msu.sdk.response.model.PaymentSystemForInstallment;

public class QueryInstallmentResponse extends ApiResponse {
	@JsonProperty(value = "paymentSystemList")
	@XmlElementWrapper(name = "paymentSystemList")
	@XmlElement(name = "paymentSystem")
	private Set<PaymentSystemForInstallment> paymentSystems;

	public Set<PaymentSystemForInstallment> getPaymentSystems() {
		return paymentSystems;
	}
}
