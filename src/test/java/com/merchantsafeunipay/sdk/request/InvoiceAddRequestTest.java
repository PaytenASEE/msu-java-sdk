package com.merchantsafeunipay.sdk.request;

import com.merchantsafeunipay.sdk.request.apiv2.invoice.InvoiceAddRequest;
import com.merchantsafeunipay.sdk.request.enumerated.Currency;
import com.merchantsafeunipay.sdk.response.InvoiceAddResponse;
import com.merchantsafeunipay.sdk.util.StringUtils;
import org.junit.Ignore;
import org.junit.Test;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

/**
 * Created by sercan.sensulun on 12/11/2020
 */
public class InvoiceAddRequestTest extends BaseIntegrationTest{

    @Test
    public void testInvoiceAddWithMerchantOrderIdAndExtra() throws Exception {
        DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Map<String, String> extra = new HashMap<>();
        extra.put("Preauth","YES");
        InvoiceAddRequest invoiceAddRequest = InvoiceAddRequest
                .builder()
                .withMerchantOrderId(StringUtils.generateString(10))
                .withExtra(extra)
                .withName(StringUtils.generateString(10))
                .withIssueDate(StringUtils.getDateAfterAddedInDays(formatter, 0))
                .withDueDate(StringUtils.getDateAfterAddedInDays(formatter, 7))
                .withAmount(new BigDecimal("101.0"))
                .withOriginalAmount(new BigDecimal("100.0"))
                .withCurrency(Currency.TRY)
                .withDealerCode("auth01")
                .build();
        InvoiceAddResponse invoiceAddResponse = client.doRequest(invoiceAddRequest);
        assertThat(invoiceAddResponse, is(notNullValue()));
        assertThat(invoiceAddResponse.isApproved(), is(Boolean.TRUE));
    }

    @Test
    public void testInvoiceAddWithInvoiceId() throws Exception {
        DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        InvoiceAddRequest invoiceAddRequest = InvoiceAddRequest
                .builder()
                .withInvoiceId(StringUtils.generateString(10))
                .withName(StringUtils.generateString(10))
                .withIssueDate(StringUtils.getDateAfterAddedInDays(formatter, 0))
                .withDueDate(StringUtils.getDateAfterAddedInDays(formatter, 7))
                .withAmount(new BigDecimal("101.0"))
                .withOriginalAmount(new BigDecimal("100.0"))
                .withCurrency(Currency.TRY)
                .withDealerCode("auth01")
                .build();
        InvoiceAddResponse invoiceAddResponse = client.doRequest(invoiceAddRequest);
        assertThat(invoiceAddResponse, is(notNullValue()));
        assertThat(invoiceAddResponse.isApproved(), is(Boolean.TRUE));
    }
}
