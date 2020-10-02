package com.github.msu.sdk.request.enumerated;

import java.util.Arrays;

/**
 * IntegrationModelv2
 * 
 * @author Tolga Durak <tolga.durak@payten.com>
 */
public enum IntegrationModelv2 {
	API, 
	HPP, 
	DIRECTPOST_THREED, 
	DIRECTPOST_NON_THREED,
	DEALER_PORTAL_BASIC_PAYMENT;
	
	public static IntegrationModelv2 fromString(String integrationModel) {
		for (IntegrationModelv2 model : values()) {
			if (model.name().equalsIgnoreCase(integrationModel)) {
				return model;
			}
		}
		return null;
	}

	public static IntegrationModelv2[] filterForCustomFields() {
		return Arrays.stream(IntegrationModelv2.values()).filter(a -> !DIRECTPOST_NON_THREED.equals(a)).toArray(IntegrationModelv2[]::new);
	}
}
