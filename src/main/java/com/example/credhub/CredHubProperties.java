package com.example.credhub;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("vcap.services.mycredhub.credentials")
//add the name of your PCF service here to replace "mycredhub"
public class CredHubProperties {
    public String mySecretKey; //add whatever properties you need in here that are stored in CredHub
}