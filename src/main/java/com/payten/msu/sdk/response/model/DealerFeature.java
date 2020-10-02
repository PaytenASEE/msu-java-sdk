package com.payten.msu.sdk.response.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class DealerFeature {
	private String feature;
	private Boolean visibility;

	public String getFeature() {
		return feature;
	}

	public Boolean getVisibility() {
		return visibility;
	}
}
