package cn.ctgu.firstdemo.security;

import org.springframework.security.oauth2.common.util.OAuth2Utils;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.OAuth2Request;
import org.springframework.security.oauth2.provider.token.DefaultAuthenticationKeyGenerator;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;

public class MyDefaultAuthenticationKeyGenerator extends DefaultAuthenticationKeyGenerator {


    public String extractKey(OAuth2Authentication authentication) {
        Map<String, String> values = new LinkedHashMap();
        OAuth2Request authorizationRequest = authentication.getOAuth2Request();
        if (!authentication.isClientOnly()) {
            values.put("username", authentication.getName());
        }

        values.put("client_id", authorizationRequest.getClientId());
        if (authorizationRequest.getScope() != null) {
            values.put("scope", OAuth2Utils.formatParameterList(new TreeSet(authorizationRequest.getScope())));
        }

        Random r = new Random();
        values.put("salt", String.valueOf(r.nextInt(Integer.MAX_VALUE-1)));

        return this.generateKey(values);
    }
}
