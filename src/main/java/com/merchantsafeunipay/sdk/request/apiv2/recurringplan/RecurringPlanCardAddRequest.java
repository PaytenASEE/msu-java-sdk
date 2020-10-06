package com.merchantsafeunipay.sdk.request.apiv2.recurringplan;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.util.ResponseInfo;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.RecurringPlanCardAddResponse;

@ResponseInfo(
        responseClass = RecurringPlanCardAddResponse.class
)
public class RecurringPlanCardAddRequest extends ApiRequest {
    private String recurringPlanCode;

    private String cardPan;

    private String cardExpiry;

    private String nameOnCard;

    private String cardToken;

    private String cardSaveName;

    private RecurringPlanCardAddRequest() {
    }

    public static RecurringPlanCardAddRequestBuilder builder() {
        return new RecurringPlanCardAddRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.RECURRINGPLANCODE, this.recurringPlanCode);
        addToPayload(Param.CARDPAN, this.cardPan);
        addToPayload(Param.CARDEXPIRY, this.cardExpiry);
        addToPayload(Param.NAMEONCARD, this.nameOnCard);
        addToPayload(Param.CARDTOKEN, this.cardToken);
        addToPayload(Param.CARDSAVENAME, this.cardSaveName);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.RECURRINGPLANCARDADD;
    }

    public static final class RecurringPlanCardAddRequestBuilder {
        private String recurringPlanCode;

        private String cardPan;

        private String cardExpiry;

        private String nameOnCard;

        private String cardToken;

        private String cardSaveName;

        private Authentication authentication;

        public RecurringPlanCardAddRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public RecurringPlanCardAddRequestBuilder withRecurringPlanCode(String recurringPlanCode) {
            this.recurringPlanCode = recurringPlanCode;
            return this;
        }

        public RecurringPlanCardAddRequestBuilder withCardPan(String cardPan) {
            this.cardPan = cardPan;
            return this;
        }

        public RecurringPlanCardAddRequestBuilder withCardExpiry(String cardExpiry) {
            this.cardExpiry = cardExpiry;
            return this;
        }

        public RecurringPlanCardAddRequestBuilder withNameOnCard(String nameOnCard) {
            this.nameOnCard = nameOnCard;
            return this;
        }

        public RecurringPlanCardAddRequestBuilder withCardToken(String cardToken) {
            this.cardToken = cardToken;
            return this;
        }

        public RecurringPlanCardAddRequestBuilder withCardSaveName(String cardSaveName) {
            this.cardSaveName = cardSaveName;
            return this;
        }

        public RecurringPlanCardAddRequest build() {
            RecurringPlanCardAddRequest request = new RecurringPlanCardAddRequest();
            request.authentication = this.authentication;
            request.recurringPlanCode = this.recurringPlanCode;
            request.cardPan = this.cardPan;
            request.cardExpiry = this.cardExpiry;
            request.nameOnCard = this.nameOnCard;
            request.cardToken = this.cardToken;
            request.cardSaveName = this.cardSaveName;
            return request;
        }
    }
}
