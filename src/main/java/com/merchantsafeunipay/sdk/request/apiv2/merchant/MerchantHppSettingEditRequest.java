package com.merchantsafeunipay.sdk.request.apiv2.merchant;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Font;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.request.enumerated.YesNo;
import com.merchantsafeunipay.sdk.response.MerchantHppSettingEditResponse;

public class MerchantHppSettingEditRequest extends ApiRequest<MerchantHppSettingEditResponse> {
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

    private MerchantHppSettingEditRequest() {
    }

    public static MerchantHppSettingEditRequestBuilder builder() {
        return new MerchantHppSettingEditRequestBuilder();
    }

    @Override
    public Class<MerchantHppSettingEditResponse> responseClass() {
        return MerchantHppSettingEditResponse.class;
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

    public static final class MerchantHppSettingEditRequestBuilder {
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

        public MerchantHppSettingEditRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public MerchantHppSettingEditRequestBuilder withLeftlogo(String leftlogo) {
            this.leftlogo = leftlogo;
            return this;
        }

        public MerchantHppSettingEditRequestBuilder withRightlogo(String rightlogo) {
            this.rightlogo = rightlogo;
            return this;
        }

        public MerchantHppSettingEditRequestBuilder withBackgroundcolor(String backgroundcolor) {
            this.backgroundcolor = backgroundcolor;
            return this;
        }

        public MerchantHppSettingEditRequestBuilder withBordercolor(String bordercolor) {
            this.bordercolor = bordercolor;
            return this;
        }

        public MerchantHppSettingEditRequestBuilder withHeadercolor(String headercolor) {
            this.headercolor = headercolor;
            return this;
        }

        public MerchantHppSettingEditRequestBuilder withButtoncolor(String buttoncolor) {
            this.buttoncolor = buttoncolor;
            return this;
        }

        public MerchantHppSettingEditRequestBuilder withFont(Font font) {
            this.font = font;
            return this;
        }

        public MerchantHppSettingEditRequestBuilder withShowssl(YesNo showssl) {
            this.showssl = showssl;
            return this;
        }

        public MerchantHppSettingEditRequestBuilder withShowvisa(YesNo showvisa) {
            this.showvisa = showvisa;
            return this;
        }

        public MerchantHppSettingEditRequestBuilder withShowmc(YesNo showmc) {
            this.showmc = showmc;
            return this;
        }

        public MerchantHppSettingEditRequestBuilder withShowamex(YesNo showamex) {
            this.showamex = showamex;
            return this;
        }

        public MerchantHppSettingEditRequestBuilder withShowjcb(YesNo showjcb) {
            this.showjcb = showjcb;
            return this;
        }

        public MerchantHppSettingEditRequestBuilder withShowtroy(YesNo showtroy) {
            this.showtroy = showtroy;
            return this;
        }

        public MerchantHppSettingEditRequestBuilder withShowdiners(YesNo showdiners) {
            this.showdiners = showdiners;
            return this;
        }

        public MerchantHppSettingEditRequestBuilder withShowdinacard(YesNo showdinacard) {
            this.showdinacard = showdinacard;
            return this;
        }

        public MerchantHppSettingEditRequest build() {
            MerchantHppSettingEditRequest request = new MerchantHppSettingEditRequest();
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
