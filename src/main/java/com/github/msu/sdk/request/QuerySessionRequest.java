package com.github.msu.sdk.request;

import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.Param;
import com.github.msu.sdk.response.QuerySessionResponse;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(responseClass = QuerySessionResponse.class)
public class QuerySessionRequest extends ApiRequest {
	private String sessionToken;

	private QuerySessionRequest() {}

	@Override
	public ApiAction apiAction() {
		return ApiAction.QUERYSESSION;
	}

	@Override
	public void applyRequestParams() {
		payload.put(Param.SESSIONTOKEN.name(), sessionToken);
	}

	public static class QuerySessionRequestBuilder {
		private String sessionToken;

		public QuerySessionRequestBuilder withSessionToken(String sessionToken) {
			this.sessionToken = sessionToken;
			return this;
		}

		public QuerySessionRequest build() {
			QuerySessionRequest querySessionRequest = new QuerySessionRequest();
			querySessionRequest.sessionToken = this.sessionToken;
			return querySessionRequest;
		}
	}
}
