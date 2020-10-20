# msu-api-sdk
## MSU API Fluent SDK - Java - [MerchantSafe Unipay](http://merchantsafeunipay.asseco.com/)
[API Documentation](https://test.merchantsafeunipay.com/msu/api/v2/doc)


### Include in classpath:
```xml
<dependency>
    <groupId>com.merchantsafeunipay</groupId>
    <artifactId>msu-java-sdk</artifactId>
    <version>1.0.2</version>
</dependency>
```
###Credential Storage is supported in three locations:
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
MsuApiClient msuClient = new MsuApiClientBuilder()
    .withDefaultAuthentication(userCredentialsAuthentication)
    .withUrl("https://neon-app.asseco-see.com.tr/msu/api/v2") // if not set, TEST env url is used
    .withPrettyPrintRequests(true) // default false - to avoid console cluttering
    .build();
```

## Sending Requests
- Session Token request

```java
SessionTokenRequest sessionTokenRequest = SessionTokenRequest.builder().withCurrency(Currency.TRY)
        .withSessionType(SessionType.PAYMENTSESSION)
        .withAmount(new BigDecimal("100.00"))
        .withCustomer("customer-3828342004")
        .withMerchantPaymentId("payment-8945456121")
        .withReturnUrl("http://www.returnurl.com")
        .build();
SessionTokenResponse sessionTokenResponse = client.doRequest(sessionTokenRequest);
```
A session token request can be created and used for subsequent requests for as long as it's not expired. If session token authentication is not set on request, `defaultAuthentication` set on the client is used.
Here's a Preauth request authenticated with a session token.
```java
SessionTokenRequest sessionTokenRequest = SessionTokenRequest.builder()
        .withSessionType(SessionType.PAYMENTSESSION)
        .withCurrency(Currency.TRY)
        .withAmount(new BigDecimal("100.00"))
        .withCustomer("customer-3828342004")
        .withMerchantPaymentId("payment-8945456121")
        .withReturnUrl("http://www.returnurl.com")
        .build();
SessionTokenResponse sessionTokenResponse = client.doRequest(sessionTokenRequest);

Authentication sessionTokenAuthentication = SessionTokenAuthentication
        .builder()
        .withToken(sessionTokenResponse.getSessionToken())
        .build();

// preauth request uses previously created token
PreauthRequest preauthRequest =  PreauthRequest.builder()
    .withAuthentication(sessionTokenAuthentication)
    .withNameOnCard("Filan Fisteku")
    .withCardPan("4022774022774026")
    .withCardExpiry("02.2026")
    .withCardCvv("000")
    .build();
PreauthResponse preauthResponse = msuClient.doRequest(preauthRequest);

```
- Preauth (without session token)
```java
PreauthRequest preauthRequest =  PreauthRequest.builder()
    .withNameOnCard("Filan Fisteku")
    .withAmount(new BigDecimal("240.55"))
    .withCurrency(Currency.TRY)
    .withCustomer("merchant-customer-id")
    .withMerchantPaymentId(String.valueOf(new Random().nextInt(16)))
    .withCardPan("4022774022774026")
    .withCardExpiry("02.2026")
    .withCardCvv("000")
    .build();
```
- Query Transaction request

```java
// query transactions by date and status
QueryTransactionRequest request = QueryTransactionRequest.builder()
    .withTransactionStatus("AP")
    .withStartDate("01-01-2016 01:00")
    .withEndDate("05-05-2016 20:00")
    .withOffset("100")
    .withLimit("20")
    .build();
QueryTransactionResponse response = msuClient.doRequest(request);
```

- Query Installment request

```java
QueryInstallmentRequest request = QueryInstallmentRequest.builder()
    .withPaymentSystem("Odeabank")
    .withPaymentSystemType("ODEABANK")
    .withStatus("OK")
    .build();
QueryInstallmentResponse response = msuClient.doRequest(request);
```

- Query Card request

```java
QueryCardRequest request = QueryCardRequest.builder()
    .withCustomer("CUSTOMER")
    .build();
QueryCardResponse response = msuClient.doRequest(request);
```

- Query Card Expiry request

```java
QueryCardExpiryRequest request = QueryCardExpiryRequest.builder()
    .withCustomer("CUSTOMER")
    .build();
QueryCardResponse response = msuClient.doRequest(request);
```

- Query Customer request

```java
QueryCustomerRequest request = QueryCustomerRequest.builder()
    .withCustomer("CUSTOMER") // by MerchantCustomerId
    .build(); 
QueryCustomerResponse response = msuClient.doRequest(request);
```

- Query Merchant request
```java
QueryMerchantRequest queryMerchantRequest = QueryMerchantRequest.builder().build(); // the queried merchant is the one making the request
QueryMerchantResponse queryMerchantResponse = msuClient.doRequest(queryMerchantRequest);
```

- Query Merchant Content request

```java
QueryMerchantContentRequest queryMerchantContentRequest = QueryMerchantContentRequest.builder()
    .withLanguage("en")
	.withMessageContentType("contact")
    .build();
QueryMerchantContentResponse queryMerchantContentResponse = msuClient.doRequest(queryMerchantContentRequest);
```

- Query Message Content request

```java
QueryMessageContentRequest request = QueryMessageContentRequest.builder()
    .withLanguage("en")
    .withMessageContentType("contact")
    .build();
QueryMessageContentResponse response = msuClient.doRequest(request);
```

All other requests are issues in similar fashion, you can browse `com.merchantsafeunipay.sdk.request.apiv2` to see request classes and check `com.merchantsafeunipay.sdk.response` for respective response classes.
