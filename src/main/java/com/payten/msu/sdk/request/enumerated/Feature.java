package com.payten.msu.sdk.request.enumerated;

import java.util.Arrays;
import java.util.List;


public enum Feature {

	BASIC_PAYMENT,

	COMMISSION_PAYMENT,

	SPLIT_PAYMENT_DEALER_PORTAL,

	DEALERCODE_AUTH_PAYMENT,

	MERCHANT_REDIRECTION_PAYMENT,

	PAY_BY_LINK_EMAIL,

	PAY_BY_LINK_SMS,

	SAVE_CARD_ON_HPP,

	CUSTOMER_PAYMENT_APPROVAL_FORM_ON_HPP,

	DIRECT_LOGIN,

	DEALER_PORTAL_LOGIN,

	NEW_DEALER_REGISTRATION_ON_LOGIN_FORM,

	SUBDEALER_MANAGEMENT,

	VIEW_PAYMENTSYSTEMS_AND_INSTALLMENTS,

	VIEW_TRANSACTION_RULES,

	VIEW_COMMISSIONS,

	VIEW_TRANSACTION_REPORT,

	VIEW_PAYMENT_REPORT,

	VIEW_AND_PAY_INVOICES,
	/**
	 * Transaction Type Selection Availability
	 */
	TRANSACTION_TYPE_SELECTION_AVAILABILITY,
	/**
	 * MERCHANT FEATURES
	 * View Executive Reports
	 */
	VIEW_EXECUTIVE_REPORT("/msu/admin/executive/report"),
	/**
	 * View Dealer Transaction Reports
	 */
	VIEW_SPLIT_PAYMENT_REPORT("/msu/admin/splitpayment/report"),
	/**
	 * View Dealer Transaction Reports
	 */
	VIEW_DEALER_TRANSACTION_REPORT("/msu/admin/dealertransaction"),
	/**
	 * View Dealer Status History Report
	 */
	VIEW_DEALER_STATUS_HISTORY_REPORT("/msu/admin/dealerstatus/report"),
	/**
	 * View Daily Detailed Reconciliation Report
	 */
	VIEW_DAILY_RECONCILIATION_REPORT("/msu/admin/reconciliation/batch/report"),
	/**
	 * View Single Transaction Reconciliation Report
	 */
	VIEW_SINGLE_RECONCILIATION_REPORT("/msu/admin/reconciliation/single/report"),
	/**
	 * View Avrasya Payment Report
	 */
	VIEW_AVRASYA_PAYMENT_REPORT("/msu/admin/avrasya/payment/report"),
	/**
	 * Transaction Rules Management
	 */
	TRANSACTION_RULES_MANAGEMENT("/msu/admin/transactionrules"),
	/**
	 * Dealer Type Management
	 */
	DEALER_TYPE_MANAGEMENT("/msu/admin/dealertype/list"),
	/**
	 * Dealer Management
	 */
	DEALER_MANAGEMENT("/msu/admin/dealer/list"),
	/**
	 * Dealer SubMerchant Support Management
	 */
	DEALER_SUBMERCHANT_SUPPORT_MANAGEMENT("/msu/admin/dealertpst/list"),
	/**
	 * Merchant Profile Management
	 */
	MERCHANT_PROFILE_MANAGEMENT("/msu/admin/merchantprofile"),
	/**
	 * Merchant Direct Login
	 */
	MERCHANT_DIRECT_LOGIN("/admin/merchantdirectlogin"),
	/**
	 * Batch Post-Authorization
	 */
	BATCH_POST_AUTHORIZATION("/msu/admin/postauth"),
	/**
	 * Campaign Management
	 */
	CAMPAIGN_MANAGEMENT("/msu/admin/campaigncode/list"),
	/**
	 * Bin Based Action Management
	 */
	BIN_BASED_ACTION_MANAGEMENT("/msu/admin/merchantbin"),
	/**
	 * Max Installment Count Management
	 */
	MAX_INSTALLMENT_COUNT_MANAGEMENT("/msu/admin/merchant/maximuminstallmentrules"),
	/**
	 * Payment Page Content Management
	 */
	PAYMENT_PAGE_CONTENT_MANAGEMENT("/msu/admin/merchant/hppcontent"),
	/**
	 * BIN Rule Management
	 */
	BIN_RULE_MANAGEMENT("/msu/admin/binrulemanagement"),
	/**
	 * Card Network Settings
	 */
	CARD_NETWORK_SETTINGS("/msu/admin/cardnetwork/list"),
	/**
	 * Card Network Settings
	 */
	CARD_BRAND_SETTINGS("/msu/admin/cardbrand/list"),
	/**
	 * One shot default payment system
	 */
	ONE_SHOT_DEFAULT_PAYMENT_SYSTEM("/msu/admin/paymentsystem/edit"),
	/**
	 * Visibility of Change Status MR button.
	 */
	CHANGE_TRANSACTION_STATUS_MR("/msu/admin/session/viewtransactiondetails"),
	/**
	 * Pay By Link Payments
	 */
	PAY_BY_LINK_PAYMENT("/msu/admin/paybylink/report"),
	/**
	 * Recurring Payments Management
	 */
	RECURRING_PAYMENT("msu/admin/recurringplan"),
	/**
	 * Management of Sale Users
	 */
	SALE_USERS_MANAGEMENT("/msu/admin/merchantusermanager/edit"),
	/**
	 * Custom Field Management
	 */
	CUSTOM_FIELD_MANAGEMENT("/msu/admin/customfield"),
	/**
	 * Reconciliation Management
	 */
	RECONCILIATION_MANAGEMENT("/msu/admin/reconciliationschema"),
	/**
	 * Payment System Rule Management
	 */
	PAYMENT_SYSTEM_RULE_MANAGEMENT("/msu/admin/payment/rule/settings"),
	/**
	 * Payment System Sharing Management
	 */
	PAYMENT_SYSTEM_SHARING_MANAGEMENT("/msu/admin/sharedpaymentsystems"),
	/**
	 * Customer Management
	 */
	CUSTOMER_MANAGEMENT("/msu/admin/customermanagement/list");

	String value;

	private Feature() {}

	private Feature(String value) {
		this.value = value;
	}

	public String value() {
		return this.value;
	}

	public static Feature fromString(String input) {
		for (Feature feature : values()) {
			if (feature.name().equals(input))
				return feature;
		}
		return null;
	}

	public static List<Feature> getDealerFeatures() {
		return Arrays.asList(Feature.VIEW_AND_PAY_INVOICES, Feature.VIEW_PAYMENT_REPORT, Feature.VIEW_TRANSACTION_REPORT, Feature.VIEW_COMMISSIONS,
				Feature.VIEW_TRANSACTION_RULES, Feature.VIEW_PAYMENTSYSTEMS_AND_INSTALLMENTS, Feature.BASIC_PAYMENT, Feature.COMMISSION_PAYMENT,
				Feature.CUSTOMER_PAYMENT_APPROVAL_FORM_ON_HPP, Feature.DEALER_PORTAL_LOGIN, Feature.DEALERCODE_AUTH_PAYMENT, Feature.DIRECT_LOGIN,
				Feature.MERCHANT_REDIRECTION_PAYMENT, Feature.PAY_BY_LINK_EMAIL, Feature.PAY_BY_LINK_SMS, Feature.SAVE_CARD_ON_HPP,
				Feature.SUBDEALER_MANAGEMENT, Feature.NEW_DEALER_REGISTRATION_ON_LOGIN_FORM, Feature.SPLIT_PAYMENT_DEALER_PORTAL,
				Feature.TRANSACTION_TYPE_SELECTION_AVAILABILITY);
	}

	public static List<Feature> getMerchantFeatures() {
		return Arrays.asList(Feature.VIEW_EXECUTIVE_REPORT, Feature.VIEW_DEALER_TRANSACTION_REPORT, Feature.VIEW_DAILY_RECONCILIATION_REPORT,
				Feature.VIEW_SINGLE_RECONCILIATION_REPORT, Feature.TRANSACTION_RULES_MANAGEMENT, Feature.DEALER_TYPE_MANAGEMENT, Feature.DEALER_MANAGEMENT,
				Feature.DEALER_SUBMERCHANT_SUPPORT_MANAGEMENT, Feature.MERCHANT_PROFILE_MANAGEMENT, Feature.VIEW_AVRASYA_PAYMENT_REPORT,
				Feature.VIEW_DEALER_STATUS_HISTORY_REPORT, Feature.VIEW_SPLIT_PAYMENT_REPORT, Feature.MERCHANT_DIRECT_LOGIN, Feature.BATCH_POST_AUTHORIZATION,
				Feature.MAX_INSTALLMENT_COUNT_MANAGEMENT, Feature.CAMPAIGN_MANAGEMENT, Feature.BIN_BASED_ACTION_MANAGEMENT,
				Feature.PAYMENT_PAGE_CONTENT_MANAGEMENT, Feature.BIN_RULE_MANAGEMENT, Feature.PAY_BY_LINK_PAYMENT, Feature.RECURRING_PAYMENT,
				Feature.SALE_USERS_MANAGEMENT, Feature.CARD_NETWORK_SETTINGS, Feature.CARD_BRAND_SETTINGS, Feature.ONE_SHOT_DEFAULT_PAYMENT_SYSTEM,
				Feature.CHANGE_TRANSACTION_STATUS_MR, Feature.CUSTOM_FIELD_MANAGEMENT, Feature.PAYMENT_SYSTEM_RULE_MANAGEMENT, Feature.PAYMENT_SYSTEM_SHARING_MANAGEMENT,
				Feature.RECONCILIATION_MANAGEMENT, Feature.CUSTOMER_MANAGEMENT);
	}

	public static List<Feature> getDefaultMerchantFeatures() {
		return Arrays.asList(Feature.CAMPAIGN_MANAGEMENT, Feature.BIN_BASED_ACTION_MANAGEMENT, Feature.PAYMENT_PAGE_CONTENT_MANAGEMENT);
	}

	public static List<List<Feature>> getMutuallyExclusiveFeatures() {
		return Arrays.asList(Arrays.asList(Feature.BIN_RULE_MANAGEMENT, Feature.CARD_NETWORK_SETTINGS),
				Arrays.asList(Feature.BIN_RULE_MANAGEMENT, Feature.CARD_BRAND_SETTINGS));
	}
}
