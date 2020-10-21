package com.merchantsafeunipay.sdk.response.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class Customer {
    private String id;
    private String email;
    private String phone;
    private String name;
    private String lastLogin;
    private String description;
    private String identityNumber;

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public String getDescription() {
        return description;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }
}
