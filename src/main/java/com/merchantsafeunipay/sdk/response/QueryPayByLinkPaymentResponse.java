package com.merchantsafeunipay.sdk.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.merchantsafeunipay.sdk.response.model.PayByLinkPayment;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

public class QueryPayByLinkPaymentResponse extends ApiResponse {
    @JsonProperty(value = "payByLinkPaymentList")
    @XmlElementWrapper(name = "payByLinkPaymentList")
    @XmlElement(name = "payByLinkPaymentList")
    private List<PayByLinkPayment> payByLinkPaymentVOList;

    public List<PayByLinkPayment> getPayByLinkPaymentVOList() {
        return payByLinkPaymentVOList;
    }
}
