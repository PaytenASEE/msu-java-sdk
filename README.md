# msu-api-sdk
## MSU API Fluent SDK - Java - [MerchantSafe Unipay](http://merchantsafeunipay.asseco.com/)



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
### Using Session Token to authenticate other requests
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
```
If authentication is not set on request, `defaultAuthentication` set on the client is used
