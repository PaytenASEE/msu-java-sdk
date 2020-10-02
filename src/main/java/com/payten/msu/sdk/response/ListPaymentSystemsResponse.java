package com.payten.msu.sdk.response;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.payten.msu.sdk.response.model.PaymentSystemForMerchant;

public class ListPaymentSystemsResponse extends ApiResponse {
	@JsonProperty(value = "paymentSystems")
	@XmlElement(name = "paymentSystems")
	private List<PaymentSystemForMerchant> paymentSystems;

}
