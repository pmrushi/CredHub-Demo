package com.example.credhub;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("vcap.services.credhub.credentials")
//add the name of your PCF service here to replace "mycredhub"
public class CredHubProps {
    public String mysecretkey; //add whatever properties you need in here that are stored in CredHub
}