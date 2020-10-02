package com.payten.sdk.msu.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.payten.sdk.msu.response.model.Card;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

public class QuerySameCardResponse extends ApiResponse {
	@JsonProperty(value = "cards")
	@XmlElementWrapper(name = "cards")
	@XmlElement(name = "card")
	private List<Card> cards;

	public QuerySameCardResponse() {
		super();
	}
	
	public QuerySameCardResponse(List<Card> cards) {
		this.cards = cards;
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
}