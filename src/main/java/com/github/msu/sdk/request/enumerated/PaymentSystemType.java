package com.github.msu.sdk.request.enumerated;

public enum PaymentSystemType  {
	EMULATOR(""), 
	AKBANK("0046"), 
	ABANK("0124"), 
	AKTIFBANK("0143"), 
	ANADOLU("0135"), 
	CARDPLUS(""), 
	CITI(""), 
	CREDITEUROPE_RO(""), 
	CREDITEUROPE_RU(""), 
	DENIZ("0134"), 
	DENIZBANKINTERTECH("0134"), 
	FINANS("0111"), 
	GARANTI("0062"), 
	HALK("0012"), 
	HSBC("0123"), 	
	ING("0099"), 
	ISBANK("0064"), 
	IYZICO(""), 
	KUVEYTTURK("0205"), 
	SEKERBANK("0059"), 
	TEB("0032"), 
	VAKIFBANK("0015"), 
	YKB("0067"), 
	ZIRAATBANK("0010"), 
	BKMEXPRESS(""), 
	COMPAY(""), 
	ODEABANK("0146"), 
	INTESABANK("BCIT"), 
	HSBCASEE("0123"), 
	PAYU3D(""),
	PAYU(""), 
	PARATIKA(""), 
	KOMBANK("");
	private String eftCode;

	private PaymentSystemType(String eftCode) {
		this.eftCode = eftCode;
	}

	public String getEftCode() {
		return eftCode;
	}
}
