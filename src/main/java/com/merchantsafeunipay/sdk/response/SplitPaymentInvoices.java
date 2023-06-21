package com.merchantsafeunipay.sdk.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.merchantsafeunipay.sdk.response.model.Dealer;
import com.merchantsafeunipay.sdk.response.model.Merchant;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SplitPaymentInvoices {

    @JsonProperty(value = "invoiceId")
    private String invoiceId;
    @JsonProperty(value = "name")
    private String name;
    @JsonProperty(value = "originalAmount")
    private BigDecimal originalAmount;
    @JsonProperty(value = "amount")
    private BigDecimal amount;
    @JsonProperty(value = "currency")
    private String currency;
    @JsonProperty(value = "status")
    private String status;
    @JsonProperty(value = "dealer")
    private Dealer dealerVO;
    @JsonProperty(value = "merchant")
    private Merchant merchantVO;
    @JsonProperty(value = "dealerTypeName")
    private String dealerTypeName;
    private Boolean isPreauth;
    private String extra;
    private String type;
    private Boolean isSplitPayment;
    private Boolean hasActiveSplitPayment;

    public Dealer getDealerVO() {return dealerVO;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public void setDealerVO(Dealer dealerVO) {this.dealerVO = dealerVO;}

    public Merchant getMerchantVO() {return merchantVO;}

    public void setMerchantVO(Merchant merchantVO) {this.merchantVO = merchantVO;}

    public String getInvoiceId() {return invoiceId;}

    public void setInvoiceId(String invoiceId) {this.invoiceId = invoiceId;}

    public BigDecimal getOriginalAmount() {return originalAmount;}

    public void setOriginalAmount(BigDecimal originalAmount) {this.originalAmount = originalAmount;}

    public BigDecimal getAmount() {return amount;}

    public void setAmount(BigDecimal amount) {this.amount = amount;}

    public String getCurrency() {return currency;}

    public void setCurrency(String currency) {this.currency = currency;}

    public String getStatus() {return status;}

    public void setStatus(String status) {this.status = status;}

    public String getDealerTypeName() {return dealerTypeName;}

    public void setDealerTypeName(String dealerTypeName) {this.dealerTypeName = dealerTypeName;}

    public Boolean getPreauth() {return isPreauth;}

    public void setPreauth(Boolean preauth) {isPreauth = preauth;}

    public String getExtra() {return extra;}

    public void setExtra(String extra) {this.extra = extra;}

    public String getType() {return type;}

    public void setType(String type) {this.type = type;}

    public Boolean getSplitPayment() {return isSplitPayment;}

    public void setSplitPayment(Boolean splitPayment) {isSplitPayment = splitPayment;}

    public Boolean getHasActiveSplitPayment() {return hasActiveSplitPayment;}

    public void setHasActiveSplitPayment(Boolean hasActiveSplitPayment) {this.hasActiveSplitPayment = hasActiveSplitPayment;}

}
