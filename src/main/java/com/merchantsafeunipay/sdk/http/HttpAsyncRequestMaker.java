package com.merchantsafeunipay.sdk.http;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class HttpAsyncRequestMaker {

    private HttpRequestMaker httpRequestMaker;

    public HttpAsyncRequestMaker(String url) {
        this.httpRequestMaker = new HttpRequestMaker(url);
    }

    public CompletableFuture<String> send(Map<String, String> requestBody) {
        return CompletableFuture.supplyAsync(() -> httpRequestMaker.send(requestBody));
    }
}
