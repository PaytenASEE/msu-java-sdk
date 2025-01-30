package com.merchantsafeunipay.sdk.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.merchantsafeunipay.sdk.response.model.Installment;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

public class QueryPsInstallmentResponse extends ApiResponse {
    @JsonProperty(value = "installmentList")
    @XmlElementWrapper(name = "installmentList")
    @XmlElement(name = "installmentList")
    private List<Installment> installmentList;
    @JsonProperty(value = "is3D")
    private boolean is3D;


    public List<Installment> getinstallmentList() {
        return installmentList;
    }




}
