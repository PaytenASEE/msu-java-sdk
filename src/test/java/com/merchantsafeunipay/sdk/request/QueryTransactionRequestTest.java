package com.merchantsafeunipay.sdk.request;
import com.merchantsafeunipay.sdk.request.apiv2.query.QueryTransactionRequest;
import com.merchantsafeunipay.sdk.response.QueryTransactionResponse;
import org.junit.Assert;
import org.junit.Test;



public class QueryTransactionRequestTest extends BaseIntegrationTest {
    @Test
    public void queryTransactionWithEcryptedPan() {
        String encryptedPan = "UBDb8Mp9chk2SbFMnhW3m5YcIw3rXQHUP6yV6oEGTiC0jWaGdTQQ+aCb50Uo1bqg1xmxXLqTCIkdPJ0yPgrbY+R918u195S7RGWe/4ZB11iy8oEjccM9nyqGTvTWAeOc3yo0/GtxgU5LJzM00xKhXsiHv59UU4hO7TeAO9ucpm5qB4ecsi09QiLDq/xld0nDOBLLOZ3Wx66VLHX/Y5+VAn0r0FFBJaQcmEzxlvVuigqxRCs/48c4dvUoyRkdjs9dLhrDLHwCzOqDjuGM89DlQ5QvPuIlaQMDhTDv0CebpoBh/mDyptzo7OpF43bEdaccTWyZDKqFGH3Avb69XbUpDg==";
        QueryTransactionRequest queryTransactionRequest = QueryTransactionRequest.builder()
                .withEncryptedPan(encryptedPan)
                .build();

        QueryTransactionResponse queryTransactionResponse = client.doRequest(queryTransactionRequest);
        Assert.assertTrue(queryTransactionResponse.getResponseMsg().contains("Approved"));

    }
}

