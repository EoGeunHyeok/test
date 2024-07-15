package com.cod.TripInJeju.social.Oatuh;

public interface OAuth2UserInfo {
    String getProvider();
    String getProviderId();
    String getEmail();
    String getName();

    String getNickname();
}