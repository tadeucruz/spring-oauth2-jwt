# spring-oauth2-jwt

This project is an exemple of Spring + Spring Security + OAuth2 using JWT Token focous in microservice. 

### *authorizationServer* 
Is responsable to manager user, auth and manager the Token. The project will run on 8080 

```bash
curl -X POST -u my-trusted-client:secret "http://localhost:8080/oauth/token?grant_type=password&username=tadeucruz&password=1q2w3e"
```

### *resourceServer* 
Is responsible to response for API endpoint, and the only will do this if the user is auth and is ADMIN. The project will run on 8081

```bash
curl -H "Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJyb2xlIjoiUk9MRV9VU0VSIiwidXNlcl9uYW1lIjoidGFkZXVjcnV6Iiwic2NvcGUiOlsicmVhZCIsIndyaXRlIl0sImV4cCI6MTQ5NTcwNTEyOCwidXVpZCI6ImUwZjNjOGM4LThmNzMtNDkzNS1hYjY3LWUxMDRhNjkyNzg2YyIsImF1dGhvcml0aWVzIjpbIlJPTEVfVVNFUiJdLCJqdGkiOiJjY2M0MTJiMi05ZTQ0LTQzODktOWIwMS01YzRjODRhYzRmNjUiLCJjbGllbnRfaWQiOiJteS10cnVzdGVkLWNsaWVudCJ9.65kTz4Omiy1a1RTgAoEtGKcidh9VUeqoM3wskHdw4sc" http://localhost:8081/endpoint/
```

## TODO:
* Use RSA Key for JWT
* Create user from when start the authorizationServer

# References 

* http://websystique.com/spring-security/secure-spring-rest-api-using-oauth2/
* http://www.baeldung.com/spring-security-oauth-jwt
* http://www.programming-free.com/2016/01/spring-security-spring-data-jpa.html
* https://github.com/nisabek/spring-security-JWT/
