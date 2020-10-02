package com.payten.sdk.msu.authentication;

import com.payten.sdk.msu.request.base.ApiRequest;

public interface Authentication {
	void authenticate(ApiRequest apiRequest);
}
