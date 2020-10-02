package com.payten.sdk.msu.response;

import java.util.List;

import com.payten.sdk.msu.response.model.Installment;

public class PaymentSystemReadResponse extends ApiResponse {
	private String paymentSystemType;
	private String paymentSystemName;
	private String paymentSystemEftCode;
	private String hostUrl;
	private String status;
	private String mode;
	private String subMerchantCode;
	private String apiMerchantId;
	private String apiUsername;
	private String apiPassword;
	private String threeDGateKey;
	private String psIntegrationExtraField00;
	private String psIntegrationExtraField01;
	private String psIntegrationExtraField02;
	private List<Installment> paymentTypes;

	public String getPaymentSystemType() {
		return paymentSystemType;
	}

	public String getPaymentSystemName() {
		return paymentSystemName;
	}

	public String getPaymentSystemEftCode() {
		return paymentSystemEftCode;
	}

	public String getHostUrl() {
		return hostUrl;
	}

	public String getStatus() {
		return status;
	}

	public String getMode() {
		return mode;
	}

	public String getSubMerchantCode() {
		return subMerchantCode;
	}

	public String getApiMerchantId() {
		return apiMerchantId;
	}

	public String getApiUsername() {
		return apiUsername;
	}

	public String getApiPassword() {
		return apiPassword;
	}

	public String getThreeDGateKey() {
		return threeDGateKey;
	}

	public String getPsIntegrationExtraField00() {
		return psIntegrationExtraField00;
	}

	public String getPsIntegrationExtraField01() {
		return psIntegrationExtraField01;
	}

	public String getPsIntegrationExtraField02() {
		return psIntegrationExtraField02;
	}

	public List<Installment> getPaymentTypes() {
		return paymentTypes;
	}
}
