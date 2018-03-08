package com.github.msu.sdk;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.authentication.credentials.providers.StaticCredentialsProvider;
import com.github.msu.sdk.authentication.types.SessionTokenAuthentication;
import com.github.msu.sdk.authentication.types.UserCredentialsAuthentication;
import com.github.msu.sdk.http.HttpRequestMaker;
import com.github.msu.sdk.request.SessionTokenRequest;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.Currency;
import com.github.msu.sdk.request.enumerated.Param;
import com.github.msu.sdk.request.financial.PreauthRequest;
import com.github.msu.sdk.response.ApiResponse;
import com.github.msu.sdk.response.SessionTokenResponse;
import com.github.msu.sdk.response.model.PreauthResponse;
import com.github.msu.sdk.util.ResponseInfo;

public class MsuApiClient {
	private Authentication defaultAuthentication;
	private String url = "https://neon-app.asseco-see.com.tr/msu/api/v2";
	private ObjectMapper mapper = new ObjectMapper();
	private static final Set<String> SHOULD_MASK_PARAMS = new HashSet<>(Arrays.asList(Param.CARDPAN.name(), Param.CARDCVV.name(), Param.CARD_EXPIRY.name(),
			Param.CARDEXPIRY.name(), Param.MERCHANTPASSWORD.name(), Param.MERCHANTUSERPASSWORD.name()));

	private MsuApiClient() {
		mapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
	}

	public static MsuApiClientBuilder builder() {
		return new MsuApiClientBuilder();
	}
	
	@SuppressWarnings("unchecked")
	public <T extends ApiResponse> T doRequest(ApiRequest apiRequest) {
		Authentication requestAuthentication = apiRequest.getAuthentication();
		// request authentication has priority
		if (requestAuthentication != null) {
			requestAuthentication.authenticate(apiRequest);
		} else {
			defaultAuthentication.authenticate(apiRequest);
			apiRequest.setAuthentication(defaultAuthentication); // for logging later
		}
		Class<?> responseClass = ApiResponse.class;
		if (apiRequest.getClass().isAnnotationPresent(ResponseInfo.class)) {
			final ResponseInfo responseInfo = apiRequest.getClass().getAnnotation(ResponseInfo.class);
			responseClass = responseInfo.responseClass();
		}
		ObjectReader reader = mapper.readerFor(responseClass);
		HttpRequestMaker httpRequestMaker = new HttpRequestMaker(url);
		long before = System.currentTimeMillis();
		String responseJSON = httpRequestMaker.send(apiRequest.getFormUrlEncodedData());
		T apiResponse = null;
		try {
			apiResponse = (T) responseClass.cast(reader.readValue(responseJSON));
			apiResponse.setRawResponse(responseJSON);
			return apiResponse;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		} finally {
			log(apiRequest, apiResponse, System.currentTimeMillis() - before);
		}
	}

	public static class MsuApiClientBuilder {
		private Authentication defaultAuthentication;
		private String url = "https://neon-app.asseco-see.com.tr/msu/api/v2";

		public MsuApiClientBuilder withDefaultAuthentication(Authentication defaultAuthentication) {
			this.defaultAuthentication = defaultAuthentication;
			return this;
		}

		public MsuApiClientBuilder withUrl(String url) {
			this.url = url;
			return this;
		}

		public MsuApiClient build() {
			MsuApiClient client = new MsuApiClient();
			client.defaultAuthentication = this.defaultAuthentication;
			client.url = url;
			return client;
		}
	}

	public void log(ApiRequest request, ApiResponse response, long totalTimeMs) {
		StringBuilder sb = new StringBuilder("- Total Request Time: ").append(totalTimeMs).append(" ms").append(System.lineSeparator())
				.append("- Authentication: ").append(request.getAuthentication()).append(System.lineSeparator()).append("- Request Body:")
				.append(System.lineSeparator());
		request.getFormUrlEncodedData().forEach((k, v) -> {
			if (v != null) {
				sb.append("\t").append(k).append(": ").append(SHOULD_MASK_PARAMS.contains(k) ? "********" : v);
				sb.append(System.lineSeparator());
			}
		});
		sb.append(System.lineSeparator());
		sb.append("- Response Body:");
		sb.append(System.lineSeparator());
		sb.append("\t").append(response == null ? "No Response!" : response.getRawResponse());
		sb.append(System.lineSeparator());
		System.out.println(sb);
	}

	public void logResponse(ApiResponse apiResponse) {
		System.out.println(apiResponse.getRawResponse());
	}
}
