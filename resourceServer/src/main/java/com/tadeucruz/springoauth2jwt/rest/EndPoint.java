package com.tadeucruz.springoauth2jwt.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;
import org.springframework.security.oauth2.provider.token.ResourceServerTokenServices;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class EndPoint {
    @Autowired
    private ResourceServerTokenServices tokenServices;

    @PreAuthorize("hasRole('ROLE_USER')")
    @RequestMapping(value = "/endpointuser", method = RequestMethod.GET)
    public ResponseEntity<String> endPointUser(OAuth2Authentication authentication) {
        OAuth2AuthenticationDetails oAuth2AuthenticationDetails = (OAuth2AuthenticationDetails) authentication.getDetails();
        Map<String, Object> additionalInfo = tokenServices.readAccessToken(oAuth2AuthenticationDetails.getTokenValue()).getAdditionalInformation();
        return new ResponseEntity<String>("Your UUID: " + additionalInfo.get("uuid").toString()
                + " , your username: " + authentication.getPrincipal() + " and your role USER",
                HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @RequestMapping(value = "/endpointadmin", method = RequestMethod.GET)
    public ResponseEntity<String> endPointAdmin(OAuth2Authentication authentication) {
        OAuth2AuthenticationDetails oAuth2AuthenticationDetails = (OAuth2AuthenticationDetails) authentication.getDetails();
        Map<String, Object> additionalInfo = tokenServices.readAccessToken(oAuth2AuthenticationDetails.getTokenValue()).getAdditionalInformation();
        return new ResponseEntity<String>("Your UUID: " + additionalInfo.get("uuid").toString()
                + " , your username: " + authentication.getPrincipal() + " and your role ADMIN",
                HttpStatus.OK);
    }
}
