package com.merchantsafeunipay.sdk.response;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.merchantsafeunipay.sdk.response.model.PaymentSystemForMerchant;

public class ListPaymentSystemsResponse extends ApiResponse {
	@JsonProperty(value = "paymentSystems")
	@XmlElement(name = "paymentSystems")
	private List<PaymentSystemForMerchant> paymentSystems;

	@JsonProperty(value = "defaultPaymentSystemWithInstallments")
	@XmlElement(name = "defaultPaymentSystemWithInstallments")
	private PaymentSystemForMerchant defaultPaymentSystemWithInstallments;

}
