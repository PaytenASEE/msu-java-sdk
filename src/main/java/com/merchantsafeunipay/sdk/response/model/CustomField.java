package com.merchantsafeunipay.sdk.response.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * Created by sercan.sensulun on 20/10/2020
 */
@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomField {
    private String integrationCode;
    private String value;

    public CustomField() {
    }

    public CustomField(String integrationCode, String value) {
        this.integrationCode = integrationCode;
        this.value = value;
    }


    private CustomField(Builder builder){
        this.integrationCode = builder.integrationCode;
        this.value = builder.value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getIntegrationCode() {
        return integrationCode;
    }

    public void setIntegrationCode(String integrationCode) {
        this.integrationCode = integrationCode;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {
        private String integrationCode;
        private String value;

        public Builder integrationCode(String integrationCode){
            this.integrationCode = integrationCode;
            return this;
        }

        public Builder value(String value){
            this.value = value;
            return this;
        }

        public CustomField build(){
            return new CustomField(this);
        }

    }


}
