package com.github.msu.sdk.request.apiv2.recurringplan;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.RecurringPlanCardAddResponse.class
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
        addToPayload(com.github.msu.sdk.request.enumerated.Param.RECURRINGPLANCODE, this.recurringPlanCode);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CARDPAN, this.cardPan);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CARDEXPIRY, this.cardExpiry);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.NAMEONCARD, this.nameOnCard);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CARDTOKEN, this.cardToken);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CARDSAVENAME, this.cardSaveName);
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
