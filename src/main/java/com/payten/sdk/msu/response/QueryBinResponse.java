package com.payten.sdk.msu.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.payten.sdk.msu.response.model.Bin;
import com.payten.sdk.msu.response.model.PaymentSystemForBin;

public class QueryBinResponse extends ApiResponse {
	@JsonProperty(value = "bin")
	@XmlElement(name = "bin")
	private Bin binVO;
	@JsonProperty(value = "installmentPaymentSystem")
	@XmlElement(name = "installmentPaymentSystem")
	private PaymentSystemForBin installmentPaymentSystem;
	@JsonProperty(value = "oneShotPaymentSystem")
	@XmlElement(name = "oneShotPaymentSystem")
	private PaymentSystemForBin oneShotPaymentSystem;
	@JsonProperty(value = "paymentSystem")
	@XmlElementWrapper(name = "paymentSystem")
	@XmlElement(name = "paymentSystem")
	private PaymentSystemForBin paymentSystemVO;

	public PaymentSystemForBin getPaymentSystemVO() {
		return paymentSystemVO;
	}

	public Bin getBinVO() {
		return binVO;
	}

	public PaymentSystemForBin getInstallmentPaymentSystem() {
		return installmentPaymentSystem;
	}

	public PaymentSystemForBin getOneShotPaymentSystem() {
		return oneShotPaymentSystem;
	}
}
