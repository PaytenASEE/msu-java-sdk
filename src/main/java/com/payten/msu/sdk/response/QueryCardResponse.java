package com.payten.msu.sdk.response;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.payten.msu.sdk.response.model.Card;

public class QueryCardResponse extends ApiResponse {
	private String cardCount;
	private String totalCardCount;
	@JsonProperty(value = "cardList")
	@XmlElementWrapper(name = "cardList")
	@XmlElement(name = "card")
	private List<Card> cards;

	public String getCardCount() {
		return cardCount;
	}

	public String getTotalCardCount() {
		return totalCardCount;
	}

	public List<Card> getCards() {
		return cards;
	}

}
