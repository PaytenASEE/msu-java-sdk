package com.merchantsafeunipay.sdk.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Currency;
import com.merchantsafeunipay.sdk.request.enumerated.PaymentSystemRuleType;
import com.merchantsafeunipay.sdk.response.model.CampaignCode;
import com.merchantsafeunipay.sdk.response.model.CampaignOnline;
import com.merchantsafeunipay.sdk.response.model.Point;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({"action", "responseCode", "merchant", "amount", "installment", "currency"})
@XmlType(propOrder = {"action", "responseCode", "merchant", "amount", "installment", "currency"})
public class FinancialResponse extends ApiResponse {
    private ApiAction action;
    private String merchant;
    private BigDecimal amount;
    private String installment;
    private Currency currency;
    @JsonProperty(value = "points")
    private List<Point> points;
    @JsonProperty(value = "campaigns")
    private List<CampaignOnline> campaigns;
    private BigDecimal finalAmount;
    private BigDecimal commissionRate;
    private BigDecimal commissionAppliedAmount;
    private String fallbackFromPaymentSystem;
    private PaymentSystemRuleType activatedFallbackRule;
    @JsonProperty(value = "campaign")
    @XmlElementWrapper(name = "campaign")
    @XmlElement(name = "campaign")
    private CampaignCode campaignCodeVO;
    private Map<String, String> bankResponseExtras;

    @Override
    public ApiAction getAction() {
        return action;
    }

    @Override
    public void setAction(ApiAction action) {
        this.action = action;
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getInstallment() {
        return installment;
    }

    public void setInstallment(String installment) {
        this.installment = installment;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public List<CampaignOnline> getCampaigns() {
        return campaigns;
    }

    public void setCampaigns(List<CampaignOnline> campaigns) {
        this.campaigns = campaigns;
    }

    public BigDecimal getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(BigDecimal finalAmount) {
        this.finalAmount = finalAmount;
    }

    public BigDecimal getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(BigDecimal commissionRate) {
        this.commissionRate = commissionRate;
    }

    public BigDecimal getCommissionAppliedAmount() {
        return commissionAppliedAmount;
    }

    public void setCommissionAppliedAmount(BigDecimal commissionAppliedAmount) {
        this.commissionAppliedAmount = commissionAppliedAmount;
    }

    public String getFallbackFromPaymentSystem() {
        return fallbackFromPaymentSystem;
    }

    public void setFallbackFromPaymentSystem(String fallbackFromPaymentSystem) {
        this.fallbackFromPaymentSystem = fallbackFromPaymentSystem;
    }

    public PaymentSystemRuleType getActivatedFallbackRule() {
        return activatedFallbackRule;
    }

    public void setActivatedFallbackRule(PaymentSystemRuleType activatedFallbackRule) {
        this.activatedFallbackRule = activatedFallbackRule;
    }

    public CampaignCode getCampaignCodeVO() {
        return campaignCodeVO;
    }

    public void setCampaignCodeVO(CampaignCode campaignCodeVO) {
        this.campaignCodeVO = campaignCodeVO;
    }

    @Override
    public Map<String, String> getBankResponseExtras() {
        return bankResponseExtras;
    }

    @Override
    public void setBankResponseExtras(Map<String, String> bankResponseExtras) {
        this.bankResponseExtras = bankResponseExtras;
    }
}
