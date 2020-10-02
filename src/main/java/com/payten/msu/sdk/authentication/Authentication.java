package com.payten.msu.sdk.authentication;

import com.payten.msu.sdk.request.base.ApiRequest;

public interface Authentication {
	void authenticate(ApiRequest apiRequest);
}
