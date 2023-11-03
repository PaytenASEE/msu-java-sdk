package com.merchantsafeunipay.sdk.request;
import com.merchantsafeunipay.sdk.request.apiv2.recurringplan.RecurringPlanAddRequest;
import com.merchantsafeunipay.sdk.request.enumerated.Currency;
import com.merchantsafeunipay.sdk.request.enumerated.Occurrence;
import com.merchantsafeunipay.sdk.response.RecurringPlanResponse;
import com.merchantsafeunipay.sdk.util.StringUtils;
import org.junit.Test;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class RecurringPlanAddRequestTest extends BaseIntegrationTest {
    @Test
    public void recurringPlanAdd() throws Exception {
        DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        RecurringPlanAddRequest recurringPlanAddRequest = RecurringPlanAddRequest
                .builder()
                .withCustomer("2")
                .withCustomerEmail("skurtulus@yopmail.com")
                .withCustomerPhone("05531907302")
                .withTckn("13286288390")
                .withRecurringPlanCode("reg1")
                .withFirstamount(new BigDecimal("100"))
                .withRecurringAmount(new BigDecimal("100"))
                .withRecurrenceCount(new BigDecimal("10"))
                .withFrequency("1")
                .withOccurrence(Occurrence.MONTH)
                .withStartDate(StringUtils.getDateAfterAddedInDays(formatter, 1))
                .withCurrency(Currency.TRY)
                .withNotificationChannels("SMS")
                .withPaymentSystem("AKBANK")
                .build();
        RecurringPlanResponse recurringPlanResponse = client.doRequest(recurringPlanAddRequest);
    }
}