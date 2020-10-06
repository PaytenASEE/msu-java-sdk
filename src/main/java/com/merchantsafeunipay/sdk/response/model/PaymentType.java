package com.merchantsafeunipay.sdk.response.model;

import java.math.BigDecimal;

public class PaymentType {
	private String installment;
	private String name;
	private String status;
	private BigDecimal interestRate;
	private BigDecimal discountRate;
	private BigDecimal commissionRate;
	private String startDate;
	private String endDate;

	public String getInstallment() {
		return installment;
	}

	public String getName() {
		return name;
	}

	public String getStatus() {
		return status;
	}

	public BigDecimal getInterestRate() {
		return interestRate;
	}

	public BigDecimal getDiscountRate() {
		return discountRate;
	}

	public BigDecimal getCommissionRate() {
		return commissionRate;
	}

	public String getStartDate() {
		return startDate;
	}

	public String getEndDate() {
		return endDate;
	}
}
