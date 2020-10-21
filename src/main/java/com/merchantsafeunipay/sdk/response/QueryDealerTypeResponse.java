package com.merchantsafeunipay.sdk.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.merchantsafeunipay.sdk.response.model.DealerType;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

public class QueryDealerTypeResponse extends ApiResponse {
    @JsonProperty(value = "dealerTypeList")
    @XmlElementWrapper(name = "dealerTypeList")
    @XmlElement(name = "dealerType")
    private List<DealerType> dealerTypes;

    public List<DealerType> getDealerTypes() {
        return dealerTypes;
    }
}
