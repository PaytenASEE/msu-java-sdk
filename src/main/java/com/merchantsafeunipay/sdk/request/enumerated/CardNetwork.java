package com.merchantsafeunipay.sdk.request.enumerated;

import java.util.Arrays;
import java.util.List;

/**
 * CardNetwork Maximum length 8-char
 *
 * @author Anil Tangul <anil.tangul@asseco-see.com.tr>
 * @author Krenar Muhidini <krenar.muhidini@asseco-see.mk>
 */
public enum CardNetwork {
    // @formatter:off
	/**
	 * Bonus
	 */
	BONUS(Arrays.asList( 
			PaymentSystemType.GARANTI, 
			PaymentSystemType.TEB, 
			PaymentSystemType.DENIZBANKINTERTECH, 
			PaymentSystemType.ING, 
			PaymentSystemType.SEKERBANK, 
			PaymentSystemType.ABANK, 
			PaymentSystemType.IYZICO,
			PaymentSystemType.TURKIYEFINANS)),
	
	/**
	 * Maximum
	 */
	MAXIMUM(Arrays.asList( 
			PaymentSystemType.ISBANK, 
			PaymentSystemType.IYZICO)),
	
	/**
	 * Axess
	 */
	AXESS(Arrays.asList( 
			PaymentSystemType.AKBANK, 
			PaymentSystemType.ODEABANK, 
			PaymentSystemType.CITI)),
	
	/**
	 * World
	 */
	WORLD(Arrays.asList(
			PaymentSystemType.YKB,
			PaymentSystemType.ANADOLU, 
			PaymentSystemType.VAKIFBANK, 
			PaymentSystemType.IYZICO)),
	
	/**
	 * Card Finans
	 */
	CARD_FNS(Arrays.asList(
			PaymentSystemType.FINANS, 
			PaymentSystemType.QNBFINANS,
			PaymentSystemType.IYZICO)),
	
	/**
	 * Paraf
	 */
	PARAF(Arrays.asList(
			PaymentSystemType.HALK, 
			PaymentSystemType.HALKKOBIKART,
			PaymentSystemType.IYZICO)),
	
	/**
	 * Advantage
	 */
	ADVANT(Arrays.asList(
			PaymentSystemType.HSBC)),
	
	/**
	 * Bankkart Combo
	 */
	BANKKART_COMBO(Arrays.asList(
			PaymentSystemType.ZIRAATBANK)),
	
	/**
	 * UNKNOWN
	 */
	UNKNOWN(Arrays.asList( 
			PaymentSystemType.CARDPLUS, 
			PaymentSystemType.CREDITEUROPE_RO, 
			PaymentSystemType.CREDITEUROPE_RU, 
			PaymentSystemType.INTESABANK,
			PaymentSystemType.KOMBANK,
			PaymentSystemType.KUVEYTTURK));
	
	
	private List<PaymentSystemType> paymentSystemTypeList;

	private CardNetwork(List<PaymentSystemType> paymentSystemTypeList) {
		this.paymentSystemTypeList = paymentSystemTypeList;
	}

	public static CardNetwork detectNetwork(PaymentSystemType type) {
		for (CardNetwork cn : values()) {
			if (cn.containsPaymentSystem(type)) {
				return cn;
			}
		}
		return CardNetwork.UNKNOWN;
	}

	public static CardNetwork fromString(String input){
		for(CardNetwork cn: values()){
			if(cn.name().equals(input))
				return cn;
		}
		return null;
	}

	public List<PaymentSystemType> getPaymentSystemTypeList() {
		return paymentSystemTypeList;
	}
	
	public boolean containsPaymentSystem(PaymentSystemType psType) {
		return this.getPaymentSystemTypeList().contains(psType);
	}
}