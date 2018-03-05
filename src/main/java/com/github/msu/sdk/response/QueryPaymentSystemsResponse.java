package com.github.msu.sdk.response;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.msu.sdk.response.model.PaymentSystemForBin;

public class QueryPaymentSystemsResponse extends ApiResponse {
	@JsonProperty(value = "installmentPaymentSystem")
	@XmlElement(name = "installmentPaymentSystem")
	private PaymentSystemForBin installmentPaymentSystem;
	@JsonProperty(value = "oneShotPaymentSystem")
	@XmlElement(name = "oneShotPaymentSystem")
	private PaymentSystemForBin oneShotPaymentSystem;

	public PaymentSystemForBin getInstallmentPaymentSystem() {
		return installmentPaymentSystem;
	}

	public PaymentSystemForBin getOneShotPaymentSystem() {
		return oneShotPaymentSystem;
	}

}
