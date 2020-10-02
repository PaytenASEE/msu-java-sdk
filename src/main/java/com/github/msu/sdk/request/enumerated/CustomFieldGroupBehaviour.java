package com.github.msu.sdk.request.enumerated;

public enum CustomFieldGroupBehaviour {
    TAB;

    public static CustomFieldGroupBehaviour fromString(String behaviour) {
        for (CustomFieldGroupBehaviour customFieldGroupBehaviour : values()) {
            if (customFieldGroupBehaviour.name().equalsIgnoreCase(behaviour)) {
                return customFieldGroupBehaviour;
            }
        }
        return null;
    }
}