package com.merchantsafeunipay.sdk.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.merchantsafeunipay.sdk.response.model.Bin;
import com.merchantsafeunipay.sdk.response.model.PaymentSystemForBin;

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

	public Bin getBinVO() {
		return binVO;
	}

	public void setBinVO(Bin binVO) {
		this.binVO = binVO;
	}

	public PaymentSystemForBin getInstallmentPaymentSystem() {
		return installmentPaymentSystem;
	}

	public void setInstallmentPaymentSystem(PaymentSystemForBin installmentPaymentSystem) {
		this.installmentPaymentSystem = installmentPaymentSystem;
	}

	public PaymentSystemForBin getOneShotPaymentSystem() {
		return oneShotPaymentSystem;
	}

	public void setOneShotPaymentSystem(PaymentSystemForBin oneShotPaymentSystem) {
		this.oneShotPaymentSystem = oneShotPaymentSystem;
	}

	public PaymentSystemForBin getPaymentSystemVO() {
		return paymentSystemVO;
	}

	public void setPaymentSystemVO(PaymentSystemForBin paymentSystemVO) {
		this.paymentSystemVO = paymentSystemVO;
	}
}
