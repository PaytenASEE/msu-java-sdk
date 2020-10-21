package com.merchantsafeunipay.sdk.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.merchantsafeunipay.sdk.response.model.MerchantStatusHistory;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

public class QueryMerchantStatusHistoryResponse extends ApiResponse {
    @JsonProperty(value = "merchantStatusHistoryList")
    @XmlElementWrapper(name = "merchantStatusHistoryList")
    @XmlElement(name = "merchantStatusHistory")
    private List<MerchantStatusHistory> statusHistoryList;

    public List<MerchantStatusHistory> getStatusHistoryList() {
        return statusHistoryList;
    }
}
