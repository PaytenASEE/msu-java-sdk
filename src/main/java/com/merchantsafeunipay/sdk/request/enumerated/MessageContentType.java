package com.merchantsafeunipay.sdk.request.enumerated;

import java.util.Arrays;
import java.util.List;


/**
 * @author Donjeta Mulaj <donjeta.mulaj@asseco-see.com>
 * @author Eren Demirel <eren.demirel@payten.com>
 * Note that this enum is different from the one at msu.core although the names are the same. Method getMessageContentTypes() is commented out
 * to prevent tightly coupling since it is not used in any tests. To use it again, simply check if user is system user or merchant user or
 * merchant group user
 */


public enum MessageContentType {
    /* SYSTEM MESSAGE CONTENT TYPES */
    /**
     * Invitation
     */
    INVITATION,
    /**
     * Forgot password
     */
    FORGOT_PASSWORD,
    /**
     * Invite merchant user
     */
    INVITE_MERCHANT_USER,
    /**
     * Email header
     */
    EMAIL_HEADER,
    /**
     * Email footer
     */
    EMAIL_FOOTER,
    /* MERCHANT MESSAGE CONTENT TYPES */
    /**
     * Pay by link email
     */
    PAYBYLINK_EMAIL,
    /**
     * Pay by link sms
     */
    PAYBYLINK_SMS,
    /**
     * Split Pay by link split payment email
     */
    PAYBYLINK_SP_EMAIL,
    /**
     * Pay by link split payment sms
     */
    PAYBYLINK_SP_SMS,
    /**
     * Pay by link remind email
     */
    PAYBYLINK_REMIND_EMAIL,
    /**
     * Pay by link remind sms
     */
    PAYBYLINK_REMIND_SMS,
    /**
     * Pay by link split payment remind email
     */
    PAYBYLINK_SP_REMIND_EMAIL,
    /**
     * Pay by link split payment remind sms
     */
    PAYBYLINK_SP_REMIND_SMS,
    /**
     * Recurring add card email
     */
    RECURRING_ADDCARD_EMAIL,
    /**
     * Recurring edit card email
     */
    RECURRING_EDITCARD_EMAIL,
    /**
     * Recurring add card sms
     */
    RECURRING_ADDCARD_SMS,
    /**
     * Recurring edit card sms
     */
    RECURRING_EDITCARD_SMS,
    /**
     * Terms and Conditions
     */
    TAC,
    /**
     * Security
     */
    SECURITY,
    /**
     * FAQ - Frequently Asked Questions
     */
    FAQ,
    /**
     * Privacy
     */
    PRIVACY,
    /**
     * Void & Refund Policy
     */
    VOID_REFUND_POLICY,
    /**
     * Contact
     */
    CONTACT,
    /**
     * Card Saving Terms and Conditions
     */
    CARD_SAVING_TAC,
    /**
     * Dealer Portal After Payment Receipt Content
     */
    DEALER_PORTAL_RECEIPT_CONTENT,
    /**
     * Card Saving Terms and Conditions For Footer
     */
    CARD_SAVING_TAC_FOOTER,
    /**
     * Payment Dealer Portal Receipt Content
     */
    DEALER_PORTAL_TRANSACTION_DETAIL_RECEIPT_CONTENT,
    /**
     * Help Line Content For Dealer Portal Footer
     */
    DEALER_PORTAL_FOOTER_HELP_LINE_CONTENT;

    private static List<MessageContentType> getSystemMessageTypes() {
        return Arrays.asList(MessageContentType.INVITATION, MessageContentType.FORGOT_PASSWORD, MessageContentType.INVITE_MERCHANT_USER,
                MessageContentType.EMAIL_HEADER, MessageContentType.EMAIL_FOOTER);
    }

    private static List<MessageContentType> getMerchantMessageTypes() {
        return Arrays.asList(MessageContentType.PAYBYLINK_EMAIL, MessageContentType.PAYBYLINK_SMS, MessageContentType.PAYBYLINK_REMIND_EMAIL,
                MessageContentType.PAYBYLINK_REMIND_SMS, MessageContentType.RECURRING_ADDCARD_EMAIL, MessageContentType.RECURRING_EDITCARD_EMAIL,
                MessageContentType.RECURRING_ADDCARD_SMS, MessageContentType.RECURRING_EDITCARD_SMS, MessageContentType.TAC, MessageContentType.SECURITY,
                MessageContentType.FAQ, MessageContentType.PRIVACY, MessageContentType.VOID_REFUND_POLICY, MessageContentType.CONTACT,
                MessageContentType.CARD_SAVING_TAC, MessageContentType.DEALER_PORTAL_RECEIPT_CONTENT, MessageContentType.CARD_SAVING_TAC_FOOTER,
                MessageContentType.DEALER_PORTAL_TRANSACTION_DETAIL_RECEIPT_CONTENT, MessageContentType.DEALER_PORTAL_FOOTER_HELP_LINE_CONTENT,
                MessageContentType.PAYBYLINK_SP_EMAIL, MessageContentType.PAYBYLINK_SP_REMIND_EMAIL, MessageContentType.PAYBYLINK_SP_SMS,
                MessageContentType.PAYBYLINK_SP_REMIND_SMS);
    }

/*	public static List<MessageContentType> getMessageContentTypes(User user) {
		if (user.isSystemUser()) {
			return getSystemMessageTypes();
		} else {
			return getMerchantMessageTypes();
		}
	}*/

    public static List<MessageContentType> getPaymentPageContentTypes() {
        return Arrays.asList(MessageContentType.TAC, MessageContentType.SECURITY, MessageContentType.FAQ, MessageContentType.PRIVACY,
                MessageContentType.VOID_REFUND_POLICY, MessageContentType.CONTACT, MessageContentType.CARD_SAVING_TAC,
                MessageContentType.CARD_SAVING_TAC_FOOTER);
    }

    public static MessageContentType[] toEnums(String... values) {
        MessageContentType[] messageContentTypeV2 = new MessageContentType[values.length];
        int i = 0;
        for (String value : values) {
            messageContentTypeV2[i++] = valueOf(value);
        }
        return messageContentTypeV2;
    }

    public static MessageContentType fromString(String input) {
        for (MessageContentType messageContentTypeV2 : values()) {
            if (messageContentTypeV2.name().equals(input)) {
                return messageContentTypeV2;
            }
        }
        return null;
    }
}
