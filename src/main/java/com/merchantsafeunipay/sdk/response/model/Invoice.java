package com.merchantsafeunipay.sdk.response.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.JsonNode;
import com.merchantsafeunipay.sdk.request.enumerated.Currency;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.math.BigDecimal;

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
    private String merchantOrderId;
    private boolean isPreauth;
    private BigDecimal discountAmount;
    private BigDecimal paidAmount;
    private BigDecimal postAuthAmount;
    private String dealerTypeName;
    private String extra;
    private String type;
    private JsonNode isSplitPayment;
    private Boolean hasActiveSplitPayment;
    private String sessionToken;

    public String getSessionToken() {return sessionToken;}

    public BigDecimal getPostAuthAmount() {return postAuthAmount;}

    public BigDecimal getPaidAmount() {return paidAmount;}

    public BigDecimal getDiscountAmount() {return discountAmount;}

    public void setDiscountAmount(BigDecimal discountAmount) {this.discountAmount = discountAmount;}

    public String getExtra() {return extra;}

    public void setExtra(String extra) {this.extra = extra;}

    public String getType() {return type;}

    public void setType(String type) {this.type = type;}

    public Object getSplitPayment() {return isSplitPayment;}

    public void setSplitPayment(JsonNode splitPayment) {isSplitPayment = splitPayment;}

    public Boolean getHasActiveSplitPayment() {return hasActiveSplitPayment;}

    public void setHasActiveSplitPayment(Boolean hasActiveSplitPayment) {this.hasActiveSplitPayment = hasActiveSplitPayment;}

    public void setDealerTypeName(String dealerTypeName) {this.dealerTypeName = dealerTypeName;}

    public String getDealerTypeName() {return dealerTypeName;}

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

    public String getMerchantOrderId() {
        return merchantOrderId;
    }

    public boolean isPreauth() {
        return isPreauth;
    }
}
