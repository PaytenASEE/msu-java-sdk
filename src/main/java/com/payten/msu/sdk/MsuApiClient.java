package com.payten.msu.sdk;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.http.HttpRequestMaker;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.ApiResponse;
import com.payten.msu.sdk.util.ResponseInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MsuApiClient {
    private Authentication defaultAuthentication;
    private String url = "https://neon-app.asseco-see.com.tr/msu/api/v2";
    private ObjectMapper mapper = new ObjectMapper();
    private static final Set<String> MUST_MASK = new HashSet<>(Arrays.asList(Param.CARDPAN.name(), Param.CARDCVV.name(), Param.CARD_EXPIRY.name(),
            Param.CARDEXPIRY.name(), Param.MERCHANTPASSWORD.name(), Param.MERCHANTUSERPASSWORD.name()));

    private static final Logger LOGGER = LoggerFactory.getLogger(MsuApiClient.class);

    private MsuApiClient() {
        mapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
    }

    public static MsuApiClientBuilder builder() {
        return new MsuApiClientBuilder();
    }

    @SuppressWarnings("unchecked")
    public <T extends ApiResponse> T doRequest(ApiRequest apiRequest) {
        Authentication requestAuthentication = apiRequest.getAuthentication();
        // request authentication has priority
        if (requestAuthentication != null) {
            requestAuthentication.authenticate(apiRequest);
        } else {
            defaultAuthentication.authenticate(apiRequest);
            apiRequest.setAuthentication(defaultAuthentication); // for logging later
        }
        Class<?> responseClass = ApiResponse.class;
        if (apiRequest.getClass().isAnnotationPresent(ResponseInfo.class)) {
            final ResponseInfo responseInfo = apiRequest.getClass().getAnnotation(ResponseInfo.class);
            responseClass = responseInfo.responseClass();
        }
        ObjectReader reader = mapper.readerFor(responseClass);
        HttpRequestMaker httpRequestMaker = new HttpRequestMaker(url);
        long before = System.currentTimeMillis();
        String responseJSON = httpRequestMaker.send(apiRequest.getFormUrlEncodedData());
        T apiResponse = null;
        try {
            apiResponse = (T) responseClass.cast(reader.readValue(responseJSON));
            // apiResponse.setRawResponse(responseJSON);
            return apiResponse;
        } catch (IOException e) {
            LOGGER.error("IO Error while making request to {}", this.url, e);
            return null;
        } finally {
            try {
                log(apiRequest, apiResponse, System.currentTimeMillis() - before);
            } catch (JsonProcessingException e) {
                LOGGER.error("Couldn't generate log for request", e);
            }
        }
    }

    public static class MsuApiClientBuilder {
        private Authentication defaultAuthentication;
        private String url = "https://neon-app.asseco-see.com.tr/msu/api/v2";

        public MsuApiClientBuilder withDefaultAuthentication(Authentication defaultAuthentication) {
            this.defaultAuthentication = defaultAuthentication;
            return this;
        }

        public MsuApiClientBuilder withUrl(String url) {
            this.url = url;
            return this;
        }

        public MsuApiClient build() {
            MsuApiClient client = new MsuApiClient();
            client.defaultAuthentication = this.defaultAuthentication;
            client.url = url;
            return client;
        }
    }

    public void log(ApiRequest request, ApiResponse response, long totalTimeMs) throws JsonProcessingException {
        String responseCode = response != null ? response.getResponseCode() : "N/A";
        String errorCode = response!= null ? response.getErrorCode() : "N/A";
        String errorMsg = response != null ? response.getErrorMsg() : "N/A";
        String header = String.format("%s -> responseCode: %s, errorCode: %s, errorMsg: %s(Request elapsed time: %d ms)",
                request.apiAction().name(), responseCode, errorCode, errorMsg, totalTimeMs);
        StringBuilder sb = new StringBuilder(header)
                .append(System.lineSeparator())
                .append("----------------- Request/Response Details -----------------")
                .append(System.lineSeparator())
                .append("- Authentication: ")
                .append(request.getAuthentication())
                .append(System.lineSeparator())
                .append("- Request Body:")
                .append(System.lineSeparator());
        request.getFormUrlEncodedData().forEach((k, v) -> {
            if (v != null) {
                sb.append("\t").append(k).append(": ").append(MUST_MASK.contains(k) ? "********" : v);
                sb.append(System.lineSeparator());
            }
        });
        sb.append(System.lineSeparator());
        sb.append("- Response Body:");
        sb.append(System.lineSeparator());
        sb.append(response == null ? "No Response!" : mapper.writerWithDefaultPrettyPrinter().writeValueAsString(response));
        sb.append(System.lineSeparator());
        sb.append("--------------------------------------------------------");
        LOGGER.info(sb.toString());
    }
}
