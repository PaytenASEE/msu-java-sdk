package com.github.msu.sdk.response;

public class PasswordRecoveryResponse extends ApiResponse {
	private String recoveryToken;
	private String expiryDate;

	public String getRecoveryToken() {
		return recoveryToken;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
}
