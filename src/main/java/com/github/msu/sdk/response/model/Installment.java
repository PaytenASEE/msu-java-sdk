package com.github.msu.sdk.response.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@XmlAccessorType(XmlAccessType.FIELD)
public class Installment {
	private String count;
	private String status;
	private BigDecimal interestRate;
	private BigDecimal discountRate;
	private BigDecimal commissionRate;
	private String startDate;
	private String endDate;
	private String startDateISO;
	private String endDateISO;
	private String name;

	public Installment() {
	}

	public static class Builder {
		private String count;
		private String status;
		private BigDecimal interestRate;
		private BigDecimal discountRate;
		private BigDecimal commissionRate;
		private String startDate;
		private String endDate;
		private String startDateISO;
		private String endDateISO;
		private String name;

		public Builder count(String count) {
			this.count = count;
			return this;
		}

		public Builder status(String status) {
			this.status = status;
			return this;
		}

		public Builder interestRate(BigDecimal interestRate) {
			this.interestRate = interestRate;
			return this;
		}

		public Builder discountRate(BigDecimal discountRate) {
			this.discountRate = discountRate;
			return this;
		}

		public Builder commissionRate(BigDecimal commissionRate) {
			this.commissionRate = commissionRate;
			return this;
		}

		public Builder startDate(String startDate) {
			this.startDate = startDate;
			return this;
		}

		public Builder endDate(String endDate) {
			this.endDate = endDate;
			return this;
		}

		public Builder startDateISO(String startDateISO) {
			this.startDateISO = startDateISO;
			return this;
		}

		public Builder endDateISO(String endDateISO) {
			this.endDateISO = endDateISO;
			return this;
		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Installment build() {
			return new Installment(this);
		}
	}

	private Installment(Builder builder) {
		this.count = builder.count;
		this.status = builder.status;
		this.interestRate = builder.interestRate;
		this.discountRate = builder.discountRate;
		this.commissionRate = builder.commissionRate;
		this.startDate = builder.startDate;
		this.endDate = builder.endDate;
		this.startDateISO = builder.startDateISO;
		this.endDateISO = builder.endDateISO;
		this.name = builder.name;
	}

	public String getCount() {
		return count;
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

	public String getStartDateISO() {
		return startDateISO;
	}

	public String getEndDateISO() {
		return endDateISO;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
