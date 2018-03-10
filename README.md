# msu-api-sdk
## MSU API Fluent SDK - Java - [MerchantSafe Unipay](http://merchantsafeunipay.asseco.com/)
[API Documentation](https://test.merchantsafeunipay.com/msu/api/v2/doc)


Credential Storage is supported in three Locations
- Property File in Classpath (i.e. `src/main/resources/msuCredentials.properties`) 
```
  merchantBusinessId=testmerchant
  merchantuser=apiuser@testmerchant.com
  merchantpassword=******
```
```java
Authentication userCredentialsAuthentication = new UserCredentialsAuthentication(
		new ClasspathPropertyFileCredentialsProvider());
```

- Environment Variables with keys
```
  MSU_MERCHANT_BUSINESS_ID=testmerchant
  MSU_MERCHANT_USER=apiuser@testmerchant.com
  MSU_MERCHANT_PASSWORD=******
```
```java
Authentication userCredentialsAuthentication = new UserCredentialsAuthentication(
		new EnvironmentVariableCredentialsProvider());
```

- Static Credentials In Code
```java
Authentication userCredentialsAuthentication = new UserCredentialsAuthentication(
		new StaticCredentialsProvider("testmerchant", "apiuser@testmerchant.com", "******"));
```

## Setting Up The Client
```java
MsuApiClient msuClient = new MsuApiClientBuilder().withDefaultAuthentication(userCredentialsAuthentication)
		.build();
```
## Sending Requests
- Session Token request

```java
SessionTokenRequest sessionTokenRequest = SessionTokenRequest.builder().withCurrency(Currency.TRY)
		.withAmount(new BigDecimal("100.00")).withCustomer("customer-3828342004")
		.withMerchantPaymentId("payment-1834832985932").withReturnUrl("http://www.returnurl.com").build();
SessionTokenResponse sessionTokenResponse = msuClient.doRequest(sessionTokenRequest);
```
A session token request can be created and used for subsequent requests for as long as it's not expired. If session token authentication is not set on request, `defaultAuthentication` set on the client is used.
Here's a PREAUTH request authenticated with a session token.
```java
SessionTokenRequest sessionTokenRequest = SessionTokenRequest.builder().withCurrency(Currency.TRY)
		.withAmount(new BigDecimal("100.00")).withCustomer("customer-3828342004")
		.withMerchantPaymentId("payment-1834832985932").withReturnUrl("http://www.returnurl.com").build();
SessionTokenResponse sessionTokenResponse = msuClient.doRequest(sessionTokenRequest);

Authentication sessionTokenAuthentication = SessionTokenAuthentication.sessionTokenAuthentication()
		.withToken(sessionTokenResponse.getSessionToken()).build();

// preauth request uses previously created token
PreauthRequest preauthRequest =  PreauthRequest.builder().withAuthentication(sessionTokenAuthentication)
		.withNameOnCard("Filan Fisteku").withCardPan("4022774022774026").withCardExpiry("02.2021")
		.withCardCvv("000").build();
PreauthResponse preauthResponse = msuClient.doRequest(preauthRequest);
// can do other requests with the same token
```

- Query Transaction request

```java
// query transactions by date and status
QueryTransactionRequest request = QueryTransactionRequest.builder().withTransactionStatus("AP")
        .withStartDate("01-01-2016 01:00").withEndDate("05-05-2016 20:00").withOffset("100").withLimit("20").build();
QueryTransactionResponse response = msuClient.doRequest(request);
```

- Query Merchant request
```java
QueryMerchantRequest queryMerchantRequest = QueryMerchantRequest.builder().build(); // the queried merchant is the one making the request
QueryMerchantResponse queryMerchantResponse = msuClient.doRequest(queryMerchantRequest);
```

- Query Merchant Content request

```java
QueryMerchantContentRequest queryMerchantContentRequest = QueryMerchantContentRequest.builder().withLanguage("en")
	.withMessageContentType("contact").build();
QueryMerchantContentResponse queryMerchantContentResponse = msuClient.doRequest(queryMerchantContentRequest);
```

- Query Message Content request

```java
QueryMessageContentRequest request = QueryMessageContentRequest.builder()
    .withLanguage("en").withMessageContentType("contact").build();
QueryMessageContentResponse response = msuClient.doRequest(request);
```

- Query Merchant Status History request

```java
QueryMerchantStatusHistoryRequest request = QueryMerchantStatusHistoryRequest.builder().withStatus("OK")
                .withStartDate("08-03-2017 18:00").withEndDate("08-03-2018 18:00").build();
QueryMerchantStatusHistoryResponse response = msuClient.doRequest(request);
```

- Query Merchant User request

```java
QueryMerchantUserRequest request = QueryMerchantUserRequest.builder()
		.withMerchantUserEmail("apiuser@testmerchant.com").withRole("mapiu").build();
QueryMerchantUserResponse response = msuClient.doRequest(request);
```

- Query User Role Permission request

```java
QueryUserRolePermissionRequest request = QueryUserRolePermissionRequest.builder().withRole("MSADM")
                .withPermission("API_QUERYMERCHANT").build();
QueryUserRolePermissionResponse response = msuClient.doRequest(request);
```

- Query Dealer request

```java
QueryDealerRequest request = QueryDealerRequest.builder().withDealerCode("test")
             .withParentDealerCode("").build();
QueryDealerResponse response = msuClient.doRequest(request);
```

- Query Transaction Rule Request

```java
QueryTransactionRuleRequest request = QueryTransactionRuleRequest.builder()
            .withDealerCode("test").build();
QueryTransactionRuleResponse response = msuClient.doRequest(request);
```
