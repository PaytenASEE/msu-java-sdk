package com.merchantsafeunipay.sdk.response.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class MerchantGroup {
    private String name;
    private String status;
    private String merchantGroupType;
    private List<Merchant> merchants;

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public String getMerchantGroupType() {
        return merchantGroupType;
    }

    public List<Merchant> getMerchants() {
        return merchants;
    }

}
