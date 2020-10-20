package com.merchantsafeunipay.sdk;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.http.HttpRequestMaker;
import com.merchantsafeunipay.sdk.http.async.HttpAsyncRequestMaker;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.ApiResponse;
import com.merchantsafeunipay.sdk.util.ResponseInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Consumer;

public class MsuApiClient {
    private Authentication defaultAuthentication;
    private String url = "https://test.merchantsafeunipay.com/msu/api/v2";
    private ObjectMapper mapper = new ObjectMapper();
    private boolean prettyPrintRequests = false;
    private Executor executor;

    private static final Set<String> MUST_MASK = new HashSet<>(Arrays.asList(Param.CARDPAN.name(), Param.CARDCVV.name(), Param.CARD_EXPIRY.name(),
            Param.CARDEXPIRY.name(), Param.MERCHANTPASSWORD.name(), Param.MERCHANTUSERPASSWORD.name()));

    private static final Logger LOGGER = LoggerFactory.getLogger(MsuApiClient.class);

    private MsuApiClient() {
        mapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
    }

    public static MsuApiClientBuilder builder() {
        return new MsuApiClientBuilder();
    }

    public <T extends ApiResponse> T doRequest(ApiRequest apiRequest) {
        authenticate(apiRequest);
        HttpRequestMaker httpRequestMaker = new HttpRequestMaker(url);
        long before = System.currentTimeMillis();
        String responseJSON = httpRequestMaker.send(apiRequest.getFormUrlEncodedData());
        T apiResponse = null;
        try {
            apiResponse = getApiResponse(apiRequest, responseJSON);
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

    public <T extends ApiResponse> void doRequestAsync(ApiRequest apiRequest, Consumer<T> callback) {
        CompletableFuture<T> requestFuture = doRequestAsync(apiRequest);
        requestFuture.thenAcceptAsync(callback);
    }

    public <T extends ApiResponse> CompletableFuture<T> doRequestAsync(ApiRequest apiRequest) {
        authenticate(apiRequest);
        long before = System.currentTimeMillis();
        Executor executorToUse = executor != null ? executor : ForkJoinPool.commonPool();
        HttpAsyncRequestMaker asyncRequestMaker = new HttpAsyncRequestMaker(url);
        return asyncRequestMaker
            .send(apiRequest.getFormUrlEncodedData(), executorToUse)
            .<T>thenApplyAsync((rawResponse) -> {
                try {
                   return getApiResponse(apiRequest, rawResponse);
                } catch (JsonProcessingException e) {
                    LOGGER.error("IO Error while making request to {}", this.url, e);
                    return null;
                }
            }, executorToUse)
            .thenApplyAsync((response) -> {
                try {
                    log(apiRequest, response, System.currentTimeMillis() - before);
                    return response;
                } catch (JsonProcessingException e) {
                    LOGGER.error("Couldn't generate log for request", e);
                    return null;
                }
            }, executorToUse);
    }

    public static class MsuApiClientBuilder {
        private Authentication defaultAuthentication;
        private String url = "https://test.merchantsafeunipay.com/msu/api/v2";
        private boolean prettyPrintRequests = false;
        private Executor executor;

        public MsuApiClientBuilder withDefaultAuthentication(Authentication defaultAuthentication) {
            this.defaultAuthentication = defaultAuthentication;
            return this;
        }

        public MsuApiClientBuilder withUrl(String url) {
            this.url = url;
            return this;
        }

        public MsuApiClientBuilder withPrettyPrintRequests(boolean prettyPrintRequests) {
            this.prettyPrintRequests = prettyPrintRequests;
            return this;
        }

        public MsuApiClientBuilder withExecutor(Executor executor) {
            this.executor = executor;
            return this;
        }

        public MsuApiClient build() {
            MsuApiClient client = new MsuApiClient();
            client.defaultAuthentication = this.defaultAuthentication;
            client.url = url;
            client.prettyPrintRequests = prettyPrintRequests;
            client.executor = executor;
            return client;
        }
    }

    @SuppressWarnings("unchecked")
    private <T extends ApiResponse> T getApiResponse(ApiRequest apiRequest, String responseJSON)
            throws JsonProcessingException {
        Class<?> responseClass = getResponseClass(apiRequest);
        T apiResponse;
        ObjectReader reader = mapper.readerFor(responseClass);
        apiResponse = (T) responseClass.cast(reader.readValue(responseJSON));
        apiResponse.setRawResponse(responseJSON);
        return apiResponse;
    }

    private Class<?> getResponseClass(ApiRequest apiRequest) {
        Class<?> responseClass = ApiResponse.class;
        if (apiRequest.getClass().isAnnotationPresent(ResponseInfo.class)) {
            final ResponseInfo responseInfo = apiRequest.getClass().getAnnotation(ResponseInfo.class);
            responseClass = responseInfo.responseClass();
        }
        return responseClass;
    }

    private void authenticate(ApiRequest apiRequest) {
        Authentication requestAuthentication = apiRequest.getAuthentication();
        // request authentication has priority
        if (requestAuthentication != null) {
            requestAuthentication.authenticate(apiRequest);
        } else {
            defaultAuthentication.authenticate(apiRequest);
            apiRequest.setAuthentication(defaultAuthentication); // for logging later
        }
    }

    public void log(ApiRequest request, ApiResponse response, long totalTimeMs) throws JsonProcessingException {
        String responseCode = response != null ? response.getResponseCode() : "N/A";
        String responseMsg = response != null ? response.getResponseMsg() : "N/A";
        String errorCode = response != null ? response.getErrorCode() : "N/A";
        String errorMsg = response != null ? response.getErrorMsg() : "N/A";
        String actionName = request.apiAction().name();
        String host = getHost();
        StringBuilder header = new StringBuilder(String.format("%s@%s -> responseCode: %s - %s (Request elapsed time: %d ms)",
                actionName, host, responseCode, responseMsg, totalTimeMs));
        if (!"00".equals(responseCode)) {
            header.append(String.format(", errorCode: %s, errorMsg: %s", errorCode, errorMsg));
        }
        String separator = this.prettyPrintRequests ? System.lineSeparator() : " ";
        StringBuilder sb = new StringBuilder(header)
                .append(separator)
                .append(this.prettyPrintRequests ? "----------------- Request/Response Details -----------------" : "")
                .append(separator)
                .append("- Authentication -> ")
                .append(request.getAuthentication())
                .append(separator)
                .append("- Request Body -> ")
                .append(separator);
        request.getFormUrlEncodedData().forEach((k, v) -> {
            if (v != null) {
                sb.append(this.prettyPrintRequests ? "\t" : " ")
                        .append(k)
                        .append(": ")
                        .append(MUST_MASK.contains(k) ? "********" : v);
                sb.append(this.prettyPrintRequests ? System.lineSeparator() : ", ");
            }
        });
        sb.append(System.lineSeparator());
        sb.append("- Response Body -> ");
        sb.append(separator);
        if (response == null) {
            sb.append("No Response! ");
        } else {
            sb.append(this.prettyPrintRequests ? mapper.writerWithDefaultPrettyPrinter().writeValueAsString(response) : getRawResponseTruncated(response));
        }
        sb.append(separator);
        sb.append(this.prettyPrintRequests ? "--------------------------------------------------------" : "");
        LOGGER.info(sb.toString());
    }

    private String getRawResponseTruncated(ApiResponse response) {
        String rawResponse = response.getRawResponse();
        int maxLength = 1024;
        return rawResponse.length() > maxLength ? rawResponse.substring(0, maxLength) + "...(TRUNCATED)": rawResponse;
    }

    private String getHost() {
        try {
            return new URL(this.url).getHost();
        } catch (MalformedURLException e) {
            LOGGER.error("Couldn't parse url {}", this.url);
            throw new RuntimeException(e);
        }
    }
}
