package com.github.msu.sdk.request.enumerated;

/**
 * ApiErrorCode
 *
 * @author Anil Tangul <anil.tangul@asseco-see.com.tr>
 * @author Nakije Iljazi <nakije.iljazi@asseco-see.com>
 * @author Alketa Fazliu <alketa.fazliu@asseco-see.com>
 */
public enum ApiErrorCode {
    //@formatter:off
    /**
     * Required but null parameter.
     */
    ERR10010,
    /**
     * Multi-definition for the same parameter.
     */
    ERR10011,
    /**
     * Maximum length exceeded for data
     */
    ERR10012,
    /**
     * Data type is not valid
     */
    ERR10013,
    /**
     * Security algorithm could not be found
     */
    ERR10014,
    /**
     * Invalid merchant
     */
    ERR10015,
    /**
     * Invalid amount
     */
    ERR10016,
    /**
     * Invalid currency
     */
    ERR10017,
    /**
     * Invalid language
     */
    ERR10018,
    /**
     * General error(System error)
     */
    ERR10019,
    /**
     * The user is not authenticated.
     */
    ERR10020,
    /**
     * Parameter is empty
     */
    ERR10021,
    /**
     * Items total amount does not match items sum
     */
    ERR10022,
    /**
     * Payment amount does not match calculated value
     */
    ERR10023,
    /**
     * Tax amount not specified
     */
    ERR10024,
    /**
     * Tax amount should be zero
     */
    ERR10025,
    /**
     * Invalid integration model supplied
     */
    ERR10026,
    /**
     * Invalid card token provided
     */
    ERR10027,
    /**
     * Payment system not found
     */
    ERR10028,
    /**
     * Payment type not found
     */
    ERR10029,
    /**
     * Transaction not found
     */
    ERR10030,
    /**
     * Transaction not refundable
     */
    ERR10031,
    /**
     * Invalid refund amount
     */
    ERR10032,
    /**
     * Transaction cannot be voided
     */
    ERR10033,
    /**
     * Payment not found
     */
    ERR10034,
    /**
     * No PREAUTH transaction for payment;
     */
    ERR10035,
    /**
     * Invalid POSTAUTH amount
     */
    ERR10036,
    /**
     * Cardholder does not exist
     */
    ERR10037,
    /**
     * There is no payment waiting for confirmation
     */
    ERR10038,
    /**
     * Invalid payment status
     */
    ERR10039,
    /**
     * Invalid subaction
     */
    ERR10040,
    /**
     * Card already exists
     */
    ERR10041,
    /**
     * This Card is removed
     */
    ERR10042,
    /**
     * Invalid period provided
     */
    ERR10043,
    /**
     * Invalid date format
     */
    ERR10044,
    /**
     * Invalid PAN number
     */
    ERR10045,
    /**
     * Invalid expiry date
     */
    ERR10046,
    /**
     * User not authorized to make API calls
     */
    ERR10047,
    /**
     * A successful Transaction already exists with this Merchant Payment ID
     */
    ERR10048,
    /**
     * The payment cannot be made with this payment system
     */
    ERR10049,
    /**
     * Invalid hash value
     */
    ERR10050,
    /**
     * No payment systems. Please make sure that you have at least one payment system.
     */
    ERR10051,
    /**
     * Unsupported merchant currency
     */
    ERR10052,
    /**
     * User not authorized for this merchant
     */
    ERR10053,
    /**
     * Payment expiry time exceeds maximum limit
     */
    ERR10054,
    /**
     * Payment expiry time is less than the minimal limit
     */
    ERR10055,
    /**
     * Invalid API action
     */
    ERR10056,
    /**
     * Dealer Type can be associated with just one Payment System Type
     */
    ERR10057,
    /**
     * CARDTOKEN and CURRENTCUSTOMERID parameters cannot be sent together.
     */
    ERR10058,
    /**
     * CUSTOMER exist
     */
    ERR10059,
    /**
     * Invalid user IP address
     */
    ERR10060,
    /**
     * Invalid Response Format
     */
    ERR10061,
    /**
     * Decimal parameter cannot be less than zero
     */
    ERR10062,
    /**
     * Merchant HPP Settings already exist.
     */
    ERR10063,
    /**
     * Merchant HPP Settings not found.
     */
    ERR10064,
    /**
     * Inconsistent installment information (KobiKart)
     */
    ERR10065,
    /**
     * Inconsistent Date
     */
    ERR10066,
    /**
     * Invalid or Missing EXTRA parameter value
     */
    ERR10067,
    /**
     * Invalid Occurance parametar
     */
    ERR10068,
    /**
     * Detached refund is only supported for Finans and İş Bank payment systems.
     */
    ERR10069,
    /**
     * Start date should be after now
     */
    ERR10070,
    /**
     * Invalid Recurring Payment status parameter
     */
    ERR10071,
    /**
     * External refund is not supported by selected payment system
     */
    ERR10072,
    /**
     * Save card and Force Save features cannot be used together.
     */
    ERR10073,
    /**
     * Customer with this id already exist.
     */
    ERR10074,
    /**
     * Logo Error
     */
    ERR10075,
    /**
     * Invalid Recurring Plan status parameter
     */
    ERR10076,
    /**
     * Invalid template
     */
    ERR10077,
    /**
     * Transaction is locked
     */
    ERR10078,
    /**
     * There is no payment system which supports this card brand. Please try again with a different card brand.
     */
    ERR10079,
    /**
     * Please provide Merchant Payment Id or Payment Token
     */
    ERR10080,
    /**
     * Invalid Transaction Type
     */
    ERR10081,
    /**
     * Api User has no permission to perform this operation
     */
    ERR10082,
    /**
     * Invalid status
     */
    ERR10083,
    /**
     * Interest Or Discount Rate Must Have Zero Value
     */
    ERR10084,
    /**
     * Valid To can not be bigger than Valid From
     */
    ERR10085,
    /**
     * Valid To must be bigger than now
     */
    ERR10086,
    /**
     * Installment count number already exists in a payment type with this payment system
     */
    ERR10087,
    /**
     * Invalid installment count
     */
    ERR10088,
    /**
     * Invalid nonce
     */
    ERR10089,
    /**
     * Transaction failed
     */
    ERR10090,
    /**
     * Payment system is disabled, cannot perform the transaction. Please contact your Merchant Super Admin
     */
    ERR10091,
    /**
     * Invalid offset
     */
    ERR10092,
    /**
     * Invalid limit
     */
    ERR10093,
    /**
     * Card not found
     */
    ERR10094,
    /**
     * Card can not be deleted. Because of the related recurring plans
     */
    ERR10095,
    /**
     * Session is invalid
     */
    ERR10096,
    /**
     * Session is finalized.
     */
    ERR10097,
    /**
     * Session token has no permission to do this action
     */
    ERR10098,
    /**
     * 3D response from payment system is modified or invalid 3D key
     */
    ERR10099,
    /**
     * This payment has more than one successful transactions, please use PGTRANID parameter.
     */
    ERR10100,
    /**
     * Invalid URL Parameter
     */
    ERR10101,
    /**
     * Invalid BIN information
     */
    ERR10102,
    /**
     * Transaction request is denied due to fraud possibility reported by Inact RT service.
     * İşlem isteği Inact RT servisi tarafından raporlanan fraud olasılığı nedeniyle reddedilmiştir.
     */
    ERR10103,
    /**
     * Invalid Card information
     */
    ERR10104,
    /**
     * This transaction cannot be done through the 3D verification process
     */
    ERR10106,
    /**
     * Campaign code not supported by payment system
     */
    ERR10107,
    /**
     * Point usage not supported by payment system
     */
    ERR10108,
    /**
     * This merchantpaymentId is used before and its session expired please use different merchantPaymentId
     */
    ERR10109,
    /**
     * One of the amount,currency,sessionType,returnUrl or apiAction parameter changed at this request
     */
    ERR10110,
    /**
     * Query Points not supported by payment system
     */
    ERR10111,
    /**
     * Invalid Points format
     */
    ERR10112,
    /**
     * Recurring Plan Not Found
     */
    ERR10113,
    /**
     * Recurring Plan with COMPLETED status can not be changed
     */
    ERR10114,
    /**
     * Recurrence count should be from 1 to 99
     */
    ERR10115,
    /**
     * Recurring Plan code already exists
     */
    ERR10116,
    /**
     * Wallet Session shouldn't contain merchantPaymentId
     */
    ERR10117,
    /**
     * Invalid commerce code parameter
     */
    ERR10118,
    /**
     * Payment system points type don't contains one of the point type in request
     */
    ERR10119,
    /**
     * Point value can not be blank
     */
    ERR10120,
    /**
     * Partial point usage not allowed by this payment system
     */
    ERR10121,
    /**
     * Restricted BIN information for 3D Authentication
     */
    ERR10122,
    /**
     * BKM Transaction Not Found
     */
    ERR10123,
    /**
     * Existing BKM Transaction
     */
    ERR10124,
    /**
     * It's not an update able transaction.
     */
    ERR10125,
    /**
     * Payment System Type or EFT code is required if bin is not given
     */
    ERR10126,
    /**
     * Extra parameter that is used when doing 3D Post Sale/Preauth is not validated
     */
    ERR10127,
    /**
     * This Recurring Plan has one or more processed transaction so it can not be deleted.
     */
    ERR10128,
    /**
     * Payment System Could Not Be Updated
     */
    ERR10129,
    /**
     * Payment System Name Exist
     */
    ERR10130,
    /**
     * Payment System Type Exist
     */
    ERR10131,
    /**
     * Connection Problem / Bad Credentials
     */
    ERR10132,
    /**
     * Can not edit disabled items.
     */
    ERR10133,
    /**
     * The payment system cannot be made default because it is not active.
     */
    ERR10134,
    /**
     * You cannot disable a default payment system. Please set a new default payment system first.
     */
    ERR10135,
    /**
     * Invalid Request parameter(generic error)
     */
    ERR10136,
    /**
     * This Pay By Link Payment is already PAID or CANCELED
     */
    ERR10137,
    /**
     * Customer not found
     */
    ERR10138,
    /**
     * Identity number should contain at least 11 digits
     */
    ERR10139,
    /**
     * Query Campaigns not supported by payment system
     */
    ERR10140,
    /**
     * Invalid Labels format
     */
    ERR10141,
    /**
     * Recurring Total Amount does not match Recurring Payments Amount Sum
     */
    ERR10142,
    /**
     * RecurringPlanCard not found
     */
    ERR10143,
    /**
     * Invalid Campaigns format
     */
    ERR10144,
    /**
     * Recurring Payment Status can be updated only to Manually Paid
     */
    ERR10145,
    /**
     * Recurring Payment Status cannot be updated
     */
    ERR10146,
    /**
     * Recurring Payment not found
     */
    ERR10147,
    /**
     * Recurring Plan Status Can Be Updated Only To Active or Inactive
     */
    ERR10148,
    /**
     * Can not activate Recurring Plan which has no card
     */
    ERR10149,
    /**
     * You should update first Recurring Plan Status to Active in order to update other fields of Recurring Plan or individual Recurring Payments
     */
    ERR10150,
    /**
     * Request is denied due to the transaction rules. Please contact your admin.
     */
    ERR10151,
    /**
     * Payment Type should apply to least one of Credit/Debit Cards or Business Cards
     */
    ERR10152,
    /**
     * Recurring amount should be higher than zero
     */
    ERR10153,
    /**
     * This transaction cannot be done without going through the 3D verification process
     */
    ERR10154,
    /**
     * Merchant can be enabled or disabled just by system users.
     */
    ERR10155,
    /**
     * Payment Policy not found
     */
    ERR10156,
    /**
     * Dealer not found
     */
    ERR10157,
    /**
     * Dealer with this code already exists
     */
    ERR10158,
    /**
     * Dealer is disabled, cannot perform action. Please contact your Super Admins
     */
    ERR10159,
    /**
     * Merchant User not found
     */
    ERR10160,
    /**
     * There's already a transaction in waiting for approval status
     */
    ERR10161,
    /**
     * Users only in Sales Representative role can be associated with dealers.
     */
    ERR10162,
    /**
     * Invalid transaction sub status
     */
    ERR10163,
    /**
     * User isn't permitted to make automated transactions.
     */
    ERR10164,
    /**
     * DealerType with this name already exist
     */
    ERR10165,
    /**
     * DealerType with this name not found
     */
    ERR10166,
    /**
     * This Dealer Type is related with more than one dealer, please update first them than try to delete this Dealer Type.
     */
    ERR10167,
    /**
     * DealerPST not found for the specified psType and dealerCode.
     */
    ERR10168,
    /**
     * Merchant User already exists
     */
    ERR10169,
    /**
     * DealerPST for this payment system type and dealer already exist.
     */
    ERR10170,
    /**
     * This Payment System Type does not exist for the specified merchant
     */
    ERR10171,
    /**
     * Payment Policy with provided information already exist for merchant.
     */
    ERR10172,
    /**
     * Value for this parameter should be on interval between 0.0000 and 99.9999
     */
    ERR10173,
    /**
     * Invalid transaction rules
     */
    ERR10174,
    /**
     * Can`t downgrade this user`s role!
     */
    ERR10176,
    /**
     * User could not be updated
     */
    ERR10177,
    /**
     * New Password must match Confirm New Password
     */
    ERR10178,
    /**
     * Message Content not found.
     */
    ERR10179,
    /**
     * Password must be at least 8 characters long, contain 1 upper-case letter, 1 lower-case letter, 1 digit and 1 symbol.
     */
    ERR10180,
    /**
     * PGTRANIDTOREFUND parameter can not be null for this action
     */
    ERR10181,
    /**
     * Message Content with this type and language already exists
     */
    ERR10182,
    /**
     * Invoice with this id exists for specified dealer and merchant
     */
    ERR10183,
    /**
     * Invoice not found
     */
    ERR10184,
    /**
     * This invoice has been PAID so it can not be updated or deleted.
     */
    ERR10185,
    /**
     * Invoices are issued only to dealers.
     */
    ERR10187,
    /**
     * Amount should be lower or equal to Original Amount
     */
    ERR10188,
    /**
     * Due date should be after issue date
     */
    ERR10189,
    /**
     * Payment System Rule already exists
     */
    ERR10190,
    /**
     * User is not found
     */
    ERR10191,
    /**
     * User is disabled
     */
    ERR10192,
    /**
     * User is locked
     */
    ERR10193,
    /**
     * Passowrd Recovery Token not found or expired
     */
    ERR10194,
    /**
     * Invalid user credentials
     */
    ERR10195,
    /**
     * IP Address was not found in System Settings white list
     */
    ERR10196,
    /**
     * This card is already saved for another customer
     */
    ERR10197,
    /**
     * This type of card is not allowed for card saving, please use another card.
     */
    ERR10198,
    /**
     * Transaction Type Not Supported By This Payment System
     */
    ERR10199,
    /**
     * Unhandled payment integration exception
     */
    ERR10200,
    /**
     * Provided submerchant code and/or dealer code is not correct
     */
    ERR10201,
    /**
     * VKN should contain at least 10 digits
     */
    ERR10202,
    /**
     * End Date should be equal or after start date.
     */
    ERR10203,
    /**
     * DealerCommissionRate with these values already exist.
     */
    ERR10204,
    /**
     * DealerCommissionRate not found.
     */
    ERR10205,
    /**
     * Rules can be added only for SubDealers, check the parent Dealer
     */
    ERR10206,
    /**
     * Rules can not be decoded, check the encoded RULE parameter
     */
    ERR10207,
    /**
     * Parent Dealer Rules has been exceeded
     */
    ERR10208,
    /**
     * Maximum installment count for the commerce code is exceeded.
     */
    ERR10209,
    /**
     * You cannot delete a default Subdealer Type. Please set a new default Subdealer Type first.
     */
    ERR10210,
    /**
     * Split Payment Code exists
     */
    ERR10211,
    /**
     * Invalid City ID
     */
    ERR10212,
    /**
     * Please make sure that you have a default payment system.
     */
    ERR10213,
    /**
     * Payment system type and name exist
     */
    ERR10214,

    /**
     * DEALERTYPENAME is only used when multiple accounts per bank is active
     */
    ERR10215,

    /**
     * CVV Display parameter error code
     */
    ERR10216,
    /**
     * Partial void transaction is not supported by this payment system.
     */
    ERR10217,
    /**
     * Transaction type is not supported for partial void
     */
    ERR10218,
    /**
     * Invalid void amount
     */
    ERR10219,
    /**
     * There is a active BIN rule with the same name
     */
    ERR10220,
    /**
     * BIN rule not found for the merchant
     */
    ERR10221,
    /**
     * One of the conditional fields is required for Bin Rule
     */
    ERR10222,
    /**
     * Merchant Bin Rule with different name but same parameters is already defined
     */
    ERR10223,
    /**
     * Maximum installment count is exceed
     */
    ERR10224,
    /**
     * Country Code and Foreign can not be used at the same time.
     */
    ERR10225,
    /**
     * Custom Field Group not found
     */
    ERR10226,
    /**
     * Custom Field Group with this name already exists
     */
    ERR10227,
    /**
     * Invalid Custom Field Availabilities
     */
    ERR10228,
    /**
     * Custom field already exists
     */
    ERR10229,
    /**
     * Custom Field not found
     */
    ERR10230,
    /**
     * Invalid Custom Fields
     */
    ERR10231,
    /**
     * Custom Field Required
     */
    ERR10232,
    /**
     * Custom Field Management Feature required to perform this action.
     */
    ERR10233,
    /**
     * Invalid card cutoff day
     */
    ERR10234,
    /**
     * Invalid Users
     */
    ERR10235,
    /**
     * Payment System Rule not found
     */
    ERR10236,
    /**
     * Associated Payment System not found
     */
    ERR10237,
    /**
     * Payment System Sharing Management Feature required for this action
     */
    ERR10238,
    /**
     * Invalid settings parameter
     */
    ERR10239,
    /**
     * Reconciliation Schema does not exist
     */
    ERR10240,
    /**
     * Reconciliation Schema already exists
     */
    ERR10241,
    /**
     * User is inactive or undefined
     */
    ERR10242,
    /**
     * The USER parameter can not be used for your merchant.
     */
    ERR10243,
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Start of available API error codes that aren't used ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Api Error codes below aren't being used on code, they may have been deleted or skipped. Please use them,
    // and after using any of it please make sure that you have removed it from the list below.

    /**
     * ERR10175
     */
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ End of available API error codes that aren't used~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Payment gateway error codes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    ERR20001,
    ERR20002,
    ERR20003,
    ERR20004,
    ERR20005,
    ERR20006,
    ERR20007,
    ERR20008,
    ERR20009,
    ERR20010,
    ERR20011,
    ERR20012,
    ERR20013,
    ERR20014,
    ERR20015,
    ERR20016,
    ERR20017,
    ERR20018,
    ERR20019,
    ERR20020,
    ERR20021,
    ERR20025,
    ERR20026,
    ERR20027,
    ERR20028,
    ERR20029,
    ERR20030,
    ERR20031,
    ERR20032,
    ERR20033,
    ERR20034,
    ERR20036,
    ERR20037,
    ERR20038,
    ERR20039,
    ERR20040,
    ERR20041,
    ERR20043,
    ERR20051,
    ERR20052,
    ERR20053,
    ERR20054,
    ERR20055,
    ERR20056,
    ERR20057,
    ERR20058,
    ERR20059,
    ERR20061,
    ERR20062,
    ERR20063,
    ERR20065,
    ERR20068,
    ERR20069,
    ERR20073,
    ERR20075,
    ERR20076,
    ERR20077,
    ERR20078,
    ERR20079,
    ERR20080,
    ERR20081,
    ERR20082,
    ERR20083,
    ERR20084,
    ERR20085,
    ERR20086,
    ERR20088,
    ERR20089,
    ERR20090,
    ERR20091,
    ERR20092,
    ERR20093,
    ERR20094,
    ERR20095,
    ERR20096,
    ERR20098,
    ERR20099,
    ERR20127,
    ERR200GK,
    ERR200SF,
    ERR200YK,
    ERR30001,
    ERR30002,
    /**
     * Api Error Code for Transaction Rules
     */
    ERR30003,
    /**
     * Api Error Code for Fraud Rules
     */
    ERR30004,
}
