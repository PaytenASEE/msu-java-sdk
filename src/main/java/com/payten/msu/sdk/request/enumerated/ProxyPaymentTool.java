package com.payten.msu.sdk.request.enumerated;

public enum ProxyPaymentTool {
	BKMEXPRESS;


	public static ProxyPaymentTool fromString(String proxyToolName) {
		if (ProxyPaymentTool.BKMEXPRESS.name().equals(proxyToolName)) {
			return ProxyPaymentTool.BKMEXPRESS;
		}
		return null;
	}
}