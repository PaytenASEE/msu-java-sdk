package com.merchantsafeunipay.sdk.request.complex;

import java.math.BigDecimal;

public class OrderItem {
    private String code;
    private String name;
    private String description;
    private BigDecimal amount;
    private Integer quantity;
    private Integer sellerId;
    private Integer sellerCommissionAmount;
    private Integer productCategoryCode;

    public OrderItem() {
    }

    private OrderItem(Builder builder) {
        this.code = builder.code;
        this.name = builder.name;
        this.description = builder.description;
        this.amount = builder.amount;
        this.quantity = builder.quantity;
        this.sellerId = builder.sellerId;
        this.sellerCommissionAmount = builder.sellerCommissionAmount;
        this.productCategoryCode = builder.productCategoryCode;

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

    public Integer getSellerCommissionAmount() {
        return sellerCommissionAmount;
    }

    public void setSellerCommissionAmount(Integer sellerCommissionAmount)  {
        this.sellerCommissionAmount = sellerCommissionAmount;
    }

    public Integer getProductCategoryCode() {
        return productCategoryCode;
    }

    public void setProductCategoryCode(Integer productCategoryCode)  {
        this.productCategoryCode = productCategoryCode;
    }

    public Integer getsellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId)  {
        this.productCategoryCode = sellerId;
    }


    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String code;
        private String name;
        private String description;
        private BigDecimal amount;
        private Integer quantity;
        private Integer sellerId;
        private Integer sellerCommissionAmount;
        private Integer productCategoryCode;

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

        public Builder sellerId(Integer sellerId) {
            this.sellerId = sellerId;
            return this;
        }

        public Builder sellerCommissionAmount(Integer sellerCommissionAmount) {
            this.sellerCommissionAmount = sellerCommissionAmount;
            return this;
        }

        public Builder productCategoryCode(Integer productCategoryCode) {
            this.productCategoryCode = productCategoryCode;
            return this;
        }

        public OrderItem build() {
            return new OrderItem(this);
        }
    }
}
