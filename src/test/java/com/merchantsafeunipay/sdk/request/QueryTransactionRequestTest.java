package com.merchantsafeunipay.sdk.request;
import com.merchantsafeunipay.sdk.request.apiv2.query.QueryTransactionRequest;
import com.merchantsafeunipay.sdk.response.QueryTransactionResponse;
import org.junit.Assert;
import org.junit.Test;



public class QueryTransactionRequestTest extends BaseIntegrationTest {
    @Test
    public void queryTransactionWithEcryptedPan() {
        String encryptedPan = "LMrwvn+0SabX/YMR1zPAMKqj4HM1Y4LK95pQ4QnR6+7PMFL3dnN8AThlTZczoOAe0k6BxiQ2aVHzdfGJSA8UFicE/6bAuCVDeFg4twtuB9FtZ1xk7xpal1qNVxCp+KaxvP4fBeXJf8fImDjP/U/watiBEwUG31qToPUM365HG6uoaz1tTucLdr3aZqJHhUJ+zO1cCC80QzolppT7ZGXDCTXMFMXYhQo+pyNiIZWjND4MN1qOPvdzJADcKF8KMNf+4ich7nzd8EZpA3s2dYSlcMmD/o1uwy0Q3rdRdUVVCa9Su/bcV5WzUTd7DJlRAsRQ6ujJ3wfqOXJ+UmPbW0Ugsw==";
        String basicQueryValue = "YES";
        QueryTransactionRequest queryTransactionRequest = QueryTransactionRequest.builder()
                .withEncryptedPan(encryptedPan)
                .withBasicQuery(basicQueryValue)
                .build();

        QueryTransactionResponse queryTransactionResponse = client.doRequest(queryTransactionRequest);
        Assert.assertTrue(queryTransactionResponse.getResponseMsg().contains("Approved"));

    }
}

