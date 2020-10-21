package com.merchantsafeunipay.sdk.response.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.merchantsafeunipay.sdk.response.misc.MoneySerializer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class RecurringPayment {
    private String startDate;
    private String status;
    private String executionDate;
    private Integer recurrence;
    @JsonSerialize(using = MoneySerializer.class)
    private BigDecimal amount;
    private Integer tryCount;
    @JsonProperty(value = "recPaymentTransactionList")
    @XmlElementWrapper(name = "recPaymentTransactionList")
    @XmlElement(name = "recPaymentTransactionList")
    private List<RecurringPaymentTransaction> recPaymentTransactionList = new ArrayList<>();

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getExecutionDate() {
        return executionDate;
    }

    public void setExecutionDate(String executionDate) {
        this.executionDate = executionDate;
    }

    public Integer getRecurrence() {
        return recurrence;
    }

    public void setRecurrence(Integer recurrence) {
        this.recurrence = recurrence;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getTryCount() {
        return tryCount;
    }

    public void setTryCount(Integer tryCount) {
        this.tryCount = tryCount;
    }

    public List<RecurringPaymentTransaction> getRecPaymentTransactionList() {
        return recPaymentTransactionList;
    }

    public void setRecPaymentTransactionList(List<RecurringPaymentTransaction> recPaymentTransactionList) {
        this.recPaymentTransactionList = recPaymentTransactionList;
    }
}