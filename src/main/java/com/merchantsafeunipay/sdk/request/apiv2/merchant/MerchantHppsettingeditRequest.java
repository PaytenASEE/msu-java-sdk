package com.merchantsafeunipay.sdk.request.apiv2.merchant;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Font;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.request.enumerated.YesNo;
import com.merchantsafeunipay.sdk.response.MerchantHppSettingEditResponse;
import com.merchantsafeunipay.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = MerchantHppSettingEditResponse.class
)
public class MerchantHppsettingeditRequest extends ApiRequest {
    private String leftlogo;

    private String rightlogo;

    private String backgroundcolor;

    private String bordercolor;

    private String headercolor;

    private String buttoncolor;

    private Font font;

    private YesNo showssl;

    private YesNo showvisa;

    private YesNo showmc;

    private YesNo showamex;

    private YesNo showjcb;

    private YesNo showtroy;

    private YesNo showdiners;

    private YesNo showdinacard;

    private MerchantHppsettingeditRequest() {
    }

    public static MerchantHppsettingeditRequestBuilder builder() {
        return new MerchantHppsettingeditRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.LEFTLOGO, this.leftlogo);
        addToPayload(Param.RIGHTLOGO, this.rightlogo);
        addToPayload(Param.BACKGROUNDCOLOR, this.backgroundcolor);
        addToPayload(Param.BORDERCOLOR, this.bordercolor);
        addToPayload(Param.HEADERCOLOR, this.headercolor);
        addToPayload(Param.BUTTONCOLOR, this.buttoncolor);
        addToPayload(Param.FONT, this.font);
        addToPayload(Param.SHOWSSL, this.showssl);
        addToPayload(Param.SHOWVISA, this.showvisa);
        addToPayload(Param.SHOWMC, this.showmc);
        addToPayload(Param.SHOWAMEX, this.showamex);
        addToPayload(Param.SHOWJCB, this.showjcb);
        addToPayload(Param.SHOWTROY, this.showtroy);
        addToPayload(Param.SHOWDINERS, this.showdiners);
        addToPayload(Param.SHOWDINACARD, this.showdinacard);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.MERCHANTHPPSETTINGEDIT;
    }

    public static final class MerchantHppsettingeditRequestBuilder {
        private String leftlogo;

        private String rightlogo;

        private String backgroundcolor;

        private String bordercolor;

        private String headercolor;

        private String buttoncolor;

        private Font font;

        private YesNo showssl;

        private YesNo showvisa;

        private YesNo showmc;

        private YesNo showamex;

        private YesNo showjcb;

        private YesNo showtroy;

        private YesNo showdiners;

        private YesNo showdinacard;

        private Authentication authentication;

        public MerchantHppsettingeditRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public MerchantHppsettingeditRequestBuilder withLeftlogo(String leftlogo) {
            this.leftlogo = leftlogo;
            return this;
        }

        public MerchantHppsettingeditRequestBuilder withRightlogo(String rightlogo) {
            this.rightlogo = rightlogo;
            return this;
        }

        public MerchantHppsettingeditRequestBuilder withBackgroundcolor(String backgroundcolor) {
            this.backgroundcolor = backgroundcolor;
            return this;
        }

        public MerchantHppsettingeditRequestBuilder withBordercolor(String bordercolor) {
            this.bordercolor = bordercolor;
            return this;
        }

        public MerchantHppsettingeditRequestBuilder withHeadercolor(String headercolor) {
            this.headercolor = headercolor;
            return this;
        }

        public MerchantHppsettingeditRequestBuilder withButtoncolor(String buttoncolor) {
            this.buttoncolor = buttoncolor;
            return this;
        }

        public MerchantHppsettingeditRequestBuilder withFont(Font font) {
            this.font = font;
            return this;
        }

        public MerchantHppsettingeditRequestBuilder withShowssl(YesNo showssl) {
            this.showssl = showssl;
            return this;
        }

        public MerchantHppsettingeditRequestBuilder withShowvisa(YesNo showvisa) {
            this.showvisa = showvisa;
            return this;
        }

        public MerchantHppsettingeditRequestBuilder withShowmc(YesNo showmc) {
            this.showmc = showmc;
            return this;
        }

        public MerchantHppsettingeditRequestBuilder withShowamex(YesNo showamex) {
            this.showamex = showamex;
            return this;
        }

        public MerchantHppsettingeditRequestBuilder withShowjcb(YesNo showjcb) {
            this.showjcb = showjcb;
            return this;
        }

        public MerchantHppsettingeditRequestBuilder withShowtroy(YesNo showtroy) {
            this.showtroy = showtroy;
            return this;
        }

        public MerchantHppsettingeditRequestBuilder withShowdiners(YesNo showdiners) {
            this.showdiners = showdiners;
            return this;
        }

        public MerchantHppsettingeditRequestBuilder withShowdinacard(YesNo showdinacard) {
            this.showdinacard = showdinacard;
            return this;
        }

        public MerchantHppsettingeditRequest build() {
            MerchantHppsettingeditRequest request = new MerchantHppsettingeditRequest();
            request.authentication = this.authentication;
            request.leftlogo = this.leftlogo;
            request.rightlogo = this.rightlogo;
            request.backgroundcolor = this.backgroundcolor;
            request.bordercolor = this.bordercolor;
            request.headercolor = this.headercolor;
            request.buttoncolor = this.buttoncolor;
            request.font = this.font;
            request.showssl = this.showssl;
            request.showvisa = this.showvisa;
            request.showmc = this.showmc;
            request.showamex = this.showamex;
            request.showjcb = this.showjcb;
            request.showtroy = this.showtroy;
            request.showdiners = this.showdiners;
            request.showdinacard = this.showdinacard;
            return request;
        }
    }
}
