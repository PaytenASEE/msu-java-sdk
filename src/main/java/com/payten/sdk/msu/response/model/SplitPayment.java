package com.payten.sdk.msu.response.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.payten.sdk.msu.request.enumerated.Currency;
import com.payten.sdk.msu.response.misc.MoneySerializer;

@JsonInclude(Include.NON_NULL)
@XmlAccessorType(XmlAccessType.FIELD)
public class SplitPayment {
	@JsonProperty(value = "code")
	private String code;
	@JsonProperty(value = "maxSplitCount")
	private Integer maxSplitCount;
	@JsonProperty(value = "maxInstallmentCount")
	private Integer maxInstallmentCount;
	@JsonSerialize(using = MoneySerializer.class)
	private BigDecimal totalAmount = BigDecimal.ZERO;
	@JsonProperty(value = "paidAmount")
	@JsonSerialize(using = MoneySerializer.class)
	private BigDecimal paidAmount = BigDecimal.ZERO;
	@JsonProperty(value = "calculatedpaidAmount")
	@JsonSerialize(using = MoneySerializer.class)
	private BigDecimal calculatedpaidAmount = BigDecimal.ZERO;
	@JsonProperty(value = "currency")
	private Currency currency;
	@JsonProperty(value = "createdTime")
	private String createdTime;
	@JsonProperty(value = "status")
	private String status;
	@JsonProperty(value = "merchant")
	@XmlElementWrapper(name = "merchant")
	@XmlElement(name = "merchant")
	private Merchant merchantVO;
	@JsonProperty(value = "customer")
	@XmlElementWrapper(name = "customer")
	@XmlElement(name = "customer")
	private Customer customerVO;
	@JsonProperty(value = "dealerCode")
	private String dealerCode;
	@JsonProperty(value = "dealerContact")
	@XmlElementWrapper(name = "dealerContact")
	@XmlElement(name = "dealerContact")
	private DealerContact dealerContact;
	@JsonProperty(value = "splitPaymentTransactionList")
	@XmlElementWrapper(name = "splitPaymentTransactionList")
	@XmlElement(name = "splitPaymentTransactionList")
	private List<SplitPaymentTransaction> splitPaymentTransactionList = new ArrayList<>();

	public String getCode() {
		return code;
	}

	public Integer getMaxSplitCount() {
		return maxSplitCount;
	}

	public Integer getMaxInstallmentCount() {
		return maxInstallmentCount;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public BigDecimal getPaidAmount() {
		return paidAmount;
	}

	public BigDecimal getCalculatedpaidAmount() {
		return calculatedpaidAmount;
	}

	public Currency getCurrency() {
		return currency;
	}

	public String getCreatedTime() {
		return createdTime;
	}

	public String getStatus() {
		return status;
	}

	public Merchant getMerchantVO() {
		return merchantVO;
	}

	public Customer getCustomerVO() {
		return customerVO;
	}

	public String getDealerCode() {
		return dealerCode;
	}

	public DealerContact getDealerContact() {
		return dealerContact;
	}

	public List<SplitPaymentTransaction> getSplitPaymentTransactionList() {
		return splitPaymentTransactionList;
	}
}
