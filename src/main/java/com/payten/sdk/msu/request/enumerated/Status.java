package com.payten.sdk.msu.request.enumerated;

/**
 * Status - Used for flagging records in database as enabled/disabled.
 * Max 2-char length!
 * 
 * @author Isah Bllaca <isah.bllaca@asseco-see.com>
 */
public enum Status {
	/**
	 * OK - enabled, active
	 */
	OK,
	/**
	 * NO - disabled, inactive
	 */
	NO,
	/**
	 * WA - waiting for approve
	 */
	WA;
	
	public static Status fromString(String input){
		for(Status s: values()){
			if(s.name().equals(input))
				return s;
		}
		return null;
	}
}
