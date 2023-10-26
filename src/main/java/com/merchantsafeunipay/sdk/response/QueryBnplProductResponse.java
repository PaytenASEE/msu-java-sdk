package com.merchantsafeunipay.sdk.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.merchantsafeunipay.sdk.response.model.ProductCode;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

public class QueryBnplProductResponse extends ApiResponse {
    @JsonProperty(value = "productCodeList")
    @XmlElementWrapper(name = "productCodeList")
    @XmlElement(name = "productCode")
    private List<ProductCode> productCode;

    public List<ProductCode> getProductCode() {
        return productCode;
    }
}