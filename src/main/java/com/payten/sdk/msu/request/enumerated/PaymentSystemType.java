package com.payten.sdk.msu.request.enumerated;

public enum PaymentSystemType  {
	
	ABANK("0124", PaymentProcessor.PROCESSOR_NESTPAY),
	AKBANK("0046", PaymentProcessor.PROCESSOR_NESTPAY),
	ANADOLU("0135", PaymentProcessor.PROCESSOR_NESTPAY),
	CARDPLUS("", PaymentProcessor.PROCESSOR_NESTPAY),
	CITI("", PaymentProcessor.PROCESSOR_NESTPAY),
	CREDITEUROPE_RO("", PaymentProcessor.PROCESSOR_NESTPAY),
	CREDITEUROPE_RU("", PaymentProcessor.PROCESSOR_NESTPAY),
	DENIZBANKINTERTECH("0134", PaymentProcessor.PROCESSOR_DENIZ),
	FINANS("0111", PaymentProcessor.PROCESSOR_NESTPAY),
	GARANTI("0062", PaymentProcessor.PROCESSOR_GARANTI),
	HALK("0012", PaymentProcessor.PROCESSOR_NESTPAY),
	HALKKOBIKART("", PaymentProcessor.PROCESSOR_NESTPAY),
	HSBC("0123", PaymentProcessor.PROCESSOR_HSBC),
	ING("0099", PaymentProcessor.PROCESSOR_NESTPAY),
	INTESABANK("BCIT", PaymentProcessor.PROCESSOR_INTESA),
	ISBANK("0064", PaymentProcessor.PROCESSOR_NESTPAY),
	KOMBANK("", PaymentProcessor.PROCESSOR_NESTPAY),
	KUVEYTTURK("0205", PaymentProcessor.PROCESSOR_KUVEYT),
	ODEABANK("0146", PaymentProcessor.PROCESSOR_ODEA),
	QNBFINANS("0111", PaymentProcessor.PROCESSOR_QNB_FINANS),
	SEKERBANK("0059", PaymentProcessor.PROCESSOR_NESTPAY),
	TEB("0032", PaymentProcessor.PROCESSOR_NESTPAY),
	VAKIFBANK("0015", PaymentProcessor.PROCESSOR_VAKIF),
	YKB("0067", PaymentProcessor.PROCESSOR_YKB),
	ZIRAATBANK("0010", PaymentProcessor.PROCESSOR_NESTPAY),
	TURKIYEFINANS("0206", PaymentProcessor.PROCESSOR_NESTPAY),
	
	
	// non issuer payment system types
	BKMEXPRESS("", PaymentProcessor.PROCESSOR_BKMEXPRESS),
	BKMEXPRESSV2("", PaymentProcessor.PROCESSOR_BKMEXPRESSV2),
	COMPAY("", PaymentProcessor.PROCESSOR_COMPAY),
	EMULATOR("", PaymentProcessor.PROCESSOR_EMULATOR),
	GARANTIPAY("", PaymentProcessor.PROCESSOR_GARANTIPAY),
	IYZICO("", PaymentProcessor.PROCESSOR_IYZICO),
	PARATIKA("", PaymentProcessor.PROCESSOR_PARATIKA),
	PAYU("", PaymentProcessor.PROCESSOR_PAYU),
	PAYU3D("", PaymentProcessor.PROCESSOR_PAYU3D),
	WIRECARD("", PaymentProcessor.PROCESSOR_WIRECARD);
	
	private String eftCode;
	private PaymentProcessor paymentProcessor;

	PaymentSystemType(String eftCode, PaymentProcessor paymentProcessor) {
		this.eftCode = eftCode;
		this.paymentProcessor = paymentProcessor;
	}

	public String getEftCode() {
		return eftCode;
	}

	public PaymentProcessor getPaymentProcessor() {
		return paymentProcessor;
	}

	public static PaymentSystemType[] nestpay(){
		return new PaymentSystemType[]{ ABANK, AKBANK, ANADOLU, CARDPLUS, CITI, CREDITEUROPE_RO, CREDITEUROPE_RU, FINANS, HALK, HALKKOBIKART, ING, ISBANK, KOMBANK, SEKERBANK, TEB, ZIRAATBANK, TURKIYEFINANS} ;
	}

	public static PaymentSystemType fromString(String input) {
		for (PaymentSystemType type : values()) {
			if (type.name().equals(input))
				return type;
		}
		return null;
	}

	public static PaymentSystemType fromEFTCode(String eftCode) {
		for (PaymentSystemType type : values()) {
			if (type.getEftCode().equals(eftCode))
				return type;
		}
		return null;
	}
}
