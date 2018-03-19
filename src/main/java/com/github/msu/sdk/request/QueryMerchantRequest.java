package com.github.msu.sdk.request;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.response.QueryMerchantResponse;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(responseClass = QueryMerchantResponse.class)
public class QueryMerchantRequest extends ApiRequest {
	private QueryMerchantRequest(QueryMerchantRequestBuilder builder) {
		this.authentication = builder.authentication;
	}

	@Override
	public ApiAction apiAction() {
		return ApiAction.QUERYMERCHANT;
	}

	@Override
	public void applyRequestParams() {
		// taken from credentials
	}

	public static QueryMerchantRequestBuilder builder() {
		return new QueryMerchantRequestBuilder();
	}

	public static class QueryMerchantRequestBuilder {
		private Authentication authentication;

		public QueryMerchantRequestBuilder withAuthentication(Authentication authentication) {
			this.authentication = authentication;
			return this;
		}

		public QueryMerchantRequest build() {
			return new QueryMerchantRequest(this);
		}
	}
}
