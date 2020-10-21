package com.merchantsafeunipay.sdk.request;

import com.merchantsafeunipay.sdk.request.apiv2.financial.*;
import com.merchantsafeunipay.sdk.request.enumerated.Currency;
import com.merchantsafeunipay.sdk.response.*;
import org.junit.Ignore;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.UUID;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class FinancialRequestsTest extends BaseIntegrationTest {

    public static final String CARD_PAN = "4155650100416111";
    public static final String CARD_EXPIRY = "02.2025";
    public static final String CARD_CVV = "123";
    public static final String QNB_FINANSBANK = "QNB Finansbank";

    @Test
    public void testSaleRequest() {
        SaleRequest saleRequest = buildSaleRequest();
        SaleResponse apiResponse = client.doRequest(saleRequest);
        assertThat(apiResponse, is(notNullValue()));
    }

    @Test
    public void testPreauthRequest() {
        PreauthRequest preauthRequest = buildPreauthRequest();
        PreauthResponse apiResponse = client.doRequest(preauthRequest);
        assertThat(apiResponse, is(notNullValue()));
    }

    @Test
    public void testPostauthRequest() {
        PreauthRequest preauthRequest = buildPreauthRequest();
        PreauthResponse preauthResponse = client.doRequest(preauthRequest);

        if (preauthResponse.isApproved()) {
            PostauthRequest postauthRequest = PostauthRequest
                    .builder()
                    .withPgTranId(preauthResponse.getPgTranId())
                    .build();
            PostauthResponse postauthRespone = client.doRequest(postauthRequest);
            assertThat(postauthRespone.isApproved(), is(true));
        }
    }

    @Test
    public void testVoidRequest() {
        PreauthRequest preauthRequest = buildPreauthRequest();
        PreauthResponse preauthResponse = client.doRequest(preauthRequest);

        if (preauthResponse.isApproved()) {
            VoidRequest voidRequest = VoidRequest
                    .builder()
                    .withPgTranId(preauthResponse.getPgTranId())
                    .build();
            VoidResponse voidResponse = client.doRequest(voidRequest);
            assertThat(voidResponse.isApproved(), is(true));
            ;
        }
    }

    @Test
    @Ignore // TODO find a valid card
    public void testRefundRequest() {
        SaleRequest saleRequest = buildSaleRequest();
        SaleResponse saleResponse = client.doRequest(saleRequest);

        if (saleResponse.isApproved()) {
            RefundRequest refundRequest = RefundRequest
                    .builder()
                    .withPgTranId(saleResponse.getPgTranId())
                    .build();
            RefundResponse refundResponse = client.doRequest(refundRequest);
            assertThat(refundResponse.isApproved(), is(true));
            ;
        }
    }

    private SaleRequest buildSaleRequest() {
        return SaleRequest.builder()
                .withNameOnCard("Filan Fisteku")
                .withAmount(new BigDecimal("240.55"))
                .withCurrency(Currency.TRY)
                .withCustomer("merchant-customer-id")
                .withMerchantPaymentId(UUID.randomUUID().toString())
                .withCardPan(CARD_PAN)
                .withCardExpiry(CARD_EXPIRY)
                .withCardCvv(CARD_CVV)
                .withPaymentSystem(QNB_FINANSBANK)
                .build();
    }

    private PreauthRequest buildPreauthRequest() {
        return PreauthRequest.builder()
                .withNameOnCard("Filan Fisteku")
                .withAmount(new BigDecimal("240.55"))
                .withCurrency(Currency.TRY)
                .withCustomer("merchant-customer-id")
                .withMerchantPaymentId(UUID.randomUUID().toString())
                .withCardPan("4155650100416111")
                .withCardExpiry("02.2025")
                .withCardCvv("123")
                .withPaymentSystem("QNB Finansbank")
                .build();
    }
}
