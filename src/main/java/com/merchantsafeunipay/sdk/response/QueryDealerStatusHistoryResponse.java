package com.merchantsafeunipay.sdk.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.merchantsafeunipay.sdk.response.model.DealerStatusHistory;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

public class QueryDealerStatusHistoryResponse extends ApiResponse {
    @JsonProperty(value = "dealerStatusHistoryList")
    @XmlElementWrapper(name = "dealerStatusHistoryList")
    @XmlElement(name = "dealerStatusHistory")
    private List<DealerStatusHistory> statusHistoryList;

    public List<DealerStatusHistory> getStatusHistoryList() {
        return statusHistoryList;
    }

    public void setStatusHistoryList(List<DealerStatusHistory> statusHistoryList) {
        this.statusHistoryList = statusHistoryList;
    }
}
