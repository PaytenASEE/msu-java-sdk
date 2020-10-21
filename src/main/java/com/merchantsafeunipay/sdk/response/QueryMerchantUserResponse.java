package com.merchantsafeunipay.sdk.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.merchantsafeunipay.sdk.response.model.MerchantUser;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

public class QueryMerchantUserResponse extends ApiResponse {
    @JsonProperty(value = "merchantUserList")
    @XmlElementWrapper(name = "merchantUserList")
    @XmlElement(name = "merchantUser")
    private List<MerchantUser> merchantUserList;

    public List<MerchantUser> getMerchantUserList() {
        return merchantUserList;
    }
}
