package com.merchantsafeunipay.sdk.request.enumerated;


public enum ApiResponseParameter {
    RESPONSE,

    responseCode,

    RESPONSEMSG,

    TOKEN,

    ERRORCODE,

    ERROR, VIOLATOR_PARAM,

    CARDTOKEN,

    CARDNAME,

    CARDSNUM,

    TOTALCARDSNUM,
    /**
     * Card's bin number
     */
    CARD_BIN,
    /**
     * Card's brand
     */
    CARD_BRAND,
    /**
     * Card's type
     */
    CARD_TYPE,
    /**
     * Card's level
     */
    CARD_LEVEL,
    /**
     * Card's network
     */
    CARD_NETWORK,
    /**
     * Card's issuer name
     */
    CARD_ISSUER,
    /**
     * Card's virtual or not
     */
    CARD_VIRTUAL,
    /**
     * Card's country iso number
     */
    CARD_COUNTRY_ISO,
    /**
     * Card's on-up payment system
     */
    CARD_PAYMENT_SYSTEM,
    /**
     * Card Status
     */
    CARD_STATUS,
    /**
     * Card Information
     */
    CARDINFORMATION,
    /**
     * Api Version 2 underscores are deleted from these paramaters
     */
    CARDBIN, CARDBRAND, CARDTYPE, CARDLEVEL, CARDNETWORK, CARDISSUER, CARDVIRTUAL, CARDCOUNTRYISO,
    /**
     * Refund type (full or partial)
     */
    REFUNDTYPE,
    /**
     * Number of transactions sent
     */
    TRXNUM,
    /**
     * Transaction Count of v2
     */
    TRANSACTIONCOUNT,
    /**
     * Amount
     */
    AMOUNT,
    /**
     * Amount
     */
    AMOUNTPAID,
    /**
     * Currency
     */
    CURRENCY,
    /**
     * Number of items sent as a response of the GETPAYMETITEMS sub-action
     */
    ITEMSNUM,
    /**
     * Number of card tokens sent as a result to the API call
     */
    CARDTOKENNUM,
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Transaction related response parameters ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    /**
     * Creation time, first persisting time to database
     * UTC
     */
    TIMECREATED,
    /**
     * Sending / Requesting to Payment System time
     * UTC
     */
    TIMEPSSENT,
    /**
     * Receiving Response from Payment System time
     * UTC
     */
    TIMEPSRECEIVED,
    /**
     * Transaction status
     */
    STATUS,
    /**
     * Transaction type
     */
    TRANSACTIONTYPE,
    /**
     * Payment System
     */
    PAYMENTSYSTEM,
    /**
     * Installment
     */
    INSTALLMENT,
    /**
     * INSTALLMENT ID
     */
    ID,
    /**
     * INSTALLMENT NAME
     */
    NAME,
    /**
     * INSTALLMENT COUNT
     */
    COUNT,
    /**
     * PaymentSystemsnum
     */
    PAYMENTSYSTEMSNUM,
    /**
     * Installment count
     * Valid data should be between 0 and 36 included.
     */
    INSTALLMENTCOUNT,
    /**
     * Interest rate, percent % value
     * Valid data should be between 0.0000 and 99.9999
     */
    INTERESTRATE,
    /**
     * Discount rate, percent % value
     * Valid data should be between 0.0000 and 99.9999
     */
    DISCOUNTRATE,
    /**
     * Value from PG / Payment Gateway / Payment System
     * Generated Order ID
     */
    PGORDERID,
    /**
     * Value from PG / Payment Gateway / Payment System
     * Generated Transaction ID
     */
    PGTRANID,
    /**
     * Value from PG / Payment Gateway / Payment System
     * Trx Return Code
     * (Usually between 00 - 99)
     */
    PGTRANRETURNCODE,
    /**
     * Value from PG / Payment Gateway / Payment System
     * Transaction Reference ID
     * (Usually 12-char Numeric, like 215911020143)
     */
    PGTRANREFID,
    /**
     * Value from PG / Payment Gateway / Payment System
     * Transaction Approval Code
     * (Usually 6-char Numeric, like 313888)
     */
    PGTRANAPPRCODE,
    /**
     * Value from PG / Payment Gateway / Payment System
     * Transaction Error Code
     * (Usually alpha-numeric, like CORE-2012)
     */
    PGTRANERRORCODE,
    /**
     * Value from PG / Payment Gateway / Payment System
     * Transaction Error Text
     * (Usually alpha-numeric and detailed, like "Invalid card number")
     */
    PGTRANERRORTEXT,
    /**
     * Value from PG / Payment Gateway / Payment System
     * Transaction Trace Audit
     * (Usually 6-char Numeric, like 020143)
     */
    PGTRANTRACEAUDIT,
    /**
     * Value from PG / Payment Gateway / Payment System
     * Transaction Settlement ID
     * Tells which settle batch owns this transaction at the bank side
     * (Usually Numeric)
     */
    PGTRANSETTLEID,
    /**
     * Value from PG / Payment Gateway / Payment System
     * Tells the date when transaction executed
     */
    PGTRANDATE,
    /**
     * Last 4 char of card
     */
    PANLAST4,
    /**
     * Card owner name (Masked)
     */
    CARDOWNERMASKED,
    /**
     * Customer's merchant system ID
     */
    CUSTOMER,
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Payment related response parameters ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    /**
     * Customer's name
     */
    CARDHOLDERNAME,
    /**
     * IP during payment (session) pages operations
     */
    CARDHOLDERIP,
    /**
     * Browser's user-agent during payment (session) pages operations
     */
    CARDHOLDERAGENT,
    /**
     * CARD HOLDER ID
     */
    CARD_HOLDER_ID,
    /**
     * IP during API calls
     */
    MERCHANTAPICLIENTIP,
    /**
     * User-agent during API calls
     */
    MERCHANTAPICLIENTAGENT,
    /**
     * Merchant system specific order ID
     */
    MERCHANTPAYMENTID,
    /**
     * API call time
     */
    SESSIONCREATETIMESTAMP,
    /**
     * Payment page creation time
     */
    PAYMENTSTARTTIMESTAMP,
    /**
     * Payment status
     */
    PAYMENTSTATUS,
    /**
     * Origin for the payment
     */
    ORIGIN,
    /**
     * Amount, Original amount, Permanent amount.
     * This amount is set during first API call, and not changeable.
     */
    FIRSTAMOUNT,
    /**
     * Total amount of the payment items (if exists)
     * Must be validated within the data of
     */
    ITEMTOTALAMOUNT,
    /**
     * Success / Fail URL
     * That must be a full URL at the merchant system side
     */
    RETURNURL,
    /**
     * Cancellation URL
     * That must be a full URL at the merchant system side
     */
    CANCELURL,
    /**
     * Merchant logo, Image that is used during payment (session) pages
     * That must be a full URL at the merchant system side (recommended)
     */
    MERCHANTIMG,
    /**
     * Merchant Template for payment page. If the response is empty or invalid
     * then the default MSU payment page is used
     */
    TEMPLATE,
    /**
     * Payment (session) pages language
     */
    LANGUAGE,
    /**
     * Payment (session) pages time-zone
     */
    TIMEZONE,
    /**
     * Background color of the payment pages
     */
    PPBGCOLOR,
    /**
     * Title color for the payment pages
     */
    PPTITLECOLOR,
    /**
     * Border color for the payment pages
     */
    PPBORDERCOLOR,
    /**
     * Tax included or not to amount (also first amount)
     */
    TAXINCLUDED,
    /**
     * Tax amount
     */
    TAXAMOUNT,
    /**
     * Shipping price / cost
     */
    SHIPPINGCOST,
    /**
     * Other expenses
     */
    OTHEREXPENSES,
    /**
     * Shipping contact data
     */
    SHIPTO,
    /**
     * Billing contact data
     */
    BILLTO,
    /**
     * Payment integration model (Model1 or Model2)
     */
    INTEGRATIONMODEL,
    /**
     * Payment confirmation for integration model 2
     */
    PAYMENTCONFIRMATION,
    /**
     * Number of payments returned in the response
     */
    PAYMENTSNUM,
    /**
     * Number of transaction returned in the response
     */
    TRANSACTIONSNUM,
    /**
     * Number of cardholder returned in the response
     */
    CARDHOLDERSNUM,
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Payment items related parameters ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    /**
     * Item code
     */
    ITEMCODE,
    /**
     * Item name
     */
    ITEMNAME,
    /**
     * Item description
     */
    ITEMDESCRIPTION,
    /**
     * Item price
     */
    ITEMPRICE,
    /**
     * Item quantity
     */
    ITEMQUANTITY,
    /**
     * MERCHANTNAME
     */
    MERCHANTNAME,
    /**
     * TOTALAMOUNT
     */
    TOTALAMOUNT,
    /**
     * CREATEDON
     */
    CREATEDON,
    /**
     * Plan name
     */
    PLANNAME,
    /**
     * MERCHANT SYSTEM CUSTOMER ID
     */
    MERCHANTSYSTEMCUSTUMERID,
    /**
     * Plan code
     */
    PLANCODE,
    /**
     * End date for the recurring payment
     */
    ENDDATE,
    /**
     * Computed fire times
     */
    PREVIEW,
    /**
     * Size (number) of sent response parametars
     */
    SIZE,
    /**
     * RECURRANCE PRICE
     */
    RECPRICE,
    /**
     * RECURRANCE REPEATS
     */
    RECREPEATS,
    /**
     * RECURRANCE FREQUENCY
     */
    RECFREQUENCY,
    /**
     * Start date
     */
    STARTDATE,
    /**
     * Number of pages
     */
    PAGES,
    /**
     * REPEAT
     */
    REPEAT,
    /**
     * FIRETIME
     */
    FIRETIME,
    /**
     * EXECUTEDTIME
     */
    EXECUTEDTIME,
    /**
     * PAYMENTTOKEN
     */
    PAYMENTTOKEN,
    /**
     * CUSTOMERNAME
     */
    CUSTOMERNAME,
    /**
     * CUSTOMEREMAIL
     */
    CUSTOMEREMAIL,
    /**
     * CUSTOMERPHONE
     */
    CUSTOMERPHONE,
    /**
     * card holder status
     */
    OWN,
    /**
     * Payment System Name
     */
    PSNANE,
    /**
     * Api Merchant ID,
     */
    APIMERCHANTID,
    /**
     * API Username
     */
    APIUSERNAME,
    /**
     * API Password
     */
    APIPASSWORD,
    /**
     * Card Number
     */
    CARDNUMBER,
    /**
     * Expiry Date
     */
    EXPIRYDATE,
    /**
     * Merchant Business ID
     */
    MERCHANTBUSINESSID,
    /**
     * Merchant Phone
     */
    MERCHANTPHONE,
    /**
     * Web Address(URL)
     */
    MERCHANTWEBADDRESS,
    /**
     * Amount To Be Paid
     */
    AMOUNTTOBEPAID,
    /**
     * Customer's email
     */
    CARDHOLDEREMAIL,
    /**
     * Customer's phone
     */
    CARDHOLDERPHONE,
    /**
     * Customer's description
     */
    CARDHOLDERDESCRIPTION,
    /**
     * Customer's last login
     */
    CARDHOLDERLASTLOGIN,
    /**
     * Payment Items Amount
     */
    PAYMENTITEMSAMOUNT,
    /**
     * PaymentSessionCreated
     */
    PAYMENTSESSIONCREATED,
    /**
     * Unmasked card owner
     */
    CARDOWNER,
    /**
     * Unmasked card PAN
     */
    CARDPAN,
    /**
     * Unmasked card expiry
     */
    CARD_EXPIRY,
    /**
     * Last card status update date
     */
    LAST_CARD_STATUS_UPDATE,
    /**
     * Payment type id
     */
    PAYMENTTYPEID,

    TRANSACTION_ID;

    public static ApiResponseParameter[] toEnums(String... values) {
        ApiResponseParameter[] apiResponseParameter = new ApiResponseParameter[values.length];
        int i = 0;
        for (String value : values) {
            apiResponseParameter[i++] = valueOf(value);
        }
        return apiResponseParameter;
    }

    public static ApiResponseParameter fromString(String name) {
        for (ApiResponseParameter p : values()) {
            if (p.name().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }
}

