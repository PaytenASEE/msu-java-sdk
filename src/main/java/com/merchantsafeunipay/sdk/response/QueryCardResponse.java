package com.merchantsafeunipay.sdk.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.merchantsafeunipay.sdk.response.model.Card;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

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
