package com.payten.msu.sdk.response;

import com.payten.msu.sdk.response.model.CustomFieldGroup;

public class BaseCustomFieldGroupResponse extends ApiResponse {
    private CustomFieldGroup subject;

    public CustomFieldGroup getSubject() {
        return subject;
    }

    public void setSubject(CustomFieldGroup subject) {
        this.subject = subject;
    }
}
