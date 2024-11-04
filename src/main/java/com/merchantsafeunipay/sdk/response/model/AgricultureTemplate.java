package com.merchantsafeunipay.sdk.response.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;


@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class AgricultureTemplate {

    private String errorCode;
    private String numCode;
    private String hostMsg;
    private String interestFreePeriodInformation;
    private String hostDate;
    private String selectedProductInformation;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getNumCode() {
        return numCode;
    }

    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    public String getHostMsg() {
        return hostMsg;
    }

    public void setHostMsg(String hostMsg) {
        this.hostMsg = hostMsg;
    }

    public String getInterestFreePeriodInformation() {
        return interestFreePeriodInformation;
    }

    public void setInterestFreePeriodInformation(String interestFreePeriodInformation) {
        this.interestFreePeriodInformation = interestFreePeriodInformation;
    }

    public String getHostDate() {
        return hostDate;
    }

    public void setHostDate(String hostDate) {
        this.hostDate = hostDate;
    }

    public String getSelectedProductInformation() {
        return selectedProductInformation;
    }

    public void setSelectedProductInformation(String selectedProductInformation) {
        this.selectedProductInformation = selectedProductInformation;
    }

    public String getImeceCardQueryResult() {
        return imeceCardQueryResult;
    }

    public void setImeceCardQueryResult(String imeceCardQueryResult) {
        this.imeceCardQueryResult = imeceCardQueryResult;
    }

    private String imeceCardQueryResult;


}
