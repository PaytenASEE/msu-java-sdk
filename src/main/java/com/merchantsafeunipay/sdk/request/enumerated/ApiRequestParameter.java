package com.merchantsafeunipay.sdk.request.enumerated;

/**
 * ApiRequestParameter
 *
 * @author Anil Tangul <anil.tangul@asseco-see.com.tr>
 * @author Alketa Fazliu <alketa.fazliu@asseco-see.com>
 */
public enum ApiRequestParameter {
	// @formatter:off
	/*
	 * Level 0 Transaction / Process information
	 */
	ACTION(128),
	AMOUNT(30),
	CURRENCY(3),
	INSTALLMENTS(2),
	RETURNURL(256),
	INTERIMPAGEURL(255),
	CANCELURL(256),
	INTEGRATIONMODEL(32),
	SESSIONTYPE(15),
	SESSIONTOKEN(48),
	TOKEN(64),
	AUTH3DTOKEN(16),
	SUBACTION(64),
	ISREFUNDABLE(3),
	SESSIONEXPIRY(5),
	WALLET3DAUTH(3),
	PREAUTH(3),
	PREAUTHEXPIRY(5),
	RESPONSEFORMAT(8),
	APIVERSION(2),
	MAXSALEATTEMPTS(2),

	@Deprecated
	PAYMENTEXPIRY(5),
	@Deprecated
	WALLET_3D_AUTH(3),
	@Deprecated
	MAX_SALE_ATTEMPTS(2),

	/**
	 * Points json array
	 */
	POINTS(500),CAMPAIGNS(500),

	/*
	 * Level 1 Merchant information
	 */
	MERCHANT(128),
	MERCHANTPAYMENTID(128),
	MERCHANTUSER(128),
	MERCHANTPASSWORD(128),
	MERCHANTUSEREMAIL(128),
	MERCHANTIMG(256),
	RANDOM(64), // Random value for hash authentication
	HASH(64), // Hash value for authentication
	DISPLAYMERCHANTNAME(3), DISPLAYINSTALLMENTS(3), MERCHANTMOTTO(256), TEMPLATE(128), CARDUNIQUE(3),
	MERCHANTBUSINESSID(16),
	MERCHANTGROUPNAME(128),
	/*
	 * Level 2 Customer information
	 */
	MERCHANTSYSTEMCUSTUMERID(128),
	CUSTOMER(128),
	CUSTOMERNAME(128),
	CUSTOMEREMAIL(64),
	CUSTOMERPHONE(64),
	CUSTOMERCARDTOKEN(64),
	CURRENTCUSTOMERID(128),
	NEWCUSTOMERID(128),

	/*
	 * Level 3 Payment Page settings
	 */
	LANGUAGE(2),
	TIMEZONE(64),

	PPBGCOLOR(16),
	PPTITLECOLOR(16),
	PPSECTIONTITLEBGCOLOR(16),
	PPLAYOUT(5),
	PPFONT(64),

	BACKGROUNDCOLOR(16),
	BORDERCOLOR(16),
	HEADERCOLOR(16),
	BUTTONCOLOR(16),
	FONT(64),
	LEFTLOGO(256),
	RIGHTLOGO(256),

	SHOWSSL(3),
	SHOWVISA(3),
	SHOWMC(3),
	SHOWAMEX(3),
	SHOWDINACARD(3),
	SHOWDINERS(3),
	SHOWJCB(3),
	SHOWTROY(3),
	/**


	 /*
	 * Level 4
	 */
	@Deprecated
	ITEMNUM_CODE(32),
	@Deprecated
	ITEMNUM_NAME(64),
	@Deprecated
	ITEMNUM_PRICE(32),
	@Deprecated
	ITEMNUM_QUANTITY(8),
	@Deprecated
	ITEMNUM_DESCRIPTION(256),
	@Deprecated
	ITEMTOTALAMOUNT(32),
	@Deprecated
	SHIPPINGCOST(32),
	@Deprecated
	ITEMTAXINCLUDED(3),
	@Deprecated
	ITEMTAXAMOUNT(10),
	@Deprecated
	OTHEREXPENSES(10),


	/*
	 * Level 5
	 */
	SHIPTONAME(100),
	SHIPTOADDRESSLINE(100),
	SHIPTOCITY(100),
	SHIPTOSTATE(100),
	SHIPTOPOSTALCODE(100),
	SHIPTOCOUNTRY(100),
	SHIPTOPHONE(100),
	/*
	 * Level 6
	 */
	BILLTONAME(100),
	BILLTOADDRESSLINE(100),
	BILLTOCITY(100),
	BILLTOSTATE(100),
	BILLTOPOSTALCODE(100),
	BILLTOCOUNTRY(100),
	BILLTOPHONE(100),
	/*
	 * Level 7 Card data
	 */
	BIN(6), //
	ENCRYPTEDDATA(2048),
	CARDTOKEN(64),
	CARDPAN(19),
	CARDEXPIRY(7),
	CARD_EXPIRY(7),
	CARDNAME(64),
	NAMEONCARD(64),
	CARDCVV(3),
	CARDSAVENAME(64),
	CARDNUMBER(64),
	CARDSTATUS(10),
	CAMPAIGNCODE(100),

	/*
	 * Level 8 Payment system name
	 */
	PAYMENTSYSTEM(128), // Payment system name
	/**
	 * Level 9 Transaction ID from the Payment gateway
	 */
	PGTRANID(64),
	/**
	 * Level 10 Cardholder data
	 */
	CARDHOLDERID(64),
	/**
	 * Ewallet Query Subaction
	 */
	OFFSET(4), LIMIT(4), S_CARD_TOKEN(64), S_CARD_OWNER_MASKED(64), S_PAN_LAST4(64), S_NAME(64), S_CUSTOMER(64), S_CARD_BIN(3), S_CARD_BRAND(3), S_CARD_TYPE(3), S_CARD_LEVEL(
			3), S_CARD_NETWORK(3), S_CARD_COUNTRY_ISO(3), S_CARD_PAYMENT_SYSTEM(3), S_CARD_ISSUER(3), S_CARD_VIRTUAL(3), S_CARD_STATUS_AC(3), S_CARD_STATUS_DE(
			3), S_CARD_STATUS_WA(3), W_NAME(64), W_CARD_TOKEN(64), FORGROUP(12), BEGINDATE(10), ENDDATE(16), STARTDATE(16), SESSION_STATUS_AC(3), SESSION_STATUS_FI(
			3), TRANSACTION_STATUS_IP(3), TRANSACTION_STATUS_CA(3), TRANSACTION_STATUS_AP(3), TRANSACTION_STATUS_FA(3), TRANSACTION_STATUS_VD(3), TRANSACTION_STATUS_MR(
			3), TRANSACTION_STATUS_PA(3), TRANSACTION_STATUS_WA(3), TRANSACTION_STATUS_WFA(4), TRANSACTION_STATUS_WLA(4), TRANSACTION_STATUS_RJ(3), CARD_STATUS_AC(3), CARD_STATUS_DE(3), CARD_STATUS_WA(3), STATUSCHANGEBEGINDATE(16), STATUSCHANGEENDDATE(16), /**
	 * Model
	 * 2 request parameters
	 */
	CANSAVECARD(3), SAVECARD(3), DISPLAYCVV(3), //
	/**
	 * Lets Bodrum specific request parameters
	 */
	TERMINALID(128), POSID(128), REDIRECTWAITINGTIME(2),
	/**
	 * Payment Type Name
	 */
	NAME(128),
	/**
	 * Payment Type Interest Rate
	 */
	INTERESTRATE(7),
	/**
	 * Payment Type DISCOUNT Rate
	 */
	DISCOUNTRATE(7),
	/**
	 * Payment Type Commission Rate
	 */
	COMMISSIONRATE(7),
	/**
	 * Payment Type Valid TO
	 */
	VALIDTO(16),
	/**
	 * Payment Type Valid From
	 */
	VALIDFROM(16),
	/**
	 *
	 */
	PAYMENTTYPEID(16),
	/**
	 * Payment Type Commission Status
	 */
	COMMISSIONSTATUS(2),
	/**
	 * Used at queryTransaction action
	 */
	TRANSACTIONSTATUS(18),
	/**
	 * MERCHANTUSER ID
	 */
	MERCHANTUSERID(16),

	MAXINSTALLMENTCOUNT(2),
	BUSINESSMAXINSTALLMENTCOUNT(2),
	/**
	 * Recurring Payments specific request parameters
	 */
	RECURRINGPLANCODE(16),
	FIRSTAMOUNT(30),
	RECURRINGAMOUNT(30),
	FREQUENCY(2),
	RECURRENCE(2),
	RECURRENCECOUNT(2),
	STATUS(2),
	RECURRINGPLANSTATUS(30),
	RECURRINGPAYMENTSTATUS(30),
	OCCURRENCE(5),
	MERCHANTLOGO(64),
	ORDERITEMS(100000),
	MERCHANTCONTENTID(16),
	THREATMETRIXSESSIONID(128),
	TMXSESSIONQUERYINPUT(1024),

	BKMTOKEN(64),
	CUSTOMERIP(39),
	CARDHOLDERPORT(39),
	TRANSACTIONTYPE(16),
	CUSTOMERUSERAGENT(255),
	PGORDERID(128),
	BKMTRANSACTIONSTATUS(4),
	PGTRANAPPRCODE(128),
	PGTRANREFID(128),
	PGTRANERRORCODE(128),
	PGTRANRETURNCODE(128),
	PGTRANERRORTEXT(1024),
	PGTRANDATE(64),
	EXTRA(1024),
	/**
	 * Internal parameters sent on EXTRA:
	 * 		Name:                         	Value:                       									 Description:
	 * 1.	ChannelCode						https://neon-app.asseco-see.com.tr/zorlu/config					 Merchants of Zorlu (info used on PDF Receipts & Excels).
	 * 2.	DealerTypeDetails				-																 Description given while making payments on Dealer Portal, with dealer type.
	 * 3.	InitiatorMerchantBusinessId     -																 Merchants that belong on group and does API calls for other merchant within group.
	 * 4.	InvoiceId						-																 Information sent by Dealer Portal, when invoice payments are processed.
	 * 5.	IsCommissionIncluded			YES/NO															 Depending on value of this parameter, calculated amount of transaction may change.
	 */
	PAYMENTSYSTEMTYPE(32),
	PAYMENTSYSTEMMODE(4),
	APIMERCHANTID(64),
	APIUSERNAME(64),
	APIPASSWORD(64),
	GATE3DKEY(64),
	ISDEFAULT(2),
	INTEGRATIONEXTRAFIELD00(4000),
	INTEGRATIONEXTRAFIELD01(4000),
	EFTCODE(4),
	SUBMERCHANTCODE(30),
	BANKMERCHANTID(16),
	/**
	 * Used to determine external compay transaction payment system.
	 */
	PAYMENTSYSTEMTYPENAME(100),
	/**
	 * Compay transaction unique key
	 */
	COMPAYTOKEN(100),
	/**
	 * Compay response code
	 */
	COMPAYRESPONSECODE(2),
	/**
	 * PayByLink Payment Parameters
	 */
	PAYBYLINKTOKEN(64),
	CREATEDTS(16),
	DUEDATE(16),
	PAYBYLINKSTATUS(2),

	/**
	 * Message Content Parameters
	 */
	TITLE(100),
	CONTENT(4000),
	MESSAGECONTENTTYPE(32),
	ISDISPLAYED(3),

	NOTIFICATIONCHANNELS(16),
	/**
	 * Split Payment
	 */
	SPLITPAYMENTCODE(16),
	SPLITPAYMENTTYPE(5),

	/**
	 * Payment Type Parameters
	 */
	APPLYFORBUSINESSCARD(3),
	APPLYFORCREDITCARD(3),
	APPLYFORDEBITCREDITCARD(3),
	/**
	 * Payment Policy Parameters
	 */
	PPOLICY(30),
	AMOUNTLIMIT(30),
	/**
	 * DEALER
	 */
	DEALERCODE(32),
	TCKN(11),
	VKN(10),
	PARENTDEALERCODE(32),
	CONTACTNAME(128),
	CONTACTEMAIL(128),
	CONTACTPHONE(32),
	CONTACTFAX(64),
	CONTACTPOSTCODE(32),
	CONTACTADDRESS(128),
	CONTACTWEBADDRESS(64),
	REASON(256),
	CITYID(16),

	/**
	 * Approve Transaction Parameter
	 */
	TRANSACTIONID(48),
	DEALERCODES(32000),
	SUBSTATUS(32),

	/**
	 * Add merchant user
	 */
	ROLE(6),
	USERNAME(128),
	MERCHANTUSERPASSWORD(128),
	CONFIRMPASSWORD(128),
	ISLOCKED(3),
	/**
	 * DealerType
	 */
	DEALERTYPENAME(256),
	DEALERTYPES(1024),
	DESCRIPTIONREQUIRED(3),
	DESCRIPTIONPRESENT(3),
	DEFAULTSUBDEALERTYPE(3),
	PAYMENTSYSTEMS(1024),
	PERMISSION(32),
	REFLECTCOMMISSION(3),
	IGNORERATES(3),
	PGTRANIDTOREFUND(64),
	MAXRESULT(5),
	AMOUNTLOWERLIMIT(64),
	AMOUNTUPPERLIMIT(64),

	/**
	 * Invoice
	 */
	INVOICEID(128),
	INVOICESTATUS(6),
	ISSUEDATE(16),
	ISSUEDATEEND(16),
	DUEDATEEND(16),
	ORIGINALAMOUNT(30),

	/**
	 * Password Recovery user email
	 */
	USEREMAIL(128),
	/**
	 * Password Recovery secure token
	 */
	RECOVERYTOKEN(32),
	OLDPASSWORD(128),
	NEWPASSWORD(128),
	NEWPASSWORDCONFIRM(128),
	/**
	 * Dealer Feature
	 */
	FEATURE(255),
	INITIATORMERCHANTBUSINESSID(128),
	INCLUDEDEALERS(3),

	RULE(1028),

	PANIIN(6),
	PANLAST4(4),
	CARDHASH(8),
	ADJUSTRATES(3),

	/**
	 * Commerce Codes in URL-Encoded JSON Array
	 */
	COMMERCECODES(1024),
	RULENAME(256),
	DIVERTEDPSNAME(128),
	CARDBRAND(16),
	CARDTYPE(16),
	CARDNETWORK(16),
	ISSUER(128),
	COUNTRYISOA3(3),
	FOREIGN(16),
	DEFAULTONLY(3),
	EXPIRYMONTH(2),
	EXPIRYYEAR(4),
	/**
	 * Custom fields
	 */
	CODE(16),
	BEHAVIOUR(16),
	AVAILABILITIES(256),
	GROUPS(256),
	HEADER(128),
	DEFINITION(1024),
	TYPE(64),
	INTEGRATIONCODE(64),
	CUSTOMFIELDS(4000),
	CARDCUTOFFDAY(2),
	CLIENTBROWSERTLSCIPHER(4000),
	CLIENTBROWSERTLSVERSION(4000),
	CARDPANTYPE(32),
	/*
	 * Used as a flag to identify loan payment systems.
	 */
	LOANSUPPORT(3);
	

	// @formatter:off
	private int maxLength;

	private ApiRequestParameter(int maxLength) {
		this.maxLength = maxLength;
	}

	public int getMaxLength() {
		return maxLength;
	}

	public static ApiRequestParameter fromString(String name) {
		for (ApiRequestParameter p : values()) {
			if (p.name().equalsIgnoreCase(name)) {
				return p;
			}
		}
		return null;
	}
}
