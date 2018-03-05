package com.github.msu.sdk.response.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.github.msu.sdk.response.ApiResponse;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class MerchantProfile extends ApiResponse {
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
	private String dealerPortalLandingPage;

	public String getMerchantBussinesId() {
		return merchantBussinesId;
	}

	public String getSmtpEmail() {
		return smtpEmail;
	}

	public String getSmtpPass() {
		return smtpPass;
	}

	public String getSmtpHost() {
		return smtpHost;
	}

	public Integer getSmtpPort() {
		return smtpPort;
	}

	public Boolean getSmtpEnableTls() {
		return smtpEnableTls;
	}

	public String getPaymentPageUrl() {
		return paymentPageUrl;
	}

	public String getRecurringPaymentPageUrl() {
		return recurringPaymentPageUrl;
	}

	public BigDecimal getMinAmountInstallment() {
		return minAmountInstallment;
	}

	public String getReturnUrl() {
		return returnUrl;
	}

	public String getDealerPortalLandingPage() {
		return dealerPortalLandingPage;
	}

}
