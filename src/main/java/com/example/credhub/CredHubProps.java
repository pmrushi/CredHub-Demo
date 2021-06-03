package com.example.credhub;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("vcap.services.mycredhub.credentials")
@JsonIgnoreProperties(value = {"$$beanFactory"})
public class CredHubProps {
    //add whatever properties you need in here that are stored in CredHub

    @JsonProperty
    public String mySecretKey;

    @JsonProperty
    public String myKey;

    public String getMyKey() {
        return myKey;
    }

    public void setMyKey(String myKey) {
        this.myKey = myKey;
    }

    public String getMySecretKey() {
        return mySecretKey;
    }

    public void setMySecretKey(String mySecretKey) {
        this.mySecretKey = mySecretKey;
    }
}