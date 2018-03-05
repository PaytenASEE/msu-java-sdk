package com.github.msu.sdk.request.enumerated;

public enum SplitPaymentType {
	OPEN, ORDER, INVOICE;
	
	public static SplitPaymentType fromString(String value){
		for(SplitPaymentType spType: values()){
			if(spType.name().equals(value)){
				return spType;
			}
		}
		return null;
	}
	
}
