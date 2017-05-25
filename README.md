# spring-oauth2-jwt

This project is an exemple of Spring + Spring Security + OAuth2 using JWT Token focous in microservice. 

### *authorizationServer* 
Is responsable to manager user, auth and manager the Token. The project will run on 8080 
### *resourceServer* 
Is responsible to response for API endpoint, and the only will do this if the user is auth and is ADMIN. The project will run on 8081

## TODO:
* Use RSA Key for JWT
* Create user from when start the authorizationServer

# References 

* http://websystique.com/spring-security/secure-spring-rest-api-using-oauth2/
* http://www.baeldung.com/spring-security-oauth-jwt
* http://www.programming-free.com/2016/01/spring-security-spring-data-jpa.html
* https://github.com/nisabek/spring-security-JWT/
