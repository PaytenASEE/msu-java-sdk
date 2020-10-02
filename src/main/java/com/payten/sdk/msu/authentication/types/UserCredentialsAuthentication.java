package com.payten.sdk.msu.authentication.types;

import java.util.Map;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.authentication.credentials.MsuCredentials;
import com.payten.sdk.msu.authentication.credentials.MsuCredentialsProvider;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.Param;

public class UserCredentialsAuthentication implements Authentication {
	private MsuCredentials msuCredentials;

	public UserCredentialsAuthentication(MsuCredentialsProvider msuCredentialsProvider) {
		this.msuCredentials = msuCredentialsProvider.getCredentials();
	}

	public void authenticate(ApiRequest apiRequest) {
		Map<String, String> formUrlEncodedData = apiRequest.getFormUrlEncodedData();
		formUrlEncodedData.put(Param.MERCHANT.name(), msuCredentials.getMerchantBusinessId());
		formUrlEncodedData.put(Param.MERCHANTUSER.name(), msuCredentials.getMerchantUser());
		formUrlEncodedData.put(Param.MERCHANTPASSWORD.name(), msuCredentials.getMerchantPassword());
	}

	@Override
	public String toString() {
		return "UserCredentialsAuthentication " + msuCredentials;
	}
}
