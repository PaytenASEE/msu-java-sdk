package com.merchantsafeunipay.sdk.response.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.merchantsafeunipay.sdk.response.misc.MoneySerializer;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class RecurringPaymentTransaction {
	@JsonProperty(value = "merchantPaymentId")
	private String merchantPaymentId;
	@JsonProperty(value = "installmentCount")
	private Integer installmentCount;
	@JsonProperty(value = "cardNumber")
	private String cardNumber;
	@JsonSerialize(using = MoneySerializer.class)
	private BigDecimal amount = BigDecimal.ZERO;

	public String getMerchantPaymentId() {
		return merchantPaymentId;
	}

	public Integer getInstallmentCount() {
		return installmentCount;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public BigDecimal getAmount() {
		return amount;
	}

}
