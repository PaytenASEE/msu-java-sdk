package com.merchantsafeunipay.sdk.response.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class MerchantStatusHistory {
    private User user;
    private Merchant merchant;
    private String status;
    private String editedTs;

    public User getUser() {
        return user;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public String getStatus() {
        return status;
    }

    public String getEditedTs() {
        return editedTs;
    }

}
