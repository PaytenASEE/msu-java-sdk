package com.payten.msu.sdk.response.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@XmlAccessorType(XmlAccessType.FIELD)
public class Card {
	private String cardToken;
	private String cardOwnerMasked;
	private String cardOwner;
	private String PAN;
	private String panLast4;
	private String customer;
	private String cardBin;
	private String cardbrand;
	private String cardType;
	private String cardLevel;
	private String cardNetwork;
	private String cardIssuer;
	private String cardVirtual;
	private String cardCountryIso;
	private String cardPaymentSystem;
	private String cardStatus;
	private String cardExpiry;
	private String cardName;

	public Card() {}

	public String getCardToken() {
		return cardToken;
	}

	public void setCardToken(String cardToken) {
		this.cardToken = cardToken;
	}

	public String getCardOwnerMasked() {
		return cardOwnerMasked;
	}

	public void setCardOwnerMasked(String cardOwnerMasked) {
		this.cardOwnerMasked = cardOwnerMasked;
	}

	public String getPanLast4() {
		return panLast4;
	}

	public void setPanLast4(String panLast4) {
		this.panLast4 = panLast4;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getCardBin() {
		return cardBin;
	}

	public void setCardBin(String cardBin) {
		this.cardBin = cardBin;
	}

	public String getCardbrand() {
		return cardbrand;
	}

	public void setCardbrand(String cardbrand) {
		this.cardbrand = cardbrand;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCardLevel() {
		return cardLevel;
	}

	public void setCardLevel(String cardLevel) {
		this.cardLevel = cardLevel;
	}

	public String getCardNetwork() {
		return cardNetwork;
	}

	public void setCardNetwork(String cardNetwork) {
		this.cardNetwork = cardNetwork;
	}

	public String getCardIssuer() {
		return cardIssuer;
	}

	public void setCardIssuer(String cardIssuer) {
		this.cardIssuer = cardIssuer;
	}

	public String getCardVirtual() {
		return cardVirtual;
	}

	public void setCardVirtual(String cardVirtual) {
		this.cardVirtual = cardVirtual;
	}

	public String getCardCountryIso() {
		return cardCountryIso;
	}

	public void setCardCountryIso(String cardCountryIso) {
		this.cardCountryIso = cardCountryIso;
	}

	public String getCardPaymentSystem() {
		return cardPaymentSystem;
	}

	public void setCardPaymentSystem(String cardPaymentSystem) {
		this.cardPaymentSystem = cardPaymentSystem;
	}

	public String getCardStatus() {
		return cardStatus;
	}

	public void setCardStatus(String cardStatus) {
		this.cardStatus = cardStatus;
	}

	public String getCardExpiry() {
		return cardExpiry;
	}

	public void setCardExpiry(String cardExpiry) {
		this.cardExpiry = cardExpiry;
	}

	public String getCardOwner() {
		return cardOwner;
	}

	public void setCardOwner(String cardOwner) {
		this.cardOwner = cardOwner;
	}

	public String getPAN() {
		return PAN;
	}

	public void setPAN(String pAN) {
		PAN = pAN;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public static class Builder {
		private String cardToken;
		private String cardOwnerMasked;
		private String cardOwner;
		private String PAN;
		private String panLast4;
		private String customer;
		private String cardBin;
		private String cardbrand;
		private String cardType;
		private String cardLevel;
		private String cardNetwork;
		private String cardIssuer;
		private String cardVirtual;
		private String cardCountryIso;
		private String cardPaymentSystem;
		private String cardStatus;
		private String cardExpiry;
		private String cardName;

		public Builder cardToken(String cardToken) {
			this.cardToken = cardToken;
			return this;
		}

		public Builder cardOwnerMasked(String cardOwnerMasked) {
			this.cardOwnerMasked = cardOwnerMasked;
			return this;
		}

		public Builder cardOwner(String cardOwner) {
			this.cardOwner = cardOwner;
			return this;
		}

		public Builder PAN(String PAN) {
			this.PAN = PAN;
			return this;
		}

		public Builder panLast4(String panLast4) {
			this.panLast4 = panLast4;
			return this;
		}

		public Builder customer(String customer) {
			this.customer = customer;
			return this;
		}

		public Builder cardBin(String cardBin) {
			this.cardBin = cardBin;
			return this;
		}

		public Builder cardbrand(String cardbrand) {
			this.cardbrand = cardbrand;
			return this;
		}

		public Builder cardType(String cardType) {
			this.cardType = cardType;
			return this;
		}

		public Builder cardLevel(String cardLevel) {
			this.cardLevel = cardLevel;
			return this;
		}

		public Builder cardNetwork(String cardNetwork) {
			this.cardNetwork = cardNetwork;
			return this;
		}

		public Builder cardIssuer(String cardIssuer) {
			this.cardIssuer = cardIssuer;
			return this;
		}

		public Builder cardVirtual(String cardVirtual) {
			this.cardVirtual = cardVirtual;
			return this;
		}

		public Builder cardCountryIso(String cardCountryIso) {
			this.cardCountryIso = cardCountryIso;
			return this;
		}

		public Builder cardPaymentSystem(String cardPaymentSystem) {
			this.cardPaymentSystem = cardPaymentSystem;
			return this;
		}

		public Builder cardStatus(String cardStatus) {
			this.cardStatus = cardStatus;
			return this;
		}

		public Builder cardExpiry(String cardExpiry) {
			this.cardExpiry = cardExpiry;
			return this;
		}

		public Builder cardName(String cardName) {
			this.cardName = cardName;
			return this;
		}

		public Card build() {
			return new Card(this);
		}
	}

	private Card(Builder builder) {
		this.cardToken = builder.cardToken;
		this.cardOwnerMasked = builder.cardOwnerMasked;
		this.cardOwner = builder.cardOwner;
		this.PAN = builder.PAN;
		this.panLast4 = builder.panLast4;
		this.customer = builder.customer;
		this.cardBin = builder.cardBin;
		this.cardbrand = builder.cardbrand;
		this.cardType = builder.cardType;
		this.cardLevel = builder.cardLevel;
		this.cardNetwork = builder.cardNetwork;
		this.cardIssuer = builder.cardIssuer;
		this.cardVirtual = builder.cardVirtual;
		this.cardCountryIso = builder.cardCountryIso;
		this.cardPaymentSystem = builder.cardPaymentSystem;
		this.cardStatus = builder.cardStatus;
		this.cardExpiry = builder.cardExpiry;
		this.cardName = builder.cardName;
	}
}
