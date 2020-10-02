package com.github.msu.sdk.response;

import com.github.msu.sdk.request.enumerated.InputType;
import com.github.msu.sdk.request.enumerated.Status;
import com.github.msu.sdk.response.model.CustomFieldAvailability;
import com.github.msu.sdk.response.model.CustomFieldGroup;

import java.util.HashSet;
import java.util.Set;

public class BaseCustomFieldResponse extends ApiResponse {
    private String code;
    private String integrationCode;
    private String name;
    private String header;
    private String definition;
    private Status status;
    private InputType type;
    private Set<CustomFieldAvailability> availabilities = new HashSet<>();
    private Set<CustomFieldGroup> groups = new HashSet<>();

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIntegrationCode() {
        return integrationCode;
    }

    public void setIntegrationCode(String integrationCode) {
        this.integrationCode = integrationCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public InputType getType() {
        return type;
    }

    public void setType(InputType type) {
        this.type = type;
    }

    public Set<CustomFieldAvailability> getAvailabilities() {
        return availabilities;
    }

    public void setAvailabilities(Set<CustomFieldAvailability> availabilities) {
        this.availabilities = availabilities;
    }

    public Set<CustomFieldGroup> getGroups() {
        return groups;
    }

    public void setGroups(Set<CustomFieldGroup> groups) {
        this.groups = groups;
    }
}
