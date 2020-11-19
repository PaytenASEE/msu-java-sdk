package com.merchantsafeunipay.sdk.request;

import com.merchantsafeunipay.sdk.request.apiv2.invoice.InvoiceAddRequest;
import com.merchantsafeunipay.sdk.request.apiv2.invoice.InvoiceEditRequest;
import com.merchantsafeunipay.sdk.request.enumerated.Currency;
import com.merchantsafeunipay.sdk.response.InvoiceAddResponse;
import com.merchantsafeunipay.sdk.response.InvoiceEditResponse;
import com.merchantsafeunipay.sdk.util.StringUtils;
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
 * Created by sercan.sensulun on 17/11/2020
 */
public class InvoiceEditRequestTest extends BaseIntegrationTest{

    @Test
    public void editInvoiceWithMerchantOrderIdTest() throws Exception {
        DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String invoiceId = StringUtils.generateString(10);
        InvoiceAddRequest invoiceAddRequest = InvoiceAddRequest
                .builder()
                .withInvoiceId(invoiceId)
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

        String merchantOrderId = StringUtils.generateString(10);
        Map<String, String> extra = new HashMap<>();
        extra.put("Preauth ","YES");
        InvoiceEditRequest invoiceEditRequest = InvoiceEditRequest
                .builder()
                .withInvoiceId(invoiceId)
                .withMerchantOrderId(merchantOrderId)
                .withExtra(extra)
                .withDealerCode("auth01")
                .build();
        InvoiceEditResponse invoiceEditResponse = client.doRequest(invoiceEditRequest);
        assertThat(invoiceEditResponse, is(notNullValue()));
        assertThat(invoiceEditResponse.isApproved(), is(Boolean.TRUE));
    }

    @Test
    public void editInvoiceWithInvoiceIdAndPreauthNo() throws Exception {
        DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Map<String, String> extra = new HashMap<>();
        extra.put("Preauth","YES");
        String merchantOrderId = StringUtils.generateString(10);
        InvoiceAddRequest invoiceAddRequest = InvoiceAddRequest
                .builder()
                .withMerchantOrderId(merchantOrderId)
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

        Map<String, String> extraEdit = new HashMap<>();
        extraEdit.put("Preauth ","NO");
        String invoiceId = StringUtils.generateString(10);
        InvoiceEditRequest invoiceEditRequest = InvoiceEditRequest
                .builder()
                .withInvoiceId(invoiceId)
                .withMerchantOrderId(merchantOrderId)
                .withExtra(extraEdit)
                .withDealerCode("auth01")
                .build();
        InvoiceEditResponse invoiceEditResponse = client.doRequest(invoiceEditRequest);
        assertThat(invoiceEditResponse, is(notNullValue()));
        assertThat(invoiceEditResponse.isApproved(), is(Boolean.TRUE));
    }
}
