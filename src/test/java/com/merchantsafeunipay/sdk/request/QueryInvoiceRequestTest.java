package com.merchantsafeunipay.sdk.request;

import com.merchantsafeunipay.sdk.request.apiv2.invoice.InvoiceAddRequest;
import com.merchantsafeunipay.sdk.request.apiv2.query.QueryInvoiceRequest;
import com.merchantsafeunipay.sdk.request.enumerated.Currency;
import com.merchantsafeunipay.sdk.request.enumerated.InvoiceType;
import com.merchantsafeunipay.sdk.response.InvoiceAddResponse;
import com.merchantsafeunipay.sdk.response.QueryInvoiceResponse;
import com.merchantsafeunipay.sdk.response.model.Invoice;
import com.merchantsafeunipay.sdk.util.StringUtils;
import org.junit.Ignore;
import org.junit.Test;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

/**
 * Created by sercan.sensulun on 23/11/2020
 */
public class QueryInvoiceRequestTest extends BaseIntegrationTest{

    @Test
    @Ignore
    public void queryInvoiceWithInvoiceTypeAsPreauthTest() throws Exception {
        DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Map<String, String> extra = new HashMap<>();
        extra.put("Preauth","YES");
        String merchantOrderId = StringUtils.generateString(10);
        String name = StringUtils.generateString(10);
        InvoiceAddRequest invoiceAddRequest = InvoiceAddRequest
                .builder()
                .withMerchantOrderId(merchantOrderId)
                .withExtra(extra)
                .withName(name)
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

        QueryInvoiceRequest queryInvoiceRequest = QueryInvoiceRequest
                .builder()
                .withDealerCode("auth01")
                .withInvoiceType(InvoiceType.PREAUTH)
                .build();
        QueryInvoiceResponse queryInvoiceResponse = client.doRequest(queryInvoiceRequest);
        assertThat(queryInvoiceResponse, is(notNullValue()));
        assertThat(queryInvoiceResponse.isApproved(), is(Boolean.TRUE));
        Stream<Invoice> queriedInvoice = queryInvoiceResponse.getInvoices()
                .stream()
                .filter(x -> x.getMerchantOrderId().equals(merchantOrderId)
                        && x.isPreauth() && x.getName().equals(name));
        long countOfQueriedInvoices = queriedInvoice.count();
        assertThat(countOfQueriedInvoices, is(1L));
        assertThat(queriedInvoice.findAny().isPresent(), is(Boolean.TRUE));
        Invoice foundInvoice = queriedInvoice.findAny().get();
        assertThat(foundInvoice.getName(), is(name));
        assertThat(foundInvoice.getMerchantOrderId(), is(merchantOrderId));
        assertThat(foundInvoice.isPreauth(), is(Boolean.TRUE));
    }

    @Test
    @Ignore
    public void queryInvoiceWithInvoiceTypeAsSaleTest() throws Exception {
        DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String invoiceId = StringUtils.generateString(10);
        String name = StringUtils.generateString(10);
        InvoiceAddRequest invoiceAddRequest = InvoiceAddRequest
                .builder()
                .withInvoiceId(invoiceId)
                .withName(name)
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

        QueryInvoiceRequest queryInvoiceRequest = QueryInvoiceRequest
                .builder()
                .withDealerCode("auth01")
                .withInvoiceType(InvoiceType.SALE)
                .build();
        QueryInvoiceResponse queryInvoiceResponse = client.doRequest(queryInvoiceRequest);
        assertThat(queryInvoiceResponse, is(notNullValue()));
        assertThat(queryInvoiceResponse.isApproved(), is(Boolean.TRUE));
        Stream<Invoice> queriedInvoice = queryInvoiceResponse.getInvoices()
                .stream()
                .filter(x -> !x.isPreauth()
                        && x.getInvoiceId().equals(invoiceId) && x.getName().equals(name));
        long countOfQueriedInvoices = queriedInvoice.count();
        assertThat(countOfQueriedInvoices, is(1L));
        assertThat(queriedInvoice.findAny().isPresent(), is(Boolean.TRUE));
        Invoice foundInvoice = queriedInvoice.findAny().get();
        assertThat(foundInvoice, is(notNullValue()));
        assertThat(foundInvoice.getName(), is(name));
        assertThat(foundInvoice.getInvoiceId(), is(invoiceId));
        assertThat(foundInvoice.isPreauth(), is(Boolean.FALSE));
    }
}
