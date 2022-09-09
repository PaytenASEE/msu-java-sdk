package com.merchantsafeunipay.sdk.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.ProxyPaymentTool;
import com.merchantsafeunipay.sdk.response.misc.ResponseCode;
import com.merchantsafeunipay.sdk.response.misc.ResponseMessage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Map;

@JsonInclude(Include.NON_NULL)
@XmlRootElement(name = "response")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonPropertyOrder({"responseCode", "responseMsg", "pgTranErrorCode"})
@XmlType(propOrder = {"responseCode", "responseMsg", "pgTranErrorCode"})
public class ApiResponse {
    private ApiAction action;
    private String apiMerchantId;
    private String paymentSystem;
    private String paymentSystemType;
    private String paymentSystemEftCode;
    private String pgTranDate;
    private String merchantPaymentId;
    private String merchantOrderId;
    private String invoiceId;
    private String pgTranId;
    private String pgTranRefId;
    private String pgOrderId;
    private String pgTranApprCode;
    private String sessionToken;
    private String cardToken;
    private String errorCode;
    private String pgTranErrorText;
    private String pgTranErrorCode;
    private String responseCode;
    private String errorMsg;
    private String responseMsg;
    private String responseDesc;
    private String violatorParam;
    private String tmxReviewStatus;
    private String tmxRiskRating;
    private String tmxPolicyScore;
    private String tmxReasonCode;
    private String tmxPolicy;
    private String tmxSessionQueryOutput;
    private String transactionId;
    private String spc;
    private String shouldDo3D;
    private String isCardSavable;
    private String panLast4;
    private String cardBin;
    private String posId;
    private String customer;
    private String cardExpiry;

    private Map<String, String> bankResponseExtras;
    private ProxyPaymentTool proxyPaymentTool;
    @JsonIgnore
    private String rawResponse;

    public static ApiResponse approved() {
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setSuccessResponseParams();
        return apiResponse;
    }

    public static ApiResponse declined() {
        ApiResponse apiServiceVO = new ApiResponse();
        apiServiceVO.setDeclinedResponseParams();
        return apiServiceVO;
    }

    public ApiAction getAction() {
        return action;
    }

    public void setAction(ApiAction action) {
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

    public String getPgTranApprCode() {
        return pgTranApprCode;
    }

    public void setPgTranApprCode(String pgTranApprCode) {
        this.pgTranApprCode = pgTranApprCode;
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

    public String getResponseDesc() {
        return responseDesc;
    }

    public void setResponseDesc(String responseDesc) {
        this.responseDesc = responseDesc;
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

    public void setTmxReviewStatus(String tmxReviewStatus) {
        this.tmxReviewStatus = tmxReviewStatus;
    }

    public String getTmxRiskRating() {
        return tmxRiskRating;
    }

    public void setTmxRiskRating(String tmxRiskRating) {
        this.tmxRiskRating = tmxRiskRating;
    }

    public String getTmxPolicyScore() {
        return tmxPolicyScore;
    }

    public void setTmxPolicyScore(String tmxPolicyScore) {
        this.tmxPolicyScore = tmxPolicyScore;
    }

    public String getTmxPolicy() {
        return tmxPolicy;
    }

    public void setTmxPolicy(String tmxPolicy) {
        this.tmxPolicy = tmxPolicy;
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

    public boolean isApproved() {
        return ResponseCode.APPROVEDCODE.equals(this.responseCode);
    }

    public String getSpc() {
        return spc;
    }

    public void setSpc(String spc) {
        this.spc = spc;
    }

    public String getShouldDo3D() {
        return shouldDo3D;
    }

    public void setShouldDo3D(String shouldDo3D) {
        this.shouldDo3D = shouldDo3D;
    }

    public String getIsCardSavable() {
        return isCardSavable;
    }

    public void setIsCardSavable(String isCardSavable) {
        this.isCardSavable = isCardSavable;
    }

    public String getPanLast4() {
        return panLast4;
    }

    public void setPanLast4(String panLast4) {
        this.panLast4 = panLast4;
    }

    public String getCardBin() {
        return cardBin;
    }

    public void setCardBin(String cardBin) {
        this.cardBin = cardBin;
    }

    public String getPosId() {
        return posId;
    }

    public String customer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setPosId(String posId) {
        this.posId = posId;
    }

    public Map<String, String> getBankResponseExtras() {
        return bankResponseExtras;
    }

    public void setBankResponseExtras(Map<String, String> bankResponseExtras) {
        this.bankResponseExtras = bankResponseExtras;
    }

    public ProxyPaymentTool getProxyPaymentTool() {
        return proxyPaymentTool;
    }

    public void setProxyPaymentTool(ProxyPaymentTool proxyPaymentTool) {
        this.proxyPaymentTool = proxyPaymentTool;
    }

    public String getRawResponse() {
        return this.rawResponse;
    }

    public void setRawResponse(String rawResponse) {
        this.rawResponse = rawResponse;
    }

    public String getMerchantOrderId() {
        return merchantOrderId;
    }

    public void setMerchantOrderId(String merchantOrderId) {
        this.merchantOrderId = merchantOrderId;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getCardExpiry() {
        return cardExpiry;
    }

    public void setCardExpiry(String cardExpiry) {
        this.cardExpiry = cardExpiry;
    }
}