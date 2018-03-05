# msu-api-sdk
## MSU API Fluent SDK - Java

Credential Storage is supported in three Locations
- Property File in Classpath (msuCredentials.properties) 
```
  merchantBusinessId=testmerchant
  merchantuser=apiuser@testmerchant.com
  merchantpassword=******
```
- Environment Variables with keys
```
  MSU_MERCHANT_BUSINESS_ID=testmerchant
  MSU_MERCHANT_USER=apiuser@testmerchant.com
  MSU_MERCHANT_PASSWORD=******
```
- Static Credentials In Code
```java
Authentication userCredentialsAuthentication = new UserCredentialsAuthentication(
		new StaticCredentialsProvider("testmerchant", "apiuser@testmerchant.com", "******"));
```

## Setting Up The Client
- With Credentials In Property File in Classpath
```java 
Authentication userCredentialsAuthentication = new UserCredentialsAuthentication(new ClasspathPropertyFileCredentialsProvider());
MsuApiClient msuClient = new MsuApiClientBuilder().withDefaultAuthentication(userCredentialsAuthentication).build();
```
- With Credentials In Environment Variables
```java
Authentication userCredentialsAuthentication = new UserCredentialsAuthentication(new EnvironmentVariableCredentialsProvider());
MsuApiClient msuClient = new MsuApiClientBuilder().withDefaultAuthentication(userCredentialsAuthentication).build();
```

