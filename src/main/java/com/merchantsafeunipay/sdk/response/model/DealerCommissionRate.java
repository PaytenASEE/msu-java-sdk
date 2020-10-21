package com.merchantsafeunipay.sdk.response.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class DealerCommissionRate {
    private String dealerCode;
    private String dealerName;
    private String installment;
    private String startDate;
    private String endDate;
    private String status;
    private BigDecimal commissionRate;

    public String getDealerCode() {
        return dealerCode;
    }

    public String getDealerName() {
        return dealerName;
    }

    public String getInstallment() {
        return installment;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getStatus() {
        return status;
    }

    public BigDecimal getCommissionRate() {
        return commissionRate;
    }
}
