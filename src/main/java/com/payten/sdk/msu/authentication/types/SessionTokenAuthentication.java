package com.payten.sdk.msu.authentication.types;

import java.util.Map;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;

public class SessionTokenAuthentication implements Authentication {
	private String token;

	private SessionTokenAuthentication(String token) {
		this.token = token;
	}

	public void authenticate(ApiRequest apiRequest) {
		Map<String, String> formUrlEncodedData = apiRequest.getFormUrlEncodedData();
		formUrlEncodedData.put("SESSIONTOKEN", token);
	}

	@Override
	public String toString() {
		return "SessionTokenAuthentication [token=" + token + "]";
	}

	public static class SessionTokenAuthenticationBuilder {
		private String token;

		public SessionTokenAuthenticationBuilder withToken(String token) {
			this.token = token;
			return this;
		}

		public SessionTokenAuthentication build() {
			return new SessionTokenAuthentication(token);
		}
	}

	public static SessionTokenAuthenticationBuilder builder() {
		return new SessionTokenAuthenticationBuilder();
	}

}
