package com.merchantsafeunipay.sdk.request.enumerated;

public enum YesNo {
	YES,
	NO;
	
	public static YesNo fromString(String yesNoString) {
		for (YesNo yesNo : values()) {
			if (yesNo.name().equals(yesNoString)) {
				return yesNo;
			}
		}
		return null;
	}

	public static String getYesNo(boolean yes) {
		return yes ? YesNo.YES.name() : YesNo.NO.name();
	}

	public static YesNo getYesNoValue(Boolean yes) {
		return yes ? YesNo.YES : YesNo.NO;
	}

	public static Boolean getBooleanValue(YesNo yes) {
		return YesNo.YES.equals(yes) ? Boolean.TRUE : Boolean.FALSE;
	}
	
	public static boolean getYesNo(String yes) {
		return YesNo.YES.equals(YesNo.valueOf(yes));

	}
}
