package com.merchantsafeunipay.sdk.request.enumerated;


public enum PayByLinkStatus {

	CR,

	SD,

	CA,

	EX,
	

	PD;
	
	
	public static PayByLinkStatus fromString(String input) {
		for (PayByLinkStatus payByLinkStatus : values()) {
			if (payByLinkStatus.name().equals(input))
				return payByLinkStatus;
		}
		return null;
	}

	public static PayByLinkStatus[] toEnums(String... values) {
		PayByLinkStatus[] payByLinkStatuses = new PayByLinkStatus[values.length];
		int i = 0;
		for (String value : values) {
			payByLinkStatuses[i++] = valueOf(value);
		}
		return payByLinkStatuses;
	}
}
