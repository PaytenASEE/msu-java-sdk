package com.merchantsafeunipay.sdk.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.merchantsafeunipay.sdk.response.model.Card;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

public class QueryCardDetailsResponse extends ApiResponse {
    private int cardCount;
    private List<Card> cardList;

    public int getCardCount() {
        return cardCount;
    }
    public List<Card> getCardList() {
        return cardList;
    }
}
