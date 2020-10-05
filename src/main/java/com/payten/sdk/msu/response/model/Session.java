package com.payten.sdk.msu.response.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.payten.sdk.msu.request.enumerated.CardPanType;

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
	private String paymentSystemName;
	private String dealerTypeName;
	private Integer businessMaxInstallmentCount;
	private CardPanType cardPanType;

	public Session() {
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getApiAction() {
		return apiAction;
	}

	public void setApiAction(String apiAction) {
		this.apiAction = apiAction;
	}

	public String getMerchantPaymentId() {
		return merchantPaymentId;
	}

	public void setMerchantPaymentId(String merchantPaymentId) {
		this.merchantPaymentId = merchantPaymentId;
	}

	public BigDecimal getFirstAmount() {
		return firstAmount;
	}

	public void setFirstAmount(BigDecimal firstAmount) {
		this.firstAmount = firstAmount;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getReturnUrl() {
		return returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getInterimPageUrl() {
		return interimPageUrl;
	}

	public void setInterimPageUrl(String interimPageUrl) {
		this.interimPageUrl = interimPageUrl;
	}

	public String getCancelUrl() {
		return cancelUrl;
	}

	public void setCancelUrl(String cancelUrl) {
		this.cancelUrl = cancelUrl;
	}

	public String getMerchantImg() {
		return merchantImg;
	}

	public void setMerchantImg(String merchantImg) {
		this.merchantImg = merchantImg;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public Boolean getCanSaveCard() {
		return canSaveCard;
	}

	public void setCanSaveCard(Boolean canSaveCard) {
		this.canSaveCard = canSaveCard;
	}

	public int getRedirectWaitingTime() {
		return redirectWaitingTime;
	}

	public void setRedirectWaitingTime(int redirectWaitingTime) {
		this.redirectWaitingTime = redirectWaitingTime;
	}

	public String getThreatMetrixSessionId() {
		return threatMetrixSessionId;
	}

	public void setThreatMetrixSessionId(String threatMetrixSessionId) {
		this.threatMetrixSessionId = threatMetrixSessionId;
	}

	public String getExtra() {
		return extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getMaxInstallmentCount() {
		return maxInstallmentCount;
	}

	public void setMaxInstallmentCount(Integer maxInstallmentCount) {
		this.maxInstallmentCount = maxInstallmentCount;
	}

	public String getSessionCreateTimestamp() {
		return sessionCreateTimestamp;
	}

	public void setSessionCreateTimestamp(String sessionCreateTimestamp) {
		this.sessionCreateTimestamp = sessionCreateTimestamp;
	}

	public String getPaymentSystemName() {
		return paymentSystemName;
	}

	public void setPaymentSystemName(String paymentSystemName) {
		this.paymentSystemName = paymentSystemName;
	}

	public String getDealerTypeName() {
		return dealerTypeName;
	}

	public void setDealerTypeName(String dealerTypeName) {
		this.dealerTypeName = dealerTypeName;
	}

	public Integer getBusinessMaxInstallmentCount() {
		return businessMaxInstallmentCount;
	}

	public void setBusinessMaxInstallmentCount(Integer businessMaxInstallmentCount) {
		this.businessMaxInstallmentCount = businessMaxInstallmentCount;
	}

	public CardPanType getCardPanType() {
		return cardPanType;
	}

	public void setCardPanType(CardPanType cardPanType) {
		this.cardPanType = cardPanType;
	}
}
