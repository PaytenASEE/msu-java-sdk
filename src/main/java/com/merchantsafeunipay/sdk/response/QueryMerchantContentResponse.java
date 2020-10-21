package com.merchantsafeunipay.sdk.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.merchantsafeunipay.sdk.response.model.MerchantContent;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;


public class QueryMerchantContentResponse extends ApiResponse {
    @JsonProperty(value = "merchantContentList")
    @XmlElementWrapper(name = "merchantContentList")
    @XmlElement(name = "merchantContent")
    private List<MerchantContent> merchantContents;

    public List<MerchantContent> getMerchantContents() {
        return merchantContents;
    }
}
