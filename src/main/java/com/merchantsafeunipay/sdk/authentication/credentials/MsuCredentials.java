package com.merchantsafeunipay.sdk.authentication.credentials;

public class MsuCredentials {
	private String merchantBusinessId;
	private String merchantUser;
	private String merchantPassword;

	public MsuCredentials(String merchantBusinessId, String email, String password) {
		this.merchantBusinessId = merchantBusinessId;
		this.merchantUser = email;
		this.merchantPassword = password;
	}

	public String getMerchantBusinessId() {
		return merchantBusinessId;
	}

	public String getMerchantUser() {
		return merchantUser;
	}

	public String getMerchantPassword() {
		return merchantPassword;
	}

	@Override
	public String toString() {
		return "[merchantBusinessId=" + merchantBusinessId + ", merchantUser=" + merchantUser
				+ ", merchantPassword=********]";
	}

}
