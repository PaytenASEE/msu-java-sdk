package com.github.msu.sdk.response.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class Session {
	private String token;
	private String apiAction;
	private String merchantPaymentId;
	private BigDecimal firstAmount;
	private BigDecimal amount;
	private String currency;
	private String returnUrl;
	private String interimPageUrl;
	private String cancelUrl;
	private String merchantImg;
	private String language;
	private String timeZone;
	private Boolean canSaveCard;
	private int redirectWaitingTime;
	private String threatMetrixSessionId;
	private String extra;
	private String status;
	private Integer maxInstallmentCount;
	private String sessionCreateTimestamp;

	public Session() {
	}

	public String getToken() {
		return token;
	}

	public String getApiAction() {
		return apiAction;
	}

	public String getMerchantPaymentId() {
		return merchantPaymentId;
	}

	public BigDecimal getFirstAmount() {
		return firstAmount;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public String getCurrency() {
		return currency;
	}

	public String getReturnUrl() {
		return returnUrl;
	}

	public String getInterimPageUrl() {
		return interimPageUrl;
	}

	public String getCancelUrl() {
		return cancelUrl;
	}

	public String getMerchantImg() {
		return merchantImg;
	}

	public String getLanguage() {
		return language;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public Boolean getCanSaveCard() {
		return canSaveCard;
	}

	public int getRedirectWaitingTime() {
		return redirectWaitingTime;
	}

	public String getThreatMetrixSessionId() {
		return threatMetrixSessionId;
	}

	public String getExtra() {
		return extra;
	}

	public String getStatus() {
		return status;
	}

	public Integer getMaxInstallmentCount() {
		return maxInstallmentCount;
	}

	public String getSessionCreateTimestamp() {
		return sessionCreateTimestamp;
	}
}
