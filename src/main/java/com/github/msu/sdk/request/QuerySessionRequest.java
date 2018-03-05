package com.github.msu.sdk.request;

import java.util.Map;

import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.Action;
import com.github.msu.sdk.request.enumerated.Param;
import com.github.msu.sdk.response.QuerySessionResponse;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(responseClass = QuerySessionResponse.class)
public class QuerySessionRequest extends ApiRequest {
	private String sessionToken;

	private QuerySessionRequest() {
	}

	@Override
	public Map<String, String> getFormUrlEncodedData() {
		payload.put(Param.ACTION.name(), Action.QUERYSESSION.name());
		payload.put(Param.SESSIONTOKEN.name(), sessionToken);
		return payload;
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
