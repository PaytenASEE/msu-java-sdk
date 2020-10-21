package com.merchantsafeunipay.sdk.request.base;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.util.StringUtils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class ApiRequest<R> {
    protected Authentication authentication;
    protected Map<String, String> payload = new HashMap<>();
    protected ObjectMapper objectMapper = new ObjectMapper();
    protected R response;

    public abstract Class<R> responseClass();

    public abstract void applyRequestParams();

    public abstract ApiAction apiAction();

    public Map<String, String> getFormUrlEncodedData() {
        payload.put(Param.ACTION.name(), apiAction().name());
        this.applyRequestParams();
        return payload;
    }

    public Authentication getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }

    protected void addToPayload(Param param, Object paramValue) {
        if (paramValue == null) {
            return;
        }
        if (paramValue instanceof Boolean) {
            String booleanValue = paramValue != null && (Boolean) paramValue ? "YES" : "NO";
            payload.put(param.name(), booleanValue);
        } else if (paramValue instanceof Enum<?>) {
            payload.put(param.name(), ((Enum<?>) paramValue).name());
        } else if (paramValue instanceof Collection<?>) {
            if (((Collection<?>) paramValue).isEmpty()) {
                return;
            }
            String asJsonStringUrlEncoded = this.serializeAndUrlEncode(paramValue);
            payload.put(param.name(), asJsonStringUrlEncoded);
        } else if (paramValue instanceof Map<?, ?>) {
            if (((Map<?, ?>) paramValue).isEmpty()) {
                return;
            }
            String asJsonStringUrlEncoded = this.serializeAndUrlEncode(paramValue);
            payload.put(param.name(), asJsonStringUrlEncoded);
        } else if (paramValue instanceof String) {
            if (StringUtils.isBlank((String) paramValue)) {
                return;
            }
            payload.put(param.name(), paramValue.toString());
        } else if (paramValue instanceof Number) {
            payload.put(param.name(), paramValue.toString());
        }
    }

    private String serializeAndUrlEncode(Object paramValue) {
        ObjectWriter objectWriter = objectMapper.writerFor(paramValue.getClass());
        String asJsonStringUrlEncoded = "";
        try {
            String asJsonString = objectWriter.writeValueAsString(paramValue);
            asJsonStringUrlEncoded = URLEncoder.encode(asJsonString, "UTF-8");
        } catch (JsonProcessingException | UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        return asJsonStringUrlEncoded;
    }

    public R getResponse() {
        return response;
    }

    public void setResponse(R response) {
        this.response = response;
    }

}
