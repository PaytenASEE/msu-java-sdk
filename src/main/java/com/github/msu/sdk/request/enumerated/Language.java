package com.github.msu.sdk.request.enumerated;


public enum Language {

	tr,

	en,

	sr;
	public static Language permissiveValueOf(String name) {
		for (Language e : values()) {
			if (e.toString().equals(name)) {
				return e;
			}
		}
		return null;
	}

	public static Language fromString(String input) {
		for (Language l : values()) {
			if (l.name().equals(input))
				return l;
		}
		return null;
	}
}
