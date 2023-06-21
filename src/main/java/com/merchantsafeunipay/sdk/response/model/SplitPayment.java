package com.merchantsafeunipay.sdk.response.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.merchantsafeunipay.sdk.request.enumerated.Currency;
import com.merchantsafeunipay.sdk.response.SplitPaymentInvoices;
import com.merchantsafeunipay.sdk.response.misc.MoneySerializer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

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
    @JsonProperty(value = "splitPaymentInvoices")
    @XmlElementWrapper(name = "splitPaymentInvoices")
    @XmlElement(name = "splitPaymentInvoices")
    private List<SplitPaymentInvoices> splitPaymentInvoices = new ArrayList<>();
    private String groupNumber;
    @JsonProperty(value = "groupNumber")
    @XmlElementWrapper(name = "groupNumber")
    @XmlElement(name = "groupNumber")
    private BigDecimal refundedAmount;
    @JsonProperty(value = "refundedAmount")
    @XmlElementWrapper(name = "refundedAmount")
    @XmlElement(name = "refundedAmount")
    private String expirationTime;
    @JsonProperty(value = "expirationTime")
    @XmlElementWrapper(name = "expirationTime")
    @XmlElement(name = "expirationTime")
    private String spExpirationTimeUTC;
    @JsonProperty(value = "spExpirationTimeUTC")
    @XmlElementWrapper(name = "spExpirationTimeUTC")
    @XmlElement(name = "spExpirationTimeUTC")



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

    public List<SplitPaymentInvoices> getSplitPaymentInvoices() {return splitPaymentInvoices;}

    public void setSplitPaymentInvoices(List<SplitPaymentInvoices> splitPaymentInvoices) {this.splitPaymentInvoices = splitPaymentInvoices;}

    public String getGroupNumber() {return groupNumber;}

    public void setGroupNumber(String groupNumber) {this.groupNumber = groupNumber;}

    public BigDecimal getRefundedAmount() {return refundedAmount;}

    public void setRefundedAmount(BigDecimal refundedAmount) {this.refundedAmount = refundedAmount;}

    public String getExpirationTime() {return expirationTime;}

    public void setExpirationTime(String expirationTime) {this.expirationTime = expirationTime;}

    public String getSpExpirationTimeUTC() {return spExpirationTimeUTC;}

    public void setSpExpirationTimeUTC(String spExpirationTimeUTC) {this.spExpirationTimeUTC = spExpirationTimeUTC;}

}
