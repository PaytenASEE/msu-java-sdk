package com.merchantsafeunipay.sdk.response;

public class RecoverPasswordResponse extends ApiResponse {
	private String recoveryToken;
	private String expiryDate;

	public String getRecoveryToken() {
		return recoveryToken;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
}
