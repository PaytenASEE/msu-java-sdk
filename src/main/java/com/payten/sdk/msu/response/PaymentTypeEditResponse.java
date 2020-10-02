package com.payten.sdk.msu.response;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.payten.sdk.msu.response.model.PaymentType;

public class PaymentTypeEditResponse extends ApiResponse {
	@JsonProperty(value = "paymentType")
	@XmlElement(name = "paymentType")
	private PaymentType paymentType;

	public PaymentType getPaymentType() {
		return paymentType;
	}
}
