package com.github.msu.sdk.response;

import com.github.msu.sdk.response.model.ReconciliationSetting;

import java.util.ArrayList;
import java.util.List;


public class QueryReconciliationSchemaResponse extends ApiResponse {
    private String name;
    private List<ReconciliationSetting> settings = new ArrayList<>();
    private String activationDate;
    private String endDate;

    public QueryReconciliationSchemaResponse() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ReconciliationSetting> getSettings() {
        return settings;
    }

    public void setSettings(List<ReconciliationSetting> settings) {
        this.settings = settings;
    }

    public String getActivationDate() {
        return activationDate;
    }

    public void setActivationDate(String activationDate) {
        this.activationDate = activationDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "QueryReconciliationSchemaAsvo [name=" + name + ", settings=" + settings + "]";
    }
}
