package com.merchantsafeunipay.sdk.response;

import com.merchantsafeunipay.sdk.response.model.CustomFieldGroup;

public class BaseCustomFieldGroupResponse extends ApiResponse {
    private CustomFieldGroup subject;

    public CustomFieldGroup getSubject() {
        return subject;
    }

    public void setSubject(CustomFieldGroup subject) {
        this.subject = subject;
    }
}
