package com.github.msu.sdk.authentication.types;

import java.util.Map;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.authentication.credentials.MsuCredentials;
import com.github.msu.sdk.authentication.credentials.MsuCredentialsProvider;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.Param;

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
