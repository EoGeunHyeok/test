package com.cod.TripInJeju.social.Oatuh.detail;


import com.cod.TripInJeju.social.Oatuh.OAuth2UserInfo;
import lombok.AllArgsConstructor;


import java.util.Map;

@AllArgsConstructor
public class GoogleUserDetails implements OAuth2UserInfo {

    private Map<String, Object> attributes;

    @Override
    public String getProvider() {
        return "google";
    }

    @Override
    public String getProviderId() {
        return (String) attributes.get("sub");
    }

    @Override
    public String getEmail() {
        return (String) attributes.get("email");
    }

    @Override
    public String getName() {
        return (String) attributes.get("name");
    }
    @Override
    public String getNickname() {
        return (String) attributes.get("nickname");
    }
}
