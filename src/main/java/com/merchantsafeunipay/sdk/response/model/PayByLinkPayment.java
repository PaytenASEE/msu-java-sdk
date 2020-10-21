package com.merchantsafeunipay.sdk.response.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.merchantsafeunipay.sdk.request.enumerated.Currency;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class PayByLinkPayment {
    private String token;
    private BigDecimal amount;
    private Currency currency;
    private String cardHolderEmail;
    private String dueDate;
    private String createdTs;
    private String status;

    public PayByLinkPayment() {
    }

    private PayByLinkPayment(Builder builder) {
        this.token = builder.token;
        this.amount = builder.amount;
        this.currency = builder.currency;
        this.cardHolderEmail = builder.cardHolderEmail;
        this.dueDate = builder.dueDate;
        this.createdTs = builder.createdTs;
        this.status = builder.status;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getCardHolderEmail() {
        return cardHolderEmail;
    }

    public void setCardHolderEmail(String cardHolderEmail) {
        this.cardHolderEmail = cardHolderEmail;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getCreatedTs() {
        return createdTs;
    }

    public void setCreatedTs(String createdTs) {
        this.createdTs = createdTs;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static class Builder {
        private String token;
        private BigDecimal amount;
        private Currency currency;
        private String cardHolderEmail;
        private String dueDate;
        private String createdTs;
        private String status;

        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public Builder amount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public Builder currency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public Builder cardHolderEmail(String cardHolderEmail) {
            this.cardHolderEmail = cardHolderEmail;
            return this;
        }

        public Builder dueDate(String dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        public Builder createdTs(String createdTs) {
            this.createdTs = createdTs;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public PayByLinkPayment build() {
            return new PayByLinkPayment(this);
        }
    }
}
