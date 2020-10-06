package com.merchantsafeunipay.sdk.response.model;

public enum WalletModel {
	/**
	 * (simple add) 
	 */
	MODEL1,
	/**
	 *  (add with preauth) 
	 */
	MODEL2,
	/**
	 *  (add with 3D + preauth) 
	 */
	MODEL3,
	/**
	 *  (add with 3D + preauth + do not delete last card) 
	 */
	MODEL4;
}