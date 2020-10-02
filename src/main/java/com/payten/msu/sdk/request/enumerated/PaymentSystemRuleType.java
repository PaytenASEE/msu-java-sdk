package com.payten.msu.sdk.request.enumerated;

public enum PaymentSystemRuleType {
	TIMEOUT;
	
	public static PaymentSystemRuleType fromString(String input){
		for(PaymentSystemRuleType psRuleType: values()){
			if(psRuleType.name().equals(input))
				return psRuleType;
		}
		return null;
	}
}