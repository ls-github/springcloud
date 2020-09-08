package cn.ctgu.firstdemo.security;

import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;

import java.util.HashMap;
import java.util.Map;

/**
 * 使用 TokenEnhancer 自定义生成令牌
 */

public class MyTokenEnhancer implements TokenEnhancer {
    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken oAuth2AccessToken, OAuth2Authentication oAuth2Authentication) {

        //把附加信息加入oAuth2AccessToken中
        Map<String ,Object> info = new HashMap<>();
        info.put("admin","tucker");
        info.put("company","bobo");
        ((DefaultOAuth2AccessToken)oAuth2AccessToken).setAdditionalInformation(info);

        return oAuth2AccessToken;
    }
}
