package com.merchantsafeunipay.sdk.request.enumerated;


public enum ApiAction {
    /**
     * SESSION TOKEN REQUEST FOR API VERSION 2 PAYMENT PAGE AND WALLET PAGE MODEL
     */
    SESSIONTOKEN,
    /**
     * Session token request VERSION 1
     */
    @Deprecated
    TOKEN,
    /**
     * Direct sale via API
     */
    SALE,
    /**
     * Direct sale 3D via API
     */
    SALE3D,
    /**
     * Direct pre-authorization via API
     */
    PREAUTH,
    /**
     * Direct preauth 3D via API
     */
    PREAUTH3D,
    /**
     * Direct post-authorization via API
     */
    POSTAUTH,
    /**
     * Direct void / cancellation via API
     */
    VOID,
    /**
     * Direct refund / partial refund via API
     */
    REFUND,
    /**
     * Direct detached refund via API
     */
    DETACHEDREFUND,
    /**
     * Query services via API
     */
    QUERY,
    /**
     * Payment confirmation action for model 2 payments
     */
    PAYMENTCONFIRMATION,
    /**
     * EWALLET
     */
    EWALLET,
    /**
     * Creates a dummy payment for adding cards with 3D authentication, via
     * payment page. @Deprecated in favor of WALLET action
     */
    @Deprecated
    MYCARDS,
    /**
     * Creates a dummy payment for adding cards with 3D authentication, via
     * payment page
     */
    WALLET,
    /**
     * An action available only for 'Lets Bodrum' merchants
     */
    LETSBODRUM,
    /**
     * Action For reporting
     * An action for creating recurring payment plan (using Basic API Fields) via API
     */
    REPORT,
    /**
     * Action for payment type
     */
    PAYMENTTYPE,
    /**
     * Api action to query transaction
     */
    QUERYTRANSACTION,
    /**
     * Api action to query dealer transaction
     */
    QUERYDEALERTRANSACTION,
    /**
     * Api action to query installments
     */
    QUERYINSTALLMENT,
    /**
     * @param EWALLETREMOVE
     * @return
     */
    EWALLETDELETECARD,
    /**
     * Action for Adding Cards for API v2
     */
    EWALLETADDCARD,
    /**
     * Action for Editing Cards for API v2
     */
    EWALLETEDITCARD,
    /**
     * Action for Querying Cards for API v2
     */
    QUERYCARD,
    /**
     * Action to check is card savable
     */
    EWALLETISCARDSAVABLE,
    /**
     * Action for Adding paymentType for API v2
     */

    QUERYPSINSTALLMENT,
    /**
     * Action for Query to bank installments according to card
     */
    PAYMENTTYPEADD,
    /**
     * Action for Adding paymentType for API v2
     */
    PAYMENTTYPEEDIT,
    /**
     * Action for quering all info about given session for APIv2
     */
    QUERYSESSION,
    /**
     * Query Card Expiry
     */
    QUERYCARDEXPIRY,
    /**
     * Query BIN data
     */
    QUERYBIN,
    /**
     * Query Offline Campaign Data
     */
    QUERYCAMPAIGN,
    /**
     * Query Bin Based Action
     */
    QUERYBINBASEDACTION,
    /**
     * Query Online Campaign Data
     */
    QUERYCAMPAIGNONLINE,
    /**
     * Query Recon
     */
    RECONTRANSACTION,
    /**
     * Action for Editing Recurring Payment
     */
    RECURRINGPAYMENTEDIT,
    /**
     * Action for adding recurring plans for API v2
     */
    RECURRINGPLANADD,
    /**
     * Action for editing recurring plans for API v2
     */
    RECURRINGPLANEDIT,
    /**
     * Action for deleting recurring plans for API v2
     */
    RECURRINGPLANDELETE,
    /**
     * Action for querying recurring plans for API v2
     */
    QUERYRECURRINGPLAN,
    /**
     * Query points of the card Owner from bank side
     */
    QUERYPOINTS,
    /**
     * Api action to add payment policy.
     */
    PAYMENTPOLICYADD,
    /**
     * Api action to edit payment policy.
     */
    PAYMENTPOLICYEDIT,
    /**
     * Query payment policies
     */
    QUERYPAYMENTPOLICY,
    /**
     * Action for enabling Payment System for API v2
     */
    PAYMENTSYSTEMENABLE,
    /**
     * Action for adding Payment System for API v2
     */
    PAYMENTSYSTEMADD,
    /**
     * Action for editing Payment System for API v2
     */
    PAYMENTSYSTEMEDIT,
    /**
     * Action for disabling Payment System for API v2
     */
    PAYMENTSYSTEMDISABLE,
    /**
     * Action for Payment System details for API v2
     */
    PAYMENTSYSTEMREAD,
    /**
     * Query payment systems
     */
    QUERYPAYMENTSYSTEMS,
    /**
     * Query merchant contents
     */
    QUERYMERCHANTCONTENT,
    /**
     * List merchant's Payment Systems
     */
    QUERYMERCHANTPAYMENTSYSTEMS,
    /**
     * Action to create a MSU transaction and a relation for BKM based transactions
     */
    BKMTRANSACTIONADD,
    /**
     * Action to update PG related fields of a BKM based transaction after it finishes
     */
    BKMTRANSACTIONEDIT,
    /**
     * Action to query a BKM related tranasctions
     */
    QUERYBKMTRANSACTION,
    /**
     * Action to query Payment System Data
     */
    QUERYPAYMENTSYSTEMDATA,
    /**
     * Action to create a MSU transaction for ComPay based transactions
     */
    COMPAYTRANSACTIONADD,
    /**
     * Action to update a MSU transaction for ComPay based transactions
     */
    COMPAYTRANSACTIONEDIT,
    /**
     * Action to Update InterimPageUrl of Session object which is used to return data to MicroServices
     */
    EDITSESSION,
    /**
     * Action to query pay by link payments
     */
    QUERYPAYBYLINKPAYMENT,
    /**
     * Action to create pay by link payment
     */
    PAYBYLINKPAYMENT,
    /**
     * Action to cancel a pay by link payment
     */
    PAYBYLINKPAYMENTCANCEL,
    /**
     * Action to resend a pay by link payment
     */
    PAYBYLINKPAYMENTRESEND,
    /**
     * Action to extend a pay by link payment
     */
    SESSIONEXTEND,
    /**
     * Action to add a new message content
     */
    MESSAGECONTENTADD,
    /**
     * Action to edit a message content
     */
    MESSAGECONTENTEDIT,
    /**
     * Action to edit a message content
     */
    QUERYMESSAGECONTENT,
    /**
     * Action to save a card and relate it to the specific recurring plan
     */
    RECURRINGPLANCARDADD,
    /**
     * Action to delete the relation of card and recurring plan
     */
    RECURRINGPLANCARDDELETE,
    /**
     * Action to list cards of recurring plan
     */
    QUERYRECURRINGPLANCARD,
    /**
     * API Action to re-send notification to cardholder
     */
    RECURRINGPLANRESENDLINK,
    /**
     * API Action to ENABLE Merchant
     */
    MERCHANTENABLE,
    /**
     * API Action to DISABLE Merchant
     */
    MERCHANTDISABLE,
    /**
     * API Action to query customer data
     */
    QUERYCUSTOMER,
    /**
     * API Action to query merchant status history
     */
    QUERYMERCHANTSTATUSHISTORY,
    /**
     * API Action to list split payments
     */
    QUERYSPLITPAYMENT,
    /**
     * API Action to add dealer
     */
    DEALERADD,
    /**
     * API Action to edit dealer
     */
    DEALEREDIT,
    /**
     * API Action to query dealers
     */
    QUERYDEALER,
    /**
     * API Action to Enable Dealer
     */
    DEALERENABLE,
    /**
     * API Action to Approve Dealer
     */
    DEALERAPPROVE,
    /**
     * API Action to Disable Dealer
     */
    DEALERDISABLE,
    /**
     * API Action to approve a WA transaction
     */
    APPROVETRANSACTION,
    /**
     * API Action to reject a transaction which is waiting for approval
     */
    REJECTTRANSACTION,
    /**
     * API Action to query dealer status history
     */
    QUERYDEALERSTATUSHISTORY,
    /**
     * API Action to add merchantUser and dealer relation
     */
    MERCHANTUSERDEALERADD,
    /**
     * API Action to remove relation between merchantUser and dealer
     */
    MERCHANTUSERDEALERREMOVE,
    /**
     * API Action to query dealers of merchant user
     */
    QUERYMERCHANTUSERDEALERS,
    /**
     * API Action to query groups with merchants belonging to them
     */
    QUERYGROUPS,
    /**
     * API Action to query executive report
     */
    QUERYEXECUTIVEREPORT,
    /**
     * API action to add and invite merchant user.
     */
    MERCHANTUSERADD,
    /**
     * API action to edit merchant user.
     */
    MERCHANTUSEREDIT,
    /**
     * Api action to reinvite a merchant user.
     */
    MERCHANTUSERREINVITE,
    /**
     * Api action to add dealer type.
     */
    DEALERTYPEADD,
    /**
     * Api action to edit dealer type.
     */
    DEALERTYPEEDIT,
    /**
     * Api action to delete dealer type.
     */
    DEALERTYPEDELETE,
    /**
     * Api action to query dealer type.
     */
    QUERYDEALERTYPE,
    /**
     * Api action to add dealer pst.
     */
    DEALERPSTADD,
    /**
     * Api action to edit dealer pst.
     */
    DEALERPSTEDIT,
    /**
     * Api action to delete dealer pst.
     */
    DEALERPSTDELETE,
    /**
     * Api action to query dealer pst.
     */
    QUERYDEALERPST,
    /**
     * Api action to query merchant user.
     */
    QUERYMERCHANTUSER,
    /**
     * Api action to query merchant.
     */
    QUERYMERCHANT,
    /**
     * Api query merchant profile
     */
    QUERYMERCHANTPROFILE,
    /**
     * Api query user role permission
     */
    QUERYUSERROLEPERMISSION,
    /**
     * Api action to enable payment type
     */
    PAYMENTTYPEENABLE,
    /**
     * Api action to disable payment type
     */
    PAYMENTTYPEDISABLE,
    /**
     * Api action to query merchant's transaction rules of a dealer (or all)
     */
    QUERYTRANSACTIONRULE,
    /**
     * Api action to simulate merchant's rule behaviour for api action and amount
     */
    CHECKTRANSACTIONRULE,
    /**
     * Query Payment (single or list)
     */
    QUERYPAYMENT,
    /**
     * Api action to add new invoice
     */
    INVOICEADD,
    /**
     * Api action to update specific invoice
     */
    INVOICEEDIT,
    /**
     * Api action to delete specific invoice
     */
    INVOICEDELETE,
    /**
     * Api action to delete all invoices with one call
     */
    INVOICEDELETEALL,
    /**
     * Api action to query invoices belonging to specific merchant
     */
    QUERYINVOICE,
    /**
     * Recover User Password
     */
    RECOVERPASSWORD,
    /**
     * Query User Password Recovery Token
     */
    QUERYPASSWORDTOKEN,
    /**
     * Reset user password
     */
    RESETPASSWORD,
    /**
     * Api action to query dealer features
     */
    QUERYDEALERFEATURE,
    /**
     * Authenticate merchant user via username and password
     */
    AUTHMERCHANTUSER,
    /**
     * Action to query transaction statistics
     */
    QUERYTRANSACTIONSTATS,
    /**
     * Action to add commission rate for dealer
     */
    DEALERCOMMISSIONRATEADD,
    /**
     * Action to edit commission rate for dealer
     */
    DEALERCOMMISSIONRATEEDIT,
    /**
     * Action to delete commission rate for specific dealer
     */
    DEALERCOMMISSIONRATEDELETE,
    /**
     * Action to delete all commission rates for specific dealer
     */
    DEALERCOMMISSIONRATEDELETEALL,
    /**
     * Action to query commission rates for all dealers or specific dealer
     */
    QUERYDEALERCOMMISSIONRATE,
    /**
     * Api action to add dealer transaction rules
     */
    DEALERTRANSACTIONRULEADD,
    /**
     * Api action to edit dealer transaction rules
     */
    DEALERTRANSACTIONRULEEDIT,
    /**
     * Api action to query cities
     */
    QUERYCITY,
    /**
     * Api action to update status of Transaction
     */
    UPDATETRANSACTIONSTATUS,
    /**
     * Api action to add Customer
     */
    CUSTOMERADD,
    /**
     * Api action to update the existing Customer
     */
    CUSTOMEREDIT,
    /**
     * Api action to add merchant HPP settings
     */
    MERCHANTHPPSETTINGEDIT,
    /**
     * Api action to delete merchant HPP settings
     */
    MERCHANTHPPSETTINGDELETE,
    /**
     * Api action to add merchant HPP settings
     */
    QUERYMERCHANTHPPSETTING,
    /**
     * Api action to query same card
     */
    QUERYSAMECARD,
    /**
     * Api action to query customers of same card
     */
    QUERYSAMECARDCUSTOMERS,
    /**
     * API Action to add a dealer user
     */
    DEALERUSERADD,
    /**
     * API Action to edit a dealer user
     */
    DEALERUSEREDIT,
    /**
     * External refund / partial refund via API
     */
    EXTERNALREFUND,
    /**
     * Kills Sessions via API
     */
    SESSIONKILL,
    /**
     * Add merchant bin rule
     */
    MERCHANTBINRULEADD,
    /**
     * Edit Merchant bin rule
     */
    MERCHANTBINRULEEDIT,
    /**
     * Delete Merchant bin rules
     */
    MERCHANTBINRULEDELETE,
    /**
     * Query Merchant bin rules
     */
    QUERYMERCHANTBINRULE,
    /**
     * Should Do 3D
     */
    SHOULDDO3D,
    /**
     * Query allowed installment counts
     */
    QUERYMAXINSTALLMENTCOUNTS,


    CUSTOMFIELDGROUPADD,
    CUSTOMFIELDGROUPEDIT,
    CUSTOMFIELDGROUPDELETE,
    QUERYCUSTOMFIELDGROUP,
    /**
     * Add Custom Field
     */
    CUSTOMFIELDADD,
    /**
     * Edit Custom Field
     */
    CUSTOMFIELDEDIT,
    /**
     * Delete Custom Field
     */
    CUSTOMFIELDDELETE,
    /**
     * Query Custom Field
     */
    QUERYCUSTOMFIELD,
    /**
     * Auth Token for Loan Payment
     */
    LOANPAYMENTAUTHTOKEN,
    /**
     * Query Card Details
     */
    QUERYCARDDETAILS,

    SHAREDPAYMENTSYSTEMADD, SHAREDPAYMENTSYSTEMDELETE, PAYMENTSYSTEMRULEADD, QUERYPAYMENTSYSTEMRULE, PAYMENTSYSTEMRULEDELETE, PAYMENTSYSTEMRULEEDIT, QUERYRECONCILIATIONSCHEMA, QUERYSHAREDPAYMENTSYSTEM, RECONCILIATIONSCHEMAADD, RECONCILIATIONSCHEMAEDIT,

    QUERYBNPLPRODUCT,

    EDITSESSIONTOKEN,
    /**
     * API action to edit sessiontoken amount and returnurl.
     */

    PAYBYLINKPAYMENTEDIT,
    /**
     * API action to edit sessiontoken amount and returnurl.
     */

    GENERATEOTP,
    /**
     * API action to generate and validate otp.
     */

    QUERYMERCHANTFEATURE,
    /**
     * API action to query merchant feature status visibility.
     */

    COMMISSIONSCHEMAADD, COMMISSIONSCHEMAEDIT, QUERYCOMMISSIONSCHEMA,

    QRPAYMENT,

    QUERYAGRITEMPLATE,

    QUERYOFFLINECAMPAIGNDATA;

    public static ApiAction fromString(String input) {
        for (ApiAction a : values()) {
            if (a.name().equals(input))
                return a;
        }
        return null;
    }
}
