package com.github.msu.sdk.response.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class Transaction {
	private String pgTranErrorCode;
	private String pgTranTraceAudit;
	private String pgTranReturnCode;
	private String pgOrderId;
	private String pgTranErrorText;
	private String pgTranApprCode;
	private String pgTranSettleId;
	private String pgTranId;
	private String pgTranRefId;
	private String timePsSent;
	private String timePsReceived;
	private String timeCreated;
	private String timeCreatedISO;
	private BigDecimal amount;
	private BigDecimal firstAmount;
	private BigDecimal discountRate;
	private BigDecimal interestRate;
	private BigDecimal commisionRate;
	private String transactionStatus;
	private String currency;
	private String paymentSystem;
	private String paymentSystemType;
	private String panLast4;
	private String transactionType;
	private Integer installmentCount;
	private String cardOwnerMasked;
	private String customerId;
	private String bin;
	private Dealer dealer;
	private boolean is3D;
	private String threeDStatus;
	private String threeDResult;
	private String errorCode;
	private boolean isRefundable;
	private String transactionId;
	private BigDecimal refundableAmount;

	public Transaction() {
	}

	public String getPgTranErrorCode() {
		return pgTranErrorCode;
	}

	public void setPgTranErrorCode(String pgTranErrorCode) {
		this.pgTranErrorCode = pgTranErrorCode;
	}

	public String getPgTranTraceAudit() {
		return pgTranTraceAudit;
	}

	public void setPgTranTraceAudit(String pgTranTraceAudit) {
		this.pgTranTraceAudit = pgTranTraceAudit;
	}

	public String getPgTranReturnCode() {
		return pgTranReturnCode;
	}

	public void setPgTranReturnCode(String pgTranReturnCode) {
		this.pgTranReturnCode = pgTranReturnCode;
	}

	public String getPgOrderId() {
		return pgOrderId;
	}

	public void setPgOrderId(String pgOrderId) {
		this.pgOrderId = pgOrderId;
	}

	public String getPgTranErrorText() {
		return pgTranErrorText;
	}

	public void setPgTranErrorText(String pgTranErrorText) {
		this.pgTranErrorText = pgTranErrorText;
	}

	public String getPgTranApprCode() {
		return pgTranApprCode;
	}

	public void setPgTranApprCode(String pgTranApprCode) {
		this.pgTranApprCode = pgTranApprCode;
	}

	public String getPgTranSettleId() {
		return pgTranSettleId;
	}

	public void setPgTranSettleId(String pgTranSettleId) {
		this.pgTranSettleId = pgTranSettleId;
	}

	public String getPgTranId() {
		return pgTranId;
	}

	public void setPgTranId(String pgTranId) {
		this.pgTranId = pgTranId;
	}

	public String getPgTranRefId() {
		return pgTranRefId;
	}

	public void setPgTranRefId(String pgTranRefId) {
		this.pgTranRefId = pgTranRefId;
	}

	public String getTimePsSent() {
		return timePsSent;
	}

	public void setTimePsSent(String timePsSent) {
		this.timePsSent = timePsSent;
	}

	public String getTimePsReceived() {
		return timePsReceived;
	}

	public void setTimePsReceived(String timePsReceived) {
		this.timePsReceived = timePsReceived;
	}

	public String getTimeCreated() {
		return timeCreated;
	}

	public void setTimeCreated(String timeCreated) {
		this.timeCreated = timeCreated;
	}

	public String getTimeCreatedISO() {
		return timeCreatedISO;
	}

	public void setTimeCreatedISO(String timeCreatedIso) {
		this.timeCreatedISO = timeCreatedIso;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getFirstAmount() {
		return firstAmount;
	}

	public void setFirstAmount(BigDecimal firstAmount) {
		this.firstAmount = firstAmount;
	}

	public BigDecimal getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(BigDecimal discountRate) {
		this.discountRate = discountRate;
	}

	public BigDecimal getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}

	public BigDecimal getCommisionRate() {
		return commisionRate;
	}

	public void setCommisionRate(BigDecimal commisionRate) {
		this.commisionRate = commisionRate;
	}

	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getPaymentSystem() {
		return paymentSystem;
	}

	public void setPaymentSystem(String paymentSystem) {
		this.paymentSystem = paymentSystem;
	}

	public String getPanLast4() {
		return panLast4;
	}

	public void setPanLast4(String panLast4) {
		this.panLast4 = panLast4;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public Integer getInstallmentCount() {
		return installmentCount;
	}

	public void setInstallmentCount(Integer installmentCount) {
		this.installmentCount = installmentCount;
	}

	public String getCardOwnerMasked() {
		return cardOwnerMasked;
	}

	public void setCardOwnerMasked(String cardOwnerMasked) {
		this.cardOwnerMasked = cardOwnerMasked;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getBin() {
		return bin;
	}

	public void setBin(String bin) {
		this.bin = bin;
	}

	public Dealer getDealer() {
		return dealer;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}

	public boolean isIs3D() {
		return is3D;
	}

	public void setIs3D(boolean is3d) {
		is3D = is3d;
	}

	public String getThreeDStatus() {
		return threeDStatus;
	}

	public void setThreeDStatus(String threeDStatus) {
		this.threeDStatus = threeDStatus;
	}

	public String getThreeDResult() {
		return threeDResult;
	}

	public void setThreeDResult(String threeDResult) {
		this.threeDResult = threeDResult;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getPaymentSystemType() {
		return paymentSystemType;
	}

	public void setPaymentSystemType(String paymentSystemType) {
		this.paymentSystemType = paymentSystemType;
	}

	public boolean isRefundable() {
		return isRefundable;
	}

	public void setRefundable(boolean isRefundable) {
		this.isRefundable = isRefundable;
	}

	public BigDecimal getRefundableAmount() {
		return refundableAmount;
	}

	public void setRefundableAmount(BigDecimal refundableAmount) {
		this.refundableAmount = refundableAmount;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
}
