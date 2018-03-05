package com.github.msu.sdk.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.github.msu.sdk.request.enumerated.Action;
import com.github.msu.sdk.response.misc.ResponseCode;
import com.github.msu.sdk.response.misc.ResponseMessage;

@JsonInclude(Include.NON_NULL)
@XmlRootElement(name = "response")
@XmlAccessorType(XmlAccessType.FIELD)
public class ApiResponse {
	private Action action;
	private String apiMerchantId;
	private String paymentSystem;
	private String paymentSystemType;
	private String paymentSystemEftCode;
	private String pgTranDate;
	private String merchantPaymentId;
	private String pgTranId;
	private String pgTranRefId;
	private String pgOrderId;
	private String sessionToken;
	private String cardToken;
	private String errorCode;
	private String pgTranErrorText;
	private String pgTranErrorCode;
	private String responseCode;
	private String errorMsg;
	private String responseMsg;
	private String violatorParam;
	private String tmxReviewStatus;
	private String tmxRiskRating;
	private String tmxPolicyScore;
	private String tmxReasonCode;
	private String tmxSessionQueryOutput;
	private String transactionId;
	private String spc;

	private String rawResponse;
	
	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

	public String getApiMerchantId() {
		return apiMerchantId;
	}

	public void setApiMerchantId(String apiMerchantId) {
		this.apiMerchantId = apiMerchantId;
	}

	public String getPaymentSystem() {
		return paymentSystem;
	}

	public void setPaymentSystem(String paymentSystem) {
		this.paymentSystem = paymentSystem;
	}

	public String getPaymentSystemType() {
		return paymentSystemType;
	}

	public void setPaymentSystemType(String paymentSystemType) {
		this.paymentSystemType = paymentSystemType;
	}

	public String getPgTranDate() {
		return pgTranDate;
	}

	public void setPgTranDate(String pgTranDate) {
		this.pgTranDate = pgTranDate;
	}

	public String getMerchantPaymentId() {
		return merchantPaymentId;
	}

	public void setMerchantPaymentId(String merchantPaymentId) {
		this.merchantPaymentId = merchantPaymentId;
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

	public String getPgOrderId() {
		return pgOrderId;
	}

	public void setPgOrderId(String pgOrderId) {
		this.pgOrderId = pgOrderId;
	}

	public String getSessionToken() {
		return sessionToken;
	}

	public void setSessionToken(String sessionToken) {
		this.sessionToken = sessionToken;
	}

	public String getCardToken() {
		return cardToken;
	}

	public void setCardToken(String cardToken) {
		this.cardToken = cardToken;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getPgTranErrorText() {
		return pgTranErrorText;
	}

	public void setPgTranErrorText(String pgTranErrorText) {
		this.pgTranErrorText = pgTranErrorText;
	}

	public String getPgTranErrorCode() {
		return pgTranErrorCode;
	}

	public void setPgTranErrorCode(String pgTranErrorCode) {
		this.pgTranErrorCode = pgTranErrorCode;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String response) {
		this.responseCode = response;
	}

	public String getResponseMsg() {
		return responseMsg;
	}

	public void setResponseMsg(String responseMsg) {
		this.responseMsg = responseMsg;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorCauser) {
		this.errorMsg = errorCauser;
	}

	public String getViolatorParam() {
		return violatorParam;
	}

	public void setViolatorParam(String violatorParam) {
		this.violatorParam = violatorParam;
	}

	public String getTmxReviewStatus() {
		return tmxReviewStatus;
	}

	public String getTmxRiskRating() {
		return tmxRiskRating;
	}

	public String getTmxPolicyScore() {
		return tmxPolicyScore;
	}

	public void setTmxReviewStatus(String tmxReviewStatus) {
		this.tmxReviewStatus = tmxReviewStatus;
	}

	public void setTmxRiskRating(String tmxRiskRating) {
		this.tmxRiskRating = tmxRiskRating;
	}

	public void setTmxPolicyScore(String tmxPolicyScore) {
		this.tmxPolicyScore = tmxPolicyScore;
	}

	public String getTmxReasonCode() {
		return tmxReasonCode;
	}

	public void setTmxReasonCode(String tmxReasonCode) {
		this.tmxReasonCode = tmxReasonCode;
	}

	public String getTmxSessionQueryOutput() {
		return tmxSessionQueryOutput;
	}

	public void setTmxSessionQueryOutput(String tmxSessionQueryOutput) {
		this.tmxSessionQueryOutput = tmxSessionQueryOutput;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getPaymentSystemEftCode() {
		return paymentSystemEftCode;
	}

	public void setPaymentSystemEftCode(String paymentSystemEftCode) {
		this.paymentSystemEftCode = paymentSystemEftCode;
	}

	public void setSuccessResponseParams() {
		this.responseCode = ResponseCode.APPROVEDCODE;
		this.responseMsg = ResponseMessage.APPROVEDMESSAGE;
	}

	public void setDeclinedResponseParams() {
		this.responseCode = ResponseCode.DECLINEDCODE;
		this.responseMsg = ResponseMessage.DECLINEDMESSAGE;
	}
	
	public String getSpc() {
		return spc;
	}

	public void setSpc(String spc) {
		this.spc = spc;
	}

	public String getRawResponse() {
		return rawResponse;
	}

	public void setRawResponse(String rawResponse) {
		this.rawResponse = rawResponse;
	}

	@Override
	public String toString() {
		return this.rawResponse;
	}
}