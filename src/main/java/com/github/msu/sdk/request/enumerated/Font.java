
package com.github.msu.sdk.request.enumerated;

public enum Font {
	/**
	 * Andada font
	 */
	ANDADA,
	/**
	 * Archivo font
	 */
	ARCHIVO,
	/**
	 * Arial font
	 */
	ARIAL,
	/**
	 * Arimo font
	 */
	ARIMO,
	/**
	 * Arsenal font
	 */
	ARSENAL,
	/**
	 * Bellota font
	 */
	BELLOTA,
	/**
	 * Biko font
	 */
	BIKO,
	/**
	 * Borgia Pro font
	 */
	BORGIAPRO,
	/**
	 * Casper font
	 */
	CASPER,
	/**
	 * Open Sans font
	 */
	OPENSANS,
	/**
	 * Sovba font
	 */
	SOVBA, 
	/**
	 * Times New Roman font
	 */
	TIMESNEWROMAN,
	/**
	 * Verdana font
	 */
	VERDANA;
	public static boolean fontExists(String input) {
		if (input != null) {
			for (Font f : values()) {
				if (f.name().equalsIgnoreCase(input.replace(" ", ""))) {
					return true;
				}
			}
		}
		return false;
	}
}
