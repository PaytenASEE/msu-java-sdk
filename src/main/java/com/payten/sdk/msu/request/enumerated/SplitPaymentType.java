package com.payten.sdk.msu.request.enumerated;


/**
 * SplitPaymentType, saved on Session 
 * 
 * @author Alketa Fazliu <alketa.fazliu@asseco-see.com>
 */
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
