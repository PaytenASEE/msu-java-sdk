package com.merchantsafeunipay.sdk.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.merchantsafeunipay.sdk.response.model.Dealer;
import com.merchantsafeunipay.sdk.response.model.MerchantUser;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

public class QueryDealerResponse extends ApiResponse {
    @JsonProperty(value = "dealerList")
    @XmlElementWrapper(name = "dealerList")
    @XmlElement(name = "dealer")
    private List<Dealer> dealers;
    @JsonProperty(value = "merchantUserList")
    @XmlElementWrapper(name = "merchantUserList")
    @XmlElement(name = "merchantUser")
    private List<MerchantUser> merchantUserList;

    public List<Dealer> getDealers() {
        return dealers;
    }

    public List<MerchantUser> getMerchantUserList() {
        return merchantUserList;
    }

}
