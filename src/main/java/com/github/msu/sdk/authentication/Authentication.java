package com.github.msu.sdk.authentication;

import com.github.msu.sdk.request.base.ApiRequest;

public interface Authentication {
	void authenticate(ApiRequest apiRequest);
}
