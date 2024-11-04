package com.merchantsafeunipay.sdk.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.merchantsafeunipay.sdk.response.model.AgricultureTemplate;


import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QueryAgricultureTemplateResponse extends ApiResponse {


    private String errorCode;
    private String numCode;
    private String hostMsg;
    private String interestFreePeriodInformation;
    private String hostDate;
    private String selectedProductInformation;
    private String imeceCardQueryResult;

    private List<AgricultureTemplate> agricultureTemplate;

    // Getter and Setter
    public List<AgricultureTemplate> getAgricultureTemplate() {
        return agricultureTemplate;

    }
    @Override
    public String getErrorCode() {
        return errorCode;
    }

    public String getNumCode() {
        return numCode;
    }

    public String getHostMsg() {
        return hostMsg;
    }

    public String getInterestFreePeriodInformation() {
        return interestFreePeriodInformation;
    }

    public String getHostDate() {
        return hostDate;
    }

    public String getSelectedProductInformation() {
        return selectedProductInformation;
    }

    public String getImeceCardQueryResult() {
        return imeceCardQueryResult;
    }



}

