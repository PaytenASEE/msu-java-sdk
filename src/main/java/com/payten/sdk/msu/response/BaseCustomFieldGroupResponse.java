package com.payten.sdk.msu.response;

import com.payten.sdk.msu.response.model.CustomFieldGroup;

public class BaseCustomFieldGroupResponse extends ApiResponse {
    private CustomFieldGroup subject;

    public CustomFieldGroup getSubject() {
        return subject;
    }

    public void setSubject(CustomFieldGroup subject) {
        this.subject = subject;
    }
}
