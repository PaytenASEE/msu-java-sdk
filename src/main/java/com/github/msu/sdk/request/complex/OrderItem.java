package com.github.msu.sdk.request.complex;

import java.math.BigDecimal;

public class OrderItem {
	private String code;
	private String name;
	private String description;
	private BigDecimal amount;
	private Integer quantity;

	public OrderItem() {
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal price) {
		this.amount = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public static class Builder {
		private String code;
		private String name;
		private String description;
		private BigDecimal amount;
		private Integer quantity;

		public Builder code(String code) {
			this.code = code;
			return this;
		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder description(String description) {
			this.description = description;
			return this;
		}

		public Builder amount(BigDecimal amount) {
			this.amount = amount;
			return this;
		}

		public Builder quantity(Integer quantity) {
			this.quantity = quantity;
			return this;
		}

		public OrderItem build() {
			return new OrderItem(this);
		}
	}

	private OrderItem(Builder builder) {
		this.code = builder.code;
		this.name = builder.name;
		this.description = builder.description;
		this.amount = builder.amount;
		this.quantity = builder.quantity;
	}
}
