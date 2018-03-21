package com.github.msu.sdk.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.github.msu.sdk.request.enumerated.DealerPortalLandingPage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryMerchantProfileResponse extends ApiResponse {
    private String merchantBussinesId;
    private String smtpEmail;
    private String smtpPass;
    private String smtpHost;
    private Integer smtpPort;
    private Boolean smtpEnableTls;
    private String paymentPageUrl;
    private String recurringPaymentPageUrl;
    private BigDecimal minAmountInstallment;
    private String returnUrl;
    private DealerPortalLandingPage dealerPortalLandingPage;

    public String getMerchantBussinesId() {
        return merchantBussinesId;
    }

    public void setMerchantBussinesId(String merchantBussinesId) {
        this.merchantBussinesId = merchantBussinesId;
    }

    public String getSmtpEmail() {
        return smtpEmail;
    }

    public void setSmtpEmail(String smtpEmail) {
        this.smtpEmail = smtpEmail;
    }

    public String getSmtpPass() {
        return smtpPass;
    }

    public void setSmtpPass(String smtpPass) {
        this.smtpPass = smtpPass;
    }

    public String getSmtpHost() {
        return smtpHost;
    }

    public void setSmtpHost(String smtpHost) {
        this.smtpHost = smtpHost;
    }

    public Integer getSmtpPort() {
        return smtpPort;
    }

    public void setSmtpPort(Integer smtpPort) {
        this.smtpPort = smtpPort;
    }

    public Boolean getSmtpEnableTls() {
        return smtpEnableTls;
    }

    public void setSmtpEnableTls(Boolean smtpEnableTls) {
        this.smtpEnableTls = smtpEnableTls;
    }

    public String getPaymentPageUrl() {
        return paymentPageUrl;
    }

    public void setPaymentPageUrl(String paymentPageUrl) {
        this.paymentPageUrl = paymentPageUrl;
    }

    public String getRecurringPaymentPageUrl() {
        return recurringPaymentPageUrl;
    }

    public void setRecurringPaymentPageUrl(String recurringPaymentPageUrl) {
        this.recurringPaymentPageUrl = recurringPaymentPageUrl;
    }

    public BigDecimal getMinAmountInstallment() {
        return minAmountInstallment;
    }

    public void setMinAmountInstallment(BigDecimal minAmountInstallment) {
        this.minAmountInstallment = minAmountInstallment;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public DealerPortalLandingPage getDealerPortalLandingPage() {
        return dealerPortalLandingPage;
    }

    public void setDealerPortalLandingPage(DealerPortalLandingPage dealerPortalLandingPage) {
        this.dealerPortalLandingPage = dealerPortalLandingPage;
    }
}