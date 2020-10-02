package com.payten.sdk.msu.response.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.payten.sdk.msu.request.enumerated.Currency;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class Invoice {
	private String invoiceId;
	private String name;
	private String createdDate;
	private String issueDate;
	private String dueDate;
	private BigDecimal originalAmount;
	private BigDecimal amount;
	private Currency currency;
	private String status;
	private String merchantPaymentId;
	private Dealer dealer;
	private Merchant merchant;

	public String getInvoiceId() {
		return invoiceId;
	}

	public String getName() {
		return name;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public String getDueDate() {
		return dueDate;
	}

	public BigDecimal getOriginalAmount() {
		return originalAmount;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public Currency getCurrency() {
		return currency;
	}

	public String getStatus() {
		return status;
	}

	public String getMerchantPaymentId() {
		return merchantPaymentId;
	}

	public Dealer getDealer() {
		return dealer;
	}

	public Merchant getMerchant() {
		return merchant;
	}

}
