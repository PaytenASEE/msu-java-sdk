package com.payten.sdk.msu.response.model;

import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.payten.sdk.msu.request.enumerated.Currency;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class RecurringPlan {
	private String recurringPlanCode;
	private String merchantName;
	private BigDecimal firstAmount;
	private BigDecimal recurringAmount;
	private BigDecimal totalAmount;
	private String startDate;
	private String scheduledEndDate;
	private int recurrenceCount;
	private int completedRecurrence;
	private int frequency;
	private String occurrence;
	private Currency currency;
	private String paymentSystem;
	private String paymentSystemType;
	private String status;
	private Merchant merchant;
	private Customer customer;
	private List<Card> cards;
	private List<RecurringPayment> recurringPayments;

	public String getRecurringPlanCode() {
		return recurringPlanCode;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public BigDecimal getFirstAmount() {
		return firstAmount;
	}

	public BigDecimal getRecurringAmount() {
		return recurringAmount;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public String getStartDate() {
		return startDate;
	}

	public String getScheduledEndDate() {
		return scheduledEndDate;
	}

	public int getRecurrenceCount() {
		return recurrenceCount;
	}

	public int getCompletedRecurrence() {
		return completedRecurrence;
	}

	public int getFrequency() {
		return frequency;
	}

	public String getOccurrence() {
		return occurrence;
	}

	public Currency getCurrency() {
		return currency;
	}

	public String getPaymentSystem() {
		return paymentSystem;
	}

	public String getPaymentSystemType() {
		return paymentSystemType;
	}

	public String getStatus() {
		return status;
	}

	public Merchant getMerchant() {
		return merchant;
	}

	public Customer getCustomer() {
		return customer;
	}

	public List<Card> getCards() {
		return cards;
	}

	public List<RecurringPayment> getRecurringPayments() {
		return recurringPayments;
	}
}
